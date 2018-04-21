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
 * FBA Inventory Service MWS
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.FulfillmentInventory._2010_10_01.*;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of FBAInventoryServiceMWS that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the FBA Inventory Service MWS service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class FBAInventoryServiceMWSMock 
        implements FBAInventoryServiceMWS, FBAInventoryServiceMWSAsync {

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
     * Gets the status of the service.
     *     Status is one of GREEN, RED representing:
     *     GREEN: The service section is operating normally.
     *     RED: The service section disruption.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws FBAInventoryServiceMWSException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws FBAInventoryServiceMWSException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Gets the status of the service.
     *     Status is one of GREEN, RED representing:
     *     GREEN: The service section is operating normally.
     *     RED: The service section disruption.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws FBAInventoryServiceMWSException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * List Inventory Supply
     * Get information about the supply of seller-owned inventory in
     *     Amazon's fulfillment network. "Supply" is inventory that is available
     *     for fulfilling (a.k.a. Multi-Channel Fulfillment) orders. In general
     *     this includes all sellable inventory that has been received by Amazon,
     *     that is not reserved for existing orders or for internal FC processes,
     *     and also inventory expected to be received from inbound shipments.
     * 
     *     This operation provides 2 typical usages by setting different 
     *     ListInventorySupplyRequest value:
     *     
     *     1. Set value to SellerSkus and not set value to QueryStartDateTime, 
     *     this operation will return all sellable inventory that has been received 
     *     by Amazon's fulfillment network for these SellerSkus.
     * 
     *     2. Not set value to SellerSkus and set value to QueryStartDateTime,
     *     This operation will return information about the supply of all seller-owned
     *     inventory in Amazon's fulfillment network, for inventory items that may have had
     *     recent changes in inventory levels. It provides the most efficient mechanism 
     *     for clients to maintain local copies of inventory supply data.
     * 
     *     Only 1 of these 2 parameters (SellerSkus and QueryStartDateTime) can be set value for 1 request.
     *     If both with values or neither with values, an exception will be thrown.
     * 
     *     This operation is used with ListInventorySupplyByNextToken
     *     to paginate over the resultset. Begin pagination by invoking the
     *     ListInventorySupply operation, and retrieve the first set of
     *     results. If more results are available,continuing iteratively requesting further 
     *     pages results by invoking the ListInventorySupplyByNextToken operation (each time 
     *     passing in the NextToken value from the previous result), until the returned NextToken
     *     is null, indicating no further results are available.
     *
     * @param request
     *           ListInventorySupplyRequest request.
     *
     * @return ListInventorySupplyResponse response.
     *
     * @throws FBAInventoryServiceMWSException
     */
    public ListInventorySupplyResponse listInventorySupply(ListInventorySupplyRequest request) 
            throws FBAInventoryServiceMWSException {
        return newResponse(ListInventorySupplyResponse.class);
    }

    /**
    * List Inventory Supply
    * Get information about the supply of seller-owned inventory in
     *     Amazon's fulfillment network. "Supply" is inventory that is available
     *     for fulfilling (a.k.a. Multi-Channel Fulfillment) orders. In general
     *     this includes all sellable inventory that has been received by Amazon,
     *     that is not reserved for existing orders or for internal FC processes,
     *     and also inventory expected to be received from inbound shipments.
     * 
     *     This operation provides 2 typical usages by setting different 
     *     ListInventorySupplyRequest value:
     *     
     *     1. Set value to SellerSkus and not set value to QueryStartDateTime, 
     *     this operation will return all sellable inventory that has been received 
     *     by Amazon's fulfillment network for these SellerSkus.
     * 
     *     2. Not set value to SellerSkus and set value to QueryStartDateTime,
     *     This operation will return information about the supply of all seller-owned
     *     inventory in Amazon's fulfillment network, for inventory items that may have had
     *     recent changes in inventory levels. It provides the most efficient mechanism 
     *     for clients to maintain local copies of inventory supply data.
     * 
     *     Only 1 of these 2 parameters (SellerSkus and QueryStartDateTime) can be set value for 1 request.
     *     If both with values or neither with values, an exception will be thrown.
     * 
     *     This operation is used with ListInventorySupplyByNextToken
     *     to paginate over the resultset. Begin pagination by invoking the
     *     ListInventorySupply operation, and retrieve the first set of
     *     results. If more results are available,continuing iteratively requesting further 
     *     pages results by invoking the ListInventorySupplyByNextToken operation (each time 
     *     passing in the NextToken value from the previous result), until the returned NextToken
     *     is null, indicating no further results are available.
    *
    * @param request
    *           ListInventorySupplyRequest request.
    *
    * @return Future<ListInventorySupplyResponse> Future containing completed response
    *
    * @throws FBAInventoryServiceMWSException
    */
    public Future<ListInventorySupplyResponse> listInventorySupplyAsync(ListInventorySupplyRequest request) {
        return newFuture(listInventorySupply(request));
    }

    /**
     * List Inventory Supply By Next Token
     * Continues pagination over a resultset of inventory data for inventory
     *     items.
     *     
     *     This operation is used in conjunction with ListUpdatedInventorySupply.
     *     Please refer to documentation for that operation for further details.
     *
     * @param request
     *           ListInventorySupplyByNextTokenRequest request.
     *
     * @return ListInventorySupplyByNextTokenResponse response.
     *
     * @throws FBAInventoryServiceMWSException
     */
    public ListInventorySupplyByNextTokenResponse listInventorySupplyByNextToken(ListInventorySupplyByNextTokenRequest request) 
            throws FBAInventoryServiceMWSException {
        return newResponse(ListInventorySupplyByNextTokenResponse.class);
    }

    /**
    * List Inventory Supply By Next Token
    * Continues pagination over a resultset of inventory data for inventory
     *     items.
     *     
     *     This operation is used in conjunction with ListUpdatedInventorySupply.
     *     Please refer to documentation for that operation for further details.
    *
    * @param request
    *           ListInventorySupplyByNextTokenRequest request.
    *
    * @return Future<ListInventorySupplyByNextTokenResponse> Future containing completed response
    *
    * @throws FBAInventoryServiceMWSException
    */
    public Future<ListInventorySupplyByNextTokenResponse> listInventorySupplyByNextTokenAsync(ListInventorySupplyByNextTokenRequest request) {
        return newFuture(listInventorySupplyByNextToken(request));
    }

}
