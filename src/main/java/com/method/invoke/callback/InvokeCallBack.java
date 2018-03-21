package com.method.invoke.callback;


import com.method.invoke.DefaultAttachment;
import com.method.invoke.base.BaseResponse;

/**
 * 回调
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public interface InvokeCallBack {
    void invokeResult(BaseResponse response, DefaultAttachment defaultAttachment, Exception e);
}
