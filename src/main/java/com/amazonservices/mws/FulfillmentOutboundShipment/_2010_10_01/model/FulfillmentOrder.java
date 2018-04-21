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
 * Fulfillment Order
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentOrder complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentOrder"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerFulfillmentOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DisplayableOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DisplayableOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="DisplayableOrderComment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ShippingSpeedCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DeliveryWindow" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}DeliveryWindow" minOccurs="0"/&gt;
 *             &lt;element name="DestinationAddress" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Address"/&gt;
 *             &lt;element name="FulfillmentAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CODSettings" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}CODSettings" minOccurs="0"/&gt;
 *             &lt;element name="ReceivedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="FulfillmentOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="StatusUpdatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="NotificationEmailList" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}NotificationEmailList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentOrder", propOrder={
    "sellerFulfillmentOrderId",
    "marketplaceId",
    "displayableOrderId",
    "displayableOrderDateTime",
    "displayableOrderComment",
    "shippingSpeedCategory",
    "deliveryWindow",
    "destinationAddress",
    "fulfillmentAction",
    "fulfillmentPolicy",
    "fulfillmentMethod",
    "codSettings",
    "receivedDateTime",
    "fulfillmentOrderStatus",
    "statusUpdatedDateTime",
    "notificationEmailList"
})
@XmlRootElement(name = "FulfillmentOrder")
public class FulfillmentOrder extends AbstractMwsObject {

