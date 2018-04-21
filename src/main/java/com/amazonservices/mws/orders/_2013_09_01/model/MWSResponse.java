/*******************************************************************************
 * Copyright 2009-2015 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Library Version: 2015-09-24
 * Generated: Fri Sep 25 20:06:20 GMT 2015
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.MwsObject;

/**
 * Interface implemented by responses.
 * 
 * @author mayerj
 */
public interface MWSResponse extends MwsObject {

    /**
     * Set the response header metadata.
     * 
     * @param rhmd
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd);

    /**
     * Get the response header metadata.
     * 
     * @return The response header metadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata();

}
