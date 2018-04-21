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
 * List Inventory Supply Result
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListInventorySupplyResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListInventorySupplyResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="InventorySupplyList" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}InventorySupplyList" minOccurs="0"/&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListInventorySupplyResult", propOrder={
    "marketplaceId",
    "inventorySupplyList",
    "nextToken"
})
@XmlRootElement(name = "ListInventorySupplyResult")
public class ListInventorySupplyResult extends AbstractMwsObject {

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="InventorySupplyList")
    private InventorySupplyList inventorySupplyList;

    @XmlElement(name="NextToken")
    private String nextToken;

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
    public ListInventorySupplyResult withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of InventorySupplyList.
     *
     * @return The value of InventorySupplyList.
     */
    public InventorySupplyList getInventorySupplyList() {
        return inventorySupplyList;
    }

    /**
     * Set the value of InventorySupplyList.
     *
     * @param inventorySupplyList
     *            The new value to set.
     */
    public void setInventorySupplyList(InventorySupplyList inventorySupplyList) {
        this.inventorySupplyList = inventorySupplyList;
    }

    /**
     * Check to see if InventorySupplyList is set.
     *
     * @return true if InventorySupplyList is set.
     */
    public boolean isSetInventorySupplyList() {
        return inventorySupplyList != null;
    }

    /**
     * Set the value of InventorySupplyList, return this.
     *
     * @param inventorySupplyList
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyResult withInventorySupplyList(InventorySupplyList inventorySupplyList) {
        this.inventorySupplyList = inventorySupplyList;
        return this;
    }

    /**
     * Get the value of NextToken.
     *
     * @return The value of NextToken.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Set the value of NextToken.
     *
     * @param nextToken
     *            The new value to set.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Check to see if NextToken is set.
     *
     * @return true if NextToken is set.
     */
    public boolean isSetNextToken() {
        return nextToken != null;
    }

    /**
     * Set the value of NextToken, return this.
     *
     * @param nextToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        marketplaceId = r.read("MarketplaceId", String.class);
        inventorySupplyList = r.read("InventorySupplyList", InventorySupplyList.class);
        nextToken = r.read("NextToken", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("MarketplaceId", marketplaceId);
        w.write("InventorySupplyList", inventorySupplyList);
        w.write("NextToken", nextToken);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "ListInventorySupplyResult",this);
    }

    /** Value constructor. */
    public ListInventorySupplyResult(String marketplaceId,InventorySupplyList inventorySupplyList,String nextToken) {
        this.marketplaceId = marketplaceId;
        this.inventorySupplyList = inventorySupplyList;
        this.nextToken = nextToken;
    }    
    

    /** Default constructor. */
    public ListInventorySupplyResult() {
        super();
    }

}
