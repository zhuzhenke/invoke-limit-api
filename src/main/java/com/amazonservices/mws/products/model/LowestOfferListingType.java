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
 * Lowest Offer Listing Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * LowestOfferListingType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LowestOfferListingType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Qualifiers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}QualifiersType"/&gt;
 *             &lt;element name="NumberOfOfferListingsConsidered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="SellerFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="Price" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}PriceType"/&gt;
 *             &lt;element name="MultipleOffersAtLowestPrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="LowestOfferListingType", propOrder={
    "qualifiers",
    "numberOfOfferListingsConsidered",
    "sellerFeedbackCount",
    "price",
    "multipleOffersAtLowestPrice"
})
@XmlRootElement(name = "LowestOfferListingType")
public class LowestOfferListingType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="Qualifiers",required=true)
    private QualifiersType qualifiers;

    @XmlElement(name="NumberOfOfferListingsConsidered")
    private Integer numberOfOfferListingsConsidered;

    @XmlElement(name="SellerFeedbackCount",required=true)
    private int sellerFeedbackCount;

    @XmlElement(name="Price",required=true)
    private PriceType price;

    @XmlElement(name="MultipleOffersAtLowestPrice",required=true)
    private String multipleOffersAtLowestPrice;

    /**
     * Get the value of Qualifiers.
     *
     * @return The value of Qualifiers.
     */
    public QualifiersType getQualifiers() {
        return qualifiers;
    }

    /**
     * Set the value of Qualifiers.
     *
     * @param qualifiers
     *            The new value to set.
     */
    public void setQualifiers(QualifiersType qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * Check to see if Qualifiers is set.
     *
     * @return true if Qualifiers is set.
     */
    public boolean isSetQualifiers() {
        return qualifiers != null;
    }

    /**
     * Set the value of Qualifiers, return this.
     *
     * @param qualifiers
     *             The new value to set.
     *
     * @return This instance.
     */
    public LowestOfferListingType withQualifiers(QualifiersType qualifiers) {
        this.qualifiers = qualifiers;
        return this;
    }

    /**
     * Get the value of NumberOfOfferListingsConsidered.
     *
     * @return The value of NumberOfOfferListingsConsidered.
     */
    public Integer getNumberOfOfferListingsConsidered() {
        return numberOfOfferListingsConsidered;
    }

    /**
     * Set the value of NumberOfOfferListingsConsidered.
     *
     * @param numberOfOfferListingsConsidered
     *            The new value to set.
     */
    public void setNumberOfOfferListingsConsidered(Integer numberOfOfferListingsConsidered) {
        this.numberOfOfferListingsConsidered = numberOfOfferListingsConsidered;
    }

    /**
     * Check to see if NumberOfOfferListingsConsidered is set.
     *
     * @return true if NumberOfOfferListingsConsidered is set.
     */
    public boolean isSetNumberOfOfferListingsConsidered() {
        return numberOfOfferListingsConsidered != null;
    }

    /**
     * Set the value of NumberOfOfferListingsConsidered, return this.
     *
     * @param numberOfOfferListingsConsidered
     *             The new value to set.
     *
     * @return This instance.
     */
    public LowestOfferListingType withNumberOfOfferListingsConsidered(Integer numberOfOfferListingsConsidered) {
        this.numberOfOfferListingsConsidered = numberOfOfferListingsConsidered;
        return this;
    }

    /**
     * Get the value of SellerFeedbackCount.
     *
     * @return The value of SellerFeedbackCount.
     */
    public int getSellerFeedbackCount() {
        return sellerFeedbackCount;
    }

    /**
     * Set the value of SellerFeedbackCount.
     *
     * @param sellerFeedbackCount
     *            The new value to set.
     */
    public void setSellerFeedbackCount(int sellerFeedbackCount) {
        this.sellerFeedbackCount = sellerFeedbackCount;
    }

    /**
     * is SellerFeedbackCount set.
     *
     * @return true.
     */
    public boolean isSetSellerFeedbackCount() {
        return true;
    }

    /**
     * Set the value of SellerFeedbackCount, return this.
     *
     * @param sellerFeedbackCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public LowestOfferListingType withSellerFeedbackCount(int sellerFeedbackCount) {
        this.sellerFeedbackCount = sellerFeedbackCount;
        return this;
    }

    /**
     * Get the value of Price.
     *
     * @return The value of Price.
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Set the value of Price.
     *
     * @param price
     *            The new value to set.
     */
    public void setPrice(PriceType price) {
        this.price = price;
    }

    /**
     * Check to see if Price is set.
     *
     * @return true if Price is set.
     */
    public boolean isSetPrice() {
        return price != null;
    }

    /**
     * Set the value of Price, return this.
     *
     * @param price
     *             The new value to set.
     *
     * @return This instance.
     */
    public LowestOfferListingType withPrice(PriceType price) {
        this.price = price;
        return this;
    }

    /**
     * Get the value of MultipleOffersAtLowestPrice.
     *
     * @return The value of MultipleOffersAtLowestPrice.
     */
    public String getMultipleOffersAtLowestPrice() {
        return multipleOffersAtLowestPrice;
    }

    /**
     * Set the value of MultipleOffersAtLowestPrice.
     *
     * @param multipleOffersAtLowestPrice
     *            The new value to set.
     */
    public void setMultipleOffersAtLowestPrice(String multipleOffersAtLowestPrice) {
        this.multipleOffersAtLowestPrice = multipleOffersAtLowestPrice;
    }

    /**
     * Check to see if MultipleOffersAtLowestPrice is set.
     *
     * @return true if MultipleOffersAtLowestPrice is set.
     */
    public boolean isSetMultipleOffersAtLowestPrice() {
        return multipleOffersAtLowestPrice != null;
    }

    /**
     * Set the value of MultipleOffersAtLowestPrice, return this.
     *
     * @param multipleOffersAtLowestPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public LowestOfferListingType withMultipleOffersAtLowestPrice(String multipleOffersAtLowestPrice) {
        this.multipleOffersAtLowestPrice = multipleOffersAtLowestPrice;
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
        qualifiers = r.read("Qualifiers", QualifiersType.class);
        numberOfOfferListingsConsidered = r.read("NumberOfOfferListingsConsidered", Integer.class);
        sellerFeedbackCount = r.read("SellerFeedbackCount", int.class);
        price = r.read("Price", PriceType.class);
        multipleOffersAtLowestPrice = r.read("MultipleOffersAtLowestPrice", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Qualifiers", qualifiers);
        w.write("NumberOfOfferListingsConsidered", numberOfOfferListingsConsidered);
        w.write("SellerFeedbackCount", sellerFeedbackCount);
        w.write("Price", price);
        w.write("MultipleOffersAtLowestPrice", multipleOffersAtLowestPrice);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "LowestOfferListingType",this);
    }

    /** Value constructor. */
    public LowestOfferListingType(QualifiersType qualifiers,Integer numberOfOfferListingsConsidered,int sellerFeedbackCount,PriceType price,String multipleOffersAtLowestPrice) {
        this.qualifiers = qualifiers;
        this.numberOfOfferListingsConsidered = numberOfOfferListingsConsidered;
        this.sellerFeedbackCount = sellerFeedbackCount;
        this.price = price;
        this.multipleOffersAtLowestPrice = multipleOffersAtLowestPrice;
    }    
    

    /** Default constructor. */
    public LowestOfferListingType() {
        super();
    }

}
