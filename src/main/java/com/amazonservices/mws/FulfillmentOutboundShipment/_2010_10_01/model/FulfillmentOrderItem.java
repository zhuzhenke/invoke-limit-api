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
 * Fulfillment Order Item
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentOrderItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentOrderItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DisplayableComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentNetworkSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="OrderItemDisposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CancelledQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="UnfulfillableQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="EstimatedShipDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitPrice" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitTax" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="PerUnitDeclaredValue" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentOrderItem", propOrder={
    "sellerSKU",
    "sellerFulfillmentOrderItemId",
    "quantity",
    "giftMessage",
    "displayableComment",
    "fulfillmentNetworkSKU",
    "orderItemDisposition",
    "cancelledQuantity",
    "unfulfillableQuantity",
    "estimatedShipDateTime",
    "estimatedArrivalDateTime",
    "perUnitPrice",
    "perUnitTax",
    "perUnitDeclaredValue"
})
@XmlRootElement(name = "FulfillmentOrderItem")
public class FulfillmentOrderItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="Quantity",required=true)
    private int quantity;

    @XmlElement(name="GiftMessage")
    private String giftMessage;

    @XmlElement(name="DisplayableComment")
    private String displayableComment;

    @XmlElement(name="FulfillmentNetworkSKU")
    private String fulfillmentNetworkSKU;

    @XmlElement(name="OrderItemDisposition")
    private String orderItemDisposition;

    @XmlElement(name="CancelledQuantity",required=true)
    private int cancelledQuantity;

    @XmlElement(name="UnfulfillableQuantity",required=true)
    private int unfulfillableQuantity;

    @XmlElement(name="EstimatedShipDateTime")
    private XMLGregorianCalendar estimatedShipDateTime;

    @XmlElement(name="EstimatedArrivalDateTime")
    private XMLGregorianCalendar estimatedArrivalDateTime;

    @XmlElement(name="PerUnitPrice")
    private Currency perUnitPrice;

    @XmlElement(name="PerUnitTax")
    private Currency perUnitTax;

    @XmlElement(name="PerUnitDeclaredValue")
    private Currency perUnitDeclaredValue;

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of SellerFulfillmentOrderItemId.
     *
     * @return The value of SellerFulfillmentOrderItemId.
     */
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    /**
     * Set the value of SellerFulfillmentOrderItemId.
     *
     * @param sellerFulfillmentOrderItemId
     *            The new value to set.
     */
    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    /**
     * Check to see if SellerFulfillmentOrderItemId is set.
     *
     * @return true if SellerFulfillmentOrderItemId is set.
     */
    public boolean isSetSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId != null;
    }

    /**
     * Set the value of SellerFulfillmentOrderItemId, return this.
     *
     * @param sellerFulfillmentOrderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSetQuantity() {
        return true;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of GiftMessage.
     *
     * @return The value of GiftMessage.
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Set the value of GiftMessage.
     *
     * @param giftMessage
     *            The new value to set.
     */
    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    /**
     * Check to see if GiftMessage is set.
     *
     * @return true if GiftMessage is set.
     */
    public boolean isSetGiftMessage() {
        return giftMessage != null;
    }

    /**
     * Set the value of GiftMessage, return this.
     *
     * @param giftMessage
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
        return this;
    }

    /**
     * Get the value of DisplayableComment.
     *
     * @return The value of DisplayableComment.
     */
    public String getDisplayableComment() {
        return displayableComment;
    }

    /**
     * Set the value of DisplayableComment.
     *
     * @param displayableComment
     *            The new value to set.
     */
    public void setDisplayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
    }

    /**
     * Check to see if DisplayableComment is set.
     *
     * @return true if DisplayableComment is set.
     */
    public boolean isSetDisplayableComment() {
        return displayableComment != null;
    }

    /**
     * Set the value of DisplayableComment, return this.
     *
     * @param displayableComment
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withDisplayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
        return this;
    }

    /**
     * Get the value of FulfillmentNetworkSKU.
     *
     * @return The value of FulfillmentNetworkSKU.
     */
    public String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }

    /**
     * Set the value of FulfillmentNetworkSKU.
     *
     * @param fulfillmentNetworkSKU
     *            The new value to set.
     */
    public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }

    /**
     * Check to see if FulfillmentNetworkSKU is set.
     *
     * @return true if FulfillmentNetworkSKU is set.
     */
    public boolean isSetFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU != null;
    }

    /**
     * Set the value of FulfillmentNetworkSKU, return this.
     *
     * @param fulfillmentNetworkSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        return this;
    }

    /**
     * Get the value of OrderItemDisposition.
     *
     * @return The value of OrderItemDisposition.
     */
    public String getOrderItemDisposition() {
        return orderItemDisposition;
    }

    /**
     * Set the value of OrderItemDisposition.
     *
     * @param orderItemDisposition
     *            The new value to set.
     */
    public void setOrderItemDisposition(String orderItemDisposition) {
        this.orderItemDisposition = orderItemDisposition;
    }

    /**
     * Check to see if OrderItemDisposition is set.
     *
     * @return true if OrderItemDisposition is set.
     */
    public boolean isSetOrderItemDisposition() {
        return orderItemDisposition != null;
    }

    /**
     * Set the value of OrderItemDisposition, return this.
     *
     * @param orderItemDisposition
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withOrderItemDisposition(String orderItemDisposition) {
        this.orderItemDisposition = orderItemDisposition;
        return this;
    }

    /**
     * Get the value of CancelledQuantity.
     *
     * @return The value of CancelledQuantity.
     */
    public int getCancelledQuantity() {
        return cancelledQuantity;
    }

    /**
     * Set the value of CancelledQuantity.
     *
     * @param cancelledQuantity
     *            The new value to set.
     */
    public void setCancelledQuantity(int cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
    }

    public boolean isSetCancelledQuantity() {
        return true;
    }

    /**
     * Set the value of CancelledQuantity, return this.
     *
     * @param cancelledQuantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withCancelledQuantity(int cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
        return this;
    }

    /**
     * Get the value of UnfulfillableQuantity.
     *
     * @return The value of UnfulfillableQuantity.
     */
    public int getUnfulfillableQuantity() {
        return unfulfillableQuantity;
    }

    /**
     * Set the value of UnfulfillableQuantity.
     *
     * @param unfulfillableQuantity
     *            The new value to set.
     */
    public void setUnfulfillableQuantity(int unfulfillableQuantity) {
        this.unfulfillableQuantity = unfulfillableQuantity;
    }

    public boolean isSetUnfulfillableQuantity() {
        return true;
    }

    /**
     * Set the value of UnfulfillableQuantity, return this.
     *
     * @param unfulfillableQuantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withUnfulfillableQuantity(int unfulfillableQuantity) {
        this.unfulfillableQuantity = unfulfillableQuantity;
        return this;
    }

    /**
     * Get the value of EstimatedShipDateTime.
     *
     * @return The value of EstimatedShipDateTime.
     */
    public XMLGregorianCalendar getEstimatedShipDateTime() {
        return estimatedShipDateTime;
    }

    /**
     * Set the value of EstimatedShipDateTime.
     *
     * @param estimatedShipDateTime
     *            The new value to set.
     */
    public void setEstimatedShipDateTime(XMLGregorianCalendar estimatedShipDateTime) {
        this.estimatedShipDateTime = estimatedShipDateTime;
    }

    /**
     * Check to see if EstimatedShipDateTime is set.
     *
     * @return true if EstimatedShipDateTime is set.
     */
    public boolean isSetEstimatedShipDateTime() {
        return estimatedShipDateTime != null;
    }

    /**
     * Set the value of EstimatedShipDateTime, return this.
     *
     * @param estimatedShipDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withEstimatedShipDateTime(XMLGregorianCalendar estimatedShipDateTime) {
        this.estimatedShipDateTime = estimatedShipDateTime;
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
    public FulfillmentOrderItem withEstimatedArrivalDateTime(XMLGregorianCalendar estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
        return this;
    }

    /**
     * Get the value of PerUnitPrice.
     *
     * @return The value of PerUnitPrice.
     */
    public Currency getPerUnitPrice() {
        return perUnitPrice;
    }

    /**
     * Set the value of PerUnitPrice.
     *
     * @param perUnitPrice
     *            The new value to set.
     */
    public void setPerUnitPrice(Currency perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    /**
     * Check to see if PerUnitPrice is set.
     *
     * @return true if PerUnitPrice is set.
     */
    public boolean isSetPerUnitPrice() {
        return perUnitPrice != null;
    }

    /**
     * Set the value of PerUnitPrice, return this.
     *
     * @param perUnitPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withPerUnitPrice(Currency perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
        return this;
    }

    /**
     * Get the value of PerUnitTax.
     *
     * @return The value of PerUnitTax.
     */
    public Currency getPerUnitTax() {
        return perUnitTax;
    }

    /**
     * Set the value of PerUnitTax.
     *
     * @param perUnitTax
     *            The new value to set.
     */
    public void setPerUnitTax(Currency perUnitTax) {
        this.perUnitTax = perUnitTax;
    }

    /**
     * Check to see if PerUnitTax is set.
     *
     * @return true if PerUnitTax is set.
     */
    public boolean isSetPerUnitTax() {
        return perUnitTax != null;
    }

    /**
     * Set the value of PerUnitTax, return this.
     *
     * @param perUnitTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withPerUnitTax(Currency perUnitTax) {
        this.perUnitTax = perUnitTax;
        return this;
    }

    /**
     * Get the value of PerUnitDeclaredValue.
     *
     * @return The value of PerUnitDeclaredValue.
     */
    public Currency getPerUnitDeclaredValue() {
        return perUnitDeclaredValue;
    }

    /**
     * Set the value of PerUnitDeclaredValue.
     *
     * @param perUnitDeclaredValue
     *            The new value to set.
     */
    public void setPerUnitDeclaredValue(Currency perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
    }

    /**
     * Check to see if PerUnitDeclaredValue is set.
     *
     * @return true if PerUnitDeclaredValue is set.
     */
    public boolean isSetPerUnitDeclaredValue() {
        return perUnitDeclaredValue != null;
    }

    /**
     * Set the value of PerUnitDeclaredValue, return this.
     *
     * @param perUnitDeclaredValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentOrderItem withPerUnitDeclaredValue(Currency perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
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
        sellerSKU = r.read("SellerSKU", String.class);
        sellerFulfillmentOrderItemId = r.read("SellerFulfillmentOrderItemId", String.class);
        quantity = r.read("Quantity", int.class);
        giftMessage = r.read("GiftMessage", String.class);
        displayableComment = r.read("DisplayableComment", String.class);
        fulfillmentNetworkSKU = r.read("FulfillmentNetworkSKU", String.class);
        orderItemDisposition = r.read("OrderItemDisposition", String.class);
        cancelledQuantity = r.read("CancelledQuantity", int.class);
        unfulfillableQuantity = r.read("UnfulfillableQuantity", int.class);
        estimatedShipDateTime = r.read("EstimatedShipDateTime", XMLGregorianCalendar.class);
        estimatedArrivalDateTime = r.read("EstimatedArrivalDateTime", XMLGregorianCalendar.class);
        perUnitPrice = r.read("PerUnitPrice", Currency.class);
        perUnitTax = r.read("PerUnitTax", Currency.class);
        perUnitDeclaredValue = r.read("PerUnitDeclaredValue", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerSKU", sellerSKU);
        w.write("SellerFulfillmentOrderItemId", sellerFulfillmentOrderItemId);
        w.write("Quantity", quantity);
        w.write("GiftMessage", giftMessage);
        w.write("DisplayableComment", displayableComment);
        w.write("FulfillmentNetworkSKU", fulfillmentNetworkSKU);
        w.write("OrderItemDisposition", orderItemDisposition);
        w.write("CancelledQuantity", cancelledQuantity);
        w.write("UnfulfillableQuantity", unfulfillableQuantity);
        w.write("EstimatedShipDateTime", estimatedShipDateTime);
        w.write("EstimatedArrivalDateTime", estimatedArrivalDateTime);
        w.write("PerUnitPrice", perUnitPrice);
        w.write("PerUnitTax", perUnitTax);
        w.write("PerUnitDeclaredValue", perUnitDeclaredValue);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentOrderItem",this);
    }

    /** Value constructor. */
    public FulfillmentOrderItem(String sellerSKU,String sellerFulfillmentOrderItemId,int quantity,String giftMessage,String displayableComment,String fulfillmentNetworkSKU,String orderItemDisposition,int cancelledQuantity,int unfulfillableQuantity,XMLGregorianCalendar estimatedShipDateTime,XMLGregorianCalendar estimatedArrivalDateTime,Currency perUnitPrice,Currency perUnitTax,Currency perUnitDeclaredValue) {
        this.sellerSKU = sellerSKU;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.quantity = quantity;
        this.giftMessage = giftMessage;
        this.displayableComment = displayableComment;
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
        this.orderItemDisposition = orderItemDisposition;
        this.cancelledQuantity = cancelledQuantity;
        this.unfulfillableQuantity = unfulfillableQuantity;
        this.estimatedShipDateTime = estimatedShipDateTime;
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
        this.perUnitPrice = perUnitPrice;
        this.perUnitTax = perUnitTax;
        this.perUnitDeclaredValue = perUnitDeclaredValue;
    }    
    

    /** Default constructor. */
    public FulfillmentOrderItem() {
        super();
    }

}
