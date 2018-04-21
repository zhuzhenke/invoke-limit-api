/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Participation
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Participation complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Participation"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="HasSellerSuspendedListings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Participation", propOrder={
    "marketplaceId",
    "sellerId",
    "hasSellerSuspendedListings"
})
@XmlRootElement(name = "Participation")
public class Participation extends AbstractMwsObject {

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="SellerId")
    private String sellerId;

    @XmlElement(name="HasSellerSuspendedListings")
    private HasSellerSuspendedListingsEnum hasSellerSuspendedListings;

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
    public Participation withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

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
    public Participation withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of HasSellerSuspendedListings.
     *
     * @return The value of HasSellerSuspendedListings.
     */
    public HasSellerSuspendedListingsEnum getHasSellerSuspendedListings() {
        return hasSellerSuspendedListings;
    }

    /**
     * Set the value of HasSellerSuspendedListings.
     *
     * @param hasSellerSuspendedListings
     *            The new value to set.
     */
    public void setHasSellerSuspendedListings(HasSellerSuspendedListingsEnum hasSellerSuspendedListings) {
        this.hasSellerSuspendedListings = hasSellerSuspendedListings;
    }

    /**
     * Check to see if HasSellerSuspendedListings is set.
     *
     * @return true if HasSellerSuspendedListings is set.
     */
    public boolean isSetHasSellerSuspendedListings() {
        return hasSellerSuspendedListings != null;
    }

    /**
     * Set the value of HasSellerSuspendedListings, return this.
     *
     * @param hasSellerSuspendedListings
     *             The new value to set.
     *
     * @return This instance.
     */
    public Participation withHasSellerSuspendedListings(HasSellerSuspendedListingsEnum hasSellerSuspendedListings) {
        this.hasSellerSuspendedListings = hasSellerSuspendedListings;
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
        sellerId = r.read("SellerId", String.class);
        hasSellerSuspendedListings = r.read("HasSellerSuspendedListings", HasSellerSuspendedListingsEnum.class);
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
        w.write("SellerId", sellerId);
        w.write("HasSellerSuspendedListings", hasSellerSuspendedListings);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "Participation",this);
    }

    /** Value constructor. */
    public Participation(String marketplaceId,String sellerId,HasSellerSuspendedListingsEnum hasSellerSuspendedListings) {
        this.marketplaceId = marketplaceId;
        this.sellerId = sellerId;
        this.hasSellerSuspendedListings = hasSellerSuspendedListings;
    }    
    

    /** Default constructor. */
    public Participation() {
        super();
    }

}
