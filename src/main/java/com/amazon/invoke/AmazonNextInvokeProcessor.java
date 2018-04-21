package com.amazon.invoke;

import com.amazon.util.IPUtil;
import com.method.invoke.DefaultSystemInvoke;
import com.method.invoke.NextInvokeProcessor;
import com.method.invoke.base.BaseRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhuzhenke
 * @date 2018/03/22
 */
public class AmazonNextInvokeProcessor implements NextInvokeProcessor {
    private static final Logger logger = LoggerFactory.getLogger(DefaultSystemInvoke.class);


    public AmazonNextInvokeProcessor() {
    }

    @Override
    public Long getNextInvokeTimeMillis(BaseRequest baseRequest, String sellerId) {
        try {
            HttpClient httpClient = new DefaultHttpClient();

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("sellerId", sellerId);
            params.put("requestName", getRequestName(baseRequest));
            params.put("localIp", IPUtil.getLocalIp());
            params.put("port", IPUtil.getPort());
            StringBuilder stringBuilder = new StringBuilder();
            Iterator<String> iterator = params.keySet().iterator();
            int i = 0;
            while (iterator.hasNext()) {
                String key = iterator.next();
                if (i == 0) {
                    stringBuilder.append("?").append(key).append("=").append(params.get(key));
                } else {
                    stringBuilder.append("&").append(key).append("=").append(params.get(key));
                }
                i++;
            }
            //这里调用统一控制中心的web接口，获取到当前request的执行时间
            HttpGet httpGet = new HttpGet("http://XXX.com/XXXtime" + stringBuilder.toString());

            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(2000).setConnectionRequestTimeout(2000)
                    .setSocketTimeout(2000).build();
            httpGet.setConfig(requestConfig);
            HttpResponse res = httpClient.execute(httpGet);
            switch (res.getStatusLine().getStatusCode()) {
                case 200:
                    String body = EntityUtils.toString(res.getEntity());
                    return Long.valueOf(body);
                default:
                    return System.currentTimeMillis() + 2000;
            }
        } catch (Exception e) {
            logger.error("AmazonNextInvokeProcessor getNextInvokeTimeMillis error,baseRequest:{},sellerId:{}", getRequestName(baseRequest), sellerId, e);
            Long nextTime = NextTimeMap.get(getRequestName(baseRequest), 2000L);
            return System.currentTimeMillis() + nextTime;
        }
    }

    public String getRequestName(BaseRequest baseRequest) {
        if (baseRequest != null) {
            return baseRequest.getClass().getSimpleName();
        }
        return "default";
    }
}
