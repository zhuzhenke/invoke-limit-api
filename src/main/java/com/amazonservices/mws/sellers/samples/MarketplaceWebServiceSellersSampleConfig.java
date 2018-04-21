/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace Web Service Sellers
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.samples;

import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersAsyncClient;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersClient;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersConfig;

/**
 * Configuration for MarketplaceWebServiceSellers samples.
 */
public class MarketplaceWebServiceSellersSampleConfig {

    /** Developer AWS access key. */
    private static final String accessKey = "replaceWithAccessKey";

    /** Developer AWS secret key. */
    private static final String secretKey = "replaceWithSecretKey";

    /** The client application name. */
    private static final String appName = "replaceWithAppName";

    /** The client application version. */
    private static final String appVersion = "replaceWithAppVersion";

    /**
     * The endpoint for region service and version.
     * ex: serviceURL = MWSEndpoint.NA_PROD.toString();
     */
    private static final String serviceURL = "replaceWithServiceURL";

    /** The client, lazy initialized. Async client is also a sync client. */
    private static MarketplaceWebServiceSellersAsyncClient client = null;

    /**
     * Get a client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static MarketplaceWebServiceSellersClient getClient() {
        return getAsyncClient();
    }

    /**
     * Get an async client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static synchronized MarketplaceWebServiceSellersAsyncClient getAsyncClient() {
        if (client==null) {
            MarketplaceWebServiceSellersConfig config = new MarketplaceWebServiceSellersConfig();
            config.setServiceURL(serviceURL);
            // Set other client connection configurations here.
            client = new MarketplaceWebServiceSellersAsyncClient(accessKey, secretKey, 
                    appName, appVersion, config, null);
        }
        return client;
    }

}
