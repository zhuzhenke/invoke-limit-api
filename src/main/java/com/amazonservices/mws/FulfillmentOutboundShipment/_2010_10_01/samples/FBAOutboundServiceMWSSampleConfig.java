/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * FBA Outbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.samples;

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSAsyncClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSConfig;

/**
 * Configuration for FBAOutboundServiceMWS samples.
 */
public class FBAOutboundServiceMWSSampleConfig {

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
    private static FBAOutboundServiceMWSAsyncClient client = null;

    /**
     * Get a client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static FBAOutboundServiceMWSClient getClient() {
        return getAsyncClient();
    }

    /**
     * Get an async client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static synchronized FBAOutboundServiceMWSAsyncClient getAsyncClient() {
        if (client==null) {
            FBAOutboundServiceMWSConfig config = new FBAOutboundServiceMWSConfig();
            config.setServiceURL(serviceURL);
            // Set other client connection configurations here.
            client = new FBAOutboundServiceMWSAsyncClient(accessKey, secretKey, 
                    appName, appVersion, config, null);
        }
        return client;
    }

}
