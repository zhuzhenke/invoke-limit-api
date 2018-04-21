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
 * Offer Count Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * OfferCountType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="OfferCountType"&gt;
 *    &lt;simpleContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *          &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="fulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *     &lt;/extension&gt;
 *    &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="OfferCountType", propOrder={
    "offerCount"
})
@XmlRootElement(name = "OfferCountType")
public class OfferCountType extends AbstractMwsObject {

    @XmlAttribute
    private String condition;

    @XmlAttribute
    private String fulfillmentChannel;

    @XmlValue
    private Integer offerCount;

    /**
     * Get the value of condition.
     *
     * @return The value of condition.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of condition.
     *
     * @param condition
     *            The new value to set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Check to see if condition is set.
     *
     * @return true if condition is set.
     */
    public boolean isSetCondition() {
        return condition != null;
    }

    /**
     * Set the value of condition, return this.
     *
     * @param condition
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferCountType withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the value of fulfillmentChannel.
     *
     * @return The value of fulfillmentChannel.
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Set the value of fulfillmentChannel.
     *
     * @param fulfillmentChannel
     *            The new value to set.
     */
    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    /**
     * Check to see if fulfillmentChannel is set.
     *
     * @return true if fulfillmentChannel is set.
     */
    public boolean isSetFulfillmentChannel() {
        return fulfillmentChannel != null;
    }

    /**
     * Set the value of fulfillmentChannel, return this.
     *
     * @param fulfillmentChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferCountType withFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Get the value of OfferCount.
     *
     * @return The value of OfferCount.
     */
    public Integer getOfferCount() {
        return offerCount;
    }

    /**
     * Set the value of OfferCount.
     *
     * @param offerCount
     *            The new value to set.
     */
    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }

    /**
     * Check to see if OfferCount is set.
     *
     * @return true if OfferCount is set.
     */
    public boolean isSetOfferCount() {
        return offerCount != null;
    }

    /**
     * Set the value of OfferCount, return this.
     *
     * @param offerCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferCountType withOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
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
        condition = r.readAttribute("condition", String.class); 
        fulfillmentChannel = r.readAttribute("fulfillmentChannel", String.class); 
        offerCount = r.readValue(Integer.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeAttribute("condition",condition);
        w.writeAttribute("fulfillmentChannel",fulfillmentChannel);
        w.writeValue(offerCount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "OfferCountType",this);
    }

    /** Value constructor. */
    public OfferCountType(String condition,String fulfillmentChannel,Integer offerCount) {
        this.condition = condition;
        this.fulfillmentChannel = fulfillmentChannel;
        this.offerCount = offerCount;
    }    
    

    /** Default constructor. */
    public OfferCountType() {
        super();
    }

}
