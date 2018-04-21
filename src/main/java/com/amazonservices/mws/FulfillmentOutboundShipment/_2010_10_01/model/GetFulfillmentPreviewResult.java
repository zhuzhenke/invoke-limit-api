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
 * Get Fulfillment Preview Result
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetFulfillmentPreviewResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetFulfillmentPreviewResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FulfillmentPreviews" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentPreviewList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetFulfillmentPreviewResult", propOrder={
    "fulfillmentPreviews"
})
@XmlRootElement(name = "GetFulfillmentPreviewResult")
public class GetFulfillmentPreviewResult extends AbstractMwsObject {

    @XmlElement(name="FulfillmentPreviews")
    private FulfillmentPreviewList fulfillmentPreviews;

    /**
     * Get the value of FulfillmentPreviews.
     *
     * @return The value of FulfillmentPreviews.
     */
    public FulfillmentPreviewList getFulfillmentPreviews() {
        return fulfillmentPreviews;
    }

    /**
     * Set the value of FulfillmentPreviews.
     *
     * @param fulfillmentPreviews
     *            The new value to set.
     */
    public void setFulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
        this.fulfillmentPreviews = fulfillmentPreviews;
    }

    /**
     * Check to see if FulfillmentPreviews is set.
     *
     * @return true if FulfillmentPreviews is set.
     */
    public boolean isSetFulfillmentPreviews() {
        return fulfillmentPreviews != null;
    }

    /**
     * Set the value of FulfillmentPreviews, return this.
     *
     * @param fulfillmentPreviews
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewResult withFulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
        this.fulfillmentPreviews = fulfillmentPreviews;
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
        fulfillmentPreviews = r.read("FulfillmentPreviews", FulfillmentPreviewList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FulfillmentPreviews", fulfillmentPreviews);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "GetFulfillmentPreviewResult",this);
    }

    /** Value constructor. */
    public GetFulfillmentPreviewResult(FulfillmentPreviewList fulfillmentPreviews) {
        this.fulfillmentPreviews = fulfillmentPreviews;
    }    
    

    /** Default constructor. */
    public GetFulfillmentPreviewResult() {
        super();
    }

}
