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



package com.amazonaws.mws;

import com.amazonaws.mws.model.ResponseHeaderMetadata;

/**
 * Marketplace Web Service  Exception provides details of errors 
 * returned by Marketplace Web Service  service
 *
 */
@SuppressWarnings("serial")
public class MarketplaceWebServiceException extends Exception {
    
    private String message = null;
    private int statusCode = -1;
    private String errorCode = null;
    private String errorType = null;
    private String requestId = null;
    private String xml = null;
    private ResponseHeaderMetadata responseHeaderMetadata = null;
    
    
    /**
     * Constructs MarketplaceWebServiceException with message
     * @param message
     *          Overview of error
     */
    public MarketplaceWebServiceException(String message) {
        this.message = message;
    }
    
    /**
     * Constructs MarketplaceWebServiceException with message and status code
     * @param message
     *          Overview of error
     * @param statusCode
     *          HTTP status code for error response
     */
    public MarketplaceWebServiceException(String message, int statusCode, ResponseHeaderMetadata metadata) {
        this.message = message;
        this.statusCode = statusCode;
        this.responseHeaderMetadata = metadata;
    }
    
    /**
     * Constructs MarketplaceWebServiceException with wrapped exception
     * @param t
     *          wrapped exception
     */
    public MarketplaceWebServiceException(Throwable t) {
        super(t);
        if (t instanceof MarketplaceWebServiceException) {
            MarketplaceWebServiceException ex = (MarketplaceWebServiceException)t;
            this.message = ex.getMessage();
            this.statusCode = ex.getStatusCode();
            this.errorCode = ex.getErrorCode();
            this.errorType = ex.getErrorType();
            this.requestId = ex.getRequestId();
            this.xml = ex.getXML();
        }
    }
    
    /**
     * Constructs MarketplaceWebServiceException with message and wrapped exception
     * @param message
     *          Overview of error
     * @param t
     *          wrapped exception
     */
    public MarketplaceWebServiceException(String message, Throwable t) {
        super(message, t);
        this.message = message;
    }
    
    
    /**
     * Constructs MarketplaceWebServiceException with information available from service
     * @param message
     *          Overview of error
     * @param statusCode
     *          HTTP status code for error response
     * @param errorCode
     *          Error Code returned by the service
     * @param errorType
     *          Error type. Possible types:  Sender, Receiver or Unknown
     * @param requestId
     *          Request ID returned by the service
     * @param xml
     *          Compete xml found in response
     */
    public MarketplaceWebServiceException(String message, int statusCode, String errorCode, String errorType, String requestId,  String xml, ResponseHeaderMetadata metadata) {
        
        this.message = message;
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorType = errorType;
        this.requestId = requestId;
        this.xml = xml;
        this.responseHeaderMetadata = metadata;
    }
    
    /**
     * Gets error code returned by the service if available.
     *
     * @return Error Code returned by the service
     */
    public String getErrorCode(){
        return errorCode;
    }
    
    /**
     * Gets error type returned by the service if available.
     *
     * @return Error Type returned by the service
     */
    public String getErrorType(){
        return errorType;
    }
    
    /**
     * Gets error message
     *
     * @return Error message
     */
    @Override
    public String getMessage() {
        return message;
    }
    
    /**
     * Gets status code returned by the service if available. If status
     * code is set to -1, it means that status code was unavailable at the
     * time exception was thrown
     *
     * @return status code returned by the service
     */
    public int getStatusCode() {
        return statusCode;
    }
    
    /**
     * Gets XML returned by the service if available.
     *
     * @return XML returned by the service
     */
    public String getXML() {
        return xml;
    }
    
    /**
     * Gets Request ID returned by the service if available.
     *
     * @return Request ID returned by the service
     */
    public String getRequestId() {
        return requestId;
    }

    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
      this.responseHeaderMetadata = responseHeaderMetadata;
    }

    public ResponseHeaderMetadata getResponseHeaderMetadata() {
      return responseHeaderMetadata;
    }
}
