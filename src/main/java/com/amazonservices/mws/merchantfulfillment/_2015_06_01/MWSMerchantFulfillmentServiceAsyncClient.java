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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.*;

public class MWSMerchantFulfillmentServiceAsyncClient extends MWSMerchantFulfillmentServiceClient implements MWSMerchantFulfillmentServiceAsync {

    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSMerchantFulfillmentServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSMerchantFulfillmentServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSMerchantFulfillmentServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<CancelShipmentResponse> cancelShipmentAsync(
        CancelShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CancelShipment", CancelShipmentResponse.class, servicePath),
            request);
    }

    public Future<CreateShipmentResponse> createShipmentAsync(
        CreateShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CreateShipment", CreateShipmentResponse.class, servicePath),
            request);
    }

    public Future<GetEligibleShippingServicesResponse> getEligibleShippingServicesAsync(
        GetEligibleShippingServicesRequest request) {
        return connection.callAsync(
            new RequestType("GetEligibleShippingServices", GetEligibleShippingServicesResponse.class, servicePath),
            request);
    }

    public Future<GetShipmentResponse> getShipmentAsync(
        GetShipmentRequest request) {
        return connection.callAsync(
            new RequestType("GetShipment", GetShipmentResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}
