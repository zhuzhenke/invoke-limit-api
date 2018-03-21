package com.method.invoke;

/**
 * 默认的下次执行时间处理器
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class DefaultNextInvokeProcessor implements NextInvokeProcessor {


    @Override
    public final Long getNextInvokeTimeMillis() {
        long nextInvokeTimeMillis = System.currentTimeMillis() + 2000;
        long curTime = System.currentTimeMillis();
        if (nextInvokeTimeMillis < curTime) {
            return curTime + 100;
        }
        return nextInvokeTimeMillis;
    }


    @Override
    public String getKey() {
        return this.getClass().getName();
    }
}
