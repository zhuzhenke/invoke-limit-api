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
package com.amazonservices.mws.merchantfulfillment._2015_06_01;

import java.util.concurrent.Future;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.*;

/**
 * This is the Merchant Fulfillment API section of the Marketplace Web Service.  It allows clients to view shipping services that meet the specific criteria.  Also, it allows clients to create shipments that result in a shipping label being generated (and paid for by the seller).  Lastly, clients can cancel the label and according to different carrier rules get refunds for their unused labels.
 */
public interface MWSMerchantFulfillmentServiceAsync extends MWSMerchantFulfillmentService {

    /**
     * Cancel Shipment
     *
     * Cancels an existing shipment.  This will only succeed if the cancellation window has not passed and if the shipment
     *     has not been cancelled already.
     *
     * @param request
     *           CancelShipmentRequest request.
     *
     * @return Future<CancelShipmentResponse> response.
     */
    Future<CancelShipmentResponse> cancelShipmentAsync(
            CancelShipmentRequest request);

    /**
     * Create Shipment
     *
     * Creates a shipment for the shipping information specified.  Purchases and returns a label for the specified
     *     shipping service or shipping service offering.
     *
     * @param request
     *           CreateShipmentRequest request.
     *
     * @return Future<CreateShipmentResponse> response.
     */
    Future<CreateShipmentResponse> createShipmentAsync(
            CreateShipmentRequest request);

    /**
     * Get Eligible Shipping Services
     *
     * Gets a list of eligible shipping services for the shipment information specified.  The ShippingServiceId or
     *     ShippingServiceOfferingId can be used in CreateShipment to specify the shipping service or the specific offer
     *     respectively.  A list of carriers that are temporarily unavailable is also returned.
     *
     * @param request
     *           GetEligibleShippingServicesRequest request.
     *
     * @return Future<GetEligibleShippingServicesResponse> response.
     */
    Future<GetEligibleShippingServicesResponse> getEligibleShippingServicesAsync(
            GetEligibleShippingServicesRequest request);

    /**
     * Get Shipment
     *
     * Gets an existing shipment, including the label status, label content, shipping information.
     *
     * @param request
     *           GetShipmentRequest request.
     *
     * @return Future<GetShipmentResponse> response.
     */
    Future<GetShipmentResponse> getShipmentAsync(
            GetShipmentRequest request);

    /**
     * Get Service Status
     *
     * 
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<GetServiceStatusResponse> getServiceStatusAsync(
            GetServiceStatusRequest request);

}