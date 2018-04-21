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
 * Fulfillment Shipment
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentShipment complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentShipment"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentCenterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentShipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentShipmentItem" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentShipmentItemList"/&gt;
 *             &lt;element name="FulfillmentShipmentPackage" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentShipmentPackageList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentShipment", propOrder={
    "amazonShipmentId",
    "fulfillmentCenterId",
    "fulfillmentShipmentStatus",
    "shippingDateTime",
    "estimatedArrivalDateTime",
    "fulfillmentShipmentItem",
    "fulfillmentShipmentPackage"
})
@XmlRootElement(name = "FulfillmentShipment")
public class FulfillmentShipment extends AbstractMwsObject {

    @XmlElement(name="AmazonShipmentId",required=true)
    private String amazonShipmentId;

    @XmlElement(name="FulfillmentCenterId",required=true)
    private String fulfillmentCenterId;

    @XmlElement(name="FulfillmentShipmentStatus",required=true)
    private String fulfillmentShipmentStatus;

    @XmlElement(name="ShippingDateTime")
    private XMLGregorianCalendar shippingDateTime;

    @XmlElement(name="EstimatedArrivalDateTime")
    private XMLGregorianCalendar estimatedArrivalDateTime;

    @XmlElement(name="FulfillmentShipmentItem",required=true)
    private FulfillmentShipmentItemList fulfillmentShipmentItem;

    @XmlElement(name="FulfillmentShipmentPackage")
    private FulfillmentShipmentPackageList fulfillmentShipmentPackage;

    /**
     * Get the value of AmazonShipmentId.
     *
     * @return The value of AmazonShipmentId.
     */
    public String getAmazonShipmentId() {
        return amazonShipmentId;
    }

