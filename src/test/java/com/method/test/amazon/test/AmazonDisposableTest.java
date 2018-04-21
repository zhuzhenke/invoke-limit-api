package com.method.test.amazon.test;

import com.amazon.commom.MarketPlace;
import com.amazon.commom.ReportType;
import com.amazon.invoke.AmazonDisposableClient;
import com.amazon.invoke.AmazonExceptionReInvokeProcessor;
import com.amazon.invoke.AmazonNextInvokeProcessor;
import com.amazon.report.DisposableRequestReportResponse;
import com.amazon.util.AmzDateUtil;
import com.amazonaws.mws.model.RequestReportRequest;
import com.method.invoke.DefaultAttachment;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.callback.InvokeCallBack;
import com.method.test.amazon.api.AmazonOrderResponse;

import java.text.SimpleDateFormat;

/**
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class AmazonDisposableTest {
    public static void main(String[] args) throws Exception {
//        getPortSync();
        getPortAsync();
    }


    private static String sellerId = "XXXXXX";
    private static String mwsAuthToken = "XXXXXX";


    public static void getPortSync() throws Exception {
        RequestReportRequest requestReportRequest = new RequestReportRequest();
        requestReportRequest.setReportType(ReportType._GET_FLAT_FILE_OPEN_LISTINGS_DATA_.name());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        requestReportRequest.setStartDate(AmzDateUtil.dateToXmlDate(simpleDateFormat.parse("2017-05-01")));
        requestReportRequest.setMarketplace(MarketPlace.US.getMarketplaceId());
        requestReportRequest.setMerchant(sellerId);
        requestReportRequest.setMWSAuthToken(mwsAuthToken);

        AmazonDisposableClient amazonDisposableClient = AmazonDisposableClient.getAmazonDisposableClientInstance();
        DisposableRequestReportResponse response = amazonDisposableClient.execute(requestReportRequest, MarketPlace.US, sellerId);
        System.out.println(1);


    }


    public static void getPortAsync() throws Exception {
        RequestReportRequest requestReportRequest = new RequestReportRequest();
        requestReportRequest.setReportType(ReportType._GET_SELLER_FEEDBACK_DATA_.name());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        requestReportRequest.setStartDate(AmzDateUtil.dateToXmlDate(simpleDateFormat.parse("2017-05-01")));
        requestReportRequest.setMarketplace(MarketPlace.US.getMarketplaceId());
        requestReportRequest.setMerchant(sellerId);
        requestReportRequest.setMWSAuthToken(mwsAuthToken);

        AmazonDisposableClient amazonDisposableClient = AmazonDisposableClient.getAmazonDisposableClientInstance();
        amazonDisposableClient.setGlobalNextInvokeProcessor(new AmazonNextInvokeProcessor());
        amazonDisposableClient.setGlobalExceptionReInvokeProcessor(new AmazonExceptionReInvokeProcessor());

        InvokeCallBack invokeCallBack = new InvokeCallBack() {
            @Override
            public void invokeResult(BaseResponse response, DefaultAttachment defaultAttachment, Exception e) {
                if (e != null) {
                    e.printStackTrace();
                } else {
                    System.out.println("invoke CallBack...");
                    System.out.println("defaultAttachment:" + defaultAttachment.get("a"));
                    System.out.println("Result" + ((AmazonOrderResponse) response).getResult());
                }
            }
        };

        DefaultAttachment defaultAttachment = new DefaultAttachment();
        defaultAttachment.put("a", "aaa");

        amazonDisposableClient.execute(requestReportRequest, MarketPlace.US, sellerId, invokeCallBack, defaultAttachment);

        System.out.println("Async Finish...");
    }
}
