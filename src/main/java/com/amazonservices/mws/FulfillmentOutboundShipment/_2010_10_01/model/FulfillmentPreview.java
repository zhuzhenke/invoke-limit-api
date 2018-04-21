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
 * Fulfillment Preview
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentPreview complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentPreview"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShippingSpeedCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ScheduledDeliveryInfo" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ScheduledDeliveryInfo" minOccurs="0"/&gt;
 *             &lt;element name="IsFulfillable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="IsCODCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedShippingWeight" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Weight" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedFees" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FeeList" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentPreviewShipments" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentPreviewShipmentList" minOccurs="0"/&gt;
 *             &lt;element name="UnfulfillablePreviewItems" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}UnfulfillablePreviewItemList" minOccurs="0"/&gt;
 *             &lt;element name="OrderUnfulfillableReasons" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}StringList" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentPreview", propOrder={
    "shippingSpeedCategory",
    "scheduledDeliveryInfo",
    "isFulfillable",
    "isCODCapable",
    "estimatedShippingWeight",
    "estimatedFees",
    "fulfillmentPreviewShipments",
    "unfulfillablePreviewItems",
    "orderUnfulfillableReasons",
    "marketplaceId"
})
@XmlRootElement(name = "FulfillmentPreview")
public class FulfillmentPreview extends AbstractMwsObject {

    @XmlElement(name="ShippingSpeedCategory",required=true)
    private String shippingSpeedCategory;

    @XmlElement(name="ScheduledDeliveryInfo")
    private ScheduledDeliveryInfo scheduledDeliveryInfo;

    @XmlElement(name="IsFulfillable",required=true)
    private boolean isFulfillable;

    @XmlElement(name="IsCODCapable")
    private Boolean isCODCapable;

    @XmlElement(name="EstimatedShippingWeight")
    private Weight estimatedShippingWeight;

    @XmlElement(name="EstimatedFees")
    private FeeList estimatedFees;

    @XmlElement(name="FulfillmentPreviewShipments")
    private FulfillmentPreviewShipmentList fulfillmentPreviewShipments;

    @XmlElement(name="UnfulfillablePreviewItems")
    private UnfulfillablePreviewItemList unfulfillablePreviewItems;

    @XmlElement(name="OrderUnfulfillableReasons")
    private StringList orderUnfulfillableReasons;

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    /**
     * Get the value of ShippingSpeedCategory.
     *
     * @return The value of ShippingSpeedCategory.
     */
    public String getShippingSpeedCategory() {
        return shippingSpeedCategory;
    }

    /**
     * Set the value of ShippingSpeedCategory.
     *
     * @param shippingSpeedCategory
     *            The new value to set.
     */
    public void setShippingSpeedCategory(String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
    }

    /**
     * Check to see if ShippingSpeedCategory is set.
     *
     * @return true if ShippingSpeedCategory is set.
     */
    public boolean isSetShippingSpeedCategory() {
        return shippingSpeedCategory != null;
    }

    /**
     * Set the value of ShippingSpeedCategory, return this.
     *
     * @param shippingSpeedCategory
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withShippingSpeedCategory(String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        return this;
    }

    /**
     * Get the value of ScheduledDeliveryInfo.
     *
     * @return The value of ScheduledDeliveryInfo.
     */
    public ScheduledDeliveryInfo getScheduledDeliveryInfo() {
        return scheduledDeliveryInfo;
    }

