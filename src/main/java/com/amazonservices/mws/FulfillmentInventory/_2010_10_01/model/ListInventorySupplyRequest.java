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
 * List Inventory Supply Request
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * ListInventorySupplyRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListInventorySupplyRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerSkus" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}SellerSkuList" minOccurs="0"/&gt;
 *             &lt;element name="QueryStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListInventorySupplyRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "marketplaceId",
    "sellerSkus",
    "queryStartDateTime",
    "responseGroup"
})
@XmlRootElement(name = "ListInventorySupplyRequest")
public class ListInventorySupplyRequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="SellerSkus")
    private SellerSkuList sellerSkus;

    @XmlElement(name="QueryStartDateTime")
    private XMLGregorianCalendar queryStartDateTime;

    @XmlElement(name="ResponseGroup")
    private String responseGroup;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of Marketplace.
     *
     * @return The value of Marketplace.
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Set the value of Marketplace.
     *
     * @param marketplace
     *            The new value to set.
     */
    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * Check to see if Marketplace is set.
     *
     * @return true if Marketplace is set.
     */
    public boolean isSetMarketplace() {
        return marketplace != null;
    }

    /**
     * Set the value of Marketplace, return this.
     *
     * @param marketplace
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
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
    public ListInventorySupplyRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of SellerSkus.
     *
     * @return The value of SellerSkus.
     */
    public SellerSkuList getSellerSkus() {
        return sellerSkus;
    }

    /**
     * Set the value of SellerSkus.
     *
     * @param sellerSkus
     *            The new value to set.
     */
    public void setSellerSkus(SellerSkuList sellerSkus) {
        this.sellerSkus = sellerSkus;
    }

    /**
     * Check to see if SellerSkus is set.
     *
     * @return true if SellerSkus is set.
     */
    public boolean isSetSellerSkus() {
        return sellerSkus != null;
    }

    /**
     * Set the value of SellerSkus, return this.
     *
     * @param sellerSkus
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withSellerSkus(SellerSkuList sellerSkus) {
        this.sellerSkus = sellerSkus;
        return this;
    }

    /**
     * Get the value of QueryStartDateTime.
     *
     * @return The value of QueryStartDateTime.
     */
    public XMLGregorianCalendar getQueryStartDateTime() {
        return queryStartDateTime;
    }

    /**
     * Set the value of QueryStartDateTime.
     *
     * @param queryStartDateTime
     *            The new value to set.
     */
    public void setQueryStartDateTime(XMLGregorianCalendar queryStartDateTime) {
        this.queryStartDateTime = queryStartDateTime;
    }

    /**
     * Check to see if QueryStartDateTime is set.
     *
     * @return true if QueryStartDateTime is set.
     */
    public boolean isSetQueryStartDateTime() {
        return queryStartDateTime != null;
    }

    /**
     * Set the value of QueryStartDateTime, return this.
     *
     * @param queryStartDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withQueryStartDateTime(XMLGregorianCalendar queryStartDateTime) {
        this.queryStartDateTime = queryStartDateTime;
        return this;
    }

    /**
     * Get the value of ResponseGroup.
     *
     * @return The value of ResponseGroup.
     */
    public String getResponseGroup() {
        return responseGroup;
    }

    /**
     * Set the value of ResponseGroup.
     *
     * @param responseGroup
     *            The new value to set.
     */
    public void setResponseGroup(String responseGroup) {
        this.responseGroup = responseGroup;
    }

    /**
     * Check to see if ResponseGroup is set.
     *
     * @return true if ResponseGroup is set.
     */
    public boolean isSetResponseGroup() {
        return responseGroup != null;
    }

    /**
     * Set the value of ResponseGroup, return this.
     *
     * @param responseGroup
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListInventorySupplyRequest withResponseGroup(String responseGroup) {
        this.responseGroup = responseGroup;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        marketplace = r.read("Marketplace", String.class);
        marketplaceId = r.read("MarketplaceId", String.class);
        sellerSkus = r.read("SellerSkus", SellerSkuList.class);
        queryStartDateTime = r.read("QueryStartDateTime", XMLGregorianCalendar.class);
        responseGroup = r.read("ResponseGroup", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("Marketplace", marketplace);
        w.write("MarketplaceId", marketplaceId);
        w.write("SellerSkus", sellerSkus);
        w.write("QueryStartDateTime", queryStartDateTime);
        w.write("ResponseGroup", responseGroup);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "ListInventorySupplyRequest",this);
    }

    /** Value constructor. */
    public ListInventorySupplyRequest(String sellerId,String mwsAuthToken,String marketplace,String marketplaceId,SellerSkuList sellerSkus,XMLGregorianCalendar queryStartDateTime,String responseGroup) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.marketplaceId = marketplaceId;
        this.sellerSkus = sellerSkus;
        this.queryStartDateTime = queryStartDateTime;
        this.responseGroup = responseGroup;
    }    

    /** Legacy value constructor. */
    public ListInventorySupplyRequest(String sellerId,String marketplace,String marketplaceId,SellerSkuList sellerSkus,XMLGregorianCalendar queryStartDateTime,String responseGroup) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.marketplaceId = marketplaceId;
        this.sellerSkus = sellerSkus;
        this.queryStartDateTime = queryStartDateTime;
        this.responseGroup = responseGroup;
    }
    

    /** Default constructor. */
    public ListInventorySupplyRequest() {
        super();
    }

}
