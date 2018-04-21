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
 * Get Lowest Offer Listings For SKU Response
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
 * GetLowestOfferListingsForSKUResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestOfferListingsForSKUResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetLowestOfferListingsForSKUResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetLowestOfferListingsForSKUResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestOfferListingsForSKUResponse", propOrder={
    "getLowestOfferListingsForSKUResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetLowestOfferListingsForSKUResponse")
public class GetLowestOfferListingsForSKUResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="GetLowestOfferListingsForSKUResult")
    private List<GetLowestOfferListingsForSKUResult> getLowestOfferListingsForSKUResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetLowestOfferListingsForSKUResult.
     *
     * @return The value of GetLowestOfferListingsForSKUResult.
     */
    public List<GetLowestOfferListingsForSKUResult> getGetLowestOfferListingsForSKUResult() {
        if (getLowestOfferListingsForSKUResult==null) {
            getLowestOfferListingsForSKUResult = new ArrayList<GetLowestOfferListingsForSKUResult>();
        }
        return getLowestOfferListingsForSKUResult;
    }

    /**
     * Set the value of GetLowestOfferListingsForSKUResult.
     *
     * @param getLowestOfferListingsForSKUResult
     *            The new value to set.
     */
    public void setGetLowestOfferListingsForSKUResult(List<GetLowestOfferListingsForSKUResult> getLowestOfferListingsForSKUResult) {
        this.getLowestOfferListingsForSKUResult = getLowestOfferListingsForSKUResult;
    }

    /**
     * Clear GetLowestOfferListingsForSKUResult.
     */
    public void unsetGetLowestOfferListingsForSKUResult() {
        this.getLowestOfferListingsForSKUResult = null;
    }

    /**
     * Check to see if GetLowestOfferListingsForSKUResult is set.
     *
     * @return true if GetLowestOfferListingsForSKUResult is set.
     */
    public boolean isSetGetLowestOfferListingsForSKUResult() {
        return getLowestOfferListingsForSKUResult != null && !getLowestOfferListingsForSKUResult.isEmpty();
    }

    /**
     * Add values for GetLowestOfferListingsForSKUResult, return this.
     *
     * @param getLowestOfferListingsForSKUResult
     *             New values to add.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForSKUResponse withGetLowestOfferListingsForSKUResult(GetLowestOfferListingsForSKUResult... values) {
        List<GetLowestOfferListingsForSKUResult> list = getGetLowestOfferListingsForSKUResult();
        for (GetLowestOfferListingsForSKUResult value : values) {
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
    public GetLowestOfferListingsForSKUResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetLowestOfferListingsForSKUResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getLowestOfferListingsForSKUResult = r.readList("GetLowestOfferListingsForSKUResult", GetLowestOfferListingsForSKUResult.class);
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
        w.writeList("GetLowestOfferListingsForSKUResult", getLowestOfferListingsForSKUResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestOfferListingsForSKUResponse",this);
    }

    /** Value constructor. */
    public GetLowestOfferListingsForSKUResponse(List<GetLowestOfferListingsForSKUResult> getLowestOfferListingsForSKUResult,ResponseMetadata responseMetadata) {
        this.getLowestOfferListingsForSKUResult = getLowestOfferListingsForSKUResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetLowestOfferListingsForSKUResponse() {
        super();
    }

}
