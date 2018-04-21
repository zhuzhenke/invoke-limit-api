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
 * Get Eligible Shipping Services Response
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.*;

/**
 * GetEligibleShippingServicesResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetEligibleShippingServicesResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetEligibleShippingServicesResult" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}GetEligibleShippingServicesResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetEligibleShippingServicesResponse extends AbstractMwsObject implements MWSResponse,AmazonBaseResponse {

    private GetEligibleShippingServicesResult getEligibleShippingServicesResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetEligibleShippingServicesResult.
     *
     * @return The value of GetEligibleShippingServicesResult.
     */
    public GetEligibleShippingServicesResult getGetEligibleShippingServicesResult() {
        return getEligibleShippingServicesResult;
    }

    /**
     * Set the value of GetEligibleShippingServicesResult.
     *
     * @param getEligibleShippingServicesResult
     *            The new value to set.
     */
    public void setGetEligibleShippingServicesResult(GetEligibleShippingServicesResult getEligibleShippingServicesResult) {
        this.getEligibleShippingServicesResult = getEligibleShippingServicesResult;
    }

    /**
     * Check to see if GetEligibleShippingServicesResult is set.
     *
     * @return true if GetEligibleShippingServicesResult is set.
     */
    public boolean isSetGetEligibleShippingServicesResult() {
        return getEligibleShippingServicesResult != null;
    }

    /**
     * Set the value of GetEligibleShippingServicesResult, return this.
     *
     * @param getEligibleShippingServicesResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesResponse withGetEligibleShippingServicesResult(GetEligibleShippingServicesResult getEligibleShippingServicesResult) {
        this.getEligibleShippingServicesResult = getEligibleShippingServicesResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetEligibleShippingServicesResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
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
        getEligibleShippingServicesResult = r.read("GetEligibleShippingServicesResult", GetEligibleShippingServicesResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("GetEligibleShippingServicesResult", getEligibleShippingServicesResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetEligibleShippingServicesResponse",this);
    }

    /** Value constructor. */
    public GetEligibleShippingServicesResponse(GetEligibleShippingServicesResult getEligibleShippingServicesResult,ResponseMetadata responseMetadata) {
        this.getEligibleShippingServicesResult = getEligibleShippingServicesResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetEligibleShippingServicesResponse() {
        super();
    }

}
