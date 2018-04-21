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
package com.amazonservices.mws.sellers.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.sellers.*;
import com.amazonservices.mws.sellers.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of MarketplaceWebServiceSellers that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the Marketplace Web Service Sellers service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MarketplaceWebServiceSellersMock 
        implements MarketplaceWebServiceSellers, MarketplaceWebServiceSellersAsync {

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
     * Get Service Status
     * Returns the service status of a particular MWS API section. The operation
     *         takes no input.
     *         All API sections within the API are required to implement this operation.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MarketplaceWebServiceSellersException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws MarketplaceWebServiceSellersException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Returns the service status of a particular MWS API section. The operation
     *         takes no input.
     *         All API sections within the API are required to implement this operation.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceSellersException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * List Marketplace Participations
     * Returns a list of marketplaces that the seller submitting the request can sell in, 
     *         and a list of participations that include seller-specific information in that marketplace.
     *
     * @param request
     *           ListMarketplaceParticipationsRequest request.
     *
     * @return ListMarketplaceParticipationsResponse response.
     *
     * @throws MarketplaceWebServiceSellersException
     */
    public ListMarketplaceParticipationsResponse listMarketplaceParticipations(ListMarketplaceParticipationsRequest request) 
            throws MarketplaceWebServiceSellersException {
        return newResponse(ListMarketplaceParticipationsResponse.class);
    }

    /**
    * List Marketplace Participations
    * Returns a list of marketplaces that the seller submitting the request can sell in, 
     *         and a list of participations that include seller-specific information in that marketplace.
    *
    * @param request
    *           ListMarketplaceParticipationsRequest request.
    *
    * @return Future<ListMarketplaceParticipationsResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceSellersException
    */
    public Future<ListMarketplaceParticipationsResponse> listMarketplaceParticipationsAsync(ListMarketplaceParticipationsRequest request) {
        return newFuture(listMarketplaceParticipations(request));
    }

    /**
     * List Marketplace Participations By Next Token
     * Returns the next page of marketplaces and participations using the NextToken value 
     *         that was returned by your previous request to either ListMarketplaceParticipations or
     *         ListMarketplaceParticipationsByNextToken.
     *
     * @param request
     *           ListMarketplaceParticipationsByNextTokenRequest request.
     *
     * @return ListMarketplaceParticipationsByNextTokenResponse response.
     *
     * @throws MarketplaceWebServiceSellersException
     */
    public ListMarketplaceParticipationsByNextTokenResponse listMarketplaceParticipationsByNextToken(ListMarketplaceParticipationsByNextTokenRequest request) 
            throws MarketplaceWebServiceSellersException {
        return newResponse(ListMarketplaceParticipationsByNextTokenResponse.class);
    }

    /**
    * List Marketplace Participations By Next Token
    * Returns the next page of marketplaces and participations using the NextToken value 
     *         that was returned by your previous request to either ListMarketplaceParticipations or
     *         ListMarketplaceParticipationsByNextToken.
    *
    * @param request
    *           ListMarketplaceParticipationsByNextTokenRequest request.
    *
    * @return Future<ListMarketplaceParticipationsByNextTokenResponse> Future containing completed response
    *
    * @throws MarketplaceWebServiceSellersException
    */
    public Future<ListMarketplaceParticipationsByNextTokenResponse> listMarketplaceParticipationsByNextTokenAsync(ListMarketplaceParticipationsByNextTokenRequest request) {
        return newFuture(listMarketplaceParticipationsByNextToken(request));
    }

}
