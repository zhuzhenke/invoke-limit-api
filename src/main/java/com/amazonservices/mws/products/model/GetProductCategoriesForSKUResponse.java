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
 * Get Product Categories For SKU Response
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
 * GetProductCategoriesForSKUResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetProductCategoriesForSKUResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetProductCategoriesForSKUResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetProductCategoriesForSKUResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetProductCategoriesForSKUResponse", propOrder={
    "getProductCategoriesForSKUResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetProductCategoriesForSKUResponse")
public class GetProductCategoriesForSKUResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="GetProductCategoriesForSKUResult")
    private GetProductCategoriesForSKUResult getProductCategoriesForSKUResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetProductCategoriesForSKUResult.
     *
     * @return The value of GetProductCategoriesForSKUResult.
     */
    public GetProductCategoriesForSKUResult getGetProductCategoriesForSKUResult() {
        return getProductCategoriesForSKUResult;
    }

    /**
     * Set the value of GetProductCategoriesForSKUResult.
     *
     * @param getProductCategoriesForSKUResult
     *            The new value to set.
     */
    public void setGetProductCategoriesForSKUResult(GetProductCategoriesForSKUResult getProductCategoriesForSKUResult) {
        this.getProductCategoriesForSKUResult = getProductCategoriesForSKUResult;
    }

    /**
     * Check to see if GetProductCategoriesForSKUResult is set.
     *
     * @return true if GetProductCategoriesForSKUResult is set.
     */
    public boolean isSetGetProductCategoriesForSKUResult() {
        return getProductCategoriesForSKUResult != null;
    }

    /**
     * Set the value of GetProductCategoriesForSKUResult, return this.
     *
     * @param getProductCategoriesForSKUResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetProductCategoriesForSKUResponse withGetProductCategoriesForSKUResult(GetProductCategoriesForSKUResult getProductCategoriesForSKUResult) {
        this.getProductCategoriesForSKUResult = getProductCategoriesForSKUResult;
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
    public GetProductCategoriesForSKUResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetProductCategoriesForSKUResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getProductCategoriesForSKUResult = r.read("GetProductCategoriesForSKUResult", GetProductCategoriesForSKUResult.class);
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
        w.write("GetProductCategoriesForSKUResult", getProductCategoriesForSKUResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetProductCategoriesForSKUResponse",this);
    }

    /** Value constructor. */
    public GetProductCategoriesForSKUResponse(GetProductCategoriesForSKUResult getProductCategoriesForSKUResult,ResponseMetadata responseMetadata) {
        this.getProductCategoriesForSKUResult = getProductCategoriesForSKUResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetProductCategoriesForSKUResponse() {
        super();
    }

}
