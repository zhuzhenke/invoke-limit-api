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
 * Summary
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Summary complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Summary"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TotalOfferCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="NumberOfOffers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}NumberOfOffers" minOccurs="0"/&gt;
 *             &lt;element name="LowestPrices" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestPrices" minOccurs="0"/&gt;
 *             &lt;element name="BuyBoxPrices" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}BuyBoxPrices" minOccurs="0"/&gt;
 *             &lt;element name="ListPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="SuggestedLowerPricePlusShipping" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="BuyBoxEligibleOffers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}BuyBoxEligibleOffers" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Summary", propOrder={
    "totalOfferCount",
    "numberOfOffers",
    "lowestPrices",
    "buyBoxPrices",
    "listPrice",
    "suggestedLowerPricePlusShipping",
    "buyBoxEligibleOffers"
})
@XmlRootElement(name = "Summary")
public class Summary extends AbstractMwsObject {

    @XmlElement(name="TotalOfferCount",required=true)
    private int totalOfferCount;

    @XmlElement(name="NumberOfOffers")
    private NumberOfOffers numberOfOffers;

    @XmlElement(name="LowestPrices")
    private LowestPrices lowestPrices;

    @XmlElement(name="BuyBoxPrices")
    private BuyBoxPrices buyBoxPrices;

    @XmlElement(name="ListPrice")
    private MoneyType listPrice;

    @XmlElement(name="SuggestedLowerPricePlusShipping")
    private MoneyType suggestedLowerPricePlusShipping;

    @XmlElement(name="BuyBoxEligibleOffers")
    private BuyBoxEligibleOffers buyBoxEligibleOffers;

    /**
     * Get the value of TotalOfferCount.
     *
     * @return The value of TotalOfferCount.
     */
    public int getTotalOfferCount() {
        return totalOfferCount;
    }

    /**
     * Set the value of TotalOfferCount.
     *
     * @param totalOfferCount
     *            The new value to set.
     */
    public void setTotalOfferCount(int totalOfferCount) {
        this.totalOfferCount = totalOfferCount;
    }

    /**
     * Set the value of TotalOfferCount, return this.
     *
     * @param totalOfferCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withTotalOfferCount(int totalOfferCount) {
        this.totalOfferCount = totalOfferCount;
        return this;
    }

    /**
     * Get the value of NumberOfOffers.
     *
     * @return The value of NumberOfOffers.
     */
    public NumberOfOffers getNumberOfOffers() {
        return numberOfOffers;
    }

    /**
     * Set the value of NumberOfOffers.
     *
     * @param numberOfOffers
     *            The new value to set.
     */
    public void setNumberOfOffers(NumberOfOffers numberOfOffers) {
        this.numberOfOffers = numberOfOffers;
    }

    /**
     * Check to see if NumberOfOffers is set.
     *
     * @return true if NumberOfOffers is set.
     */
    public boolean isSetNumberOfOffers() {
        return numberOfOffers != null;
    }

    /**
     * Set the value of NumberOfOffers, return this.
     *
     * @param numberOfOffers
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withNumberOfOffers(NumberOfOffers numberOfOffers) {
        this.numberOfOffers = numberOfOffers;
        return this;
    }

    /**
     * Get the value of LowestPrices.
     *
     * @return The value of LowestPrices.
     */
    public LowestPrices getLowestPrices() {
        return lowestPrices;
    }

    /**
     * Set the value of LowestPrices.
     *
     * @param lowestPrices
     *            The new value to set.
     */
    public void setLowestPrices(LowestPrices lowestPrices) {
        this.lowestPrices = lowestPrices;
    }

    /**
     * Check to see if LowestPrices is set.
     *
     * @return true if LowestPrices is set.
     */
    public boolean isSetLowestPrices() {
        return lowestPrices != null;
    }

    /**
     * Set the value of LowestPrices, return this.
     *
     * @param lowestPrices
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withLowestPrices(LowestPrices lowestPrices) {
        this.lowestPrices = lowestPrices;
        return this;
    }

    /**
     * Get the value of BuyBoxPrices.
     *
     * @return The value of BuyBoxPrices.
     */
    public BuyBoxPrices getBuyBoxPrices() {
        return buyBoxPrices;
    }

    /**
     * Set the value of BuyBoxPrices.
     *
     * @param buyBoxPrices
     *            The new value to set.
     */
    public void setBuyBoxPrices(BuyBoxPrices buyBoxPrices) {
        this.buyBoxPrices = buyBoxPrices;
    }

    /**
     * Check to see if BuyBoxPrices is set.
     *
     * @return true if BuyBoxPrices is set.
     */
    public boolean isSetBuyBoxPrices() {
        return buyBoxPrices != null;
    }

    /**
     * Set the value of BuyBoxPrices, return this.
     *
     * @param buyBoxPrices
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withBuyBoxPrices(BuyBoxPrices buyBoxPrices) {
        this.buyBoxPrices = buyBoxPrices;
        return this;
    }

    /**
     * Get the value of ListPrice.
     *
     * @return The value of ListPrice.
     */
    public MoneyType getListPrice() {
        return listPrice;
    }

