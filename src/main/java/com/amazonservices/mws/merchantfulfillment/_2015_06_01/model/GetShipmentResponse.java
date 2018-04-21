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
 * Get Shipment Response
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.*;

/**
 * GetShipmentResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetShipmentResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetShipmentResult" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}GetShipmentResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetShipmentResponse extends AbstractMwsObject implements MWSResponse,AmazonBaseResponse {

    private GetShipmentResult getShipmentResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetShipmentResult.
     *
     * @return The value of GetShipmentResult.
     */
    public GetShipmentResult getGetShipmentResult() {
        return getShipmentResult;
    }

    /**
     * Set the value of GetShipmentResult.
     *
     * @param getShipmentResult
     *            The new value to set.
     */
    public void setGetShipmentResult(GetShipmentResult getShipmentResult) {
        this.getShipmentResult = getShipmentResult;
    }

    /**
     * Check to see if GetShipmentResult is set.
     *
     * @return true if GetShipmentResult is set.
     */
    public boolean isSetGetShipmentResult() {
        return getShipmentResult != null;
    }

    /**
     * Set the value of GetShipmentResult, return this.
     *
     * @param getShipmentResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetShipmentResponse withGetShipmentResult(GetShipmentResult getShipmentResult) {
        this.getShipmentResult = getShipmentResult;
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
    public GetShipmentResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetShipmentResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getShipmentResult = r.read("GetShipmentResult", GetShipmentResult.class);
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
        w.write("GetShipmentResult", getShipmentResult);
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
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetShipmentResponse",this);
    }

    /** Value constructor. */
    public GetShipmentResponse(GetShipmentResult getShipmentResult,ResponseMetadata responseMetadata) {
        this.getShipmentResult = getShipmentResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetShipmentResponse() {
        super();
    }

}
