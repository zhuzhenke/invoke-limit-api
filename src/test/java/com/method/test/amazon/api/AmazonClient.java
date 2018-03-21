package com.method.test.amazon.api;


import com.method.invoke.base.BaseClient;
import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonClient extends BaseClient {
    int i = 0;

    @Override
    public BaseResponse executeInternal(BaseRequest baseRequest) throws Exception {
        System.out.println("invoke baseRequest..." + i);
        AmazonResponse amazonResponse = new AmazonResponse();
        amazonResponse.setResult("finish");
        i++;
        if (i == 10) {
            return amazonResponse;
        } else {
            throw new Exception("授权异常了");
        }
    }

}
