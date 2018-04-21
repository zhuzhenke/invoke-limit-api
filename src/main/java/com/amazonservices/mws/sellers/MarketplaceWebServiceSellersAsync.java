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

import java.util.concurrent.Future;
import com.amazonservices.mws.sellers.model.*;

/**
 * This is the Sellers API section of the Marketplace Web Service.
 */
public interface MarketplaceWebServiceSellersAsync extends MarketplaceWebServiceSellers {

    /**
     * Get Service Status
     *
     * Returns the service status of a particular MWS API section. The operation
     *         takes no input.
     *         All API sections within the API are required to implement this operation.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<GetServiceStatusResponse> getServiceStatusAsync(
            GetServiceStatusRequest request);

    /**
     * List Marketplace Participations
     *
     * Returns a list of marketplaces that the seller submitting the request can sell in, 
     *         and a list of participations that include seller-specific information in that marketplace.
     *
     * @param request
     *           ListMarketplaceParticipationsRequest request.
     *
     * @return Future<ListMarketplaceParticipationsResponse> response.
     */
    Future<ListMarketplaceParticipationsResponse> listMarketplaceParticipationsAsync(
            ListMarketplaceParticipationsRequest request);

    /**
     * List Marketplace Participations By Next Token
     *
     * Returns the next page of marketplaces and participations using the NextToken value 
     *         that was returned by your previous request to either ListMarketplaceParticipations or
     *         ListMarketplaceParticipationsByNextToken.
     *
     * @param request
     *           ListMarketplaceParticipationsByNextTokenRequest request.
     *
     * @return Future<ListMarketplaceParticipationsByNextTokenResponse> response.
     */
    Future<ListMarketplaceParticipationsByNextTokenResponse> listMarketplaceParticipationsByNextTokenAsync(
            ListMarketplaceParticipationsByNextTokenRequest request);

}