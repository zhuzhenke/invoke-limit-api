package com.method.test.amazon.apitest;

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
import com.method.test.amazon.apimocktest.AmazonOrderResponse;
import org.junit.Test;

import java.text.SimpleDateFormat;

/**
 * 组合模式的接口调用，如获取商品列表这种数据
 * 通常分为3个步骤完成所有调用
 * （1）提交获取商品请求，拿到请求ID
 * （2）通过请求ID，去获取这个请求ID的报告是否完成，如已经完成，拿到报告ID
 * （3）通过报告ID获取商品数据
 * <p>
 * 但是如果分为3次调用就会比较麻烦，所以提供了AmazonDisposableClient只需要一次调用，就可以获取最后的商品数据了
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class AmazonDisposableTest {


    private static String sellerId = "XXXXXX";
    private static String mwsAuthToken = "XXXXXX";


    @Test
    public void getListingsDataSync() throws Exception {
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


    @Test
    public void getListingsDataAsync() throws Exception {
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
