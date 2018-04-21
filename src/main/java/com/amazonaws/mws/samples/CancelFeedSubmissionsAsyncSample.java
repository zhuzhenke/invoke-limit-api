/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package com.amazonaws.mws.samples;

import java.util.List;
import java.util.ArrayList;
import com.amazonaws.mws.*;
import com.amazonaws.mws.model.*;
import java.util.concurrent.Future;

/**
 *
 * Cancel Feed Submissions  Samples
 *
 *
 */
public class CancelFeedSubmissionsAsyncSample {

    /**
     * Just add a few required parameters, and try the service
     * Cancel Feed Submissions functionality
     *
     * @param args unused
     */
    public static void main(String... args) {

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
        final String accessKeyId = "<Your Access Key ID>";
        final String secretAccessKey = "<Your Secret Access Key>";
        final String appName = "<Your Application or Company Name>";
        final String appVersion = "<Your Application Version or Build Number or Release Date>";
        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        // US
        // config.setServiceURL("https://mws.amazonservices.com/");
        // UK
        // config.setServiceURL("https://mws.amazonservices.co.uk/");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de/");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr/");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it/");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp/");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn/");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca/");
        // India
        // config.setServiceURL("https://mws.amazonservices.in/");

        /************************************************************************
         * The argument (35) set below is the number of threads client should
         * spawn for processing.
         ***********************************************************************/

        config.setMaxAsyncThreads(35);

        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service        
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);


        /************************************************************************
         * Setup requests parameters and invoke parallel processing. Of course
         * in real world application, there will be much more than a couple of
         * requests to process.
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all 
         * Marketplace Web Service calls.
         ***********************************************************************/
        final String merchantId = "<Your Merchant ID>";
        final String sellerDevAuthToken = "<Merchant Developer MWS Auth Token>";

        CancelFeedSubmissionsRequest requestOne = new CancelFeedSubmissionsRequest();
        requestOne.setMerchant( merchantId );
        //requestOne.setMWSAuthToken(sellerDevAuthToken);
        // @TODO: set request parameters here

        CancelFeedSubmissionsRequest requestTwo = new CancelFeedSubmissionsRequest();
        requestTwo.setMerchant( merchantId );
        //requestTwo.setMWSAuthToken(sellerDevAuthToken);
        // @TODO: set second request parameters here

        List<CancelFeedSubmissionsRequest> requests = new ArrayList<CancelFeedSubmissionsRequest>();
        requests.add(requestOne);
        requests.add(requestTwo);

        // invokeCancelFeedSubmissions(service, requests);

    }



    /**
     * Cancel Feed Submissions request sample
     * cancels feed submissions - by default all of the submissions of the
     * last 30 days that have not started processing
     *   
     * @param service instance of MarketplaceWebService service
     * @param requests list of requests to process
     */
    public static void invokeCancelFeedSubmissions(MarketplaceWebService service, List<CancelFeedSubmissionsRequest> requests) {
        List<Future<CancelFeedSubmissionsResponse>> responses = new ArrayList<Future<CancelFeedSubmissionsResponse>>();
        for (CancelFeedSubmissionsRequest request : requests) {
            responses.add(service.cancelFeedSubmissionsAsync(request));
        }
        for (Future<CancelFeedSubmissionsResponse> future : responses) {
            while (!future.isDone()) {
                Thread.yield();
            }
            try {
                CancelFeedSubmissionsResponse response = future.get();
                // Original request corresponding to this response, if needed:
                CancelFeedSubmissionsRequest originalRequest = requests.get(responses.indexOf(future));
                System.out.println("Response request id: " + response.getResponseMetadata().getRequestId());
                System.out.println(response.getResponseHeaderMetadata());
                System.out.println();
            } catch (Exception e) {
                if (e.getCause() instanceof MarketplaceWebServiceException) {
                    MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e.getCause());
                    System.out.println("Caught Exception: " + exception.getMessage());
                    System.out.println("Response Status Code: " + exception.getStatusCode());
                    System.out.println("Error Code: " + exception.getErrorCode());
                    System.out.println("Error Type: " + exception.getErrorType());
                    System.out.println("Request ID: " + exception.getRequestId());
                    System.out.print("XML: " + exception.getXML());
                    System.out.println("ResponseHeaderMetadata: " + exception.getResponseHeaderMetadata());
                } else {
                    e.printStackTrace();
                }
            }
        }
    }

}
