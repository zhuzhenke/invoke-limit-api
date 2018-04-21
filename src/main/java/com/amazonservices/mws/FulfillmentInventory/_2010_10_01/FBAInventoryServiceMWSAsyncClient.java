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
package com.amazonservices.mws.FulfillmentInventory._2010_10_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.*;

public class FBAInventoryServiceMWSAsyncClient extends FBAInventoryServiceMWSClient implements FBAInventoryServiceMWSAsync {

    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInventoryServiceMWSConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInventoryServiceMWSConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            FBAInventoryServiceMWSConfig config) {
        super(accessKey, secretKey, config);
    }

    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<ListInventorySupplyResponse> listInventorySupplyAsync(
        ListInventorySupplyRequest request) {
        return connection.callAsync(
            new RequestType("ListInventorySupply", ListInventorySupplyResponse.class, servicePath),
            request);
    }

    public Future<ListInventorySupplyByNextTokenResponse> listInventorySupplyByNextTokenAsync(
        ListInventorySupplyByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInventorySupplyByNextToken", ListInventorySupplyByNextTokenResponse.class, servicePath),
            request);
    }


}
