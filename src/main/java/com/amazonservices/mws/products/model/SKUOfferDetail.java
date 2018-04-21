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
 * SKU Offer Detail
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * SKUOfferDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SKUOfferDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MyOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="SubCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerFeedbackRating" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}SellerFeedbackType" minOccurs="0"/&gt;
 *             &lt;element name="ShippingTime" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}DetailedShippingTimeType"/&gt;
 *             &lt;element name="ListingPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/&gt;
 *             &lt;element name="Points" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Points" minOccurs="0"/&gt;
 *             &lt;element name="Shipping" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/&gt;
 *             &lt;element name="ShipsFrom" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ShipsFromType" minOccurs="0"/&gt;
 *             &lt;element name="IsFulfilledByAmazon" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="IsBuyBoxWinner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="IsFeaturedMerchant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SKUOfferDetail", propOrder={
    "myOffer",
    "subCondition",
    "sellerFeedbackRating",
    "shippingTime",
    "listingPrice",
    "points",
    "shipping",
    "shipsFrom",
    "isFulfilledByAmazon",
    "isBuyBoxWinner",
    "isFeaturedMerchant"
})
@XmlRootElement(name = "SKUOfferDetail")
public class SKUOfferDetail extends AbstractMwsObject {

    @XmlElement(name="MyOffer",required=true)
    private boolean myOffer;

    @XmlElement(name="SubCondition",required=true)
    private String subCondition;

    @XmlElement(name="SellerFeedbackRating")
    private SellerFeedbackType sellerFeedbackRating;

    @XmlElement(name="ShippingTime",required=true)
    private DetailedShippingTimeType shippingTime;

    @XmlElement(name="ListingPrice",required=true)
    private MoneyType listingPrice;

    @XmlElement(name="Points")
    private Points points;

    @XmlElement(name="Shipping",required=true)
    private MoneyType shipping;

    @XmlElement(name="ShipsFrom")
    private ShipsFromType shipsFrom;

    @XmlElement(name="IsFulfilledByAmazon",required=true)
    private boolean isFulfilledByAmazon;

    @XmlElement(name="IsBuyBoxWinner")
    private Boolean isBuyBoxWinner;

    @XmlElement(name="IsFeaturedMerchant")
    private Boolean isFeaturedMerchant;

    /**
     * Check the value of MyOffer.
     *
     * @return true if MyOffer is set to true.
     */
    public boolean isMyOffer() {
        return myOffer;
    }

    /**
     * Get the value of MyOffer.
     *
     * @return The value of MyOffer.
     */
    public boolean getMyOffer() {
        return myOffer;
    }

    /**
     * Set the value of MyOffer.
     *
     * @param myOffer
     *            The new value to set.
     */
    public void setMyOffer(boolean myOffer) {
        this.myOffer = myOffer;
    }

    /**
     * Set the value of MyOffer, return this.
     *
     * @param myOffer
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withMyOffer(boolean myOffer) {
        this.myOffer = myOffer;
        return this;
    }

    /**
     * Get the value of SubCondition.
     *
     * @return The value of SubCondition.
     */
    public String getSubCondition() {
        return subCondition;
    }

    /**
     * Set the value of SubCondition.
     *
     * @param subCondition
     *            The new value to set.
     */
    public void setSubCondition(String subCondition) {
        this.subCondition = subCondition;
    }

    /**
     * Check to see if SubCondition is set.
     *
     * @return true if SubCondition is set.
     */
    public boolean isSetSubCondition() {
        return subCondition != null;
    }

    /**
     * Set the value of SubCondition, return this.
     *
     * @param subCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withSubCondition(String subCondition) {
        this.subCondition = subCondition;
        return this;
    }

    /**
     * Get the value of SellerFeedbackRating.
     *
     * @return The value of SellerFeedbackRating.
     */
    public SellerFeedbackType getSellerFeedbackRating() {
        return sellerFeedbackRating;
    }

    /**
     * Set the value of SellerFeedbackRating.
     *
     * @param sellerFeedbackRating
     *            The new value to set.
     */
    public void setSellerFeedbackRating(SellerFeedbackType sellerFeedbackRating) {
        this.sellerFeedbackRating = sellerFeedbackRating;
    }

    /**
     * Check to see if SellerFeedbackRating is set.
     *
     * @return true if SellerFeedbackRating is set.
     */
    public boolean isSetSellerFeedbackRating() {
        return sellerFeedbackRating != null;
    }

    /**
     * Set the value of SellerFeedbackRating, return this.
     *
     * @param sellerFeedbackRating
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withSellerFeedbackRating(SellerFeedbackType sellerFeedbackRating) {
        this.sellerFeedbackRating = sellerFeedbackRating;
        return this;
    }

    /**
     * Get the value of ShippingTime.
     *
     * @return The value of ShippingTime.
     */
    public DetailedShippingTimeType getShippingTime() {
        return shippingTime;
    }

