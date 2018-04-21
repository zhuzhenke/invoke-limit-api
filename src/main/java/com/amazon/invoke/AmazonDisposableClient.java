package com.amazon.invoke;

import com.amazon.commom.MarketPlace;
import com.amazon.report.DisposableRequestReportResponse;
import com.amazon.util.AmazonCommonUtil;
import com.amazonaws.mws.model.*;
import com.method.invoke.DefaultAttachment;
import com.method.invoke.ExceptionReInvokeProcessor;
import com.method.invoke.NextInvokeProcessor;
import com.method.invoke.callback.InvokeCallBack;
import org.apache.commons.io.IOUtils;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 亚马逊获取报告Client
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class AmazonDisposableClient {
    /**
     * 全局重试时间处理
     */
    private NextInvokeProcessor globalNextInvokeProcessor;
    /**
     * 全局异常重试处理器
     */
    private ExceptionReInvokeProcessor globalExceptionReInvokeProcessor;

    public void setGlobalExceptionReInvokeProcessor(ExceptionReInvokeProcessor globalExceptionReInvokeProcessor) {
        this.globalExceptionReInvokeProcessor = globalExceptionReInvokeProcessor;
    }

    public void setGlobalNextInvokeProcessor(NextInvokeProcessor globalNextInvokeProcessor) {
        this.globalNextInvokeProcessor = globalNextInvokeProcessor;
    }

    private static AmazonDisposableClient client = new AmazonDisposableClient();

    private AmazonDisposableClient() {
        setGlobalNextInvokeProcessor(new AmazonNextInvokeProcessor());
        setGlobalExceptionReInvokeProcessor(new AmazonExceptionReInvokeProcessor());
    }

    public static AmazonDisposableClient getAmazonDisposableClientInstance() {
        return client;
    }

    /**
     * 拉取报告，同步方法，返回最终的结果
     */
    public DisposableRequestReportResponse execute(RequestReportRequest requestReportRequest, MarketPlace marketPlace, String sellerId) throws Exception {
        return executeInternal(requestReportRequest, marketPlace, sellerId);
    }

    /**
     * 拉取报告，同步方法，返回最终的结果
     */
    private DisposableRequestReportResponse executeInternal(RequestReportRequest requestReportRequest, MarketPlace marketPlace, String sellerId) throws Exception {
        if (requestReportRequest.getMarketplace() == null) {
            throw new Exception("站点不能为空");
        }
        AmazonClient amazonClient = AmazonClient.getAmazonClientInstance();
        amazonClient.setGlobalNextInvokeProcessor(globalNextInvokeProcessor);
        amazonClient.setGlobalExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);

        DisposableRequestReportResponse reportResponse = new DisposableRequestReportResponse();
        /**
         * 第一步
         */
        RequestReportResponse requestReportResponse = (RequestReportResponse) amazonClient.execute(requestReportRequest, marketPlace, sellerId);
        final String reportRequestId = requestReportResponse.getRequestReportResult().getReportRequestInfo().getReportRequestId();
        reportResponse.setReportRequestId(reportRequestId);

        /**
         * 第二步:这里可能拿到的是一个中间状态
         */
        GetReportRequestListResponse getReportRequestListResponse = null;
        String processingStatus = null;
        //当前时间，对于30分钟还拿不到报告结果的，直接返回报错信息
        long startTimeMillis = System.currentTimeMillis();
        long maxInterval = 1000 * 60 * 30;
        do {
            GetReportRequestListRequest getReportRequestListRequest = new GetReportRequestListRequest();
            IdList idList = new IdList(new ArrayList<String>() {{
                add(reportRequestId);
            }});
            getReportRequestListRequest.setMWSAuthToken(requestReportRequest.getMWSAuthToken());
            getReportRequestListRequest.setReportRequestIdList(idList);
            getReportRequestListRequest.setMarketplace(requestReportRequest.getMarketplace());
            getReportRequestListRequest.setMerchant(requestReportRequest.getMerchant());

            getReportRequestListResponse = (GetReportRequestListResponse) amazonClient.execute(getReportRequestListRequest, marketPlace, sellerId);
            processingStatus = getReportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList().get(0).getReportProcessingStatus();
        }
        while (!AmazonCommonUtil.isFinishStatus(processingStatus) && (System.currentTimeMillis() - startTimeMillis <= maxInterval));

        if ((System.currentTimeMillis() - startTimeMillis > maxInterval)) {
            throw new Exception("获取报告结果超时");
        }
        if (AmazonCommonUtil.isCancelledStatus(processingStatus)) {
            throw new Exception("获取报告任务被取消");
        }
        if (AmazonCommonUtil.isFinishNoDataStatus(processingStatus)) {
            reportResponse.setHasResult(false);
            return reportResponse;
        }

        /**
         * 第三步
         */
        GetReportRequest getReportRequest = new GetReportRequest();
        getReportRequest.setMarketplace(requestReportRequest.getMarketplace());
        getReportRequest.setMWSAuthToken(requestReportRequest.getMWSAuthToken());
        getReportRequest.setMerchant(requestReportRequest.getMerchant());
        String generatedReportId = getReportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList().get(0).getGeneratedReportId();
        getReportRequest.setReportId(generatedReportId);
        amazonClient.execute(getReportRequest, marketPlace, sellerId);

        reportResponse.setHasResult(true);
        reportResponse.setGeneratedReportId(generatedReportId);

        StringReader reader = null;
        if (MarketPlace.MX.getMarketplaceId().equals(requestReportRequest.getMarketplace())) {
            reader = new StringReader(new String(((org.apache.commons.io.output.ByteArrayOutputStream) getReportRequest.getReportOutputStream()).toByteArray(), "ISO-8859-1"));
        } else {
            reader = new StringReader(new String(((org.apache.commons.io.output.ByteArrayOutputStream) getReportRequest.getReportOutputStream()).toByteArray()));
        }
        List<String> resultList = IOUtils.readLines(reader);

        List<Object> reportResultList = AmazonCommonUtil.resolveReportResult(requestReportRequest.getReportType(), resultList);
        reportResponse.setReportResultList(reportResultList);
        return reportResponse;
    }

    public void execute(final RequestReportRequest requestReportRequest, final MarketPlace marketPlace, final String sellerId, final InvokeCallBack invokeCallBack, final DefaultAttachment defaultAttachment) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    DisposableRequestReportResponse reportResponse = executeInternal(requestReportRequest, marketPlace, sellerId);
                    if (invokeCallBack != null) {
                        invokeCallBack.invokeResult(reportResponse, defaultAttachment, null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    invokeCallBack.invokeResult(null, defaultAttachment, e);
                }
            }
        }).start();
    }
}
