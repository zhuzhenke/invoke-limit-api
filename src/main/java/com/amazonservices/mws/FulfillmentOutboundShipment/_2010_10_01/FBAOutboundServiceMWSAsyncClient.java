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
 * FBA Outbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;

public class FBAOutboundServiceMWSAsyncClient extends FBAOutboundServiceMWSClient implements FBAOutboundServiceMWSAsync {

    public FBAOutboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAOutboundServiceMWSConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public FBAOutboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAOutboundServiceMWSConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public FBAOutboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            FBAOutboundServiceMWSConfig config) {
        super(accessKey, secretKey, config);
    }

    public FBAOutboundServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<CancelFulfillmentOrderResponse> cancelFulfillmentOrderAsync(
        CancelFulfillmentOrderRequest request) {
        return connection.callAsync(
            new RequestType("CancelFulfillmentOrder", CancelFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public Future<CreateFulfillmentOrderResponse> createFulfillmentOrderAsync(
        CreateFulfillmentOrderRequest request) {
        return connection.callAsync(
            new RequestType("CreateFulfillmentOrder", CreateFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public Future<GetFulfillmentOrderResponse> getFulfillmentOrderAsync(
        GetFulfillmentOrderRequest request) {
        return connection.callAsync(
            new RequestType("GetFulfillmentOrder", GetFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public Future<GetFulfillmentPreviewResponse> getFulfillmentPreviewAsync(
        GetFulfillmentPreviewRequest request) {
        return connection.callAsync(
            new RequestType("GetFulfillmentPreview", GetFulfillmentPreviewResponse.class, servicePath),
            request);
    }

    public Future<GetPackageTrackingDetailsResponse> getPackageTrackingDetailsAsync(
        GetPackageTrackingDetailsRequest request) {
        return connection.callAsync(
            new RequestType("GetPackageTrackingDetails", GetPackageTrackingDetailsResponse.class, servicePath),
            request);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<ListAllFulfillmentOrdersResponse> listAllFulfillmentOrdersAsync(
        ListAllFulfillmentOrdersRequest request) {
        return connection.callAsync(
            new RequestType("ListAllFulfillmentOrders", ListAllFulfillmentOrdersResponse.class, servicePath),
            request);
    }

    public Future<ListAllFulfillmentOrdersByNextTokenResponse> listAllFulfillmentOrdersByNextTokenAsync(
        ListAllFulfillmentOrdersByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListAllFulfillmentOrdersByNextToken", ListAllFulfillmentOrdersByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<UpdateFulfillmentOrderResponse> updateFulfillmentOrderAsync(
        UpdateFulfillmentOrderRequest request) {
        return connection.callAsync(
            new RequestType("UpdateFulfillmentOrder", UpdateFulfillmentOrderResponse.class, servicePath),
            request);
    }


}
