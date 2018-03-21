package com.method.invoke.base;

/**
 * 基本请求类
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class BaseRequest<T extends BaseResponse> {
    /**
     * 用于标记第一次提交
     */
    private boolean isSubmit;

    public BaseRequest() {
        isSubmit = true;
    }

    public boolean isSubmit() {
        return isSubmit;
    }

    public void closeSubmit() {
        isSubmit = false;
    }

    public void checkParams() throws Exception {

    }
}
