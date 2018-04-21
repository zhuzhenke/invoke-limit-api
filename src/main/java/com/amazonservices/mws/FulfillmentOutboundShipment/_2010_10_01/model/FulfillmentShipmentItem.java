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
 * Fulfillment Shipment Item
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentShipmentItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentShipmentItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFulfillmentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentShipmentItem", propOrder={
    "sellerSKU",
    "sellerFulfillmentOrderItemId",
    "quantity",
    "packageNumber"
})
@XmlRootElement(name = "FulfillmentShipmentItem")
public class FulfillmentShipmentItem extends AbstractMwsObject {

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    @XmlElement(name="SellerFulfillmentOrderItemId",required=true)
    private String sellerFulfillmentOrderItemId;

    @XmlElement(name="Quantity",required=true)
    private int quantity;

    @XmlElement(name="PackageNumber")
    private Integer packageNumber;

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
    public FulfillmentShipmentItem withSellerSKU(String sellerSKU) {
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
    public FulfillmentShipmentItem withSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
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
    public FulfillmentShipmentItem withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of PackageNumber.
     *
     * @return The value of PackageNumber.
     */
    public Integer getPackageNumber() {
        return packageNumber;
    }

    /**
     * Set the value of PackageNumber.
     *
     * @param packageNumber
     *            The new value to set.
     */
    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    /**
     * Check to see if PackageNumber is set.
     *
     * @return true if PackageNumber is set.
     */
    public boolean isSetPackageNumber() {
        return packageNumber != null;
    }

    /**
     * Set the value of PackageNumber, return this.
     *
     * @param packageNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipmentItem withPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
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
        packageNumber = r.read("PackageNumber", Integer.class);
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
        w.write("PackageNumber", packageNumber);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentShipmentItem",this);
    }

    /** Value constructor. */
    public FulfillmentShipmentItem(String sellerSKU,String sellerFulfillmentOrderItemId,int quantity,Integer packageNumber) {
        this.sellerSKU = sellerSKU;
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        this.quantity = quantity;
        this.packageNumber = packageNumber;
    }    
    

    /** Default constructor. */
    public FulfillmentShipmentItem() {
        super();
    }

}
