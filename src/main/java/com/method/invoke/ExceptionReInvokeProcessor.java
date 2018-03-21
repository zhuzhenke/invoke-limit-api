package com.method.invoke;

/**
 * 异常重试处理器
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public interface ExceptionReInvokeProcessor {
    boolean needReInvoke(Exception e);
}
