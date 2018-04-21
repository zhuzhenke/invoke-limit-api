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

/**
 * This is the Products API section of the Marketplace Web Service.
 */
public interface MarketplaceWebServiceProducts {

    /**
     * Get Competitive Pricing For ASIN
     *
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
    GetCompetitivePricingForASINResponse getCompetitivePricingForASIN(
            GetCompetitivePricingForASINRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Competitive Pricing For SKU
     *
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
    GetCompetitivePricingForSKUResponse getCompetitivePricingForSKU(
            GetCompetitivePricingForSKURequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Lowest Offer Listings For ASIN
     *
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
    GetLowestOfferListingsForASINResponse getLowestOfferListingsForASIN(
            GetLowestOfferListingsForASINRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Lowest Offer Listings For SKU
     *
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
    GetLowestOfferListingsForSKUResponse getLowestOfferListingsForSKU(
            GetLowestOfferListingsForSKURequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Lowest Priced Offers For ASIN
     *
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
    GetLowestPricedOffersForASINResponse getLowestPricedOffersForASIN(
            GetLowestPricedOffersForASINRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Lowest Priced Offers For SKU
     *
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
    GetLowestPricedOffersForSKUResponse getLowestPricedOffersForSKU(
            GetLowestPricedOffersForSKURequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Matching Product
     *
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
    GetMatchingProductResponse getMatchingProduct(
            GetMatchingProductRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Matching Product For Id
     *
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
    GetMatchingProductForIdResponse getMatchingProductForId(
            GetMatchingProductForIdRequest request)
        throws MarketplaceWebServiceProductsException;

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
     * @return GetMyFeesEstimateResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    GetMyFeesEstimateResponse getMyFeesEstimate(
            GetMyFeesEstimateRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get My Price For ASIN
     *
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForASINRequest request.
     *
     * @return GetMyPriceForASINResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    GetMyPriceForASINResponse getMyPriceForASIN(
            GetMyPriceForASINRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get My Price For SKU
     *
     * <!-- Wrong doc in current code -->
     *
     * @param request
     *           GetMyPriceForSKURequest request.
     *
     * @return GetMyPriceForSKUResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    GetMyPriceForSKUResponse getMyPriceForSKU(
            GetMyPriceForSKURequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Product Categories For ASIN
     *
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
    GetProductCategoriesForASINResponse getProductCategoriesForASIN(
            GetProductCategoriesForASINRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * Get Product Categories For SKU
     *
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
    GetProductCategoriesForSKUResponse getProductCategoriesForSKU(
            GetProductCategoriesForSKURequest request)
        throws MarketplaceWebServiceProductsException;

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
     * @return GetServiceStatusResponse response.
     *
     * @throws MarketplaceWebServiceProductsException
     */
    GetServiceStatusResponse getServiceStatus(
            GetServiceStatusRequest request)
        throws MarketplaceWebServiceProductsException;

    /**
     * List Matching Products
     *
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
    ListMatchingProductsResponse listMatchingProducts(
            ListMatchingProductsRequest request)
        throws MarketplaceWebServiceProductsException;

}
