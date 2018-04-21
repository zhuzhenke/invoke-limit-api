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
 * Inventory Supply
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * InventorySupply complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InventorySupply"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FNSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TotalSupplyQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="InStockSupplyQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="EarliestAvailability" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}Timepoint" minOccurs="0"/&gt;
 *             &lt;element name="SupplyDetail" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}InventorySupplyDetailList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InventorySupply", propOrder={
    "sellerSKU",
    "fnsku",
    "asin",
    "condition",
    "totalSupplyQuantity",
    "inStockSupplyQuantity",
    "earliestAvailability",
    "supplyDetail"
})
@XmlRootElement(name = "InventorySupply")
public class InventorySupply extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private String sellerSKU;

    @XmlElement(name="FNSKU")
    private String fnsku;

    @XmlElement(name="ASIN")
    private String asin;

    @XmlElement(name="Condition")
    private String condition;

    @XmlElement(name="TotalSupplyQuantity")
    private Integer totalSupplyQuantity;

    @XmlElement(name="InStockSupplyQuantity")
    private Integer inStockSupplyQuantity;

    @XmlElement(name="EarliestAvailability")
    private Timepoint earliestAvailability;

    @XmlElement(name="SupplyDetail")
    private InventorySupplyDetailList supplyDetail;

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
    public InventorySupply withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of FNSKU.
     *
     * @return The value of FNSKU.
     */
    public String getFNSKU() {
        return fnsku;
    }

    /**
     * Set the value of FNSKU.
     *
     * @param fnsku
     *            The new value to set.
     */
    public void setFNSKU(String fnsku) {
        this.fnsku = fnsku;
    }

    /**
     * Check to see if FNSKU is set.
     *
     * @return true if FNSKU is set.
     */
    public boolean isSetFNSKU() {
        return fnsku != null;
    }

    /**
     * Set the value of FNSKU, return this.
     *
     * @param fnsku
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withFNSKU(String fnsku) {
        this.fnsku = fnsku;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withASIN(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get the value of Condition.
     *
     * @return The value of Condition.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of Condition.
     *
     * @param condition
     *            The new value to set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Check to see if Condition is set.
     *
     * @return true if Condition is set.
     */
    public boolean isSetCondition() {
        return condition != null;
    }

    /**
     * Set the value of Condition, return this.
     *
     * @param condition
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the value of TotalSupplyQuantity.
     *
     * @return The value of TotalSupplyQuantity.
     */
    public Integer getTotalSupplyQuantity() {
        return totalSupplyQuantity;
    }

    /**
     * Set the value of TotalSupplyQuantity.
     *
     * @param totalSupplyQuantity
     *            The new value to set.
     */
    public void setTotalSupplyQuantity(Integer totalSupplyQuantity) {
        this.totalSupplyQuantity = totalSupplyQuantity;
    }

    /**
     * Check to see if TotalSupplyQuantity is set.
     *
     * @return true if TotalSupplyQuantity is set.
     */
    public boolean isSetTotalSupplyQuantity() {
        return totalSupplyQuantity != null;
    }

    /**
     * Set the value of TotalSupplyQuantity, return this.
     *
     * @param totalSupplyQuantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withTotalSupplyQuantity(Integer totalSupplyQuantity) {
        this.totalSupplyQuantity = totalSupplyQuantity;
        return this;
    }

    /**
     * Get the value of InStockSupplyQuantity.
     *
     * @return The value of InStockSupplyQuantity.
     */
    public Integer getInStockSupplyQuantity() {
        return inStockSupplyQuantity;
    }

    /**
     * Set the value of InStockSupplyQuantity.
     *
     * @param inStockSupplyQuantity
     *            The new value to set.
     */
    public void setInStockSupplyQuantity(Integer inStockSupplyQuantity) {
        this.inStockSupplyQuantity = inStockSupplyQuantity;
    }

    /**
     * Check to see if InStockSupplyQuantity is set.
     *
     * @return true if InStockSupplyQuantity is set.
     */
    public boolean isSetInStockSupplyQuantity() {
        return inStockSupplyQuantity != null;
    }

    /**
     * Set the value of InStockSupplyQuantity, return this.
     *
     * @param inStockSupplyQuantity
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withInStockSupplyQuantity(Integer inStockSupplyQuantity) {
        this.inStockSupplyQuantity = inStockSupplyQuantity;
        return this;
    }

    /**
     * Get the value of EarliestAvailability.
     *
     * @return The value of EarliestAvailability.
     */
    public Timepoint getEarliestAvailability() {
        return earliestAvailability;
    }

    /**
     * Set the value of EarliestAvailability.
     *
     * @param earliestAvailability
     *            The new value to set.
     */
    public void setEarliestAvailability(Timepoint earliestAvailability) {
        this.earliestAvailability = earliestAvailability;
    }

    /**
     * Check to see if EarliestAvailability is set.
     *
     * @return true if EarliestAvailability is set.
     */
    public boolean isSetEarliestAvailability() {
        return earliestAvailability != null;
    }

    /**
     * Set the value of EarliestAvailability, return this.
     *
     * @param earliestAvailability
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withEarliestAvailability(Timepoint earliestAvailability) {
        this.earliestAvailability = earliestAvailability;
        return this;
    }

    /**
     * Get the value of SupplyDetail.
     *
     * @return The value of SupplyDetail.
     */
    public InventorySupplyDetailList getSupplyDetail() {
        return supplyDetail;
    }

    /**
     * Set the value of SupplyDetail.
     *
     * @param supplyDetail
     *            The new value to set.
     */
    public void setSupplyDetail(InventorySupplyDetailList supplyDetail) {
        this.supplyDetail = supplyDetail;
    }

    /**
     * Check to see if SupplyDetail is set.
     *
     * @return true if SupplyDetail is set.
     */
    public boolean isSetSupplyDetail() {
        return supplyDetail != null;
    }

    /**
     * Set the value of SupplyDetail, return this.
     *
     * @param supplyDetail
     *             The new value to set.
     *
     * @return This instance.
     */
    public InventorySupply withSupplyDetail(InventorySupplyDetailList supplyDetail) {
        this.supplyDetail = supplyDetail;
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
        fnsku = r.read("FNSKU", String.class);
        asin = r.read("ASIN", String.class);
        condition = r.read("Condition", String.class);
        totalSupplyQuantity = r.read("TotalSupplyQuantity", Integer.class);
        inStockSupplyQuantity = r.read("InStockSupplyQuantity", Integer.class);
        earliestAvailability = r.read("EarliestAvailability", Timepoint.class);
        supplyDetail = r.read("SupplyDetail", InventorySupplyDetailList.class);
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
        w.write("FNSKU", fnsku);
        w.write("ASIN", asin);
        w.write("Condition", condition);
        w.write("TotalSupplyQuantity", totalSupplyQuantity);
        w.write("InStockSupplyQuantity", inStockSupplyQuantity);
        w.write("EarliestAvailability", earliestAvailability);
        w.write("SupplyDetail", supplyDetail);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "InventorySupply",this);
    }

    /** Value constructor. */
    public InventorySupply(String sellerSKU,String fnsku,String asin,String condition,Integer totalSupplyQuantity,Integer inStockSupplyQuantity,Timepoint earliestAvailability,InventorySupplyDetailList supplyDetail) {
        this.sellerSKU = sellerSKU;
        this.fnsku = fnsku;
        this.asin = asin;
        this.condition = condition;
        this.totalSupplyQuantity = totalSupplyQuantity;
        this.inStockSupplyQuantity = inStockSupplyQuantity;
        this.earliestAvailability = earliestAvailability;
        this.supplyDetail = supplyDetail;
    }    
    

    /** Default constructor. */
    public InventorySupply() {
        super();
    }

}
