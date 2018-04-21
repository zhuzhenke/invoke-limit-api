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

import java.util.concurrent.Future;
import com.amazonservices.mws.products.model.*;

/**
 * This is the Products API section of the Marketplace Web Service.
 */
public interface MarketplaceWebServiceProductsAsync extends MarketplaceWebServiceProducts {

    /**
     * Get Competitive Pricing For ASIN
     *
     * Gets competitive pricing and related information for a product identified by
     * the MarketplaceId and ASIN.
     *
     * @param request
     *           GetCompetitivePricingForASINRequest request.
     *
     * @return Future<GetCompetitivePricingForASINResponse> response.
     */
    Future<GetCompetitivePricingForASINResponse> getCompetitivePricingForASINAsync(
            GetCompetitivePricingForASINRequest request);

    /**
     * Get Competitive Pricing For SKU
     *
     * Gets competitive pricing and related information for a product identified by
     * the SellerId and SKU.
     *
     * @param request
     *           GetCompetitivePricingForSKURequest request.
     *
     * @return Future<GetCompetitivePricingForSKUResponse> response.
     */
    Future<GetCompetitivePricingForSKUResponse> getCompetitivePricingForSKUAsync(
            GetCompetitivePricingForSKURequest request);

    /**
     * Get Lowest Offer Listings For ASIN
     *
     * Gets some of the lowest prices based on the product identified by the given
     * MarketplaceId and ASIN.
     *
     * @param request
     *           GetLowestOfferListingsForASINRequest request.
     *
     * @return Future<GetLowestOfferListingsForASINResponse> response.
     */
    Future<GetLowestOfferListingsForASINResponse> getLowestOfferListingsForASINAsync(
            GetLowestOfferListingsForASINRequest request);

    /**
     * Get Lowest Offer Listings For SKU
     *
     * Gets some of the lowest prices based on the product identified by the given
     * SellerId and SKU.
     *
     * @param request
     *           GetLowestOfferListingsForSKURequest request.
     *
     * @return Future<GetLowestOfferListingsForSKUResponse> response.
     */
    Future<GetLowestOfferListingsForSKUResponse> getLowestOfferListingsForSKUAsync(
            GetLowestOfferListingsForSKURequest request);

    /**
     * Get Lowest Priced Offers For ASIN
     *
     * Retrieves the lowest priced offers based on the product identified by the given
     *     ASIN.
     *
     * @param request
     *           GetLowestPricedOffersForASINRequest request.
     *
     * @return Future<GetLowestPricedOffersForASINResponse> response.
     */
    Future<GetLowestPricedOffersForASINResponse> getLowestPricedOffersForASINAsync(
            GetLowestPricedOffersForASINRequest request);

    /**
     * Get Lowest Priced Offers For SKU
     *
     * Retrieves the lowest priced offers based on the product identified by the given
     *     SellerId and SKU.
     *
     * @param request
     *           GetLowestPricedOffersForSKURequest request.
     *
     * @return Future<GetLowestPricedOffersForSKUResponse> response.
     */
    Future<GetLowestPricedOffersForSKUResponse> getLowestPricedOffersForSKUAsync(
            GetLowestPricedOffersForSKURequest request);

    /**
     * Get Matching Product
     *
     * GetMatchingProduct will return the details (attributes) for the
     * given ASIN.
     *
     * @param request
     *           GetMatchingProductRequest request.
     *
     * @return Future<GetMatchingProductResponse> response.
     */
    Future<GetMatchingProductResponse> getMatchingProductAsync(
            GetMatchingProductRequest request);

    /**
     * Get Matching Product For Id
     *
     * GetMatchingProduct will return the details (attributes) for the
     * given Identifier list. Identifer type can be one of [SKU|ASIN|UPC|EAN|ISBN|GTIN|JAN]
     *
     * @param request
     *           GetMatchingProductForIdRequest request.
     *
     * @return Future<GetMatchingProductForIdResponse> response.
     */
    Future<GetMatchingProductForIdResponse> getMatchingProductForIdAsync(
            GetMatchingProductForIdRequest request);

    /**
     * Get My Fees Estimate
     *
     * Retrieves the fees estimate for the
     *         products identified by the given
     *         ASIN/SKU list.
     *
     * @param request
     *           GetMyFeesEstimateRequest request.
     *
     * @return Future<GetMyFeesEstimateResponse> response.
     */
    Future<GetMyFeesEstimateResponse> getMyFeesEstimateAsync(
            GetMyFeesEstimateRequest request);

    /**
     * Get My Price For ASIN
     *
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForASINRequest request.
     *
     * @return Future<GetMyPriceForASINResponse> response.
     */
    Future<GetMyPriceForASINResponse> getMyPriceForASINAsync(
            GetMyPriceForASINRequest request);

    /**
     * Get My Price For SKU
     *
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForSKURequest request.
     *
     * @return Future<GetMyPriceForSKUResponse> response.
     */
    Future<GetMyPriceForSKUResponse> getMyPriceForSKUAsync(
            GetMyPriceForSKURequest request);

    /**
     * Get Product Categories For ASIN
     *
     * Gets categories information for a product identified by
     * the MarketplaceId and ASIN.
     *
     * @param request
     *           GetProductCategoriesForASINRequest request.
     *
     * @return Future<GetProductCategoriesForASINResponse> response.
     */
    Future<GetProductCategoriesForASINResponse> getProductCategoriesForASINAsync(
            GetProductCategoriesForASINRequest request);

    /**
     * Get Product Categories For SKU
     *
     * Gets categories information for a product identified by
     * the SellerId and SKU.
     *
     * @param request
     *           GetProductCategoriesForSKURequest request.
     *
     * @return Future<GetProductCategoriesForSKUResponse> response.
     */
    Future<GetProductCategoriesForSKUResponse> getProductCategoriesForSKUAsync(
            GetProductCategoriesForSKURequest request);

    /**
     * Get Service Status
     *
     * Returns the service status of a particular MWS API section. The operation
     * takes no input.
     * All API sections within the API are required to implement this operation.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<GetServiceStatusResponse> getServiceStatusAsync(
            GetServiceStatusRequest request);

    /**
     * List Matching Products
     *
     * ListMatchingProducts can be used to
     * find products that match the given criteria.
     *
     * @param request
     *           ListMatchingProductsRequest request.
     *
     * @return Future<ListMatchingProductsResponse> response.
     */
    Future<ListMatchingProductsResponse> listMatchingProductsAsync(
            ListMatchingProductsRequest request);

}