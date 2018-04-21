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
package com.amazonservices.mws.products.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.products.*;
import com.amazonservices.mws.products.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of MarketplaceWebServiceProducts that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the Marketplace Web Service Products service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MarketplaceWebServiceProductsMock 
        implements MarketplaceWebServiceProducts, MarketplaceWebServiceProductsAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     * 
     * @param cls
     * 
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            ResponseHeaderMetadata rhmd = new ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * Get Competitive Pricing For ASIN
     * Gets competitive pricing and related information for a product identified by
     * the MarketplaceId and ASIN.
     *
     * @param request
     *           GetCompetitivePricingForASINRequest request.
     *
     * @return GetCompetitivePricingForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetCompetitivePricingForASINResponse getCompetitivePricingForASIN(GetCompetitivePricingForASINRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetCompetitivePricingForASINResponse.class);
    }

    /**
    * Get Competitive Pricing For ASIN
    * Gets competitive pricing and related information for a product identified by
     * the MarketplaceId and ASIN.
    *
    * @param request
    *           GetCompetitivePricingForASINRequest request.
    *
    * @return Future<GetCompetitivePricingForASINResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetCompetitivePricingForASINResponse> getCompetitivePricingForASINAsync(GetCompetitivePricingForASINRequest request) {
        return newFuture(getCompetitivePricingForASIN(request));
    }

    /**
     * Get Competitive Pricing For SKU
     * Gets competitive pricing and related information for a product identified by
     * the SellerId and SKU.
     *
     * @param request
     *           GetCompetitivePricingForSKURequest request.
     *
     * @return GetCompetitivePricingForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetCompetitivePricingForSKUResponse getCompetitivePricingForSKU(GetCompetitivePricingForSKURequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetCompetitivePricingForSKUResponse.class);
    }

    /**
    * Get Competitive Pricing For SKU
    * Gets competitive pricing and related information for a product identified by
     * the SellerId and SKU.
    *
    * @param request
    *           GetCompetitivePricingForSKURequest request.
    *
    * @return Future<GetCompetitivePricingForSKUResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetCompetitivePricingForSKUResponse> getCompetitivePricingForSKUAsync(GetCompetitivePricingForSKURequest request) {
        return newFuture(getCompetitivePricingForSKU(request));
    }

    /**
     * Get Lowest Offer Listings For ASIN
     * Gets some of the lowest prices based on the product identified by the given
     * MarketplaceId and ASIN.
     *
     * @param request
     *           GetLowestOfferListingsForASINRequest request.
     *
     * @return GetLowestOfferListingsForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetLowestOfferListingsForASINResponse getLowestOfferListingsForASIN(GetLowestOfferListingsForASINRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetLowestOfferListingsForASINResponse.class);
    }

    /**
    * Get Lowest Offer Listings For ASIN
    * Gets some of the lowest prices based on the product identified by the given
     * MarketplaceId and ASIN.
    *
    * @param request
    *           GetLowestOfferListingsForASINRequest request.
    *
    * @return Future<GetLowestOfferListingsForASINResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetLowestOfferListingsForASINResponse> getLowestOfferListingsForASINAsync(GetLowestOfferListingsForASINRequest request) {
        return newFuture(getLowestOfferListingsForASIN(request));
    }

    /**
     * Get Lowest Offer Listings For SKU
     * Gets some of the lowest prices based on the product identified by the given
     * SellerId and SKU.
     *
     * @param request
     *           GetLowestOfferListingsForSKURequest request.
     *
     * @return GetLowestOfferListingsForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetLowestOfferListingsForSKUResponse getLowestOfferListingsForSKU(GetLowestOfferListingsForSKURequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetLowestOfferListingsForSKUResponse.class);
    }

    /**
    * Get Lowest Offer Listings For SKU
    * Gets some of the lowest prices based on the product identified by the given
     * SellerId and SKU.
    *
    * @param request
    *           GetLowestOfferListingsForSKURequest request.
    *
    * @return Future<GetLowestOfferListingsForSKUResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetLowestOfferListingsForSKUResponse> getLowestOfferListingsForSKUAsync(GetLowestOfferListingsForSKURequest request) {
        return newFuture(getLowestOfferListingsForSKU(request));
    }

    /**
     * Get Lowest Priced Offers For ASIN
     * Retrieves the lowest priced offers based on the product identified by the given
     *     ASIN.
     *
     * @param request
     *           GetLowestPricedOffersForASINRequest request.
     *
     * @return GetLowestPricedOffersForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetLowestPricedOffersForASINResponse getLowestPricedOffersForASIN(GetLowestPricedOffersForASINRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetLowestPricedOffersForASINResponse.class);
    }

    /**
    * Get Lowest Priced Offers For ASIN
    * Retrieves the lowest priced offers based on the product identified by the given
     *     ASIN.
    *
    * @param request
    *           GetLowestPricedOffersForASINRequest request.
    *
    * @return Future<GetLowestPricedOffersForASINResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetLowestPricedOffersForASINResponse> getLowestPricedOffersForASINAsync(GetLowestPricedOffersForASINRequest request) {
        return newFuture(getLowestPricedOffersForASIN(request));
    }

    /**
     * Get Lowest Priced Offers For SKU
     * Retrieves the lowest priced offers based on the product identified by the given
     *     SellerId and SKU.
     *
     * @param request
     *           GetLowestPricedOffersForSKURequest request.
     *
     * @return GetLowestPricedOffersForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetLowestPricedOffersForSKUResponse getLowestPricedOffersForSKU(GetLowestPricedOffersForSKURequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetLowestPricedOffersForSKUResponse.class);
    }

    /**
    * Get Lowest Priced Offers For SKU
    * Retrieves the lowest priced offers based on the product identified by the given
     *     SellerId and SKU.
    *
    * @param request
    *           GetLowestPricedOffersForSKURequest request.
    *
    * @return Future<GetLowestPricedOffersForSKUResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetLowestPricedOffersForSKUResponse> getLowestPricedOffersForSKUAsync(GetLowestPricedOffersForSKURequest request) {
        return newFuture(getLowestPricedOffersForSKU(request));
    }

    /**
     * Get Matching Product
     * GetMatchingProduct will return the details (attributes) for the
     * given ASIN.
     *
     * @param request
     *           GetMatchingProductRequest request.
     *
     * @return GetMatchingProductResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetMatchingProductResponse getMatchingProduct(GetMatchingProductRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetMatchingProductResponse.class);
    }

    /**
    * Get Matching Product
    * GetMatchingProduct will return the details (attributes) for the
     * given ASIN.
    *
    * @param request
    *           GetMatchingProductRequest request.
    *
    * @return Future<GetMatchingProductResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetMatchingProductResponse> getMatchingProductAsync(GetMatchingProductRequest request) {
        return newFuture(getMatchingProduct(request));
    }

    /**
     * Get Matching Product For Id
     * GetMatchingProduct will return the details (attributes) for the
     * given Identifier list. Identifer type can be one of [SKU|ASIN|UPC|EAN|ISBN|GTIN|JAN]
     *
     * @param request
     *           GetMatchingProductForIdRequest request.
     *
     * @return GetMatchingProductForIdResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetMatchingProductForIdResponse getMatchingProductForId(GetMatchingProductForIdRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetMatchingProductForIdResponse.class);
    }

    /**
    * Get Matching Product For Id
    * GetMatchingProduct will return the details (attributes) for the
     * given Identifier list. Identifer type can be one of [SKU|ASIN|UPC|EAN|ISBN|GTIN|JAN]
    *
    * @param request
    *           GetMatchingProductForIdRequest request.
    *
    * @return Future<GetMatchingProductForIdResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetMatchingProductForIdResponse> getMatchingProductForIdAsync(GetMatchingProductForIdRequest request) {
        return newFuture(getMatchingProductForId(request));
    }

    /**
     * Get My Fees Estimate
     * Retrieves the fees estimate for the
     *         products identified by the given
     *         ASIN/SKU list.
     *
     * @param request
     *           GetMyFeesEstimateRequest request.
     *
     * @return GetMyFeesEstimateResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetMyFeesEstimateResponse getMyFeesEstimate(GetMyFeesEstimateRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetMyFeesEstimateResponse.class);
    }

    /**
    * Get My Fees Estimate
    * Retrieves the fees estimate for the
     *         products identified by the given
     *         ASIN/SKU list.
    *
    * @param request
    *           GetMyFeesEstimateRequest request.
    *
    * @return Future<GetMyFeesEstimateResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetMyFeesEstimateResponse> getMyFeesEstimateAsync(GetMyFeesEstimateRequest request) {
        return newFuture(getMyFeesEstimate(request));
    }

    /**
     * Get My Price For ASIN
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForASINRequest request.
     *
     * @return GetMyPriceForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetMyPriceForASINResponse getMyPriceForASIN(GetMyPriceForASINRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetMyPriceForASINResponse.class);
    }

    /**
    * Get My Price For ASIN
    * <!-- Wrong doc in current code -->
    *
    * @param request
    *           GetMyPriceForASINRequest request.
    *
    * @return Future<GetMyPriceForASINResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetMyPriceForASINResponse> getMyPriceForASINAsync(GetMyPriceForASINRequest request) {
        return newFuture(getMyPriceForASIN(request));
    }

    /**
     * Get My Price For SKU
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForSKURequest request.
     *
     * @return GetMyPriceForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetMyPriceForSKUResponse getMyPriceForSKU(GetMyPriceForSKURequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetMyPriceForSKUResponse.class);
    }

    /**
    * Get My Price For SKU
    * <!-- Wrong doc in current code -->
    *
    * @param request
    *           GetMyPriceForSKURequest request.
    *
    * @return Future<GetMyPriceForSKUResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetMyPriceForSKUResponse> getMyPriceForSKUAsync(GetMyPriceForSKURequest request) {
        return newFuture(getMyPriceForSKU(request));
    }

    /**
     * Get Product Categories For ASIN
     * Gets categories information for a product identified by
     * the MarketplaceId and ASIN.
     *
     * @param request
     *           GetProductCategoriesForASINRequest request.
     *
     * @return GetProductCategoriesForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetProductCategoriesForASINResponse getProductCategoriesForASIN(GetProductCategoriesForASINRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetProductCategoriesForASINResponse.class);
    }

    /**
    * Get Product Categories For ASIN
    * Gets categories information for a product identified by
     * the MarketplaceId and ASIN.
    *
    * @param request
    *           GetProductCategoriesForASINRequest request.
    *
    * @return Future<GetProductCategoriesForASINResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetProductCategoriesForASINResponse> getProductCategoriesForASINAsync(GetProductCategoriesForASINRequest request) {
        return newFuture(getProductCategoriesForASIN(request));
    }

    /**
     * Get Product Categories For SKU
     * Gets categories information for a product identified by
     * the SellerId and SKU.
     *
     * @param request
     *           GetProductCategoriesForSKURequest request.
     *
     * @return GetProductCategoriesForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetProductCategoriesForSKUResponse getProductCategoriesForSKU(GetProductCategoriesForSKURequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetProductCategoriesForSKUResponse.class);
    }

    /**
    * Get Product Categories For SKU
    * Gets categories information for a product identified by
     * the SellerId and SKU.
    *
    * @param request
    *           GetProductCategoriesForSKURequest request.
    *
    * @return Future<GetProductCategoriesForSKUResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetProductCategoriesForSKUResponse> getProductCategoriesForSKUAsync(GetProductCategoriesForSKURequest request) {
        return newFuture(getProductCategoriesForSKU(request));
    }

    /**
     * Get Service Status
     * Returns the service status of a particular MWS API section. The operation
     * takes no input.
     * All API sections within the API are required to implement this operation.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Returns the service status of a particular MWS API section. The operation
     * takes no input.
     * All API sections within the API are required to implement this operation.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * List Matching Products
     * ListMatchingProducts can be used to
     * find products that match the given criteria.
     *
     * @param request
     *           ListMatchingProductsRequest request.
     *
     * @return ListMatchingProductsResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    public ListMatchingProductsResponse listMatchingProducts(ListMatchingProductsRequest request) 
            throws MarketplaceWebServiceProductsException {
        return newResponse(ListMatchingProductsResponse.class);
    }

    /**
    * List Matching Products
    * ListMatchingProducts can be used to
     * find products that match the given criteria.
    *
    * @param request
    *           ListMatchingProductsRequest request.
    *
    * @return Future<ListMatchingProductsResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceProductsException
    */
    public Future<ListMatchingProductsResponse> listMatchingProductsAsync(ListMatchingProductsRequest request) {
        return newFuture(listMatchingProducts(request));
    }

}
