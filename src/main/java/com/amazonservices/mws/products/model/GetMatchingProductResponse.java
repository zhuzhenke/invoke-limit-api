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
 * Get Matching Product Response
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.*;

/**
 * GetMatchingProductResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMatchingProductResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetMatchingProductResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetMatchingProductResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMatchingProductResponse", propOrder={
    "getMatchingProductResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetMatchingProductResponse")
public class GetMatchingProductResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="GetMatchingProductResult")
    private List<GetMatchingProductResult> getMatchingProductResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetMatchingProductResult.
     *
     * @return The value of GetMatchingProductResult.
     */
    public List<GetMatchingProductResult> getGetMatchingProductResult() {
        if (getMatchingProductResult==null) {
            getMatchingProductResult = new ArrayList<GetMatchingProductResult>();
        }
        return getMatchingProductResult;
    }

    /**
     * Set the value of GetMatchingProductResult.
     *
     * @param getMatchingProductResult
     *            The new value to set.
     */
    public void setGetMatchingProductResult(List<GetMatchingProductResult> getMatchingProductResult) {
        this.getMatchingProductResult = getMatchingProductResult;
    }

    /**
     * Clear GetMatchingProductResult.
     */
    public void unsetGetMatchingProductResult() {
        this.getMatchingProductResult = null;
    }

    /**
     * Check to see if GetMatchingProductResult is set.
     *
     * @return true if GetMatchingProductResult is set.
     */
    public boolean isSetGetMatchingProductResult() {
        return getMatchingProductResult != null && !getMatchingProductResult.isEmpty();
    }

    /**
     * Add values for GetMatchingProductResult, return this.
     *
     * @param getMatchingProductResult
     *             New values to add.
     *
     * @return This instance.
     */
    public GetMatchingProductResponse withGetMatchingProductResult(GetMatchingProductResult... values) {
        List<GetMatchingProductResult> list = getGetMatchingProductResult();
        for (GetMatchingProductResult value : values) {
            list.add(value);
        }
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
    public GetMatchingProductResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetMatchingProductResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getMatchingProductResult = r.readList("GetMatchingProductResult", GetMatchingProductResult.class);
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
        w.writeList("GetMatchingProductResult", getMatchingProductResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMatchingProductResponse",this);
    }

    /** Value constructor. */
    public GetMatchingProductResponse(List<GetMatchingProductResult> getMatchingProductResult,ResponseMetadata responseMetadata) {
        this.getMatchingProductResult = getMatchingProductResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetMatchingProductResponse() {
        super();
    }

}
