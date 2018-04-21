package com.method.test.amazon.test;

import com.amazon.commom.MarketPlace;
import com.amazon.invoke.AmazonClient;
import com.amazonservices.mws.products.model.GetMyPriceForSKURequest;
import com.amazonservices.mws.products.model.GetMyPriceForSKUResponse;
import com.amazonservices.mws.products.model.SellerSKUListType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2018/03/22
 */
public class AmazonTest {
    private static String sellerId = "XXXXXX";
    private static String mwsAuthToken = "XXXXXX";


    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    getPrice();
                }
            }).start();
        }
    }

    private static void getPrice() {

        try {

            GetMyPriceForSKURequest getMyPriceForSKURequest = new GetMyPriceForSKURequest();

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
            //同步方式
            GetMyPriceForSKUResponse response = (GetMyPriceForSKUResponse) AmazonClient.getAmazonClientInstance().execute(getMyPriceForSKURequest, MarketPlace.US, sellerId);
            //异步方式
//            AmazonClient.getAmazonClientInstance().execute(getMyPriceForSKURequest, MarketPlace.US, sellerId, new InvokeCallBack() {
//                @Override
//                public void invokeResult(BaseResponse response, DefaultAttachment defaultAttachment, Exception e) {
//                    System.out.println(response.getClass());
//                    System.out.println(defaultAttachment);
//                }
//            },new DefaultAttachment());


            System.out.println(response.isSetGetMyPriceForSKUResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
