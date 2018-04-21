package com.amazon.commom;


import com.amazon.config.AmazonAccountConfig;

import java.util.HashMap;
import java.util.Map;

public enum MarketPlace {

    /*********************
     * 北美地区
     *********************/

    CA("https://mws.amazonservices.ca", MarketPlaceId.A2EUQ1WTGCTBG2.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    US("https://mws.amazonservices.com", MarketPlaceId.ATVPDKIKX0DER.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    /**
     * 墨西哥
     */
    MX("https://mws.amazonservices.com.mx", MarketPlaceId.A1AM78C64UM0Y8.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    /********************* 北美地区 *********************/

    /*********************
     * 欧洲地区
     *********************/

    DE("https://mws-eu.amazonservices.com", MarketPlaceId.A1PA6795UKMFR9.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    ES("https://mws-eu.amazonservices.com", MarketPlaceId.A1RKKUPIHCS9HS.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    FR("https://mws-eu.amazonservices.com", MarketPlaceId.A13V1IB3VIYZZH.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    IN("https://mws.amazonservices.in", MarketPlaceId.A21TJRUUN4KGV.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    IT("https://mws-eu.amazonservices.com", MarketPlaceId.APJ6JRA9NG5V4.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    UK("https://mws-eu.amazonservices.com", MarketPlaceId.A1F83G8C2ARO7P.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    /********************* 欧洲地区 *********************/

    /*********************
     * 远东地区
     *********************/

    JP("https://mws.amazonservices.jp", MarketPlaceId.A1VC38T7YXB528.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey()),

    /********************* 远东地区 *********************/
    /*********************
     * 远东地区
     *********************/

    CN("https://mws.amazonservices.com.cn", MarketPlaceId.AAHKV2X7AFYLW.name(), getCommonAwsAccessKeyId(), getCommonAwsSecretAccessKey());

    /*********************
     * 远东地区
     *********************/


    private final String serviceUrl;

    private final String marketplaceId;

    private final String awsAccessKeyId;

    private final String awsSecretAccessKey;

    private boolean init = false;

    MarketPlace(String serviceUrl, String marketplaceId, String awsAccessKeyId, String awsSecretAccessKey) {
        this.serviceUrl = serviceUrl;
        this.marketplaceId = marketplaceId;
        this.awsAccessKeyId = awsAccessKeyId;
        this.awsSecretAccessKey = awsSecretAccessKey;
    }

    private static Map<String, MarketPlace> marketPlaceMap = null;
    private static final Object lock = new Object();

    public static MarketPlace from(String marketplaceId) {
        if (marketPlaceMap == null) {
            synchronized (lock) {
                if (marketPlaceMap == null) {
                    HashMap<String, MarketPlace> tempMap = new HashMap<String, MarketPlace>();
                    MarketPlace[] marketPlaces = MarketPlace.values();
                    if (marketPlaces != null) {
                        for (MarketPlace marketPlace : marketPlaces) {
                            tempMap.put(marketPlace.getMarketplaceId(), marketPlace);
                        }
                    }
                    marketPlaceMap = tempMap;
                }
            }
        }
        return marketPlaceMap.get(marketplaceId);
    }

    public String getMarketplaceId() {
        check();
        return marketplaceId;
    }

    public String getServiceUrl() {
        check();
        return serviceUrl;
    }

    public String getAwsAccessKeyId() {
        check();
        return awsAccessKeyId;
    }

    public String getAwsSecretAccessKey() {
        check();
        return awsSecretAccessKey;
    }

    private void check() {
        if (init) {
            return;
        }
        if ((awsAccessKeyId == null || awsAccessKeyId.length() == 0)) {
            throw new IllegalArgumentException("not support marketplaceId:" + marketplaceId);
        }
        if ((awsSecretAccessKey == null || awsSecretAccessKey.length() == 0)) {
            throw new IllegalArgumentException("awsAccessKeyId or awsSecretAccessKey is null! ");
        }
        init = true;
    }

    private static String getCommonAwsAccessKeyId() {
        return AmazonAccountConfig.getAwsAccessKeyId();
    }

    private static String getCommonAwsSecretAccessKey() {
        return AmazonAccountConfig.getAwsSecretAccessKey();
    }
}
