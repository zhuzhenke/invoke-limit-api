package com.method.test;

import com.method.invoke.DefaultAttachment;
import com.method.invoke.DefaultNextInvokeProcessor;
import com.method.invoke.ExceptionReInvokeProcessor;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.callback.InvokeCallBack;
import com.method.test.amazon.api.AmazonClient;
import com.method.test.amazon.api.AmazonRequest;
import com.method.test.amazon.api.AmazonResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/21
 */
public class MainTest {
    public static void main(String[] args) throws Exception {

//        eee();
        eeeCallBack();
    }


    public static void eee() throws Exception {
        long start = System.currentTimeMillis();
        AmazonClient amazonClient = new AmazonClient();
        amazonClient.setNextInvokeProcessor(new DefaultNextInvokeProcessor());
        amazonClient.setExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
            @Override
            public boolean needReInvoke(Exception e) {
                if (e.getMessage().contains("授权异常")) {
                    return true;
                }
                return false;
            }
        });

        AmazonRequest amazonRequest = new AmazonRequest();
        AmazonResponse response = (AmazonResponse) amazonClient.execute(amazonRequest);
        System.out.println(System.currentTimeMillis() - start);
    }


    public static void eeeCallBack() throws Exception {
        long start = System.currentTimeMillis();
        AmazonClient amazonClient = new AmazonClient();
        amazonClient.setNextInvokeProcessor(new DefaultNextInvokeProcessor());
        amazonClient.setExceptionReInvokeProcessor(new ExceptionReInvokeProcessor() {
            @Override
            public boolean needReInvoke(Exception e) {
                if (e.getMessage().contains("授权异常")) {
                    return true;
                }
                return false;
            }
        });

        AmazonRequest amazonRequest = new AmazonRequest();

        DefaultAttachment defaultAttachment = new DefaultAttachment();
        defaultAttachment.put("a", "aaa");
        amazonClient.execute(amazonRequest, new InvokeCallBack() {
            @Override
            public void invokeResult(BaseResponse response, DefaultAttachment defaultAttachment, Exception e) {
                if (e != null) {
                    e.printStackTrace();
                } else {
                    System.out.println("invoke CallBack...");
                    System.out.println("defaultAttachment:" + defaultAttachment.get("a"));
                    System.out.println("Result" + ((AmazonResponse) response).getResult());
                }
            }
        }, defaultAttachment);
        System.out.println("执行时间:" + (System.currentTimeMillis() - start));
    }
}
