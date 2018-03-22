package com.method.invoke;


import com.method.invoke.base.BaseResponse;

/**
 * 系统后台线程工作池
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public interface SystemInvoke {
    BaseResponse execute(RequestCommand request) throws Exception;
}
