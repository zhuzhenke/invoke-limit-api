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
 * Get My Fees Estimate Request
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetMyFeesEstimateRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMyFeesEstimateRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeesEstimateRequestList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimateRequestList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMyFeesEstimateRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "feesEstimateRequestList"
})
@XmlRootElement(name = "GetMyFeesEstimateRequest")
public class GetMyFeesEstimateRequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId")
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="FeesEstimateRequestList")
    private FeesEstimateRequestList feesEstimateRequestList;

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
    public GetMyFeesEstimateRequest withSellerId(String sellerId) {
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
    public GetMyFeesEstimateRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of FeesEstimateRequestList.
     *
     * @return The value of FeesEstimateRequestList.
     */
    public FeesEstimateRequestList getFeesEstimateRequestList() {
        return feesEstimateRequestList;
    }

    /**
     * Set the value of FeesEstimateRequestList.
     *
     * @param feesEstimateRequestList
     *            The new value to set.
     */
    public void setFeesEstimateRequestList(FeesEstimateRequestList feesEstimateRequestList) {
        this.feesEstimateRequestList = feesEstimateRequestList;
    }

    /**
     * Check to see if FeesEstimateRequestList is set.
     *
     * @return true if FeesEstimateRequestList is set.
     */
    public boolean isSetFeesEstimateRequestList() {
        return feesEstimateRequestList != null;
    }

    /**
     * Set the value of FeesEstimateRequestList, return this.
     *
     * @param feesEstimateRequestList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMyFeesEstimateRequest withFeesEstimateRequestList(FeesEstimateRequestList feesEstimateRequestList) {
        this.feesEstimateRequestList = feesEstimateRequestList;
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
        feesEstimateRequestList = r.read("FeesEstimateRequestList", FeesEstimateRequestList.class);
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
        w.write("FeesEstimateRequestList", feesEstimateRequestList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMyFeesEstimateRequest",this);
    }

    /** Value constructor. */
    public GetMyFeesEstimateRequest(String sellerId,String mwsAuthToken,FeesEstimateRequestList feesEstimateRequestList) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.feesEstimateRequestList = feesEstimateRequestList;
    }    

    /** Legacy value constructor. */
    public GetMyFeesEstimateRequest(String sellerId,FeesEstimateRequestList feesEstimateRequestList) {
        this.sellerId = sellerId;
        this.feesEstimateRequestList = feesEstimateRequestList;
    }
    

    /** Default constructor. */
    public GetMyFeesEstimateRequest() {
        super();
    }

}
