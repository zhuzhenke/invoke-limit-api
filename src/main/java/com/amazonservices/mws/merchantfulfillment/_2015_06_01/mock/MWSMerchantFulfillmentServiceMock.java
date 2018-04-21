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
 * MWS Merchant Fulfillment Service
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.merchantfulfillment._2015_06_01.*;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of MWSMerchantFulfillmentService that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the MWS Merchant Fulfillment Service service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MWSMerchantFulfillmentServiceMock 
        implements MWSMerchantFulfillmentService, MWSMerchantFulfillmentServiceAsync {

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
     * Cancel Shipment
     * Cancels an existing shipment.  This will only succeed if the cancellation window has not passed and if the shipment
     *     has not been cancelled already.
     *
     * @param request
     *           CancelShipmentRequest request.
     *
     * @return CancelShipmentResponse response.
     *
     * @throws MWSMerchantFulfillmentServiceException
     */
    public CancelShipmentResponse cancelShipment(CancelShipmentRequest request) 
            throws MWSMerchantFulfillmentServiceException {
        return newResponse(CancelShipmentResponse.class);
    }

    /**
    * Cancel Shipment
    * Cancels an existing shipment.  This will only succeed if the cancellation window has not passed and if the shipment
     *     has not been cancelled already.
    *
    * @param request
    *           CancelShipmentRequest request.
    *
    * @return Future<CancelShipmentResponse> Future containing completed response
    *
    * @throws MWSMerchantFulfillmentServiceException
    */
    public Future<CancelShipmentResponse> cancelShipmentAsync(CancelShipmentRequest request) {
        return newFuture(cancelShipment(request));
    }

    /**
     * Create Shipment
     * Creates a shipment for the shipping information specified.  Purchases and returns a label for the specified
     *     shipping service or shipping service offering.
     *
     * @param request
     *           CreateShipmentRequest request.
     *
     * @return CreateShipmentResponse response.
     *
     * @throws MWSMerchantFulfillmentServiceException
     */
    public CreateShipmentResponse createShipment(CreateShipmentRequest request) 
            throws MWSMerchantFulfillmentServiceException {
        return newResponse(CreateShipmentResponse.class);
    }

    /**
    * Create Shipment
    * Creates a shipment for the shipping information specified.  Purchases and returns a label for the specified
     *     shipping service or shipping service offering.
    *
    * @param request
    *           CreateShipmentRequest request.
    *
    * @return Future<CreateShipmentResponse> Future containing completed response
    *
    * @throws MWSMerchantFulfillmentServiceException
    */
    public Future<CreateShipmentResponse> createShipmentAsync(CreateShipmentRequest request) {
        return newFuture(createShipment(request));
    }

    /**
     * Get Eligible Shipping Services
     * Gets a list of eligible shipping services for the shipment information specified.  The ShippingServiceId or
     *     ShippingServiceOfferingId can be used in CreateShipment to specify the shipping service or the specific offer
     *     respectively.  A list of carriers that are temporarily unavailable is also returned.
     *
     * @param request
     *           GetEligibleShippingServicesRequest request.
     *
     * @return GetEligibleShippingServicesResponse response.
     *
     * @throws MWSMerchantFulfillmentServiceException
     */
    public GetEligibleShippingServicesResponse getEligibleShippingServices(GetEligibleShippingServicesRequest request) 
            throws MWSMerchantFulfillmentServiceException {
        return newResponse(GetEligibleShippingServicesResponse.class);
    }

    /**
    * Get Eligible Shipping Services
    * Gets a list of eligible shipping services for the shipment information specified.  The ShippingServiceId or
     *     ShippingServiceOfferingId can be used in CreateShipment to specify the shipping service or the specific offer
     *     respectively.  A list of carriers that are temporarily unavailable is also returned.
    *
    * @param request
    *           GetEligibleShippingServicesRequest request.
    *
    * @return Future<GetEligibleShippingServicesResponse> Future containing completed response
    *
    * @throws MWSMerchantFulfillmentServiceException
    */
    public Future<GetEligibleShippingServicesResponse> getEligibleShippingServicesAsync(GetEligibleShippingServicesRequest request) {
        return newFuture(getEligibleShippingServices(request));
    }

    /**
     * Get Shipment
     * Gets an existing shipment, including the label status, label content, shipping information.
     *
     * @param request
     *           GetShipmentRequest request.
     *
     * @return GetShipmentResponse response.
     *
     * @throws MWSMerchantFulfillmentServiceException
     */
    public GetShipmentResponse getShipment(GetShipmentRequest request) 
            throws MWSMerchantFulfillmentServiceException {
        return newResponse(GetShipmentResponse.class);
    }

    /**
    * Get Shipment
    * Gets an existing shipment, including the label status, label content, shipping information.
    *
    * @param request
    *           GetShipmentRequest request.
    *
    * @return Future<GetShipmentResponse> Future containing completed response
    *
    * @throws MWSMerchantFulfillmentServiceException
    */
    public Future<GetShipmentResponse> getShipmentAsync(GetShipmentRequest request) {
        return newFuture(getShipment(request));
    }

    /**
     * Get Service Status
     * 
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws MWSMerchantFulfillmentServiceException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws MWSMerchantFulfillmentServiceException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * 
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws MWSMerchantFulfillmentServiceException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

}
