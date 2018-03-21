package com.method.invoke;

/**
 * 默认的异常重试处理器:不重试，直接返回
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class DefaultExceptionReInvokeProcessor implements ExceptionReInvokeProcessor {

    @Override
    public boolean needReInvoke(Exception e) {
        return false;
    }
}
