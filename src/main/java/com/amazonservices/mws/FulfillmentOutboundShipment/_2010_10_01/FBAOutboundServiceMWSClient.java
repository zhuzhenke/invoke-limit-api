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

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;
import com.amazonservices.mws.client.*;

public class FBAOutboundServiceMWSClient implements FBAOutboundServiceMWS {

    private static final String libraryName = "FBAOutboundServiceMWS";

    private static final String libraryVersion = "2016-02-01";

    protected String servicePath;

    protected final MwsConnection connection;

    public FBAOutboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAOutboundServiceMWSConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public FBAOutboundServiceMWSClient(
            String accessKey,
            String secretKey,
            FBAOutboundServiceMWSConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public FBAOutboundServiceMWSClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new FBAOutboundServiceMWSConfig());
    }

    public CancelFulfillmentOrderResponse cancelFulfillmentOrder(CancelFulfillmentOrderRequest request) {
        return connection.call(
            new RequestType("CancelFulfillmentOrder", CancelFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public CreateFulfillmentOrderResponse createFulfillmentOrder(CreateFulfillmentOrderRequest request) {
        return connection.call(
            new RequestType("CreateFulfillmentOrder", CreateFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public GetFulfillmentOrderResponse getFulfillmentOrder(GetFulfillmentOrderRequest request) {
        return connection.call(
            new RequestType("GetFulfillmentOrder", GetFulfillmentOrderResponse.class, servicePath),
            request);
    }

    public GetFulfillmentPreviewResponse getFulfillmentPreview(GetFulfillmentPreviewRequest request) {
        return connection.call(
            new RequestType("GetFulfillmentPreview", GetFulfillmentPreviewResponse.class, servicePath),
            request);
    }

    public GetPackageTrackingDetailsResponse getPackageTrackingDetails(GetPackageTrackingDetailsRequest request) {
        return connection.call(
            new RequestType("GetPackageTrackingDetails", GetPackageTrackingDetailsResponse.class, servicePath),
            request);
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    public ListAllFulfillmentOrdersResponse listAllFulfillmentOrders(ListAllFulfillmentOrdersRequest request) {
        return connection.call(
            new RequestType("ListAllFulfillmentOrders", ListAllFulfillmentOrdersResponse.class, servicePath),
            request);
    }

    public ListAllFulfillmentOrdersByNextTokenResponse listAllFulfillmentOrdersByNextToken(ListAllFulfillmentOrdersByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListAllFulfillmentOrdersByNextToken", ListAllFulfillmentOrdersByNextTokenResponse.class, servicePath),
            request);
    }

    public UpdateFulfillmentOrderResponse updateFulfillmentOrder(UpdateFulfillmentOrderRequest request) {
        return connection.call(
            new RequestType("UpdateFulfillmentOrder", UpdateFulfillmentOrderResponse.class, servicePath),
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
            return new FBAOutboundServiceMWSException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
