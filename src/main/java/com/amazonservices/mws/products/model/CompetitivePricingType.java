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
 * Competitive Pricing Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * CompetitivePricingType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CompetitivePricingType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CompetitivePrices" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}CompetitivePriceList"/&gt;
 *             &lt;element name="NumberOfOfferListings" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}NumberOfOfferListingsList"/&gt;
 *             &lt;element name="TradeInValue" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CompetitivePricingType", propOrder={
    "competitivePrices",
    "numberOfOfferListings",
    "tradeInValue"
})
@XmlRootElement(name = "CompetitivePricingType")
public class CompetitivePricingType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="CompetitivePrices",required=true)
    private CompetitivePriceList competitivePrices;

    @XmlElement(name="NumberOfOfferListings",required=true)
    private NumberOfOfferListingsList numberOfOfferListings;

    @XmlElement(name="TradeInValue")
    private MoneyType tradeInValue;

    /**
     * Get the value of CompetitivePrices.
     *
     * @return The value of CompetitivePrices.
     */
    public CompetitivePriceList getCompetitivePrices() {
        return competitivePrices;
    }

    /**
     * Set the value of CompetitivePrices.
     *
     * @param competitivePrices
     *            The new value to set.
     */
    public void setCompetitivePrices(CompetitivePriceList competitivePrices) {
        this.competitivePrices = competitivePrices;
    }

    /**
     * Check to see if CompetitivePrices is set.
     *
     * @return true if CompetitivePrices is set.
     */
    public boolean isSetCompetitivePrices() {
        return competitivePrices != null;
    }

    /**
     * Set the value of CompetitivePrices, return this.
     *
     * @param competitivePrices
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePricingType withCompetitivePrices(CompetitivePriceList competitivePrices) {
        this.competitivePrices = competitivePrices;
        return this;
    }

    /**
     * Get the value of NumberOfOfferListings.
     *
     * @return The value of NumberOfOfferListings.
     */
    public NumberOfOfferListingsList getNumberOfOfferListings() {
        return numberOfOfferListings;
    }

    /**
     * Set the value of NumberOfOfferListings.
     *
     * @param numberOfOfferListings
     *            The new value to set.
     */
    public void setNumberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
        this.numberOfOfferListings = numberOfOfferListings;
    }

    /**
     * Check to see if NumberOfOfferListings is set.
     *
     * @return true if NumberOfOfferListings is set.
     */
    public boolean isSetNumberOfOfferListings() {
        return numberOfOfferListings != null;
    }

    /**
     * Set the value of NumberOfOfferListings, return this.
     *
     * @param numberOfOfferListings
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePricingType withNumberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
        this.numberOfOfferListings = numberOfOfferListings;
        return this;
    }

    /**
     * Get the value of TradeInValue.
     *
     * @return The value of TradeInValue.
     */
    public MoneyType getTradeInValue() {
        return tradeInValue;
    }

    /**
     * Set the value of TradeInValue.
     *
     * @param tradeInValue
     *            The new value to set.
     */
    public void setTradeInValue(MoneyType tradeInValue) {
        this.tradeInValue = tradeInValue;
    }

    /**
     * Check to see if TradeInValue is set.
     *
     * @return true if TradeInValue is set.
     */
    public boolean isSetTradeInValue() {
        return tradeInValue != null;
    }

    /**
     * Set the value of TradeInValue, return this.
     *
     * @param tradeInValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePricingType withTradeInValue(MoneyType tradeInValue) {
        this.tradeInValue = tradeInValue;
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
        competitivePrices = r.read("CompetitivePrices", CompetitivePriceList.class);
        numberOfOfferListings = r.read("NumberOfOfferListings", NumberOfOfferListingsList.class);
        tradeInValue = r.read("TradeInValue", MoneyType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CompetitivePrices", competitivePrices);
        w.write("NumberOfOfferListings", numberOfOfferListings);
        w.write("TradeInValue", tradeInValue);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "CompetitivePricingType",this);
    }

    /** Value constructor. */
    public CompetitivePricingType(CompetitivePriceList competitivePrices,NumberOfOfferListingsList numberOfOfferListings,MoneyType tradeInValue) {
        this.competitivePrices = competitivePrices;
        this.numberOfOfferListings = numberOfOfferListings;
        this.tradeInValue = tradeInValue;
    }    
    

    /** Default constructor. */
    public CompetitivePricingType() {
        super();
    }

}
