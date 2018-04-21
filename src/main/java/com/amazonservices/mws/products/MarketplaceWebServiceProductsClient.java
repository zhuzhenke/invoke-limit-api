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

import com.amazonservices.mws.products.model.*;
import com.amazonservices.mws.client.*;

public class MarketplaceWebServiceProductsClient implements MarketplaceWebServiceProducts {

    private static final String libraryName = "MarketplaceWebServiceProducts";

    private static final String libraryVersion = "2016-06-01";

    protected String servicePath;

    protected final MwsConnection connection;

    public MarketplaceWebServiceProductsClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceProductsConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public MarketplaceWebServiceProductsClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceProductsConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public MarketplaceWebServiceProductsClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MarketplaceWebServiceProductsConfig());
    }

    public GetCompetitivePricingForASINResponse getCompetitivePricingForASIN(GetCompetitivePricingForASINRequest request) {
        return connection.call(
            new RequestType("GetCompetitivePricingForASIN", GetCompetitivePricingForASINResponse.class, servicePath),
            request);
    }

    public GetCompetitivePricingForSKUResponse getCompetitivePricingForSKU(GetCompetitivePricingForSKURequest request) {
        return connection.call(
            new RequestType("GetCompetitivePricingForSKU", GetCompetitivePricingForSKUResponse.class, servicePath),
            request);
    }

    public GetLowestOfferListingsForASINResponse getLowestOfferListingsForASIN(GetLowestOfferListingsForASINRequest request) {
        return connection.call(
            new RequestType("GetLowestOfferListingsForASIN", GetLowestOfferListingsForASINResponse.class, servicePath),
            request);
    }

    public GetLowestOfferListingsForSKUResponse getLowestOfferListingsForSKU(GetLowestOfferListingsForSKURequest request) {
        return connection.call(
            new RequestType("GetLowestOfferListingsForSKU", GetLowestOfferListingsForSKUResponse.class, servicePath),
            request);
    }

    public GetLowestPricedOffersForASINResponse getLowestPricedOffersForASIN(GetLowestPricedOffersForASINRequest request) {
        return connection.call(
            new RequestType("GetLowestPricedOffersForASIN", GetLowestPricedOffersForASINResponse.class, servicePath),
            request);
    }

    public GetLowestPricedOffersForSKUResponse getLowestPricedOffersForSKU(GetLowestPricedOffersForSKURequest request) {
        return connection.call(
            new RequestType("GetLowestPricedOffersForSKU", GetLowestPricedOffersForSKUResponse.class, servicePath),
            request);
    }

    public GetMatchingProductResponse getMatchingProduct(GetMatchingProductRequest request) {
        return connection.call(
            new RequestType("GetMatchingProduct", GetMatchingProductResponse.class, servicePath),
            request);
    }

    public GetMatchingProductForIdResponse getMatchingProductForId(GetMatchingProductForIdRequest request) {
        return connection.call(
            new RequestType("GetMatchingProductForId", GetMatchingProductForIdResponse.class, servicePath),
            request);
    }

    public GetMyFeesEstimateResponse getMyFeesEstimate(GetMyFeesEstimateRequest request) {
        return connection.call(
            new RequestType("GetMyFeesEstimate", GetMyFeesEstimateResponse.class, servicePath),
            request);
    }

    public GetMyPriceForASINResponse getMyPriceForASIN(GetMyPriceForASINRequest request) {
        return connection.call(
            new RequestType("GetMyPriceForASIN", GetMyPriceForASINResponse.class, servicePath),
            request);
    }

    public GetMyPriceForSKUResponse getMyPriceForSKU(GetMyPriceForSKURequest request) {
        return connection.call(
            new RequestType("GetMyPriceForSKU", GetMyPriceForSKUResponse.class, servicePath),
            request);
    }

    public GetProductCategoriesForASINResponse getProductCategoriesForASIN(GetProductCategoriesForASINRequest request) {
        return connection.call(
            new RequestType("GetProductCategoriesForASIN", GetProductCategoriesForASINResponse.class, servicePath),
            request);
    }

    public GetProductCategoriesForSKUResponse getProductCategoriesForSKU(GetProductCategoriesForSKURequest request) {
        return connection.call(
            new RequestType("GetProductCategoriesForSKU", GetProductCategoriesForSKUResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public ListMatchingProductsResponse listMatchingProducts(ListMatchingProductsRequest request) {
        return connection.call(
            new RequestType("ListMatchingProducts", ListMatchingProductsResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MarketplaceWebServiceProductsException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
