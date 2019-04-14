package com.method.test.amazon.apimocktest;

import com.amazon.commom.MarketPlace;
import com.method.invoke.DefaultAttachment;
import com.method.invoke.DefaultNextInvokeProcessor;
import com.method.invoke.ExceptionReInvokeProcessor;
import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.callback.InvokeCallBack;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonOrderRequest implements BaseRequest {

    /**
     * 测试类
     *
     * @author zhuzhenke
     * @date 2018/03/21
     */
    public static class AmazonMockTest {

        public static final String testSelerId = "testSellerId";

        private static void eeeDubble() throws Exception {
            long start = System.currentTimeMillis();
            AmazonTestClient amazonTestClient = new AmazonTestClient();
            amazonTestClient.setGlobalNextInvokeProcessor(new DefaultNextInvokeProcessor());
            amazonTestClient.setGlobalExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
                @Override
                public boolean needReInvoke(Exception e) {
                    if (e.getMessage().contains("授权异常")) {
                        return true;
                    }
                    return false;
                }
            });

            AmazonOrderRequest amazonOrderRequest = new AmazonOrderRequest();
            AmazonOrderResponse response = (AmazonOrderResponse) amazonTestClient.execute(amazonOrderRequest, MarketPlace.US, testSelerId);
            System.out.println("response Time:" + (System.currentTimeMillis() - start) + ";result:" + response.getResult());

            AmazonProductRequest amazonProductRequest = new AmazonProductRequest();
            AmazonProductResponse amazonProductResponse = (AmazonProductResponse) amazonTestClient.execute(amazonProductRequest, MarketPlace.US, testSelerId);
            System.out.println("amazonProductResponse Time:" + (System.currentTimeMillis() - start) + ";result:" + amazonProductResponse.getResult());


        }


        public static void eee() throws Exception {
            long start = System.currentTimeMillis();
            AmazonTestClient amazonTestClient = new AmazonTestClient();
            amazonTestClient.setGlobalNextInvokeProcessor(new DefaultNextInvokeProcessor());
            amazonTestClient.setGlobalExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
                @Override
                public boolean needReInvoke(Exception e) {
                    if (e.getMessage().contains("授权异常")) {
                        return true;
                    }
                    return false;
                }
            });

            AmazonOrderRequest amazonOrderRequest = new AmazonOrderRequest();
            AmazonOrderResponse response = (AmazonOrderResponse) amazonTestClient.execute(amazonOrderRequest, MarketPlace.US, testSelerId);
            System.out.println(System.currentTimeMillis() - start);
        }

        public static void eeeItem() throws Exception {
            long start = System.currentTimeMillis();
            AmazonTestClient amazonTestClient = new AmazonTestClient();
            amazonTestClient.setGlobalNextInvokeProcessor(new DefaultNextInvokeProcessor());
            amazonTestClient.setGlobalExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
                @Override
                public boolean needReInvoke(Exception e) {
                    if (e.getMessage().contains("授权异常")) {
                        return true;
                    }
                    return false;
                }
            });

            AmazonOrderRequest amazonOrderRequest = new AmazonOrderRequest();
            AmazonOrderResponse response = (AmazonOrderResponse) amazonTestClient.execute(amazonOrderRequest, MarketPlace.US, testSelerId);
            System.out.println(System.currentTimeMillis() - start);
        }


        public static void eeeCallBack() throws Exception {
            long start = System.currentTimeMillis();
            AmazonTestClient amazonTestClient = new AmazonTestClient();
            amazonTestClient.setGlobalNextInvokeProcessor(new DefaultNextInvokeProcessor());
            amazonTestClient.setGlobalExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
                @Override
                public boolean needReInvoke(Exception e) {
                    if (e.getMessage().contains("授权异常")) {
                        return true;
                    }
                    return false;
                }
            });

            AmazonOrderRequest amazonOrderRequest = new AmazonOrderRequest();


            DefaultAttachment defaultAttachment = new DefaultAttachment();
            defaultAttachment.put("a", "aaa");
            amazonTestClient.execute(amazonOrderRequest, MarketPlace.US, testSelerId, new InvokeCallBack() {
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
            }, defaultAttachment);
            System.out.println("执行时间:" + (System.currentTimeMillis() - start));
        }

    }
}
