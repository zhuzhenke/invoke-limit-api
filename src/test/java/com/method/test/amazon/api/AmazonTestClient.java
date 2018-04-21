package com.method.test.amazon.api;

import com.amazon.commom.MarketPlace;
import com.method.invoke.base.BaseClient;
import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonTestClient extends BaseClient {
    int i = 0;

    /**
     * 复用同一个client
     */
    @Override
    public BaseResponse executeInternal(BaseRequest baseRequest, MarketPlace marketPlace) throws Exception {
        if (baseRequest instanceof AmazonOrderRequest) {
            System.out.println("invoke AmazonOrderRequest..." + i);
            AmazonOrderResponse amazonOrderResponse = new AmazonOrderResponse();
            amazonOrderResponse.setResult("AmazonOrderRequest finish");
            i++;
            if (i == 10) {
                return amazonOrderResponse;
            } else {
                throw new Exception("授权异常了");
            }
        } else if (baseRequest instanceof AmazonProductRequest) {
            System.out.println("invoke AmazonProductRequest..." + i);
            AmazonProductResponse amazonProductResponse = new AmazonProductResponse();
            amazonProductResponse.setResult("AmazonProductRequest finish");
            i++;
            if (i == 15) {
                return amazonProductResponse;
            } else {
                throw new Exception("授权异常了");
            }
        } else {
            throw new Exception("授权异常了");
        }
    }

}
