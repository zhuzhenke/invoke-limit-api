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
 * Get Competitive Pricing For SKU Response
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
 * GetCompetitivePricingForSKUResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetCompetitivePricingForSKUResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetCompetitivePricingForSKUResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetCompetitivePricingForSKUResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetCompetitivePricingForSKUResponse", propOrder={
    "getCompetitivePricingForSKUResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetCompetitivePricingForSKUResponse")
public class GetCompetitivePricingForSKUResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="GetCompetitivePricingForSKUResult")
    private List<GetCompetitivePricingForSKUResult> getCompetitivePricingForSKUResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetCompetitivePricingForSKUResult.
     *
     * @return The value of GetCompetitivePricingForSKUResult.
     */
    public List<GetCompetitivePricingForSKUResult> getGetCompetitivePricingForSKUResult() {
        if (getCompetitivePricingForSKUResult==null) {
            getCompetitivePricingForSKUResult = new ArrayList<GetCompetitivePricingForSKUResult>();
        }
        return getCompetitivePricingForSKUResult;
    }

    /**
     * Set the value of GetCompetitivePricingForSKUResult.
     *
     * @param getCompetitivePricingForSKUResult
     *            The new value to set.
     */
    public void setGetCompetitivePricingForSKUResult(List<GetCompetitivePricingForSKUResult> getCompetitivePricingForSKUResult) {
        this.getCompetitivePricingForSKUResult = getCompetitivePricingForSKUResult;
    }

    /**
     * Clear GetCompetitivePricingForSKUResult.
     */
    public void unsetGetCompetitivePricingForSKUResult() {
        this.getCompetitivePricingForSKUResult = null;
    }

    /**
     * Check to see if GetCompetitivePricingForSKUResult is set.
     *
     * @return true if GetCompetitivePricingForSKUResult is set.
     */
    public boolean isSetGetCompetitivePricingForSKUResult() {
        return getCompetitivePricingForSKUResult != null && !getCompetitivePricingForSKUResult.isEmpty();
    }

    /**
     * Add values for GetCompetitivePricingForSKUResult, return this.
     *
     * @param getCompetitivePricingForSKUResult
     *             New values to add.
     *
     * @return This instance.
     */
    public GetCompetitivePricingForSKUResponse withGetCompetitivePricingForSKUResult(GetCompetitivePricingForSKUResult... values) {
        List<GetCompetitivePricingForSKUResult> list = getGetCompetitivePricingForSKUResult();
        for (GetCompetitivePricingForSKUResult value : values) {
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
    public GetCompetitivePricingForSKUResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetCompetitivePricingForSKUResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getCompetitivePricingForSKUResult = r.readList("GetCompetitivePricingForSKUResult", GetCompetitivePricingForSKUResult.class);
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
        w.writeList("GetCompetitivePricingForSKUResult", getCompetitivePricingForSKUResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetCompetitivePricingForSKUResponse",this);
    }

    /** Value constructor. */
    public GetCompetitivePricingForSKUResponse(List<GetCompetitivePricingForSKUResult> getCompetitivePricingForSKUResult,ResponseMetadata responseMetadata) {
        this.getCompetitivePricingForSKUResult = getCompetitivePricingForSKUResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetCompetitivePricingForSKUResponse() {
        super();
    }

}
