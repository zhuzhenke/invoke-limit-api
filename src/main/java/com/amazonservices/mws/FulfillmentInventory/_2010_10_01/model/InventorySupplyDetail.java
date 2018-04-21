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
 * Inventory Supply Detail
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * InventorySupplyDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InventorySupplyDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="SupplyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="EarliestAvailableToPick" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}Timepoint" minOccurs="0"/&gt;
 *             &lt;element name="LatestAvailableToPick" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}Timepoint" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InventorySupplyDetail", propOrder={
    "quantity",
    "supplyType",
    "earliestAvailableToPick",
    "latestAvailableToPick"
})
@XmlRootElement(name = "InventorySupplyDetail")
public class InventorySupplyDetail extends AbstractMwsObject {

    @XmlElement(name="Quantity")
    private Integer quantity;

    @XmlElement(name="SupplyType")
    private String supplyType;

    @XmlElement(name="EarliestAvailableToPick")
    private Timepoint earliestAvailableToPick;

    @XmlElement(name="LatestAvailableToPick")
    private Timepoint latestAvailableToPick;

    /**
     * Get the value of Quantity.
     *
     * @return The value of Quantity.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set the value of Quantity.
     *
     * @param quantity
     *            The new value to set.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Check to see if Quantity is set.
     *
     * @return true if Quantity is set.
     */
    public boolean isSetQuantity() {
        return quantity != null;
    }

    /**
     * Set the value of Quantity, return this.
     *
     * @param quantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupplyDetail withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the value of SupplyType.
     *
     * @return The value of SupplyType.
     */
    public String getSupplyType() {
        return supplyType;
    }

    /**
     * Set the value of SupplyType.
     *
     * @param supplyType
     *            The new value to set.
     */
    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    /**
     * Check to see if SupplyType is set.
     *
     * @return true if SupplyType is set.
     */
    public boolean isSetSupplyType() {
        return supplyType != null;
    }

    /**
     * Set the value of SupplyType, return this.
     *
     * @param supplyType
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupplyDetail withSupplyType(String supplyType) {
        this.supplyType = supplyType;
        return this;
    }

    /**
     * Get the value of EarliestAvailableToPick.
     *
     * @return The value of EarliestAvailableToPick.
     */
    public Timepoint getEarliestAvailableToPick() {
        return earliestAvailableToPick;
    }

    /**
     * Set the value of EarliestAvailableToPick.
     *
     * @param earliestAvailableToPick
     *            The new value to set.
     */
    public void setEarliestAvailableToPick(Timepoint earliestAvailableToPick) {
        this.earliestAvailableToPick = earliestAvailableToPick;
    }

    /**
     * Check to see if EarliestAvailableToPick is set.
     *
     * @return true if EarliestAvailableToPick is set.
     */
    public boolean isSetEarliestAvailableToPick() {
        return earliestAvailableToPick != null;
    }

    /**
     * Set the value of EarliestAvailableToPick, return this.
     *
     * @param earliestAvailableToPick
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupplyDetail withEarliestAvailableToPick(Timepoint earliestAvailableToPick) {
        this.earliestAvailableToPick = earliestAvailableToPick;
        return this;
    }

    /**
     * Get the value of LatestAvailableToPick.
     *
     * @return The value of LatestAvailableToPick.
     */
    public Timepoint getLatestAvailableToPick() {
        return latestAvailableToPick;
    }

    /**
     * Set the value of LatestAvailableToPick.
     *
     * @param latestAvailableToPick
     *            The new value to set.
     */
    public void setLatestAvailableToPick(Timepoint latestAvailableToPick) {
        this.latestAvailableToPick = latestAvailableToPick;
    }

    /**
     * Check to see if LatestAvailableToPick is set.
     *
     * @return true if LatestAvailableToPick is set.
     */
    public boolean isSetLatestAvailableToPick() {
        return latestAvailableToPick != null;
    }

    /**
     * Set the value of LatestAvailableToPick, return this.
     *
     * @param latestAvailableToPick
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupplyDetail withLatestAvailableToPick(Timepoint latestAvailableToPick) {
        this.latestAvailableToPick = latestAvailableToPick;
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
        quantity = r.read("Quantity", Integer.class);
        supplyType = r.read("SupplyType", String.class);
        earliestAvailableToPick = r.read("EarliestAvailableToPick", Timepoint.class);
        latestAvailableToPick = r.read("LatestAvailableToPick", Timepoint.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Quantity", quantity);
        w.write("SupplyType", supplyType);
        w.write("EarliestAvailableToPick", earliestAvailableToPick);
        w.write("LatestAvailableToPick", latestAvailableToPick);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "InventorySupplyDetail",this);
    }

    /** Value constructor. */
    public InventorySupplyDetail(Integer quantity,String supplyType,Timepoint earliestAvailableToPick,Timepoint latestAvailableToPick) {
        this.quantity = quantity;
        this.supplyType = supplyType;
        this.earliestAvailableToPick = earliestAvailableToPick;
        this.latestAvailableToPick = latestAvailableToPick;
    }    
    

    /** Default constructor. */
    public InventorySupplyDetail() {
        super();
    }

}
