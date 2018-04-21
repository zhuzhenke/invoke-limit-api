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
 * Buyer Customized Info Detail
 * API Version: 2013-09-01
 * Library Version: 2015-09-24
 * Generated: Fri Sep 25 20:06:20 GMT 2015
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * BuyerCustomizedInfoDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="BuyerCustomizedInfoDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CustomizedURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class BuyerCustomizedInfoDetail extends AbstractMwsObject implements Serializable {

    private String customizedURL;

    /**
     * Get the value of CustomizedURL.
     *
     * @return The value of CustomizedURL.
     */
    public String getCustomizedURL() {
        return customizedURL;
    }

    /**
     * Set the value of CustomizedURL.
     *
     * @param customizedURL
     *            The new value to set.
     */
    public void setCustomizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
    }

    /**
     * Check to see if CustomizedURL is set.
     *
     * @return true if CustomizedURL is set.
     */
    public boolean isSetCustomizedURL() {
        return customizedURL != null;
    }

    /**
     * Set the value of CustomizedURL, return this.
     *
     * @param customizedURL
     *             The new value to set.
     *
     * @return This instance.
     */
    public BuyerCustomizedInfoDetail withCustomizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        customizedURL = r.read("CustomizedURL", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CustomizedURL", customizedURL);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "BuyerCustomizedInfoDetail",this);
    }

    /** Value constructor. */
    public BuyerCustomizedInfoDetail(String customizedURL) {
        this.customizedURL = customizedURL;
    }    
    

    /** Default constructor. */
    public BuyerCustomizedInfoDetail() {
        super();
    }

}
