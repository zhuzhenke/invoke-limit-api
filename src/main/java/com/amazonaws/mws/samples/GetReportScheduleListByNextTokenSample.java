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
import com.amazonaws.mws.mock.MarketplaceWebServiceMock;

/**
 *
 * Get Report Schedule List By Next Token  Samples
 *
 *
 */
public class GetReportScheduleListByNextTokenSample {

    /**
     * Just add a few required parameters, and try the service
     * Get Report Schedule List By Next Token functionality
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
         * Uncomment to try out Mock Service that simulates Marketplace Web Service 
         * responses without calling Marketplace Web Service  service.
         *
         * Responses are loaded from local XML files. You can tweak XML files to
         * experiment with various outputs during development
         *
         * XML files available under com/amazonaws/mws/mock tree
         *
         ***********************************************************************/
        // MarketplaceWebService service = new MarketplaceWebServiceMock();

        /************************************************************************
         * Setup request parameters and uncomment invoke to try out 
         * sample for Get Report Schedule List By Next Token 
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all 
         * Marketplace Web Service calls.
         ***********************************************************************/
        final String merchantId = "<Your Merchant ID>";
        final String sellerDevAuthToken = "<Merchant Developer MWS Auth Token>";

        GetReportScheduleListByNextTokenRequest request = new GetReportScheduleListByNextTokenRequest();
        request.setMerchant( merchantId );
        //request.setMWSAuthToken(sellerDevAuthToken);

        // @TODO: set request parameters here

        // invokeGetReportScheduleListByNextToken(service, request);

    }



    /**
     * Get Report Schedule List By Next Token  request sample
     * retrieve the next batch of list items and if there are more items to retrieve
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static void invokeGetReportScheduleListByNextToken(MarketplaceWebService service, GetReportScheduleListByNextTokenRequest request) {
        try {

            GetReportScheduleListByNextTokenResponse response = service.getReportScheduleListByNextToken(request);


            System.out.println ("GetReportScheduleListByNextToken Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportScheduleListByNextTokenResponse");
            System.out.println();
            if (response.isSetGetReportScheduleListByNextTokenResult()) {
                System.out.print("        GetReportScheduleListByNextTokenResult");
                System.out.println();
                GetReportScheduleListByNextTokenResult  getReportScheduleListByNextTokenResult = response.getGetReportScheduleListByNextTokenResult();
                if (getReportScheduleListByNextTokenResult.isSetNextToken()) {
                    System.out.print("            NextToken");
                    System.out.println();
                    System.out.print("                " + getReportScheduleListByNextTokenResult.getNextToken());
                    System.out.println();
                }
                if (getReportScheduleListByNextTokenResult.isSetHasNext()) {
                    System.out.print("            HasNext");
                    System.out.println();
                    System.out.print("                " + getReportScheduleListByNextTokenResult.isHasNext());
                    System.out.println();
                }
                List<ReportSchedule> reportScheduleList = getReportScheduleListByNextTokenResult.getReportScheduleList();
                for (ReportSchedule reportSchedule : reportScheduleList) {
                    System.out.print("            ReportSchedule");
                    System.out.println();
                    if (reportSchedule.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + reportSchedule.getReportType());
                        System.out.println();
                    }
                    if (reportSchedule.isSetSchedule()) {
                        System.out.print("                Schedule");
                        System.out.println();
                        System.out.print("                    " + reportSchedule.getSchedule());
                        System.out.println();
                    }
                    if (reportSchedule.isSetScheduledDate()) {
                        System.out.print("                ScheduledDate");
                        System.out.println();
                        System.out.print("                    " + reportSchedule.getScheduledDate());
                        System.out.println();
                    }
                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
    }

}
