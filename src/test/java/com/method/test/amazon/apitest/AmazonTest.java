package com.method.test.amazon.apitest;

import com.amazon.commom.MarketPlace;
import com.amazon.invoke.AmazonClient;
import com.amazonservices.mws.products.model.*;
import com.method.invoke.DefaultAttachment;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.callback.InvokeCallBack;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 正常模式调用，即只需要一次调用接口就可以完成的调用
 * 提供同步和异步两种方式，异步方式有回调方法
 *
 * @author zhuzhenke
 * @date 2018/03/22
 */
public class AmazonTest {
    private static String sellerId = "XXXXXX";
    private static String mwsAuthToken = "XXXXXX";


    @Test
    public void getPriceSync() {
        try {
            GetMyPriceForSKURequest getMyPriceForSKURequest = new GetMyPriceForSKURequest();

            //代理模式，如搭建香港服务器加快访问
//            MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
//            config.setServiceURL("http://mws.amazonservices.com");
//            config.setProxyHost("111.111.111.111");
//            config.setProxyPort(11111);
//            amazonClient.setMarketplaceWebServiceConfig(config);

            getMyPriceForSKURequest.setMarketplaceId(MarketPlace.US.getMarketplaceId());
            getMyPriceForSKURequest.setSellerId(sellerId);
            getMyPriceForSKURequest.setMWSAuthToken(mwsAuthToken);
            List<String> sellerSkuList = new ArrayList<String>();
            sellerSkuList.add("X");
            sellerSkuList.add("XX");
            sellerSkuList.add("XXX");
            sellerSkuList.add("XXXX");
            sellerSkuList.add("XXXXX");
            sellerSkuList.add("XXXXXX");

            getMyPriceForSKURequest.setSellerSKUList(new SellerSKUListType(sellerSkuList));

            //同步方式调用
            GetMyPriceForSKUResponse response = (GetMyPriceForSKUResponse) AmazonClient.getAmazonClientInstance().execute(getMyPriceForSKURequest, MarketPlace.US, sellerId);

            System.out.println(response.isSetGetMyPriceForSKUResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPriceAsync() {

        try {

            GetMyPriceForSKURequest getMyPriceForSKURequest = new GetMyPriceForSKURequest();

            //代理模式，如搭建香港服务器加快访问
//            MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
//            config.setServiceURL("http://mws.amazonservices.com");
//            config.setProxyHost("111.111.111.111");
//            config.setProxyPort(11111);
//            amazonClient.setMarketplaceWebServiceConfig(config);

            getMyPriceForSKURequest.setMarketplaceId(MarketPlace.US.getMarketplaceId());
            getMyPriceForSKURequest.setSellerId(sellerId);
            getMyPriceForSKURequest.setMWSAuthToken(mwsAuthToken);
            List<String> sellerSkuList = new ArrayList<String>();
            sellerSkuList.add("X");
            sellerSkuList.add("XX");
            sellerSkuList.add("XXX");
            sellerSkuList.add("XXXX");
            sellerSkuList.add("XXXXX");
            sellerSkuList.add("XXXXXX");

            getMyPriceForSKURequest.setSellerSKUList(new SellerSKUListType(sellerSkuList));

            //异步方式调用
            AmazonClient.getAmazonClientInstance().execute(getMyPriceForSKURequest, MarketPlace.US, sellerId, new InvokeCallBack() {
                @Override
                public void invokeResult(BaseResponse response, DefaultAttachment defaultAttachment, Exception e) {
                    //异步的回调方法，在这里完成获得数据的操作
                    System.out.println(response.getClass());
                    System.out.println(defaultAttachment);
                }
            }, new DefaultAttachment());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
