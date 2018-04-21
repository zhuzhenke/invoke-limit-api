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
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.samples;

import java.util.*;
import java.util.concurrent.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.amazonservices.mws.client.*;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.*;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;

/** Sample async call for GetPackageTrackingDetails. */
public class GetPackageTrackingDetailsAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeGetPackageTrackingDetails(
            FBAOutboundServiceMWSAsync client, 
            List<GetPackageTrackingDetailsRequest> requestList) {
        // Call the service async.
        List<Future<GetPackageTrackingDetailsResponse>> futureList = 
            new ArrayList<Future<GetPackageTrackingDetailsResponse>>();
        for (GetPackageTrackingDetailsRequest request : requestList) {
            Future<GetPackageTrackingDetailsResponse> future = 
                client.getPackageTrackingDetailsAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<GetPackageTrackingDetailsResponse> future : futureList) {
            Object xresponse;
            try {
                GetPackageTrackingDetailsResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof FBAOutboundServiceMWSException) {
                    // Exception properties are important for diagnostics.
                    FBAOutboundServiceMWSException ex = 
                        (FBAOutboundServiceMWSException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        FBAOutboundServiceMWSAsyncClient client = FBAOutboundServiceMWSSampleConfig.getAsyncClient();

        // Create a request list.
        List<GetPackageTrackingDetailsRequest> requestList = new ArrayList<GetPackageTrackingDetailsRequest>();
        GetPackageTrackingDetailsRequest request = new GetPackageTrackingDetailsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        int packageNumber = 1;
        request.setPackageNumber(packageNumber);
        requestList.add(request);

        // Make the calls.
        GetPackageTrackingDetailsAsyncSample.invokeGetPackageTrackingDetails(client, requestList);

    }

}
