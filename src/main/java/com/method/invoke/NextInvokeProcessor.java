package com.method.invoke;

/**
 * 下次执行时间处理器
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public interface NextInvokeProcessor {
    /**
     * 下一次执行时间
     */
    Long getNextInvokeTimeMillis();

    /**
     * 当前接口限制的维度
     */
    String getKey();
}
