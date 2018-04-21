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
 * Get Lowest Offer Listings For SKU Request
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * GetLowestOfferListingsForSKURequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestOfferListingsForSKURequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerSKUList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}SellerSKUListType"/&gt;
 *             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ExcludeMe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestOfferListingsForSKURequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplaceId",
    "sellerSKUList",
    "itemCondition",
    "excludeMe"
})
@XmlRootElement(name = "GetLowestOfferListingsForSKURequest")
public class GetLowestOfferListingsForSKURequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    @XmlElement(name="SellerSKUList",required=true)
    private SellerSKUListType sellerSKUList;

    @XmlElement(name="ItemCondition")
    private String itemCondition;

    @XmlElement(name="ExcludeMe")
    private Boolean excludeMe;

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
    public GetLowestOfferListingsForSKURequest withSellerId(String sellerId) {
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
    public GetLowestOfferListingsForSKURequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
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
    public GetLowestOfferListingsForSKURequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of SellerSKUList.
     *
     * @return The value of SellerSKUList.
     */
    public SellerSKUListType getSellerSKUList() {
        return sellerSKUList;
    }

    /**
     * Set the value of SellerSKUList.
     *
     * @param sellerSKUList
     *            The new value to set.
     */
    public void setSellerSKUList(SellerSKUListType sellerSKUList) {
        this.sellerSKUList = sellerSKUList;
    }

    /**
     * Check to see if SellerSKUList is set.
     *
     * @return true if SellerSKUList is set.
     */
    public boolean isSetSellerSKUList() {
        return sellerSKUList != null;
    }

    /**
     * Set the value of SellerSKUList, return this.
     *
     * @param sellerSKUList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForSKURequest withSellerSKUList(SellerSKUListType sellerSKUList) {
        this.sellerSKUList = sellerSKUList;
        return this;
    }

    /**
     * Get the value of ItemCondition.
     *
     * @return The value of ItemCondition.
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * Set the value of ItemCondition.
     *
     * @param itemCondition
     *            The new value to set.
     */
    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * Check to see if ItemCondition is set.
     *
     * @return true if ItemCondition is set.
     */
    public boolean isSetItemCondition() {
        return itemCondition != null;
    }

    /**
     * Set the value of ItemCondition, return this.
     *
     * @param itemCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForSKURequest withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Check the value of ExcludeMe.
     *
     * @return true if ExcludeMe is set to true.
     */
    public boolean isExcludeMe() {
        return excludeMe!=null && excludeMe.booleanValue();
    }

    /**
     * Get the value of ExcludeMe.
     *
     * @return The value of ExcludeMe.
     */
    public Boolean getExcludeMe() {
        return excludeMe;
    }

    /**
     * Set the value of ExcludeMe.
     *
     * @param excludeMe
     *            The new value to set.
     */
    public void setExcludeMe(Boolean excludeMe) {
        this.excludeMe = excludeMe;
    }

    /**
     * Check to see if ExcludeMe is set.
     *
     * @return true if ExcludeMe is set.
     */
    public boolean isSetExcludeMe() {
        return excludeMe != null;
    }

    /**
     * Set the value of ExcludeMe, return this.
     *
     * @param excludeMe
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForSKURequest withExcludeMe(Boolean excludeMe) {
        this.excludeMe = excludeMe;
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
        marketplaceId = r.read("MarketplaceId", String.class);
        sellerSKUList = r.read("SellerSKUList", SellerSKUListType.class);
        itemCondition = r.read("ItemCondition", String.class);
        excludeMe = r.read("ExcludeMe", Boolean.class);
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
        w.write("MarketplaceId", marketplaceId);
        w.write("SellerSKUList", sellerSKUList);
        w.write("ItemCondition", itemCondition);
        w.write("ExcludeMe", excludeMe);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestOfferListingsForSKURequest",this);
    }

    /** Value constructor. */
    public GetLowestOfferListingsForSKURequest(String sellerId,String mwsAuthToken,String marketplaceId,SellerSKUListType sellerSKUList,String itemCondition,Boolean excludeMe) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplaceId = marketplaceId;
        this.sellerSKUList = sellerSKUList;
        this.itemCondition = itemCondition;
        this.excludeMe = excludeMe;
    }    

    /** Legacy value constructor. */
    public GetLowestOfferListingsForSKURequest(String sellerId,String marketplaceId,SellerSKUListType sellerSKUList,String itemCondition,Boolean excludeMe) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.sellerSKUList = sellerSKUList;
        this.itemCondition = itemCondition;
        this.excludeMe = excludeMe;
    }
    

    /** Default constructor. */
    public GetLowestOfferListingsForSKURequest() {
        super();
    }

}
