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
 * List All Fulfillment Orders By Next Token Response
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ListAllFulfillmentOrdersByNextTokenResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListAllFulfillmentOrdersByNextTokenResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListAllFulfillmentOrdersByNextTokenResult" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ListAllFulfillmentOrdersByNextTokenResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListAllFulfillmentOrdersByNextTokenResponse", propOrder={
    "listAllFulfillmentOrdersByNextTokenResult",
    "responseMetadata"
})
@XmlRootElement(name = "ListAllFulfillmentOrdersByNextTokenResponse")
public class ListAllFulfillmentOrdersByNextTokenResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="ListAllFulfillmentOrdersByNextTokenResult")
    private ListAllFulfillmentOrdersByNextTokenResult listAllFulfillmentOrdersByNextTokenResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListAllFulfillmentOrdersByNextTokenResult.
     *
     * @return The value of ListAllFulfillmentOrdersByNextTokenResult.
     */
    public ListAllFulfillmentOrdersByNextTokenResult getListAllFulfillmentOrdersByNextTokenResult() {
        return listAllFulfillmentOrdersByNextTokenResult;
    }

    /**
     * Set the value of ListAllFulfillmentOrdersByNextTokenResult.
     *
     * @param listAllFulfillmentOrdersByNextTokenResult
     *            The new value to set.
     */
    public void setListAllFulfillmentOrdersByNextTokenResult(ListAllFulfillmentOrdersByNextTokenResult listAllFulfillmentOrdersByNextTokenResult) {
        this.listAllFulfillmentOrdersByNextTokenResult = listAllFulfillmentOrdersByNextTokenResult;
    }

    /**
     * Check to see if ListAllFulfillmentOrdersByNextTokenResult is set.
     *
     * @return true if ListAllFulfillmentOrdersByNextTokenResult is set.
     */
    public boolean isSetListAllFulfillmentOrdersByNextTokenResult() {
        return listAllFulfillmentOrdersByNextTokenResult != null;
    }

    /**
     * Set the value of ListAllFulfillmentOrdersByNextTokenResult, return this.
     *
     * @param listAllFulfillmentOrdersByNextTokenResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersByNextTokenResponse withListAllFulfillmentOrdersByNextTokenResult(ListAllFulfillmentOrdersByNextTokenResult listAllFulfillmentOrdersByNextTokenResult) {
        this.listAllFulfillmentOrdersByNextTokenResult = listAllFulfillmentOrdersByNextTokenResult;
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
    public ListAllFulfillmentOrdersByNextTokenResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public ListAllFulfillmentOrdersByNextTokenResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        listAllFulfillmentOrdersByNextTokenResult = r.read("ListAllFulfillmentOrdersByNextTokenResult", ListAllFulfillmentOrdersByNextTokenResult.class);
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
        w.write("ListAllFulfillmentOrdersByNextTokenResult", listAllFulfillmentOrdersByNextTokenResult);
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
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ListAllFulfillmentOrdersByNextTokenResponse",this);
    }

    /** Value constructor. */
    public ListAllFulfillmentOrdersByNextTokenResponse(ListAllFulfillmentOrdersByNextTokenResult listAllFulfillmentOrdersByNextTokenResult,ResponseMetadata responseMetadata) {
        this.listAllFulfillmentOrdersByNextTokenResult = listAllFulfillmentOrdersByNextTokenResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public ListAllFulfillmentOrdersByNextTokenResponse() {
        super();
    }

}
