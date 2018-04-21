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
 * List Matching Products Response
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ListMatchingProductsResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMatchingProductsResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListMatchingProductsResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ListMatchingProductsResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMatchingProductsResponse", propOrder={
    "listMatchingProductsResult",
    "responseMetadata"
})
@XmlRootElement(name = "ListMatchingProductsResponse")
public class ListMatchingProductsResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="ListMatchingProductsResult")
    private ListMatchingProductsResult listMatchingProductsResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListMatchingProductsResult.
     *
     * @return The value of ListMatchingProductsResult.
     */
    public ListMatchingProductsResult getListMatchingProductsResult() {
        return listMatchingProductsResult;
    }

    /**
     * Set the value of ListMatchingProductsResult.
     *
     * @param listMatchingProductsResult
     *            The new value to set.
     */
    public void setListMatchingProductsResult(ListMatchingProductsResult listMatchingProductsResult) {
        this.listMatchingProductsResult = listMatchingProductsResult;
    }

    /**
     * Check to see if ListMatchingProductsResult is set.
     *
     * @return true if ListMatchingProductsResult is set.
     */
    public boolean isSetListMatchingProductsResult() {
        return listMatchingProductsResult != null;
    }

    /**
     * Set the value of ListMatchingProductsResult, return this.
     *
     * @param listMatchingProductsResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMatchingProductsResponse withListMatchingProductsResult(ListMatchingProductsResult listMatchingProductsResult) {
        this.listMatchingProductsResult = listMatchingProductsResult;
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
    public ListMatchingProductsResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public ListMatchingProductsResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        listMatchingProductsResult = r.read("ListMatchingProductsResult", ListMatchingProductsResult.class);
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
        w.write("ListMatchingProductsResult", listMatchingProductsResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ListMatchingProductsResponse",this);
    }

    /** Value constructor. */
    public ListMatchingProductsResponse(ListMatchingProductsResult listMatchingProductsResult,ResponseMetadata responseMetadata) {
        this.listMatchingProductsResult = listMatchingProductsResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public ListMatchingProductsResponse() {
        super();
    }

}