    @XmlElement(name="SellerFulfillmentOrderId",required=true)
    private String sellerFulfillmentOrderId;

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="DisplayableOrderId",required=true)
    private String displayableOrderId;

    @XmlElement(name="DisplayableOrderDateTime",required=true)
    private XMLGregorianCalendar displayableOrderDateTime;

    @XmlElement(name="DisplayableOrderComment",required=true)
    private String displayableOrderComment;

    @XmlElement(name="ShippingSpeedCategory",required=true)
    private String shippingSpeedCategory;

    @XmlElement(name="DeliveryWindow")
    private DeliveryWindow deliveryWindow;

    @XmlElement(name="DestinationAddress",required=true)
    private Address destinationAddress;

    @XmlElement(name="FulfillmentAction")
    private String fulfillmentAction;

    @XmlElement(name="FulfillmentPolicy")
    private String fulfillmentPolicy;

    @XmlElement(name="FulfillmentMethod")
    private String fulfillmentMethod;

    @XmlElement(name="CODSettings")
    private CODSettings codSettings;

    @XmlElement(name="ReceivedDateTime",required=true)
    private XMLGregorianCalendar receivedDateTime;

    @XmlElement(name="FulfillmentOrderStatus",required=true)
    private String fulfillmentOrderStatus;

    @XmlElement(name="StatusUpdatedDateTime",required=true)
    private XMLGregorianCalendar statusUpdatedDateTime;

    @XmlElement(name="NotificationEmailList")
    private NotificationEmailList notificationEmailList;

    /**
     * Get the value of SellerFulfillmentOrderId.
     *
     * @return The value of SellerFulfillmentOrderId.
     */
    public String getSellerFulfillmentOrderId() {
        return sellerFulfillmentOrderId;
    }

    /**
     * Set the value of SellerFulfillmentOrderId.
     *
     * @param sellerFulfillmentOrderId
     *            The new value to set.
     */
    public void setSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
    }

    /**
     * Check to see if SellerFulfillmentOrderId is set.
     *
     * @return true if SellerFulfillmentOrderId is set.
     */
    public boolean isSetSellerFulfillmentOrderId() {
        return sellerFulfillmentOrderId != null;
    }

    /**
     * Set the value of SellerFulfillmentOrderId, return this.
     *
     * @param sellerFulfillmentOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
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
    public FulfillmentOrder withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of DisplayableOrderId.
     *
     * @return The value of DisplayableOrderId.
     */
    public String getDisplayableOrderId() {
        return displayableOrderId;
    }

    /**
     * Set the value of DisplayableOrderId.
     *
     * @param displayableOrderId
     *            The new value to set.
     */
    public void setDisplayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
    }

    /**
     * Check to see if DisplayableOrderId is set.
     *
     * @return true if DisplayableOrderId is set.
     */
    public boolean isSetDisplayableOrderId() {
        return displayableOrderId != null;
    }

    /**
     * Set the value of DisplayableOrderId, return this.
     *
     * @param displayableOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withDisplayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
        return this;
    }

    /**
     * Get the value of DisplayableOrderDateTime.
     *
     * @return The value of DisplayableOrderDateTime.
     */
    public XMLGregorianCalendar getDisplayableOrderDateTime() {
        return displayableOrderDateTime;
    }

    /**
     * Set the value of DisplayableOrderDateTime.
     *
     * @param displayableOrderDateTime
     *            The new value to set.
     */
    public void setDisplayableOrderDateTime(XMLGregorianCalendar displayableOrderDateTime) {
        this.displayableOrderDateTime = displayableOrderDateTime;
    }

    /**
     * Check to see if DisplayableOrderDateTime is set.
     *
     * @return true if DisplayableOrderDateTime is set.
     */
    public boolean isSetDisplayableOrderDateTime() {
        return displayableOrderDateTime != null;
    }

    /**
     * Set the value of DisplayableOrderDateTime, return this.
     *
     * @param displayableOrderDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withDisplayableOrderDateTime(XMLGregorianCalendar displayableOrderDateTime) {
        this.displayableOrderDateTime = displayableOrderDateTime;
        return this;
    }

    /**
     * Get the value of DisplayableOrderComment.
     *
     * @return The value of DisplayableOrderComment.
     */
    public String getDisplayableOrderComment() {
        return displayableOrderComment;
    }

    /**
     * Set the value of DisplayableOrderComment.
     *
     * @param displayableOrderComment
     *            The new value to set.
     */
    public void setDisplayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
    }

    /**
     * Check to see if DisplayableOrderComment is set.
     *
     * @return true if DisplayableOrderComment is set.
     */
    public boolean isSetDisplayableOrderComment() {
        return displayableOrderComment != null;
    }

    /**
     * Set the value of DisplayableOrderComment, return this.
     *
     * @param displayableOrderComment
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withDisplayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
        return this;
    }

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
    public FulfillmentOrder withShippingSpeedCategory(String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        return this;
    }

    /**
     * Get the value of DeliveryWindow.
     *
     * @return The value of DeliveryWindow.
     */
    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    /**
     * Set the value of DeliveryWindow.
     *
     * @param deliveryWindow
     *            The new value to set.
     */
    public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    /**
     * Check to see if DeliveryWindow is set.
     *
     * @return true if DeliveryWindow is set.
     */
    public boolean isSetDeliveryWindow() {
        return deliveryWindow != null;
    }

    /**
     * Set the value of DeliveryWindow, return this.
     *
     * @param deliveryWindow
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
        return this;
    }

    /**
     * Get the value of DestinationAddress.
     *
     * @return The value of DestinationAddress.
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Set the value of DestinationAddress.
     *
     * @param destinationAddress
     *            The new value to set.
     */
    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * Check to see if DestinationAddress is set.
     *
     * @return true if DestinationAddress is set.
     */
    public boolean isSetDestinationAddress() {
        return destinationAddress != null;
    }

    /**
     * Set the value of DestinationAddress, return this.
     *
     * @param destinationAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    /**
     * Get the value of FulfillmentAction.
     *
     * @return The value of FulfillmentAction.
     */
    public String getFulfillmentAction() {
        return fulfillmentAction;
    }

    /**
     * Set the value of FulfillmentAction.
     *
     * @param fulfillmentAction
     *            The new value to set.
     */
    public void setFulfillmentAction(String fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
    }

    /**
     * Check to see if FulfillmentAction is set.
     *
     * @return true if FulfillmentAction is set.
     */
    public boolean isSetFulfillmentAction() {
        return fulfillmentAction != null;
    }

    /**
     * Set the value of FulfillmentAction, return this.
     *
     * @param fulfillmentAction
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withFulfillmentAction(String fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
        return this;
    }

    /**
     * Get the value of FulfillmentPolicy.
     *
     * @return The value of FulfillmentPolicy.
     */
    public String getFulfillmentPolicy() {
        return fulfillmentPolicy;
    }

    /**
     * Set the value of FulfillmentPolicy.
     *
     * @param fulfillmentPolicy
     *            The new value to set.
     */
    public void setFulfillmentPolicy(String fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
    }

    /**
     * Check to see if FulfillmentPolicy is set.
     *
     * @return true if FulfillmentPolicy is set.
     */
    public boolean isSetFulfillmentPolicy() {
        return fulfillmentPolicy != null;
    }

    /**
     * Set the value of FulfillmentPolicy, return this.
     *
     * @param fulfillmentPolicy
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withFulfillmentPolicy(String fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
        return this;
    }

    /**
     * Get the value of FulfillmentMethod.
     *
     * @return The value of FulfillmentMethod.
     */
    public String getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    /**
     * Set the value of FulfillmentMethod.
     *
     * @param fulfillmentMethod
     *            The new value to set.
     */
    public void setFulfillmentMethod(String fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }

    /**
     * Check to see if FulfillmentMethod is set.
     *
     * @return true if FulfillmentMethod is set.
     */
    public boolean isSetFulfillmentMethod() {
        return fulfillmentMethod != null;
    }

    /**
     * Set the value of FulfillmentMethod, return this.
     *
     * @param fulfillmentMethod
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withFulfillmentMethod(String fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
        return this;
    }

    /**
     * Get the value of CODSettings.
     *
     * @return The value of CODSettings.
     */
    public CODSettings getCODSettings() {
        return codSettings;
    }

    /**
     * Set the value of CODSettings.
     *
     * @param codSettings
     *            The new value to set.
     */
    public void setCODSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
    }

    /**
     * Check to see if CODSettings is set.
     *
     * @return true if CODSettings is set.
     */
    public boolean isSetCODSettings() {
        return codSettings != null;
    }

    /**
     * Set the value of CODSettings, return this.
     *
     * @param codSettings
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withCODSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
        return this;
    }

    /**
     * Get the value of ReceivedDateTime.
     *
     * @return The value of ReceivedDateTime.
     */
    public XMLGregorianCalendar getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Set the value of ReceivedDateTime.
     *
     * @param receivedDateTime
     *            The new value to set.
     */
    public void setReceivedDateTime(XMLGregorianCalendar receivedDateTime) {
        this.receivedDateTime = receivedDateTime;
    }

    /**
     * Check to see if ReceivedDateTime is set.
     *
     * @return true if ReceivedDateTime is set.
     */
    public boolean isSetReceivedDateTime() {
        return receivedDateTime != null;
    }

    /**
     * Set the value of ReceivedDateTime, return this.
     *
     * @param receivedDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withReceivedDateTime(XMLGregorianCalendar receivedDateTime) {
        this.receivedDateTime = receivedDateTime;
        return this;
    }

    /**
     * Get the value of FulfillmentOrderStatus.
     *
     * @return The value of FulfillmentOrderStatus.
     */
    public String getFulfillmentOrderStatus() {
        return fulfillmentOrderStatus;
    }

    /**
     * Set the value of FulfillmentOrderStatus.
     *
     * @param fulfillmentOrderStatus
     *            The new value to set.
     */
    public void setFulfillmentOrderStatus(String fulfillmentOrderStatus) {
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
    }

    /**
     * Check to see if FulfillmentOrderStatus is set.
     *
     * @return true if FulfillmentOrderStatus is set.
     */
    public boolean isSetFulfillmentOrderStatus() {
        return fulfillmentOrderStatus != null;
    }

    /**
     * Set the value of FulfillmentOrderStatus, return this.
     *
     * @param fulfillmentOrderStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withFulfillmentOrderStatus(String fulfillmentOrderStatus) {
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
        return this;
    }

    /**
     * Get the value of StatusUpdatedDateTime.
     *
     * @return The value of StatusUpdatedDateTime.
     */
    public XMLGregorianCalendar getStatusUpdatedDateTime() {
        return statusUpdatedDateTime;
    }

    /**
     * Set the value of StatusUpdatedDateTime.
     *
     * @param statusUpdatedDateTime
     *            The new value to set.
     */
    public void setStatusUpdatedDateTime(XMLGregorianCalendar statusUpdatedDateTime) {
        this.statusUpdatedDateTime = statusUpdatedDateTime;
    }

    /**
     * Check to see if StatusUpdatedDateTime is set.
     *
     * @return true if StatusUpdatedDateTime is set.
     */
    public boolean isSetStatusUpdatedDateTime() {
        return statusUpdatedDateTime != null;
    }

    /**
     * Set the value of StatusUpdatedDateTime, return this.
     *
     * @param statusUpdatedDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withStatusUpdatedDateTime(XMLGregorianCalendar statusUpdatedDateTime) {
        this.statusUpdatedDateTime = statusUpdatedDateTime;
        return this;
    }

    /**
     * Get the value of NotificationEmailList.
     *
     * @return The value of NotificationEmailList.
     */
    public NotificationEmailList getNotificationEmailList() {
        return notificationEmailList;
    }

    /**
     * Set the value of NotificationEmailList.
     *
     * @param notificationEmailList
     *            The new value to set.
     */
    public void setNotificationEmailList(NotificationEmailList notificationEmailList) {
        this.notificationEmailList = notificationEmailList;
    }

    /**
     * Check to see if NotificationEmailList is set.
     *
     * @return true if NotificationEmailList is set.
     */
    public boolean isSetNotificationEmailList() {
        return notificationEmailList != null;
    }

    /**
     * Set the value of NotificationEmailList, return this.
     *
     * @param notificationEmailList
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrder withNotificationEmailList(NotificationEmailList notificationEmailList) {
        this.notificationEmailList = notificationEmailList;
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
        sellerFulfillmentOrderId = r.read("SellerFulfillmentOrderId", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        displayableOrderId = r.read("DisplayableOrderId", String.class);
        displayableOrderDateTime = r.read("DisplayableOrderDateTime", XMLGregorianCalendar.class);
        displayableOrderComment = r.read("DisplayableOrderComment", String.class);
        shippingSpeedCategory = r.read("ShippingSpeedCategory", String.class);
        deliveryWindow = r.read("DeliveryWindow", DeliveryWindow.class);
        destinationAddress = r.read("DestinationAddress", Address.class);
        fulfillmentAction = r.read("FulfillmentAction", String.class);
        fulfillmentPolicy = r.read("FulfillmentPolicy", String.class);
        fulfillmentMethod = r.read("FulfillmentMethod", String.class);
        codSettings = r.read("CODSettings", CODSettings.class);
        receivedDateTime = r.read("ReceivedDateTime", XMLGregorianCalendar.class);
        fulfillmentOrderStatus = r.read("FulfillmentOrderStatus", String.class);
        statusUpdatedDateTime = r.read("StatusUpdatedDateTime", XMLGregorianCalendar.class);
        notificationEmailList = r.read("NotificationEmailList", NotificationEmailList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerFulfillmentOrderId", sellerFulfillmentOrderId);
        w.write("MarketplaceId", marketplaceId);
        w.write("DisplayableOrderId", displayableOrderId);
        w.write("DisplayableOrderDateTime", displayableOrderDateTime);
        w.write("DisplayableOrderComment", displayableOrderComment);
        w.write("ShippingSpeedCategory", shippingSpeedCategory);
        w.write("DeliveryWindow", deliveryWindow);
        w.write("DestinationAddress", destinationAddress);
        w.write("FulfillmentAction", fulfillmentAction);
        w.write("FulfillmentPolicy", fulfillmentPolicy);
        w.write("FulfillmentMethod", fulfillmentMethod);
        w.write("CODSettings", codSettings);
        w.write("ReceivedDateTime", receivedDateTime);
        w.write("FulfillmentOrderStatus", fulfillmentOrderStatus);
        w.write("StatusUpdatedDateTime", statusUpdatedDateTime);
        w.write("NotificationEmailList", notificationEmailList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentOrder",this);
    }

    /** Value constructor. */
    public FulfillmentOrder(final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final XMLGregorianCalendar receivedDateTime, final String fulfillmentOrderStatus, final XMLGregorianCalendar statusUpdatedDateTime, final NotificationEmailList notificationEmailList) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.receivedDateTime = receivedDateTime;
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
        this.statusUpdatedDateTime = statusUpdatedDateTime;
        this.notificationEmailList = notificationEmailList;
    }

    public FulfillmentOrder(final String sellerFulfillmentOrderId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentPolicy, final String fulfillmentMethod, final XMLGregorianCalendar receivedDateTime, final String fulfillmentOrderStatus, final XMLGregorianCalendar statusUpdatedDateTime, final NotificationEmailList notificationEmailList, final CODSettings cODSettings) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.receivedDateTime = receivedDateTime;
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
        this.statusUpdatedDateTime = statusUpdatedDateTime;
        this.notificationEmailList = notificationEmailList;
        this.codSettings = cODSettings;
    }
    
    public FulfillmentOrder(final String sellerFulfillmentOrderId, final String marketplaceId, final String displayableOrderId, final XMLGregorianCalendar displayableOrderDateTime, final String displayableOrderComment, final String shippingSpeedCategory, final Address destinationAddress, final String fulfillmentAction, final String fulfillmentPolicy, final String fulfillmentMethod, final XMLGregorianCalendar receivedDateTime, final String fulfillmentOrderStatus, final XMLGregorianCalendar statusUpdatedDateTime, final NotificationEmailList notificationEmailList, final CODSettings cODSettings) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        this.marketplaceId = marketplaceId;
        this.displayableOrderId = displayableOrderId;
        this.displayableOrderDateTime = displayableOrderDateTime;
        this.displayableOrderComment = displayableOrderComment;
        this.shippingSpeedCategory = shippingSpeedCategory;
        this.destinationAddress = destinationAddress;
        this.fulfillmentAction = fulfillmentAction;
        this.fulfillmentPolicy = fulfillmentPolicy;
        this.fulfillmentMethod = fulfillmentMethod;
        this.receivedDateTime = receivedDateTime;
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
        this.statusUpdatedDateTime = statusUpdatedDateTime;
        this.notificationEmailList = notificationEmailList;
        this.codSettings = cODSettings;
    }

    /** Default constructor. */
    public FulfillmentOrder() {
        super();
    }

}
