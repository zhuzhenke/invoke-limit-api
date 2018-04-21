/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * List Marketplace Participations By Next Token Response
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import com.amazon.invoke.AmazonBaseResponse;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ListMarketplaceParticipationsByNextTokenResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMarketplaceParticipationsByNextTokenResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListMarketplaceParticipationsByNextTokenResult" type="{https://mws.amazonservices.com/Sellers/2011-07-01}ListMarketplaceParticipationsByNextTokenResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/Sellers/2011-07-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMarketplaceParticipationsByNextTokenResponse", propOrder={
    "listMarketplaceParticipationsByNextTokenResult",
    "responseMetadata"
})
@XmlRootElement(name = "ListMarketplaceParticipationsByNextTokenResponse")
public class ListMarketplaceParticipationsByNextTokenResponse extends AbstractMwsObject implements MWSResponse,AmazonBaseResponse {

    @XmlElement(name="ListMarketplaceParticipationsByNextTokenResult")
    private ListMarketplaceParticipationsByNextTokenResult listMarketplaceParticipationsByNextTokenResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListMarketplaceParticipationsByNextTokenResult.
     *
     * @return The value of ListMarketplaceParticipationsByNextTokenResult.
     */
    public ListMarketplaceParticipationsByNextTokenResult getListMarketplaceParticipationsByNextTokenResult() {
        return listMarketplaceParticipationsByNextTokenResult;
    }

    /**
     * Set the value of ListMarketplaceParticipationsByNextTokenResult.
     *
     * @param listMarketplaceParticipationsByNextTokenResult
     *            The new value to set.
     */
    public void setListMarketplaceParticipationsByNextTokenResult(ListMarketplaceParticipationsByNextTokenResult listMarketplaceParticipationsByNextTokenResult) {
        this.listMarketplaceParticipationsByNextTokenResult = listMarketplaceParticipationsByNextTokenResult;
    }

    /**
     * Check to see if ListMarketplaceParticipationsByNextTokenResult is set.
     *
     * @return true if ListMarketplaceParticipationsByNextTokenResult is set.
     */
    public boolean isSetListMarketplaceParticipationsByNextTokenResult() {
        return listMarketplaceParticipationsByNextTokenResult != null;
    }

    /**
     * Set the value of ListMarketplaceParticipationsByNextTokenResult, return this.
     *
     * @param listMarketplaceParticipationsByNextTokenResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMarketplaceParticipationsByNextTokenResponse withListMarketplaceParticipationsByNextTokenResult(ListMarketplaceParticipationsByNextTokenResult listMarketplaceParticipationsByNextTokenResult) {
        this.listMarketplaceParticipationsByNextTokenResult = listMarketplaceParticipationsByNextTokenResult;
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
    public ListMarketplaceParticipationsByNextTokenResponse withResponseMetadata(ResponseMetadata responseMetadata) {
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
    public ListMarketplaceParticipationsByNextTokenResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
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
        listMarketplaceParticipationsByNextTokenResult = r.read("ListMarketplaceParticipationsByNextTokenResult", ListMarketplaceParticipationsByNextTokenResult.class);
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
        w.write("ListMarketplaceParticipationsByNextTokenResult", listMarketplaceParticipationsByNextTokenResult);
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
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "ListMarketplaceParticipationsByNextTokenResponse",this);
    }

    /** Value constructor. */
    public ListMarketplaceParticipationsByNextTokenResponse(ListMarketplaceParticipationsByNextTokenResult listMarketplaceParticipationsByNextTokenResult,ResponseMetadata responseMetadata) {
        this.listMarketplaceParticipationsByNextTokenResult = listMarketplaceParticipationsByNextTokenResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /** Default constructor. */
    public ListMarketplaceParticipationsByNextTokenResponse() {
        super();
    }

}