    /**
     * Set the value of ShippingTime.
     *
     * @param shippingTime
     *            The new value to set.
     */
    public void setShippingTime(DetailedShippingTimeType shippingTime) {
        this.shippingTime = shippingTime;
    }

    /**
     * Check to see if ShippingTime is set.
     *
     * @return true if ShippingTime is set.
     */
    public boolean isSetShippingTime() {
        return shippingTime != null;
    }

    /**
     * Set the value of ShippingTime, return this.
     *
     * @param shippingTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withShippingTime(DetailedShippingTimeType shippingTime) {
        this.shippingTime = shippingTime;
        return this;
    }

    /**
     * Get the value of ListingPrice.
     *
     * @return The value of ListingPrice.
     */
    public MoneyType getListingPrice() {
        return listingPrice;
    }

    /**
     * Set the value of ListingPrice.
     *
     * @param listingPrice
     *            The new value to set.
     */
    public void setListingPrice(MoneyType listingPrice) {
        this.listingPrice = listingPrice;
    }

    /**
     * Check to see if ListingPrice is set.
     *
     * @return true if ListingPrice is set.
     */
    public boolean isSetListingPrice() {
        return listingPrice != null;
    }

    /**
     * Set the value of ListingPrice, return this.
     *
     * @param listingPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withListingPrice(MoneyType listingPrice) {
        this.listingPrice = listingPrice;
        return this;
    }

    /**
     * Get the value of Points.
     *
     * @return The value of Points.
     */
    public Points getPoints() {
        return points;
    }

    /**
     * Set the value of Points.
     *
     * @param points
     *            The new value to set.
     */
    public void setPoints(Points points) {
        this.points = points;
    }

    /**
     * Check to see if Points is set.
     *
     * @return true if Points is set.
     */
    public boolean isSetPoints() {
        return points != null;
    }

    /**
     * Set the value of Points, return this.
     *
     * @param points
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withPoints(Points points) {
        this.points = points;
        return this;
    }

    /**
     * Get the value of Shipping.
     *
     * @return The value of Shipping.
     */
    public MoneyType getShipping() {
        return shipping;
    }

    /**
     * Set the value of Shipping.
     *
     * @param shipping
     *            The new value to set.
     */
    public void setShipping(MoneyType shipping) {
        this.shipping = shipping;
    }

    /**
     * Check to see if Shipping is set.
     *
     * @return true if Shipping is set.
     */
    public boolean isSetShipping() {
        return shipping != null;
    }

    /**
     * Set the value of Shipping, return this.
     *
     * @param shipping
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withShipping(MoneyType shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Get the value of ShipsFrom.
     *
     * @return The value of ShipsFrom.
     */
    public ShipsFromType getShipsFrom() {
        return shipsFrom;
    }

    /**
     * Set the value of ShipsFrom.
     *
     * @param shipsFrom
     *            The new value to set.
     */
    public void setShipsFrom(ShipsFromType shipsFrom) {
        this.shipsFrom = shipsFrom;
    }

    /**
     * Check to see if ShipsFrom is set.
     *
     * @return true if ShipsFrom is set.
     */
    public boolean isSetShipsFrom() {
        return shipsFrom != null;
    }

    /**
     * Set the value of ShipsFrom, return this.
     *
     * @param shipsFrom
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withShipsFrom(ShipsFromType shipsFrom) {
        this.shipsFrom = shipsFrom;
        return this;
    }

    /**
     * Check the value of IsFulfilledByAmazon.
     *
     * @return true if IsFulfilledByAmazon is set to true.
     */
    public boolean isIsFulfilledByAmazon() {
        return isFulfilledByAmazon;
    }

    /**
     * Get the value of IsFulfilledByAmazon.
     *
     * @return The value of IsFulfilledByAmazon.
     */
    public boolean getIsFulfilledByAmazon() {
        return isFulfilledByAmazon;
    }

    /**
     * Set the value of IsFulfilledByAmazon.
     *
     * @param isFulfilledByAmazon
     *            The new value to set.
     */
    public void setIsFulfilledByAmazon(boolean isFulfilledByAmazon) {
        this.isFulfilledByAmazon = isFulfilledByAmazon;
    }

    /**
     * Set the value of IsFulfilledByAmazon, return this.
     *
     * @param isFulfilledByAmazon
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withIsFulfilledByAmazon(boolean isFulfilledByAmazon) {
        this.isFulfilledByAmazon = isFulfilledByAmazon;
        return this;
    }

    /**
     * Check the value of IsBuyBoxWinner.
     *
     * @return true if IsBuyBoxWinner is set to true.
     */
    public boolean isIsBuyBoxWinner() {
        return isBuyBoxWinner!=null && isBuyBoxWinner.booleanValue();
    }

