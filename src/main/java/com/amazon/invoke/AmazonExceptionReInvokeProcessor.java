package com.amazon.invoke;

import com.method.invoke.ExceptionReInvokeProcessor;

/**
 * @author zhuzhenke
 * @date 2018/03/22
 */
public class AmazonExceptionReInvokeProcessor implements ExceptionReInvokeProcessor {
    @Override
    public boolean needReInvoke(Exception e) {
        if (e.getMessage() != null &&
                (e.getMessage().contains("You exceeded your quota") || e.getMessage().contains("Request is throttled"))) {
            System.out.println("亚马逊异常了 。。。需要继续执行");
            e.printStackTrace();
            return true;
        }
        return false;
    }
}