    /**
     * Set the value of ListPrice.
     *
     * @param listPrice
     *            The new value to set.
     */
    public void setListPrice(MoneyType listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * Check to see if ListPrice is set.
     *
     * @return true if ListPrice is set.
     */
    public boolean isSetListPrice() {
        return listPrice != null;
    }

    /**
     * Set the value of ListPrice, return this.
     *
     * @param listPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withListPrice(MoneyType listPrice) {
        this.listPrice = listPrice;
        return this;
    }

    /**
     * Get the value of SuggestedLowerPricePlusShipping.
     *
     * @return The value of SuggestedLowerPricePlusShipping.
     */
    public MoneyType getSuggestedLowerPricePlusShipping() {
        return suggestedLowerPricePlusShipping;
    }

    /**
     * Set the value of SuggestedLowerPricePlusShipping.
     *
     * @param suggestedLowerPricePlusShipping
     *            The new value to set.
     */
    public void setSuggestedLowerPricePlusShipping(MoneyType suggestedLowerPricePlusShipping) {
        this.suggestedLowerPricePlusShipping = suggestedLowerPricePlusShipping;
    }

    /**
     * Check to see if SuggestedLowerPricePlusShipping is set.
     *
     * @return true if SuggestedLowerPricePlusShipping is set.
     */
    public boolean isSetSuggestedLowerPricePlusShipping() {
        return suggestedLowerPricePlusShipping != null;
    }

    /**
     * Set the value of SuggestedLowerPricePlusShipping, return this.
     *
     * @param suggestedLowerPricePlusShipping
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withSuggestedLowerPricePlusShipping(MoneyType suggestedLowerPricePlusShipping) {
        this.suggestedLowerPricePlusShipping = suggestedLowerPricePlusShipping;
        return this;
    }

    /**
     * Get the value of BuyBoxEligibleOffers.
     *
     * @return The value of BuyBoxEligibleOffers.
     */
    public BuyBoxEligibleOffers getBuyBoxEligibleOffers() {
        return buyBoxEligibleOffers;
    }

    /**
     * Set the value of BuyBoxEligibleOffers.
     *
     * @param buyBoxEligibleOffers
     *            The new value to set.
     */
    public void setBuyBoxEligibleOffers(BuyBoxEligibleOffers buyBoxEligibleOffers) {
        this.buyBoxEligibleOffers = buyBoxEligibleOffers;
    }

    /**
     * Check to see if BuyBoxEligibleOffers is set.
     *
     * @return true if BuyBoxEligibleOffers is set.
     */
    public boolean isSetBuyBoxEligibleOffers() {
        return buyBoxEligibleOffers != null;
    }

    /**
     * Set the value of BuyBoxEligibleOffers, return this.
     *
     * @param buyBoxEligibleOffers
     *             The new value to set.
     *
     * @return This instance.
     */
    public Summary withBuyBoxEligibleOffers(BuyBoxEligibleOffers buyBoxEligibleOffers) {
        this.buyBoxEligibleOffers = buyBoxEligibleOffers;
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
        totalOfferCount = r.read("TotalOfferCount", int.class);
        numberOfOffers = r.read("NumberOfOffers", NumberOfOffers.class);
        lowestPrices = r.read("LowestPrices", LowestPrices.class);
        buyBoxPrices = r.read("BuyBoxPrices", BuyBoxPrices.class);
        listPrice = r.read("ListPrice", MoneyType.class);
        suggestedLowerPricePlusShipping = r.read("SuggestedLowerPricePlusShipping", MoneyType.class);
        buyBoxEligibleOffers = r.read("BuyBoxEligibleOffers", BuyBoxEligibleOffers.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TotalOfferCount", totalOfferCount);
        w.write("NumberOfOffers", numberOfOffers);
        w.write("LowestPrices", lowestPrices);
        w.write("BuyBoxPrices", buyBoxPrices);
        w.write("ListPrice", listPrice);
        w.write("SuggestedLowerPricePlusShipping", suggestedLowerPricePlusShipping);
        w.write("BuyBoxEligibleOffers", buyBoxEligibleOffers);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Summary",this);
    }

    /** Value constructor. */
    public Summary(int totalOfferCount,NumberOfOffers numberOfOffers,LowestPrices lowestPrices,BuyBoxPrices buyBoxPrices,MoneyType listPrice,MoneyType suggestedLowerPricePlusShipping,BuyBoxEligibleOffers buyBoxEligibleOffers) {
        this.totalOfferCount = totalOfferCount;
        this.numberOfOffers = numberOfOffers;
        this.lowestPrices = lowestPrices;
        this.buyBoxPrices = buyBoxPrices;
        this.listPrice = listPrice;
        this.suggestedLowerPricePlusShipping = suggestedLowerPricePlusShipping;
        this.buyBoxEligibleOffers = buyBoxEligibleOffers;
    }    
    

    /** Default constructor. */
    public Summary() {
        super();
    }

}
