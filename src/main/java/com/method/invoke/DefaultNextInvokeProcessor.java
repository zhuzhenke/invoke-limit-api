package com.method.invoke;

import com.method.invoke.base.BaseRequest;

/**
 * 默认的下次执行时间处理器
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class DefaultNextInvokeProcessor implements NextInvokeProcessor {


    @Override
    public final Long getNextInvokeTimeMillis(BaseRequest baseRequest, String sellerId) {
        long nextInvokeTimeMillis = System.currentTimeMillis() + 2000;
        long curTime = System.currentTimeMillis();
        if (nextInvokeTimeMillis < curTime) {
            return curTime + 100;
        }
        return nextInvokeTimeMillis;
    }

}