    /**
     * Set the value of AmazonShipmentId.
     *
     * @param amazonShipmentId
     *            The new value to set.
     */
    public void setAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }

    /**
     * Check to see if AmazonShipmentId is set.
     *
     * @return true if AmazonShipmentId is set.
     */
    public boolean isSetAmazonShipmentId() {
        return amazonShipmentId != null;
    }

    /**
     * Set the value of AmazonShipmentId, return this.
     *
     * @param amazonShipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * Get the value of FulfillmentCenterId.
     *
     * @return The value of FulfillmentCenterId.
     */
    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    /**
     * Set the value of FulfillmentCenterId.
     *
     * @param fulfillmentCenterId
     *            The new value to set.
     */
    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    /**
     * Check to see if FulfillmentCenterId is set.
     *
     * @return true if FulfillmentCenterId is set.
     */
    public boolean isSetFulfillmentCenterId() {
        return fulfillmentCenterId != null;
    }

    /**
     * Set the value of FulfillmentCenterId, return this.
     *
     * @param fulfillmentCenterId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
        return this;
    }

    /**
     * Get the value of FulfillmentShipmentStatus.
     *
     * @return The value of FulfillmentShipmentStatus.
     */
    public String getFulfillmentShipmentStatus() {
        return fulfillmentShipmentStatus;
    }

    /**
     * Set the value of FulfillmentShipmentStatus.
     *
     * @param fulfillmentShipmentStatus
     *            The new value to set.
     */
    public void setFulfillmentShipmentStatus(String fulfillmentShipmentStatus) {
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
    }

    /**
     * Check to see if FulfillmentShipmentStatus is set.
     *
     * @return true if FulfillmentShipmentStatus is set.
     */
    public boolean isSetFulfillmentShipmentStatus() {
        return fulfillmentShipmentStatus != null;
    }

    /**
     * Set the value of FulfillmentShipmentStatus, return this.
     *
     * @param fulfillmentShipmentStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withFulfillmentShipmentStatus(String fulfillmentShipmentStatus) {
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
        return this;
    }

    /**
     * Get the value of ShippingDateTime.
     *
     * @return The value of ShippingDateTime.
     */
    public XMLGregorianCalendar getShippingDateTime() {
        return shippingDateTime;
    }

    /**
     * Set the value of ShippingDateTime.
     *
     * @param shippingDateTime
     *            The new value to set.
     */
    public void setShippingDateTime(XMLGregorianCalendar shippingDateTime) {
        this.shippingDateTime = shippingDateTime;
    }

    /**
     * Check to see if ShippingDateTime is set.
     *
     * @return true if ShippingDateTime is set.
     */
    public boolean isSetShippingDateTime() {
        return shippingDateTime != null;
    }

    /**
     * Set the value of ShippingDateTime, return this.
     *
     * @param shippingDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withShippingDateTime(XMLGregorianCalendar shippingDateTime) {
        this.shippingDateTime = shippingDateTime;
        return this;
    }

    /**
     * Get the value of EstimatedArrivalDateTime.
     *
     * @return The value of EstimatedArrivalDateTime.
     */
    public XMLGregorianCalendar getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }

    /**
     * Set the value of EstimatedArrivalDateTime.
     *
     * @param estimatedArrivalDateTime
     *            The new value to set.
     */
    public void setEstimatedArrivalDateTime(XMLGregorianCalendar estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }

    /**
     * Check to see if EstimatedArrivalDateTime is set.
     *
     * @return true if EstimatedArrivalDateTime is set.
     */
    public boolean isSetEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime != null;
    }

    /**
     * Set the value of EstimatedArrivalDateTime, return this.
     *
     * @param estimatedArrivalDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withEstimatedArrivalDateTime(XMLGregorianCalendar estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
        return this;
    }

    /**
     * Get the value of FulfillmentShipmentItem.
     *
     * @return The value of FulfillmentShipmentItem.
     */
    public FulfillmentShipmentItemList getFulfillmentShipmentItem() {
        return fulfillmentShipmentItem;
    }

    /**
     * Set the value of FulfillmentShipmentItem.
     *
     * @param fulfillmentShipmentItem
     *            The new value to set.
     */
    public void setFulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
    }

    /**
     * Check to see if FulfillmentShipmentItem is set.
     *
     * @return true if FulfillmentShipmentItem is set.
     */
    public boolean isSetFulfillmentShipmentItem() {
        return fulfillmentShipmentItem != null;
    }

    /**
     * Set the value of FulfillmentShipmentItem, return this.
     *
     * @param fulfillmentShipmentItem
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withFulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
        return this;
    }

    /**
     * Get the value of FulfillmentShipmentPackage.
     *
     * @return The value of FulfillmentShipmentPackage.
     */
    public FulfillmentShipmentPackageList getFulfillmentShipmentPackage() {
        return fulfillmentShipmentPackage;
    }

    /**
     * Set the value of FulfillmentShipmentPackage.
     *
     * @param fulfillmentShipmentPackage
     *            The new value to set.
     */
    public void setFulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    }

    /**
     * Check to see if FulfillmentShipmentPackage is set.
     *
     * @return true if FulfillmentShipmentPackage is set.
     */
    public boolean isSetFulfillmentShipmentPackage() {
        return fulfillmentShipmentPackage != null;
    }

    /**
     * Set the value of FulfillmentShipmentPackage, return this.
     *
     * @param fulfillmentShipmentPackage
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipment withFulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
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
        amazonShipmentId = r.read("AmazonShipmentId", String.class);
        fulfillmentCenterId = r.read("FulfillmentCenterId", String.class);
        fulfillmentShipmentStatus = r.read("FulfillmentShipmentStatus", String.class);
        shippingDateTime = r.read("ShippingDateTime", XMLGregorianCalendar.class);
        estimatedArrivalDateTime = r.read("EstimatedArrivalDateTime", XMLGregorianCalendar.class);
        fulfillmentShipmentItem = r.read("FulfillmentShipmentItem", FulfillmentShipmentItemList.class);
        fulfillmentShipmentPackage = r.read("FulfillmentShipmentPackage", FulfillmentShipmentPackageList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonShipmentId", amazonShipmentId);
        w.write("FulfillmentCenterId", fulfillmentCenterId);
        w.write("FulfillmentShipmentStatus", fulfillmentShipmentStatus);
        w.write("ShippingDateTime", shippingDateTime);
        w.write("EstimatedArrivalDateTime", estimatedArrivalDateTime);
        w.write("FulfillmentShipmentItem", fulfillmentShipmentItem);
        w.write("FulfillmentShipmentPackage", fulfillmentShipmentPackage);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentShipment",this);
    }

    /** Value constructor. */
    public FulfillmentShipment(String amazonShipmentId,String fulfillmentCenterId,String fulfillmentShipmentStatus,XMLGregorianCalendar shippingDateTime,XMLGregorianCalendar estimatedArrivalDateTime,FulfillmentShipmentItemList fulfillmentShipmentItem,FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
        this.amazonShipmentId = amazonShipmentId;
        this.fulfillmentCenterId = fulfillmentCenterId;
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
        this.shippingDateTime = shippingDateTime;
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    }    
    

    /** Default constructor. */
    public FulfillmentShipment() {
        super();
    }

}
