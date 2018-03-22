package com.method.test.amazon.api;


import com.method.invoke.base.BaseResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonProductResponse extends BaseResponse {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