    /**
     * Set the value of ScheduledDeliveryInfo.
     *
     * @param scheduledDeliveryInfo
     *            The new value to set.
     */
    public void setScheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
        this.scheduledDeliveryInfo = scheduledDeliveryInfo;
    }

    /**
     * Check to see if ScheduledDeliveryInfo is set.
     *
     * @return true if ScheduledDeliveryInfo is set.
     */
    public boolean isSetScheduledDeliveryInfo() {
        return scheduledDeliveryInfo != null;
    }

    /**
     * Set the value of ScheduledDeliveryInfo, return this.
     *
     * @param scheduledDeliveryInfo
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withScheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
        this.scheduledDeliveryInfo = scheduledDeliveryInfo;
        return this;
    }

    /**
     * Check the value of IsFulfillable.
     *
     * @return true if IsFulfillable is set to true.
     */
    public boolean isIsFulfillable() {
        return isFulfillable;
    }

    /**
     * Get the value of IsFulfillable.
     *
     * @return The value of IsFulfillable.
     */
    public boolean getIsFulfillable() {
        return isFulfillable;
    }

    /**
     * Set the value of IsFulfillable.
     *
     * @param isFulfillable
     *            The new value to set.
     */
    public void setIsFulfillable(boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public boolean isSetIsFulfillable() {
        return true;
    }

    /**
     * Set the value of IsFulfillable, return this.
     *
     * @param isFulfillable
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withIsFulfillable(boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
        return this;
    }

    /**
     * Check the value of IsCODCapable.
     *
     * @return true if IsCODCapable is set to true.
     */
    public boolean isIsCODCapable() {
        return isCODCapable!=null && isCODCapable.booleanValue();
    }

    /**
     * Get the value of IsCODCapable.
     *
     * @return The value of IsCODCapable.
     */
    public Boolean getIsCODCapable() {
        return isCODCapable;
    }

    /**
     * Set the value of IsCODCapable.
     *
     * @param isCODCapable
     *            The new value to set.
     */
    public void setIsCODCapable(Boolean isCODCapable) {
        this.isCODCapable = isCODCapable;
    }

    /**
     * Check to see if IsCODCapable is set.
     *
     * @return true if IsCODCapable is set.
     */
    public boolean isSetIsCODCapable() {
        return isCODCapable != null;
    }

    /**
     * Set the value of IsCODCapable, return this.
     *
     * @param isCODCapable
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withIsCODCapable(Boolean isCODCapable) {
        this.isCODCapable = isCODCapable;
        return this;
    }

    /**
     * Get the value of EstimatedShippingWeight.
     *
     * @return The value of EstimatedShippingWeight.
     */
    public Weight getEstimatedShippingWeight() {
        return estimatedShippingWeight;
    }

    /**
     * Set the value of EstimatedShippingWeight.
     *
     * @param estimatedShippingWeight
     *            The new value to set.
     */
    public void setEstimatedShippingWeight(Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
    }

    /**
     * Check to see if EstimatedShippingWeight is set.
     *
     * @return true if EstimatedShippingWeight is set.
     */
    public boolean isSetEstimatedShippingWeight() {
        return estimatedShippingWeight != null;
    }

    /**
     * Set the value of EstimatedShippingWeight, return this.
     *
     * @param estimatedShippingWeight
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withEstimatedShippingWeight(Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
        return this;
    }

    /**
     * Get the value of EstimatedFees.
     *
     * @return The value of EstimatedFees.
     */
    public FeeList getEstimatedFees() {
        return estimatedFees;
    }

    /**
     * Set the value of EstimatedFees.
     *
     * @param estimatedFees
     *            The new value to set.
     */
    public void setEstimatedFees(FeeList estimatedFees) {
        this.estimatedFees = estimatedFees;
    }

    /**
     * Check to see if EstimatedFees is set.
     *
     * @return true if EstimatedFees is set.
     */
    public boolean isSetEstimatedFees() {
        return estimatedFees != null;
    }

    /**
     * Set the value of EstimatedFees, return this.
     *
     * @param estimatedFees
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withEstimatedFees(FeeList estimatedFees) {
        this.estimatedFees = estimatedFees;
        return this;
    }

    /**
     * Get the value of FulfillmentPreviewShipments.
     *
     * @return The value of FulfillmentPreviewShipments.
     */
    public FulfillmentPreviewShipmentList getFulfillmentPreviewShipments() {
        return fulfillmentPreviewShipments;
    }

    /**
     * Set the value of FulfillmentPreviewShipments.
     *
     * @param fulfillmentPreviewShipments
     *            The new value to set.
     */
    public void setFulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
    }

    /**
     * Check to see if FulfillmentPreviewShipments is set.
     *
     * @return true if FulfillmentPreviewShipments is set.
     */
    public boolean isSetFulfillmentPreviewShipments() {
        return fulfillmentPreviewShipments != null;
    }

    /**
     * Set the value of FulfillmentPreviewShipments, return this.
     *
     * @param fulfillmentPreviewShipments
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withFulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
        return this;
    }

    /**
     * Get the value of UnfulfillablePreviewItems.
     *
     * @return The value of UnfulfillablePreviewItems.
     */
    public UnfulfillablePreviewItemList getUnfulfillablePreviewItems() {
        return unfulfillablePreviewItems;
    }

    /**
     * Set the value of UnfulfillablePreviewItems.
     *
     * @param unfulfillablePreviewItems
     *            The new value to set.
     */
    public void setUnfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
    }

    /**
     * Check to see if UnfulfillablePreviewItems is set.
     *
     * @return true if UnfulfillablePreviewItems is set.
     */
    public boolean isSetUnfulfillablePreviewItems() {
        return unfulfillablePreviewItems != null;
    }

    /**
     * Set the value of UnfulfillablePreviewItems, return this.
     *
     * @param unfulfillablePreviewItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withUnfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
        return this;
    }

    /**
     * Get the value of OrderUnfulfillableReasons.
     *
     * @return The value of OrderUnfulfillableReasons.
     */
    public StringList getOrderUnfulfillableReasons() {
        return orderUnfulfillableReasons;
    }

    /**
     * Set the value of OrderUnfulfillableReasons.
     *
     * @param orderUnfulfillableReasons
     *            The new value to set.
     */
    public void setOrderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    }

    /**
     * Check to see if OrderUnfulfillableReasons is set.
     *
     * @return true if OrderUnfulfillableReasons is set.
     */
    public boolean isSetOrderUnfulfillableReasons() {
        return orderUnfulfillableReasons != null;
    }

    /**
     * Set the value of OrderUnfulfillableReasons, return this.
     *
     * @param orderUnfulfillableReasons
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withOrderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreview withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
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
        shippingSpeedCategory = r.read("ShippingSpeedCategory", String.class);
        scheduledDeliveryInfo = r.read("ScheduledDeliveryInfo", ScheduledDeliveryInfo.class);
        isFulfillable = r.read("IsFulfillable", boolean.class);
        isCODCapable = r.read("IsCODCapable", Boolean.class);
        estimatedShippingWeight = r.read("EstimatedShippingWeight", Weight.class);
        estimatedFees = r.read("EstimatedFees", FeeList.class);
        fulfillmentPreviewShipments = r.read("FulfillmentPreviewShipments", FulfillmentPreviewShipmentList.class);
        unfulfillablePreviewItems = r.read("UnfulfillablePreviewItems", UnfulfillablePreviewItemList.class);
        orderUnfulfillableReasons = r.read("OrderUnfulfillableReasons", StringList.class);
        marketplaceId = r.read("MarketplaceId", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShippingSpeedCategory", shippingSpeedCategory);
        w.write("ScheduledDeliveryInfo", scheduledDeliveryInfo);
        w.write("IsFulfillable", isFulfillable);
        w.write("IsCODCapable", isCODCapable);
        w.write("EstimatedShippingWeight", estimatedShippingWeight);
        w.write("EstimatedFees", estimatedFees);
        w.write("FulfillmentPreviewShipments", fulfillmentPreviewShipments);
        w.write("UnfulfillablePreviewItems", unfulfillablePreviewItems);
        w.write("OrderUnfulfillableReasons", orderUnfulfillableReasons);
        w.write("MarketplaceId", marketplaceId);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentPreview",this);
    }

    /** Value constructor. */
    public FulfillmentPreview(String shippingSpeedCategory,ScheduledDeliveryInfo scheduledDeliveryInfo,boolean isFulfillable,Boolean isCODCapable,Weight estimatedShippingWeight,FeeList estimatedFees,FulfillmentPreviewShipmentList fulfillmentPreviewShipments,UnfulfillablePreviewItemList unfulfillablePreviewItems,StringList orderUnfulfillableReasons,String marketplaceId) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.scheduledDeliveryInfo = scheduledDeliveryInfo;
        this.isFulfillable = isFulfillable;
        this.isCODCapable = isCODCapable;
        this.estimatedShippingWeight = estimatedShippingWeight;
        this.estimatedFees = estimatedFees;
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
        this.marketplaceId = marketplaceId;
    }    
    

    /**
     * Value constructor
     * 
     */
    public FulfillmentPreview(final String shippingSpeedCategory, final boolean isFulfillable, final Weight estimatedShippingWeight, final FeeList estimatedFees, final FulfillmentPreviewShipmentList fulfillmentPreviewShipments, final UnfulfillablePreviewItemList unfulfillablePreviewItems, final StringList orderUnfulfillableReasons) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.isFulfillable = isFulfillable;
        this.estimatedShippingWeight = estimatedShippingWeight;
        this.estimatedFees = estimatedFees;
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    }

    /** Default constructor. */
    public FulfillmentPreview() {
        super();
    }

}
