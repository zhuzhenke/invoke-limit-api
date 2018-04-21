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
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01;

public enum MWSEndpoint {

    US("mws.amazonservices.com"),
    UK("mws.amazonservices.co.uk"),
    DE("mws.amazonservices.de"),
    FR("mws.amazonservices.fr"),
    JP("mws.amazonservices.jp"),
    CN("mws.amazonservices.com.cn"),
    IT("mws.amazonservices.it");

    private final String url;

    private MWSEndpoint(String domain) {
        this.url = "https://" + domain + "/" + FBAInventoryServiceMWSConfig.DEFAULT_SERVICE_PATH;
    }

    @Override
    public String toString() {
       return url;
    }

}
