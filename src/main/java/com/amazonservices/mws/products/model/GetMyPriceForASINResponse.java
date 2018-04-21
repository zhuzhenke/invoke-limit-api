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
 * Get My Price For ASIN Response
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
 * GetMyPriceForASINResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMyPriceForASINResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetMyPriceForASINResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetMyPriceForASINResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMyPriceForASINResponse", propOrder={
    "getMyPriceForASINResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetMyPriceForASINResponse")
public class GetMyPriceForASINResponse extends AbstractMwsObject implements MWSResponse, AmazonBaseResponse {

    @XmlElement(name="GetMyPriceForASINResult")
    private List<GetMyPriceForASINResult> getMyPriceForASINResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetMyPriceForASINResult.
     *
     * @return The value of GetMyPriceForASINResult.
     */
    public List<GetMyPriceForASINResult> getGetMyPriceForASINResult() {
        if (getMyPriceForASINResult==null) {
            getMyPriceForASINResult = new ArrayList<GetMyPriceForASINResult>();
        }
        return getMyPriceForASINResult;
    }

    /**
     * Set the value of GetMyPriceForASINResult.
     *
     * @param getMyPriceForASINResult
     *            The new value to set.
     */
    public void setGetMyPriceForASINResult(List<GetMyPriceForASINResult> getMyPriceForASINResult) {
        this.getMyPriceForASINResult = getMyPriceForASINResult;
    }

    /**
     * Clear GetMyPriceForASINResult.
     */
    public void unsetGetMyPriceForASINResult() {
        this.getMyPriceForASINResult = null;
    }

    /**
     * Check to see if GetMyPriceForASINResult is set.
     *
     * @return true if GetMyPriceForASINResult is set.
     */
    public boolean isSetGetMyPriceForASINResult() {
        return getMyPriceForASINResult != null && !getMyPriceForASINResult.isEmpty();
    }

    /**
     * Add values for GetMyPriceForASINResult, return this.
     *
     * @param getMyPriceForASINResult
     *             New values to add.
     *
     * @return This instance.
     */
    public GetMyPriceForASINResponse withGetMyPriceForASINResult(GetMyPriceForASINResult... values) {
        List<GetMyPriceForASINResult> list = getGetMyPriceForASINResult();
        for (GetMyPriceForASINResult value : values) {
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
    public GetMyPriceForASINResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public GetMyPriceForASINResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        getMyPriceForASINResult = r.readList("GetMyPriceForASINResult", GetMyPriceForASINResult.class);
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
        w.writeList("GetMyPriceForASINResult", getMyPriceForASINResult);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMyPriceForASINResponse",this);
    }

    /** Value constructor. */
    public GetMyPriceForASINResponse(List<GetMyPriceForASINResult> getMyPriceForASINResult,ResponseMetadata responseMetadata) {
        this.getMyPriceForASINResult = getMyPriceForASINResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public GetMyPriceForASINResponse() {
        super();
    }

}