    /**
     * Get the value of IsBuyBoxWinner.
     *
     * @return The value of IsBuyBoxWinner.
     */
    public Boolean getIsBuyBoxWinner() {
        return isBuyBoxWinner;
    }

    /**
     * Set the value of IsBuyBoxWinner.
     *
     * @param isBuyBoxWinner
     *            The new value to set.
     */
    public void setIsBuyBoxWinner(Boolean isBuyBoxWinner) {
        this.isBuyBoxWinner = isBuyBoxWinner;
    }

    /**
     * Check to see if IsBuyBoxWinner is set.
     *
     * @return true if IsBuyBoxWinner is set.
     */
    public boolean isSetIsBuyBoxWinner() {
        return isBuyBoxWinner != null;
    }

    /**
     * Set the value of IsBuyBoxWinner, return this.
     *
     * @param isBuyBoxWinner
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withIsBuyBoxWinner(Boolean isBuyBoxWinner) {
        this.isBuyBoxWinner = isBuyBoxWinner;
        return this;
    }

    /**
     * Check the value of IsFeaturedMerchant.
     *
     * @return true if IsFeaturedMerchant is set to true.
     */
    public boolean isIsFeaturedMerchant() {
        return isFeaturedMerchant!=null && isFeaturedMerchant.booleanValue();
    }

    /**
     * Get the value of IsFeaturedMerchant.
     *
     * @return The value of IsFeaturedMerchant.
     */
    public Boolean getIsFeaturedMerchant() {
        return isFeaturedMerchant;
    }

    /**
     * Set the value of IsFeaturedMerchant.
     *
     * @param isFeaturedMerchant
     *            The new value to set.
     */
    public void setIsFeaturedMerchant(Boolean isFeaturedMerchant) {
        this.isFeaturedMerchant = isFeaturedMerchant;
    }

    /**
     * Check to see if IsFeaturedMerchant is set.
     *
     * @return true if IsFeaturedMerchant is set.
     */
    public boolean isSetIsFeaturedMerchant() {
        return isFeaturedMerchant != null;
    }

    /**
     * Set the value of IsFeaturedMerchant, return this.
     *
     * @param isFeaturedMerchant
     *             The new value to set.
     *
     * @return This instance.
     */
    public SKUOfferDetail withIsFeaturedMerchant(Boolean isFeaturedMerchant) {
        this.isFeaturedMerchant = isFeaturedMerchant;
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
        myOffer = r.read("MyOffer", boolean.class);
        subCondition = r.read("SubCondition", String.class);
        sellerFeedbackRating = r.read("SellerFeedbackRating", SellerFeedbackType.class);
        shippingTime = r.read("ShippingTime", DetailedShippingTimeType.class);
        listingPrice = r.read("ListingPrice", MoneyType.class);
        points = r.read("Points", Points.class);
        shipping = r.read("Shipping", MoneyType.class);
        shipsFrom = r.read("ShipsFrom", ShipsFromType.class);
        isFulfilledByAmazon = r.read("IsFulfilledByAmazon", boolean.class);
        isBuyBoxWinner = r.read("IsBuyBoxWinner", Boolean.class);
        isFeaturedMerchant = r.read("IsFeaturedMerchant", Boolean.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("MyOffer", myOffer);
        w.write("SubCondition", subCondition);
        w.write("SellerFeedbackRating", sellerFeedbackRating);
        w.write("ShippingTime", shippingTime);
        w.write("ListingPrice", listingPrice);
        w.write("Points", points);
        w.write("Shipping", shipping);
        w.write("ShipsFrom", shipsFrom);
        w.write("IsFulfilledByAmazon", isFulfilledByAmazon);
        w.write("IsBuyBoxWinner", isBuyBoxWinner);
        w.write("IsFeaturedMerchant", isFeaturedMerchant);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "SKUOfferDetail",this);
    }

    /** Value constructor. */
    public SKUOfferDetail(boolean myOffer,String subCondition,SellerFeedbackType sellerFeedbackRating,DetailedShippingTimeType shippingTime,MoneyType listingPrice,Points points,MoneyType shipping,ShipsFromType shipsFrom,boolean isFulfilledByAmazon,Boolean isBuyBoxWinner,Boolean isFeaturedMerchant) {
        this.myOffer = myOffer;
        this.subCondition = subCondition;
        this.sellerFeedbackRating = sellerFeedbackRating;
        this.shippingTime = shippingTime;
        this.listingPrice = listingPrice;
        this.points = points;
        this.shipping = shipping;
        this.shipsFrom = shipsFrom;
        this.isFulfilledByAmazon = isFulfilledByAmazon;
        this.isBuyBoxWinner = isBuyBoxWinner;
        this.isFeaturedMerchant = isFeaturedMerchant;
    }    
    

    /** Default constructor. */
    public SKUOfferDetail() {
        super();
    }

}
