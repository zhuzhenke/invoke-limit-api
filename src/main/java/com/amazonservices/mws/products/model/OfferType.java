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
 * Offer Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * OfferType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="BuyingPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}PriceType"/&gt;
 *             &lt;element name="RegularPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/&gt;
 *             &lt;element name="FulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="ItemSubCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="OfferType", propOrder={
    "buyingPrice",
    "regularPrice",
    "fulfillmentChannel",
    "itemCondition",
    "itemSubCondition",
    "sellerId",
    "sellerSKU"
})
@XmlRootElement(name = "OfferType")
public class OfferType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="BuyingPrice",required=true)
    private PriceType buyingPrice;

    @XmlElement(name="RegularPrice",required=true)
    private MoneyType regularPrice;

    @XmlElement(name="FulfillmentChannel",required=true)
    private String fulfillmentChannel;

    @XmlElement(name="ItemCondition",required=true)
    private String itemCondition;

    @XmlElement(name="ItemSubCondition",required=true)
    private String itemSubCondition;

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="SellerSKU",required=true)
    private String sellerSKU;

    /**
     * Get the value of BuyingPrice.
     *
     * @return The value of BuyingPrice.
     */
    public PriceType getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * Set the value of BuyingPrice.
     *
     * @param buyingPrice
     *            The new value to set.
     */
    public void setBuyingPrice(PriceType buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * Check to see if BuyingPrice is set.
     *
     * @return true if BuyingPrice is set.
     */
    public boolean isSetBuyingPrice() {
        return buyingPrice != null;
    }

    /**
     * Set the value of BuyingPrice, return this.
     *
     * @param buyingPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferType withBuyingPrice(PriceType buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    /**
     * Get the value of RegularPrice.
     *
     * @return The value of RegularPrice.
     */
    public MoneyType getRegularPrice() {
        return regularPrice;
    }

    /**
     * Set the value of RegularPrice.
     *
     * @param regularPrice
     *            The new value to set.
     */
    public void setRegularPrice(MoneyType regularPrice) {
        this.regularPrice = regularPrice;
    }

    /**
     * Check to see if RegularPrice is set.
     *
     * @return true if RegularPrice is set.
     */
    public boolean isSetRegularPrice() {
        return regularPrice != null;
    }

    /**
     * Set the value of RegularPrice, return this.
     *
     * @param regularPrice
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferType withRegularPrice(MoneyType regularPrice) {
        this.regularPrice = regularPrice;
        return this;
    }

    /**
     * Get the value of FulfillmentChannel.
     *
     * @return The value of FulfillmentChannel.
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Set the value of FulfillmentChannel.
     *
     * @param fulfillmentChannel
     *            The new value to set.
     */
    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    /**
     * Check to see if FulfillmentChannel is set.
     *
     * @return true if FulfillmentChannel is set.
     */
    public boolean isSetFulfillmentChannel() {
        return fulfillmentChannel != null;
    }

    /**
     * Set the value of FulfillmentChannel, return this.
     *
     * @param fulfillmentChannel
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferType withFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
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
    public OfferType withItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Get the value of ItemSubCondition.
     *
     * @return The value of ItemSubCondition.
     */
    public String getItemSubCondition() {
        return itemSubCondition;
    }

    /**
     * Set the value of ItemSubCondition.
     *
     * @param itemSubCondition
     *            The new value to set.
     */
    public void setItemSubCondition(String itemSubCondition) {
        this.itemSubCondition = itemSubCondition;
    }

    /**
     * Check to see if ItemSubCondition is set.
     *
     * @return true if ItemSubCondition is set.
     */
    public boolean isSetItemSubCondition() {
        return itemSubCondition != null;
    }

    /**
     * Set the value of ItemSubCondition, return this.
     *
     * @param itemSubCondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferType withItemSubCondition(String itemSubCondition) {
        this.itemSubCondition = itemSubCondition;
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
    public OfferType withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferType withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
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
        buyingPrice = r.read("BuyingPrice", PriceType.class);
        regularPrice = r.read("RegularPrice", MoneyType.class);
        fulfillmentChannel = r.read("FulfillmentChannel", String.class);
        itemCondition = r.read("ItemCondition", String.class);
        itemSubCondition = r.read("ItemSubCondition", String.class);
        sellerId = r.read("SellerId", String.class);
        sellerSKU = r.read("SellerSKU", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("BuyingPrice", buyingPrice);
        w.write("RegularPrice", regularPrice);
        w.write("FulfillmentChannel", fulfillmentChannel);
        w.write("ItemCondition", itemCondition);
        w.write("ItemSubCondition", itemSubCondition);
        w.write("SellerId", sellerId);
        w.write("SellerSKU", sellerSKU);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "OfferType",this);
    }

    /** Value constructor. */
    public OfferType(PriceType buyingPrice,MoneyType regularPrice,String fulfillmentChannel,String itemCondition,String itemSubCondition,String sellerId,String sellerSKU) {
        this.buyingPrice = buyingPrice;
        this.regularPrice = regularPrice;
        this.fulfillmentChannel = fulfillmentChannel;
        this.itemCondition = itemCondition;
        this.itemSubCondition = itemSubCondition;
        this.sellerId = sellerId;
        this.sellerSKU = sellerSKU;
    }    
    

    /** Default constructor. */
    public OfferType() {
        super();
    }

}
