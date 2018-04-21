package com.amazon.commom;

import com.amazon.config.AmazonAccountConfig;
import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWS;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSClient;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSConfig;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWS;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSConfig;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentService;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceClient;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.MWSMerchantFulfillmentServiceConfig;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrders;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersConfig;
import com.amazonservices.mws.products.MarketplaceWebServiceProducts;
import com.amazonservices.mws.products.MarketplaceWebServiceProductsAsyncClient;
import com.amazonservices.mws.products.MarketplaceWebServiceProductsConfig;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellers;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersClient;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersConfig;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MarketplaceService {

    public final static Map<MarketPlace, MarketplaceWebServiceProducts> marketplaceWebServiceProductsMap = new ConcurrentHashMap<MarketPlace, MarketplaceWebServiceProducts>();
    public final static Map<MarketPlace, MarketplaceWebService> marketplaceWebServiceMap = new ConcurrentHashMap<MarketPlace, MarketplaceWebService>();
    public final static Map<MarketPlace, FBAInventoryServiceMWS> fBAInventoryServiceMWSMap = new ConcurrentHashMap<MarketPlace, FBAInventoryServiceMWS>();
    public final static Map<MarketPlace, MarketplaceWebServiceOrders> marketplaceWebServiceOrdersMap = new ConcurrentHashMap<MarketPlace, MarketplaceWebServiceOrders>();
    public final static Map<MarketPlace, FBAOutboundServiceMWS> marketplaceFBAOutboundServiceMWSMap = new ConcurrentHashMap<MarketPlace, FBAOutboundServiceMWS>();
    public final static Map<MarketPlace, MWSMerchantFulfillmentService> marketplaceMWSMerchantFulfillmentServiceMap = new ConcurrentHashMap<MarketPlace, MWSMerchantFulfillmentService>();
    public final static Map<MarketPlace, MarketplaceWebServiceSellers> marketplaceMarketplaceWebServiceSellersMap = new ConcurrentHashMap<MarketPlace, MarketplaceWebServiceSellers>();

    public static MarketplaceWebService buildMarketplaceWebService(MarketPlace marketPlace, MarketplaceWebServiceConfig marketplaceWebServiceConfig) {
        if (!marketplaceWebServiceMap.containsKey(marketPlace)) {
            MarketplaceWebServiceConfig config = null;
            if (marketplaceWebServiceConfig != null) {
                config = marketplaceWebServiceConfig;
                if (config.getServiceURL() == null) {
                    config.setServiceURL(marketPlace.getServiceUrl());
                }
            } else {
                config = new MarketplaceWebServiceConfig();
                config.setServiceURL(marketPlace.getServiceUrl());
            }
            marketplaceWebServiceMap.put(marketPlace, new MarketplaceWebServiceClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceWebServiceMap.get(marketPlace);
    }

    public static MarketplaceWebServiceProducts buildMarketplaceWebServiceProducts(MarketPlace marketPlace) {
        if (!marketplaceWebServiceProductsMap.containsKey(marketPlace)) {
            MarketplaceWebServiceProductsConfig config = new MarketplaceWebServiceProductsConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            marketplaceWebServiceProductsMap.put(marketPlace, new MarketplaceWebServiceProductsAsyncClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceWebServiceProductsMap.get(marketPlace);
    }

    public static FBAInventoryServiceMWS buildFBAInventoryServiceMWS(MarketPlace marketPlace) {
        if (!fBAInventoryServiceMWSMap.containsKey(marketPlace)) {
            FBAInventoryServiceMWSConfig config = new FBAInventoryServiceMWSConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            fBAInventoryServiceMWSMap.put(marketPlace, new FBAInventoryServiceMWSClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return fBAInventoryServiceMWSMap.get(marketPlace);
    }

    public static MarketplaceWebServiceOrders buildMarketplaceWebServiceOrders(MarketPlace marketPlace) {
        if (!marketplaceWebServiceOrdersMap.containsKey(marketPlace)) {
            MarketplaceWebServiceOrdersConfig config = new MarketplaceWebServiceOrdersConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            marketplaceWebServiceOrdersMap.put(marketPlace, new MarketplaceWebServiceOrdersClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceWebServiceOrdersMap.get(marketPlace);
    }

    public static FBAOutboundServiceMWS buildFBAOutboundServiceMWS(MarketPlace marketPlace) {
        if (!marketplaceFBAOutboundServiceMWSMap.containsKey(marketPlace)) {
            FBAOutboundServiceMWSConfig config = new FBAOutboundServiceMWSConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            marketplaceFBAOutboundServiceMWSMap.put(marketPlace, new FBAOutboundServiceMWSClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceFBAOutboundServiceMWSMap.get(marketPlace);
    }

    public static MWSMerchantFulfillmentService buildMWSMerchantFulfillmentService(MarketPlace marketPlace) {
        if (!marketplaceMWSMerchantFulfillmentServiceMap.containsKey(marketPlace)) {
            MWSMerchantFulfillmentServiceConfig config = new MWSMerchantFulfillmentServiceConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            marketplaceMWSMerchantFulfillmentServiceMap.put(marketPlace, new MWSMerchantFulfillmentServiceClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceMWSMerchantFulfillmentServiceMap.get(marketPlace);
    }

    public static MarketplaceWebServiceSellers buildMarketplaceWebServiceSellers(MarketPlace marketPlace) {
        if (!marketplaceMarketplaceWebServiceSellersMap.containsKey(marketPlace)) {
            MarketplaceWebServiceSellersConfig config = new MarketplaceWebServiceSellersConfig();
            config.setServiceURL(marketPlace.getServiceUrl());
            marketplaceMarketplaceWebServiceSellersMap.put(marketPlace, new MarketplaceWebServiceSellersClient(marketPlace.getAwsAccessKeyId(), marketPlace.getAwsSecretAccessKey(), AmazonAccountConfig.getApplicationName(), AmazonAccountConfig.getApplicationVersion(), config));
        }
        return marketplaceMarketplaceWebServiceSellersMap.get(marketPlace);
    }
}
