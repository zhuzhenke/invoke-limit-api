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
 * Get Order Request
 * API Version: 2013-09-01
 * Library Version: 2015-09-24
 * Generated: Fri Sep 25 20:06:20 GMT 2015
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import java.util.List;
import java.util.ArrayList;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.*;

/**
 * GetOrderRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetOrderRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetOrderRequest extends AbstractMwsObject implements AmazonBaseRequest {

    private String sellerId;

    private String mwsAuthToken;

    private List<String> amazonOrderId;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetOrderRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetOrderRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public List<String> getAmazonOrderId() {
        if (amazonOrderId==null) {
            amazonOrderId = new ArrayList<String>();
        }
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(List<String> amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Clear AmazonOrderId.
     */
    public void unsetAmazonOrderId() {
        this.amazonOrderId = null;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null && !amazonOrderId.isEmpty();
    }

    /**
     * Add values for AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             New values to add.
     *
     * @return This instance.
     */
    public GetOrderRequest withAmazonOrderId(String... values) {
        List<String> list = getAmazonOrderId();
        for (String value : values) {
            list.add(value);
        }
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        amazonOrderId = r.readList("AmazonOrderId", "Id", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.writeList("AmazonOrderId", "Id", amazonOrderId);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "GetOrderRequest",this);
    }

    /** Value constructor. */
    public GetOrderRequest(String sellerId,String mwsAuthToken,List<String> amazonOrderId) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.amazonOrderId = amazonOrderId;
    }    

    /** Legacy value constructor. */
    public GetOrderRequest(String sellerId,List<String> amazonOrderId) {
        this.sellerId = sellerId;
        this.amazonOrderId = amazonOrderId;
    }
    

    /** Default constructor. */
    public GetOrderRequest() {
        super();
    }

}
