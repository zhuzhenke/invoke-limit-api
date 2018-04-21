package com.method.invoke;

import com.method.invoke.base.BaseRequest;

/**
 * 下次执行时间处理器
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public interface NextInvokeProcessor {

    /**
     * 下一次执行时间
     * 这里的参数需要根据业务来定，一般这里放影响下次执行时间的参数
     */
    Long getNextInvokeTimeMillis(BaseRequest baseRequest, String sellerId);
}
