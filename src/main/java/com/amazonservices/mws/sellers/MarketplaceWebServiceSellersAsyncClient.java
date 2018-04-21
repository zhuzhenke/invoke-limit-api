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
package com.amazonservices.mws.sellers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazonservices.mws.sellers.model.*;

public class MarketplaceWebServiceSellersAsyncClient extends MarketplaceWebServiceSellersClient implements MarketplaceWebServiceSellersAsync {

    public MarketplaceWebServiceSellersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceSellersConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MarketplaceWebServiceSellersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceSellersConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MarketplaceWebServiceSellersAsyncClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceSellersConfig config) {
        super(accessKey, secretKey, config);
    }

    public MarketplaceWebServiceSellersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<ListMarketplaceParticipationsResponse> listMarketplaceParticipationsAsync(
        ListMarketplaceParticipationsRequest request) {
        return connection.callAsync(
            new RequestType("ListMarketplaceParticipations", ListMarketplaceParticipationsResponse.class, servicePath),
            request);
    }

    public Future<ListMarketplaceParticipationsByNextTokenResponse> listMarketplaceParticipationsByNextTokenAsync(
        ListMarketplaceParticipationsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListMarketplaceParticipationsByNextToken", ListMarketplaceParticipationsByNextTokenResponse.class, servicePath),
            request);
    }


}
