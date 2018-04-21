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
 * Get Lowest Priced Offers For ASIN Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetLowestPricedOffersForASINResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestPricedOffersForASINResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Identifier" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetLowestPricedOffersAsinIdentifier"/&gt;
 *             &lt;element name="Summary" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Summary"/&gt;
 *             &lt;element name="Offers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ASINOfferDetailList"/&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="MarketplaceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="ASIN" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="ItemCondition" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestPricedOffersForASINResult", propOrder={
    "identifier",
    "summary",
    "offers"
})
@XmlRootElement(name = "GetLowestPricedOffersForASINResult")
public class GetLowestPricedOffersForASINResult extends AbstractMwsObject {

    @XmlAttribute(required=true)
    private String marketplaceID;

    @XmlAttribute(required=true)
    private String asin;

    @XmlAttribute(required=true)
    private String itemCondition;

    @XmlAttribute(required=true)
    private String status;

    @XmlElement(name="Identifier",required=true)
    private GetLowestPricedOffersAsinIdentifier identifier;

    @XmlElement(name="Summary",required=true)
    private Summary summary;

    @XmlElement(name="Offers",required=true)
    private ASINOfferDetailList offers;

    /**
     * Get the value of MarketplaceID.
     *
     * @return The value of MarketplaceID.
     */
    public String getMarketplaceID() {
        return marketplaceID;
    }

    /**
     * Set the value of MarketplaceID.
     *
     * @param marketplaceID
     *            The new value to set.
     */
    public void setMarketplaceID(String marketplaceID) {
        this.marketplaceID = marketplaceID;
    }

    /**
     * Check to see if MarketplaceID is set.
     *
     * @return true if MarketplaceID is set.
     */
    public boolean isSetMarketplaceID() {
        return marketplaceID != null;
    }

    /**
     * Set the value of MarketplaceID, return this.
     *
     * @param marketplaceID
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForASINResult withMarketplaceID(String marketplaceID) {
        this.marketplaceID = marketplaceID;
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
    public GetLowestPricedOffersForASINResult withASIN(String asin) {
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
    public GetLowestPricedOffersForASINResult withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Get the value of status.
     *
     * @return The value of status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if status is set.
     *
     * @return true if status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForASINResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of Identifier.
     *
     * @return The value of Identifier.
     */
    public GetLowestPricedOffersAsinIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Set the value of Identifier.
     *
     * @param identifier
     *            The new value to set.
     */
    public void setIdentifier(GetLowestPricedOffersAsinIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * Check to see if Identifier is set.
     *
     * @return true if Identifier is set.
     */
    public boolean isSetIdentifier() {
        return identifier != null;
    }

    /**
     * Set the value of Identifier, return this.
     *
     * @param identifier
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForASINResult withIdentifier(GetLowestPricedOffersAsinIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the value of Summary.
     *
     * @return The value of Summary.
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Set the value of Summary.
     *
     * @param summary
     *            The new value to set.
     */
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * Check to see if Summary is set.
     *
     * @return true if Summary is set.
     */
    public boolean isSetSummary() {
        return summary != null;
    }

    /**
     * Set the value of Summary, return this.
     *
     * @param summary
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForASINResult withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the value of Offers.
     *
     * @return The value of Offers.
     */
    public ASINOfferDetailList getOffers() {
        return offers;
    }

    /**
     * Set the value of Offers.
     *
     * @param offers
     *            The new value to set.
     */
    public void setOffers(ASINOfferDetailList offers) {
        this.offers = offers;
    }

    /**
     * Check to see if Offers is set.
     *
     * @return true if Offers is set.
     */
    public boolean isSetOffers() {
        return offers != null;
    }

    /**
     * Set the value of Offers, return this.
     *
     * @param offers
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestPricedOffersForASINResult withOffers(ASINOfferDetailList offers) {
        this.offers = offers;
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
        marketplaceID = r.readAttribute("MarketplaceID", String.class); 
        asin = r.readAttribute("ASIN", String.class); 
        itemCondition = r.readAttribute("ItemCondition", String.class); 
        status = r.readAttribute("status", String.class); 
        identifier = r.read("Identifier", GetLowestPricedOffersAsinIdentifier.class);
        summary = r.read("Summary", Summary.class);
        offers = r.read("Offers", ASINOfferDetailList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeAttribute("MarketplaceID",marketplaceID);
        w.writeAttribute("ASIN",asin);
        w.writeAttribute("ItemCondition",itemCondition);
        w.writeAttribute("status",status);
        w.write("Identifier", identifier);
        w.write("Summary", summary);
        w.write("Offers", offers);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestPricedOffersForASINResult",this);
    }

    /** Value constructor. */
    public GetLowestPricedOffersForASINResult(String marketplaceID,String asin,String itemCondition,String status,GetLowestPricedOffersAsinIdentifier identifier,Summary summary,ASINOfferDetailList offers) {
        this.marketplaceID = marketplaceID;
        this.asin = asin;
        this.itemCondition = itemCondition;
        this.status = status;
        this.identifier = identifier;
        this.summary = summary;
        this.offers = offers;
    }    
    

    /** Default constructor. */
    public GetLowestPricedOffersForASINResult() {
        super();
    }

}
