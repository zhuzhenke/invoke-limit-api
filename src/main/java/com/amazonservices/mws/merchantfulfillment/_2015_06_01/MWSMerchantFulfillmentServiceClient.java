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

import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.*;
import com.amazonservices.mws.client.*;

public class MWSMerchantFulfillmentServiceClient implements MWSMerchantFulfillmentService {

    private static final String libraryName = "MWSMerchantFulfillmentService";

    private static final String libraryVersion = "2016-03-30";

    protected String servicePath;

    protected final MwsConnection connection;

    public MWSMerchantFulfillmentServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSMerchantFulfillmentServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public MWSMerchantFulfillmentServiceClient(
            String accessKey,
            String secretKey,
            MWSMerchantFulfillmentServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public MWSMerchantFulfillmentServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSMerchantFulfillmentServiceConfig());
    }

    public CancelShipmentResponse cancelShipment(CancelShipmentRequest request) {
        return connection.call(
            new RequestType("CancelShipment", CancelShipmentResponse.class, servicePath),
            request);
    }

    public CreateShipmentResponse createShipment(CreateShipmentRequest request) {
        return connection.call(
            new RequestType("CreateShipment", CreateShipmentResponse.class, servicePath),
            request);
    }

    public GetEligibleShippingServicesResponse getEligibleShippingServices(GetEligibleShippingServicesRequest request) {
        return connection.call(
            new RequestType("GetEligibleShippingServices", GetEligibleShippingServicesResponse.class, servicePath),
            request);
    }

    public GetShipmentResponse getShipment(GetShipmentRequest request) {
        return connection.call(
            new RequestType("GetShipment", GetShipmentResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSMerchantFulfillmentServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
