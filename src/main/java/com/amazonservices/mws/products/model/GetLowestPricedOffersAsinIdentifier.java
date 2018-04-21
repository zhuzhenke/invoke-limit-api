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
 * Get Lowest Priced Offers Asin Identifier
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetLowestPricedOffersAsinIdentifier complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestPricedOffersAsinIdentifier"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TimeOfOfferChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestPricedOffersAsinIdentifier", propOrder={
    "marketplaceId",
    "asin",
    "itemCondition",
    "timeOfOfferChange"
})
@XmlRootElement(name = "GetLowestPricedOffersAsinIdentifier")
public class GetLowestPricedOffersAsinIdentifier extends AbstractMwsObject {

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    @XmlElement(name="ASIN",required=true)
    private String asin;

    @XmlElement(name="ItemCondition",required=true)
    private String itemCondition;

    @XmlElement(name="TimeOfOfferChange")
    private XMLGregorianCalendar timeOfOfferChange;

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
    public GetLowestPricedOffersAsinIdentifier withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
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
    public GetLowestPricedOffersAsinIdentifier withASIN(String asin) {
        this.asin = asin;
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
    public GetLowestPricedOffersAsinIdentifier withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Get the value of TimeOfOfferChange.
     *
     * @return The value of TimeOfOfferChange.
     */
    public XMLGregorianCalendar getTimeOfOfferChange() {
        return timeOfOfferChange;
    }

    /**
     * Set the value of TimeOfOfferChange.
     *
     * @param timeOfOfferChange
     *            The new value to set.
     */
    public void setTimeOfOfferChange(XMLGregorianCalendar timeOfOfferChange) {
        this.timeOfOfferChange = timeOfOfferChange;
    }

    /**
     * Check to see if TimeOfOfferChange is set.
     *
     * @return true if TimeOfOfferChange is set.
     */
    public boolean isSetTimeOfOfferChange() {
        return timeOfOfferChange != null;
    }

    /**
     * Set the value of TimeOfOfferChange, return this.
     *
     * @param timeOfOfferChange
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersAsinIdentifier withTimeOfOfferChange(XMLGregorianCalendar timeOfOfferChange) {
        this.timeOfOfferChange = timeOfOfferChange;
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
        asin = r.read("ASIN", String.class);
        itemCondition = r.read("ItemCondition", String.class);
        timeOfOfferChange = r.read("TimeOfOfferChange", XMLGregorianCalendar.class);
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
        w.write("ASIN", asin);
        w.write("ItemCondition", itemCondition);
        w.write("TimeOfOfferChange", timeOfOfferChange);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestPricedOffersAsinIdentifier",this);
    }

    /** Value constructor. */
    public GetLowestPricedOffersAsinIdentifier(String marketplaceId,String asin,String itemCondition,XMLGregorianCalendar timeOfOfferChange) {
        this.marketplaceId = marketplaceId;
        this.asin = asin;
        this.itemCondition = itemCondition;
        this.timeOfOfferChange = timeOfOfferChange;
    }    
    

    /** Default constructor. */
    public GetLowestPricedOffersAsinIdentifier() {
        super();
    }

}
