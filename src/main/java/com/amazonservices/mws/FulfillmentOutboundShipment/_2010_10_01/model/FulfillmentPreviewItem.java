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
 * Fulfillment Preview Item
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentPreviewItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentPreviewItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="EstimatedShippingWeight" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Weight" minOccurs="0"/&gt;
 *             &lt;element name="ShippingWeightCalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentPreviewItem", propOrder={
    "sellerSKU",
    "quantity",
    "sellerFulfillmentOrderItemId",
    "estimatedShippingWeight",
    "shippingWeightCalculationMethod"
})
@XmlRootElement(name = "FulfillmentPreviewItem")
public class FulfillmentPreviewItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="Quantity",required=true)
    private int quantity;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="EstimatedShippingWeight")
    private Weight estimatedShippingWeight;

    @XmlElement(name="ShippingWeightCalculationMethod")
    private String shippingWeightCalculationMethod;

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
    public FulfillmentPreviewItem withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
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
    public FulfillmentPreviewItem withQuantity(int quantity) {
        this.quantity = quantity;
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
    public FulfillmentPreviewItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
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
    public FulfillmentPreviewItem withEstimatedShippingWeight(Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
        return this;
    }

    /**
     * Get the value of ShippingWeightCalculationMethod.
     *
     * @return The value of ShippingWeightCalculationMethod.
     */
    public String getShippingWeightCalculationMethod() {
        return shippingWeightCalculationMethod;
    }

    /**
     * Set the value of ShippingWeightCalculationMethod.
     *
     * @param shippingWeightCalculationMethod
     *            The new value to set.
     */
    public void setShippingWeightCalculationMethod(String shippingWeightCalculationMethod) {
        this.shippingWeightCalculationMethod = shippingWeightCalculationMethod;
    }

    /**
     * Check to see if ShippingWeightCalculationMethod is set.
     *
     * @return true if ShippingWeightCalculationMethod is set.
     */
    public boolean isSetShippingWeightCalculationMethod() {
        return shippingWeightCalculationMethod != null;
    }

    /**
     * Set the value of ShippingWeightCalculationMethod, return this.
     *
     * @param shippingWeightCalculationMethod
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewItem withShippingWeightCalculationMethod(String shippingWeightCalculationMethod) {
        this.shippingWeightCalculationMethod = shippingWeightCalculationMethod;
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
        quantity = r.read("Quantity", int.class);
        sellerFulfillmentOrderItemId = r.read("SellerFulfillmentOrderItemId", String.class);
        estimatedShippingWeight = r.read("EstimatedShippingWeight", Weight.class);
        shippingWeightCalculationMethod = r.read("ShippingWeightCalculationMethod", String.class);
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
        w.write("Quantity", quantity);
        w.write("SellerFulfillmentOrderItemId", sellerFulfillmentOrderItemId);
        w.write("EstimatedShippingWeight", estimatedShippingWeight);
        w.write("ShippingWeightCalculationMethod", shippingWeightCalculationMethod);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentPreviewItem",this);
    }

    /** Value constructor. */
    public FulfillmentPreviewItem(String sellerSKU,int quantity,String sellerFulfillmentOrderItemId,Weight estimatedShippingWeight,String shippingWeightCalculationMethod) {
        this.sellerSKU = sellerSKU;
        this.quantity = quantity;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.estimatedShippingWeight = estimatedShippingWeight;
        this.shippingWeightCalculationMethod = shippingWeightCalculationMethod;
    }    
    

    /** Default constructor. */
    public FulfillmentPreviewItem() {
        super();
    }

}
