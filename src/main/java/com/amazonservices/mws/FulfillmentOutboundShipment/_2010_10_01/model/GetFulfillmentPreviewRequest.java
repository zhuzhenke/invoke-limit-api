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
 * Get Fulfillment Preview Request
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetFulfillmentPreviewRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetFulfillmentPreviewRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Address" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Address"/&gt;
 *             &lt;element name="Items" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}GetFulfillmentPreviewItemList"/&gt;
 *             &lt;element name="ShippingSpeedCategories" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}ShippingSpeedCategoryList" minOccurs="0"/&gt;
 *             &lt;element name="IncludeCODFulfillmentPreview" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="IncludeDeliveryWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetFulfillmentPreviewRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "marketplaceId",
    "address",
    "items",
    "shippingSpeedCategories",
    "includeCODFulfillmentPreview",
    "includeDeliveryWindows"
})
@XmlRootElement(name = "GetFulfillmentPreviewRequest")
public class GetFulfillmentPreviewRequest extends AbstractMwsObject implements AmazonBaseRequest{

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="Address",required=true)
    private Address address;

    @XmlElement(name="Items",required=true)
    private GetFulfillmentPreviewItemList items;

    @XmlElement(name="ShippingSpeedCategories")
    private ShippingSpeedCategoryList shippingSpeedCategories;

    @XmlElement(name="IncludeCODFulfillmentPreview")
    private Boolean includeCODFulfillmentPreview;

    @XmlElement(name="IncludeDeliveryWindows")
    private Boolean includeDeliveryWindows;

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
    public GetFulfillmentPreviewRequest withSellerId(String sellerId) {
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
    public GetFulfillmentPreviewRequest withMWSAuthToken(String mwsAuthToken) {
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
    public GetFulfillmentPreviewRequest withMarketplace(String marketplace) {
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
    public GetFulfillmentPreviewRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of Address.
     *
     * @return The value of Address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set the value of Address.
     *
     * @param address
     *            The new value to set.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Check to see if Address is set.
     *
     * @return true if Address is set.
     */
    public boolean isSetAddress() {
        return address != null;
    }

    /**
     * Set the value of Address, return this.
     *
     * @param address
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewRequest withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get the value of Items.
     *
     * @return The value of Items.
     */
    public GetFulfillmentPreviewItemList getItems() {
        return items;
    }

    /**
     * Set the value of Items.
     *
     * @param items
     *            The new value to set.
     */
    public void setItems(GetFulfillmentPreviewItemList items) {
        this.items = items;
    }

    /**
     * Check to see if Items is set.
     *
     * @return true if Items is set.
     */
    public boolean isSetItems() {
        return items != null;
    }

    /**
     * Set the value of Items, return this.
     *
     * @param items
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewRequest withItems(GetFulfillmentPreviewItemList items) {
        this.items = items;
        return this;
    }

    /**
     * Get the value of ShippingSpeedCategories.
     *
     * @return The value of ShippingSpeedCategories.
     */
    public ShippingSpeedCategoryList getShippingSpeedCategories() {
        return shippingSpeedCategories;
    }

    /**
     * Set the value of ShippingSpeedCategories.
     *
     * @param shippingSpeedCategories
     *            The new value to set.
     */
    public void setShippingSpeedCategories(ShippingSpeedCategoryList shippingSpeedCategories) {
        this.shippingSpeedCategories = shippingSpeedCategories;
    }

    /**
     * Check to see if ShippingSpeedCategories is set.
     *
     * @return true if ShippingSpeedCategories is set.
     */
    public boolean isSetShippingSpeedCategories() {
        return shippingSpeedCategories != null;
    }

    /**
     * Set the value of ShippingSpeedCategories, return this.
     *
     * @param shippingSpeedCategories
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewRequest withShippingSpeedCategories(ShippingSpeedCategoryList shippingSpeedCategories) {
        this.shippingSpeedCategories = shippingSpeedCategories;
        return this;
    }

    /**
     * Check the value of IncludeCODFulfillmentPreview.
     *
     * @return true if IncludeCODFulfillmentPreview is set to true.
     */
    public boolean isIncludeCODFulfillmentPreview() {
        return includeCODFulfillmentPreview!=null && includeCODFulfillmentPreview.booleanValue();
    }

    /**
     * Get the value of IncludeCODFulfillmentPreview.
     *
     * @return The value of IncludeCODFulfillmentPreview.
     */
    public Boolean getIncludeCODFulfillmentPreview() {
        return includeCODFulfillmentPreview;
    }

    /**
     * Set the value of IncludeCODFulfillmentPreview.
     *
     * @param includeCODFulfillmentPreview
     *            The new value to set.
     */
    public void setIncludeCODFulfillmentPreview(Boolean includeCODFulfillmentPreview) {
        this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
    }

    /**
     * Check to see if IncludeCODFulfillmentPreview is set.
     *
     * @return true if IncludeCODFulfillmentPreview is set.
     */
    public boolean isSetIncludeCODFulfillmentPreview() {
        return includeCODFulfillmentPreview != null;
    }

    /**
     * Set the value of IncludeCODFulfillmentPreview, return this.
     *
     * @param includeCODFulfillmentPreview
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewRequest withIncludeCODFulfillmentPreview(Boolean includeCODFulfillmentPreview) {
        this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
        return this;
    }

    /**
     * Check the value of IncludeDeliveryWindows.
     *
     * @return true if IncludeDeliveryWindows is set to true.
     */
    public boolean isIncludeDeliveryWindows() {
        return includeDeliveryWindows!=null && includeDeliveryWindows.booleanValue();
    }

    /**
     * Get the value of IncludeDeliveryWindows.
     *
     * @return The value of IncludeDeliveryWindows.
     */
    public Boolean getIncludeDeliveryWindows() {
        return includeDeliveryWindows;
    }

    /**
     * Set the value of IncludeDeliveryWindows.
     *
     * @param includeDeliveryWindows
     *            The new value to set.
     */
    public void setIncludeDeliveryWindows(Boolean includeDeliveryWindows) {
        this.includeDeliveryWindows = includeDeliveryWindows;
    }

    /**
     * Check to see if IncludeDeliveryWindows is set.
     *
     * @return true if IncludeDeliveryWindows is set.
     */
    public boolean isSetIncludeDeliveryWindows() {
        return includeDeliveryWindows != null;
    }

    /**
     * Set the value of IncludeDeliveryWindows, return this.
     *
     * @param includeDeliveryWindows
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetFulfillmentPreviewRequest withIncludeDeliveryWindows(Boolean includeDeliveryWindows) {
        this.includeDeliveryWindows = includeDeliveryWindows;
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
        address = r.read("Address", Address.class);
        items = r.read("Items", GetFulfillmentPreviewItemList.class);
        shippingSpeedCategories = r.read("ShippingSpeedCategories", ShippingSpeedCategoryList.class);
        includeCODFulfillmentPreview = r.read("IncludeCODFulfillmentPreview", Boolean.class);
        includeDeliveryWindows = r.read("IncludeDeliveryWindows", Boolean.class);
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
        w.write("Address", address);
        w.write("Items", items);
        w.write("ShippingSpeedCategories", shippingSpeedCategories);
        w.write("IncludeCODFulfillmentPreview", includeCODFulfillmentPreview);
        w.write("IncludeDeliveryWindows", includeDeliveryWindows);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "GetFulfillmentPreviewRequest",this);
    }

    /** Value constructor. */
    public GetFulfillmentPreviewRequest(String sellerId,String mwsAuthToken,String marketplace,String marketplaceId,Address address,GetFulfillmentPreviewItemList items,ShippingSpeedCategoryList shippingSpeedCategories,Boolean includeCODFulfillmentPreview,Boolean includeDeliveryWindows) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.marketplaceId = marketplaceId;
        this.address = address;
        this.items = items;
        this.shippingSpeedCategories = shippingSpeedCategories;
        this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
        this.includeDeliveryWindows = includeDeliveryWindows;
    }    

    /**
     * Value constructor
     * 
     */
    public GetFulfillmentPreviewRequest(final String sellerId, final String marketplace, final Address address, final GetFulfillmentPreviewItemList items, final ShippingSpeedCategoryList shippingSpeedCategories) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.address = address;
        this.items = items;
        this.shippingSpeedCategories = shippingSpeedCategories;
    }
    
    /**
     * Value constructor
     * 
     */
    public GetFulfillmentPreviewRequest(final String sellerId, final String mwsAuthToken, final String marketplace, final Address address, final GetFulfillmentPreviewItemList items, final ShippingSpeedCategoryList shippingSpeedCategories) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.address = address;
        this.items = items;
        this.shippingSpeedCategories = shippingSpeedCategories;
    }

    /** Legacy value constructor. */
    public GetFulfillmentPreviewRequest(String sellerId,String marketplace,String marketplaceId,Address address,GetFulfillmentPreviewItemList items,ShippingSpeedCategoryList shippingSpeedCategories,Boolean includeCODFulfillmentPreview,Boolean includeDeliveryWindows) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.marketplaceId = marketplaceId;
        this.address = address;
        this.items = items;
        this.shippingSpeedCategories = shippingSpeedCategories;
        this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
        this.includeDeliveryWindows = includeDeliveryWindows;
    }
    

    /** Default constructor. */
    public GetFulfillmentPreviewRequest() {
        super();
    }

}
