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
 * Qualifiers Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * QualifiersType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="QualifiersType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ItemSubcondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShipsDomestically" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingTime" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ShippingTimeType"/&gt;
 *             &lt;element name="SellerPositiveFeedbackRating" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="QualifiersType", propOrder={
    "itemCondition",
    "itemSubcondition",
    "fulfillmentChannel",
    "shipsDomestically",
    "shippingTime",
    "sellerPositiveFeedbackRating"
})
@XmlRootElement(name = "QualifiersType")
public class QualifiersType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="ItemCondition",required=true)
    private String itemCondition;

    @XmlElement(name="ItemSubcondition",required=true)
    private String itemSubcondition;

    @XmlElement(name="FulfillmentChannel",required=true)
    private String fulfillmentChannel;

    @XmlElement(name="ShipsDomestically",required=true)
    private String shipsDomestically;

    @XmlElement(name="ShippingTime",required=true)
    private ShippingTimeType shippingTime;

    @XmlElement(name="SellerPositiveFeedbackRating",required=true)
    private String sellerPositiveFeedbackRating;

    /**
     * Get the value of ItemCondition.
     *
     * @return The value of ItemCondition.
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * Set the value of ItemCondition.
     *
     * @param itemCondition
     *            The new value to set.
     */
    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * Check to see if ItemCondition is set.
     *
     * @return true if ItemCondition is set.
     */
    public boolean isSetItemCondition() {
        return itemCondition != null;
    }

    /**
     * Set the value of ItemCondition, return this.
     *
     * @param itemCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Get the value of ItemSubcondition.
     *
     * @return The value of ItemSubcondition.
     */
    public String getItemSubcondition() {
        return itemSubcondition;
    }

    /**
     * Set the value of ItemSubcondition.
     *
     * @param itemSubcondition
     *            The new value to set.
     */
    public void setItemSubcondition(String itemSubcondition) {
        this.itemSubcondition = itemSubcondition;
    }

    /**
     * Check to see if ItemSubcondition is set.
     *
     * @return true if ItemSubcondition is set.
     */
    public boolean isSetItemSubcondition() {
        return itemSubcondition != null;
    }

    /**
     * Set the value of ItemSubcondition, return this.
     *
     * @param itemSubcondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withItemSubcondition(String itemSubcondition) {
        this.itemSubcondition = itemSubcondition;
        return this;
    }

    /**
     * Get the value of FulfillmentChannel.
     *
     * @return The value of FulfillmentChannel.
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Set the value of FulfillmentChannel.
     *
     * @param fulfillmentChannel
     *            The new value to set.
     */
    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    /**
     * Check to see if FulfillmentChannel is set.
     *
     * @return true if FulfillmentChannel is set.
     */
    public boolean isSetFulfillmentChannel() {
        return fulfillmentChannel != null;
    }

    /**
     * Set the value of FulfillmentChannel, return this.
     *
     * @param fulfillmentChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Get the value of ShipsDomestically.
     *
     * @return The value of ShipsDomestically.
     */
    public String getShipsDomestically() {
        return shipsDomestically;
    }

    /**
     * Set the value of ShipsDomestically.
     *
     * @param shipsDomestically
     *            The new value to set.
     */
    public void setShipsDomestically(String shipsDomestically) {
        this.shipsDomestically = shipsDomestically;
    }

    /**
     * Check to see if ShipsDomestically is set.
     *
     * @return true if ShipsDomestically is set.
     */
    public boolean isSetShipsDomestically() {
        return shipsDomestically != null;
    }

    /**
     * Set the value of ShipsDomestically, return this.
     *
     * @param shipsDomestically
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withShipsDomestically(String shipsDomestically) {
        this.shipsDomestically = shipsDomestically;
        return this;
    }

    /**
     * Get the value of ShippingTime.
     *
     * @return The value of ShippingTime.
     */
    public ShippingTimeType getShippingTime() {
        return shippingTime;
    }

    /**
     * Set the value of ShippingTime.
     *
     * @param shippingTime
     *            The new value to set.
     */
    public void setShippingTime(ShippingTimeType shippingTime) {
        this.shippingTime = shippingTime;
    }

    /**
     * Check to see if ShippingTime is set.
     *
     * @return true if ShippingTime is set.
     */
    public boolean isSetShippingTime() {
        return shippingTime != null;
    }

    /**
     * Set the value of ShippingTime, return this.
     *
     * @param shippingTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withShippingTime(ShippingTimeType shippingTime) {
        this.shippingTime = shippingTime;
        return this;
    }

    /**
     * Get the value of SellerPositiveFeedbackRating.
     *
     * @return The value of SellerPositiveFeedbackRating.
     */
    public String getSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating;
    }

    /**
     * Set the value of SellerPositiveFeedbackRating.
     *
     * @param sellerPositiveFeedbackRating
     *            The new value to set.
     */
    public void setSellerPositiveFeedbackRating(String sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    }

    /**
     * Check to see if SellerPositiveFeedbackRating is set.
     *
     * @return true if SellerPositiveFeedbackRating is set.
     */
    public boolean isSetSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating != null;
    }

    /**
     * Set the value of SellerPositiveFeedbackRating, return this.
     *
     * @param sellerPositiveFeedbackRating
     *             The new value to set.
     *
     * @return This instance.
     */
    public QualifiersType withSellerPositiveFeedbackRating(String sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
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
        itemCondition = r.read("ItemCondition", String.class);
        itemSubcondition = r.read("ItemSubcondition", String.class);
        fulfillmentChannel = r.read("FulfillmentChannel", String.class);
        shipsDomestically = r.read("ShipsDomestically", String.class);
        shippingTime = r.read("ShippingTime", ShippingTimeType.class);
        sellerPositiveFeedbackRating = r.read("SellerPositiveFeedbackRating", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ItemCondition", itemCondition);
        w.write("ItemSubcondition", itemSubcondition);
        w.write("FulfillmentChannel", fulfillmentChannel);
        w.write("ShipsDomestically", shipsDomestically);
        w.write("ShippingTime", shippingTime);
        w.write("SellerPositiveFeedbackRating", sellerPositiveFeedbackRating);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "QualifiersType",this);
    }

    /** Value constructor. */
    public QualifiersType(String itemCondition,String itemSubcondition,String fulfillmentChannel,String shipsDomestically,ShippingTimeType shippingTime,String sellerPositiveFeedbackRating) {
        this.itemCondition = itemCondition;
        this.itemSubcondition = itemSubcondition;
        this.fulfillmentChannel = fulfillmentChannel;
        this.shipsDomestically = shipsDomestically;
        this.shippingTime = shippingTime;
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    }    
    

    /** Default constructor. */
    public QualifiersType() {
        super();
    }

}
