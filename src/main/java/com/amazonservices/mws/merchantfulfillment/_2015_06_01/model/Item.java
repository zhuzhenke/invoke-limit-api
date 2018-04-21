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
 * Item
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.*;

/**
 * Item complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Item"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Item extends AbstractMwsObject {

    private String orderItemId;

    private int quantity;

    /**
     * Get the value of OrderItemId.
     *
     * @return The value of OrderItemId.
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Set the value of OrderItemId.
     *
     * @param orderItemId
     *            The new value to set.
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * Check to see if OrderItemId is set.
     *
     * @return true if OrderItemId is set.
     */
    public boolean isSetOrderItemId() {
        return orderItemId != null;
    }

    /**
     * Set the value of OrderItemId, return this.
     *
     * @param orderItemId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
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

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public Item withQuantity(int quantity) {
        this.quantity = quantity;
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
        orderItemId = r.read("OrderItemId", String.class);
        quantity = r.read("Quantity", int.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("OrderItemId", orderItemId);
        w.write("Quantity", quantity);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Item",this);
    }

    /** Value constructor. */
    public Item(String orderItemId,int quantity) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
    }    
    

    /** Default constructor. */
    public Item() {
        super();
    }

}
