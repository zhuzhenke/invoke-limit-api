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
 * Marketplace Web Service Products
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products;

import com.amazonservices.mws.products.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsException;
 import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * Exceptions thrown by MarketplaceWebServiceProducts operations.
 */
public class MarketplaceWebServiceProductsException extends MwsException {

    /** For serialization. */
    private static final long serialVersionUID = 1L;

    @Override
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        MwsResponseHeaderMetadata baseRHMD = super.getResponseHeaderMetadata();
        if(baseRHMD != null) {
            return new ResponseHeaderMetadata(baseRHMD);
        } else {
            return null;
        }
    }

    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd) {
        super.setResponseHeaderMetadata(rhmd);
    }

    public MarketplaceWebServiceProductsException(String message) {
        super(0, message, null);
    }

    public MarketplaceWebServiceProductsException(String message, int statusCode) {
        super(statusCode, message, null);
    }

    public MarketplaceWebServiceProductsException(Throwable t) {
        super(0, null, t);
    }

    public MarketplaceWebServiceProductsException(String message, Throwable t) {
        super(0, message, t);
    }

    public MarketplaceWebServiceProductsException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml, ResponseHeaderMetadata rhmd) {
        super(statusCode, message, errorCode, errorType, xml, rhmd);
    }

    public MarketplaceWebServiceProductsException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml) {
        super(statusCode, message, errorCode, errorType, xml, null);
    }

}

