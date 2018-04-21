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
 * Marketplace Web Service Products
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazonservices.mws.products.model.*;

public class MarketplaceWebServiceProductsAsyncClient extends MarketplaceWebServiceProductsClient implements MarketplaceWebServiceProductsAsync {

    public MarketplaceWebServiceProductsAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceProductsConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MarketplaceWebServiceProductsAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceProductsConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MarketplaceWebServiceProductsAsyncClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceProductsConfig config) {
        super(accessKey, secretKey, config);
    }

    public MarketplaceWebServiceProductsAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<GetCompetitivePricingForASINResponse> getCompetitivePricingForASINAsync(
        GetCompetitivePricingForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetCompetitivePricingForASIN", GetCompetitivePricingForASINResponse.class, servicePath),
            request);
    }

    public Future<GetCompetitivePricingForSKUResponse> getCompetitivePricingForSKUAsync(
        GetCompetitivePricingForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetCompetitivePricingForSKU", GetCompetitivePricingForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetLowestOfferListingsForASINResponse> getLowestOfferListingsForASINAsync(
        GetLowestOfferListingsForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetLowestOfferListingsForASIN", GetLowestOfferListingsForASINResponse.class, servicePath),
            request);
    }

    public Future<GetLowestOfferListingsForSKUResponse> getLowestOfferListingsForSKUAsync(
        GetLowestOfferListingsForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetLowestOfferListingsForSKU", GetLowestOfferListingsForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetLowestPricedOffersForASINResponse> getLowestPricedOffersForASINAsync(
        GetLowestPricedOffersForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetLowestPricedOffersForASIN", GetLowestPricedOffersForASINResponse.class, servicePath),
            request);
    }

    public Future<GetLowestPricedOffersForSKUResponse> getLowestPricedOffersForSKUAsync(
        GetLowestPricedOffersForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetLowestPricedOffersForSKU", GetLowestPricedOffersForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetMatchingProductResponse> getMatchingProductAsync(
        GetMatchingProductRequest request) {
        return connection.callAsync(
            new RequestType("GetMatchingProduct", GetMatchingProductResponse.class, servicePath),
            request);
    }

    public Future<GetMatchingProductForIdResponse> getMatchingProductForIdAsync(
        GetMatchingProductForIdRequest request) {
        return connection.callAsync(
            new RequestType("GetMatchingProductForId", GetMatchingProductForIdResponse.class, servicePath),
            request);
    }

    public Future<GetMyFeesEstimateResponse> getMyFeesEstimateAsync(
        GetMyFeesEstimateRequest request) {
        return connection.callAsync(
            new RequestType("GetMyFeesEstimate", GetMyFeesEstimateResponse.class, servicePath),
            request);
    }

    public Future<GetMyPriceForASINResponse> getMyPriceForASINAsync(
        GetMyPriceForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetMyPriceForASIN", GetMyPriceForASINResponse.class, servicePath),
            request);
    }

    public Future<GetMyPriceForSKUResponse> getMyPriceForSKUAsync(
        GetMyPriceForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetMyPriceForSKU", GetMyPriceForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetProductCategoriesForASINResponse> getProductCategoriesForASINAsync(
        GetProductCategoriesForASINRequest request) {
        return connection.callAsync(
            new RequestType("GetProductCategoriesForASIN", GetProductCategoriesForASINResponse.class, servicePath),
            request);
    }

    public Future<GetProductCategoriesForSKUResponse> getProductCategoriesForSKUAsync(
        GetProductCategoriesForSKURequest request) {
        return connection.callAsync(
            new RequestType("GetProductCategoriesForSKU", GetProductCategoriesForSKUResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<ListMatchingProductsResponse> listMatchingProductsAsync(
        ListMatchingProductsRequest request) {
        return connection.callAsync(
            new RequestType("ListMatchingProducts", ListMatchingProductsResponse.class, servicePath),
            request);
    }


}
