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
 * Shipment Request Details
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * ShipmentRequestDetails complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShipmentRequestDetails"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ItemList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Item" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipFromAddress" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Address"/&gt;
 *             &lt;element name="PackageDimensions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}PackageDimensions"/&gt;
 *             &lt;element name="Weight" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Weight"/&gt;
 *             &lt;element name="MustArriveByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ShippingServiceOptions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShippingServiceOptions"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShipmentRequestDetails extends AbstractMwsObject {

    private String amazonOrderId;

    private String sellerOrderId;

    private List<Item> itemList;

    private Address shipFromAddress;

    private PackageDimensions packageDimensions;

    private Weight weight;

    private XMLGregorianCalendar mustArriveByDate;

    private XMLGregorianCalendar shipDate;

    private ShippingServiceOptions shippingServiceOptions;

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of SellerOrderId.
     *
     * @return The value of SellerOrderId.
     */
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    /**
     * Set the value of SellerOrderId.
     *
     * @param sellerOrderId
     *            The new value to set.
     */
    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    /**
     * Check to see if SellerOrderId is set.
     *
     * @return true if SellerOrderId is set.
     */
    public boolean isSetSellerOrderId() {
        return sellerOrderId != null;
    }

    /**
     * Set the value of SellerOrderId, return this.
     *
     * @param sellerOrderId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * Get the value of ItemList.
     *
     * @return The value of ItemList.
     */
    public List<Item> getItemList() {
        if (itemList==null) {
            itemList = new ArrayList<Item>();
        }
        return itemList;
    }

    /**
     * Set the value of ItemList.
     *
     * @param itemList
     *            The new value to set.
     */
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    /**
     * Clear ItemList.
     */
    public void unsetItemList() {
        this.itemList = null;
    }

    /**
     * Check to see if ItemList is set.
     *
     * @return true if ItemList is set.
     */
    public boolean isSetItemList() {
        return itemList != null && !itemList.isEmpty();
    }

    /**
     * Add values for ItemList, return this.
     *
     * @param itemList
     *             New values to add.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withItemList(Item... values) {
        List<Item> list = getItemList();
        for (Item value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ShipFromAddress.
     *
     * @return The value of ShipFromAddress.
     */
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Set the value of ShipFromAddress.
     *
     * @param shipFromAddress
     *            The new value to set.
     */
    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    /**
     * Check to see if ShipFromAddress is set.
     *
     * @return true if ShipFromAddress is set.
     */
    public boolean isSetShipFromAddress() {
        return shipFromAddress != null;
    }

    /**
     * Set the value of ShipFromAddress, return this.
     *
     * @param shipFromAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get the value of PackageDimensions.
     *
     * @return The value of PackageDimensions.
     */
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Set the value of PackageDimensions.
     *
     * @param packageDimensions
     *            The new value to set.
     */
    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    /**
     * Check to see if PackageDimensions is set.
     *
     * @return true if PackageDimensions is set.
     */
    public boolean isSetPackageDimensions() {
        return packageDimensions != null;
    }

    /**
     * Set the value of PackageDimensions, return this.
     *
     * @param packageDimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
        return this;
    }

    /**
     * Get the value of Weight.
     *
     * @return The value of Weight.
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Set the value of Weight.
     *
     * @param weight
     *            The new value to set.
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    /**
     * Check to see if Weight is set.
     *
     * @return true if Weight is set.
     */
    public boolean isSetWeight() {
        return weight != null;
    }

    /**
     * Set the value of Weight, return this.
     *
     * @param weight
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withWeight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the value of MustArriveByDate.
     *
     * @return The value of MustArriveByDate.
     */
    public XMLGregorianCalendar getMustArriveByDate() {
        return mustArriveByDate;
    }

    /**
     * Set the value of MustArriveByDate.
     *
     * @param mustArriveByDate
     *            The new value to set.
     */
    public void setMustArriveByDate(XMLGregorianCalendar mustArriveByDate) {
        this.mustArriveByDate = mustArriveByDate;
    }

    /**
     * Check to see if MustArriveByDate is set.
     *
     * @return true if MustArriveByDate is set.
     */
    public boolean isSetMustArriveByDate() {
        return mustArriveByDate != null;
    }

    /**
     * Set the value of MustArriveByDate, return this.
     *
     * @param mustArriveByDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withMustArriveByDate(XMLGregorianCalendar mustArriveByDate) {
        this.mustArriveByDate = mustArriveByDate;
        return this;
    }

    /**
     * Get the value of ShipDate.
     *
     * @return The value of ShipDate.
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Set the value of ShipDate.
     *
     * @param shipDate
     *            The new value to set.
     */
    public void setShipDate(XMLGregorianCalendar shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * Check to see if ShipDate is set.
     *
     * @return true if ShipDate is set.
     */
    public boolean isSetShipDate() {
        return shipDate != null;
    }

    /**
     * Set the value of ShipDate, return this.
     *
     * @param shipDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withShipDate(XMLGregorianCalendar shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get the value of ShippingServiceOptions.
     *
     * @return The value of ShippingServiceOptions.
     */
    public ShippingServiceOptions getShippingServiceOptions() {
        return shippingServiceOptions;
    }

    /**
     * Set the value of ShippingServiceOptions.
     *
     * @param shippingServiceOptions
     *            The new value to set.
     */
    public void setShippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
    }

    /**
     * Check to see if ShippingServiceOptions is set.
     *
     * @return true if ShippingServiceOptions is set.
     */
    public boolean isSetShippingServiceOptions() {
        return shippingServiceOptions != null;
    }

    /**
     * Set the value of ShippingServiceOptions, return this.
     *
     * @param shippingServiceOptions
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShipmentRequestDetails withShippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
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
        amazonOrderId = r.read("AmazonOrderId", String.class);
        sellerOrderId = r.read("SellerOrderId", String.class);
        itemList = r.readList("ItemList", "Item", Item.class);
        shipFromAddress = r.read("ShipFromAddress", Address.class);
        packageDimensions = r.read("PackageDimensions", PackageDimensions.class);
        weight = r.read("Weight", Weight.class);
        mustArriveByDate = r.read("MustArriveByDate", XMLGregorianCalendar.class);
        shipDate = r.read("ShipDate", XMLGregorianCalendar.class);
        shippingServiceOptions = r.read("ShippingServiceOptions", ShippingServiceOptions.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonOrderId", amazonOrderId);
        w.write("SellerOrderId", sellerOrderId);
        w.writeList("ItemList", "Item", itemList);
        w.write("ShipFromAddress", shipFromAddress);
        w.write("PackageDimensions", packageDimensions);
        w.write("Weight", weight);
        w.write("MustArriveByDate", mustArriveByDate);
        w.write("ShipDate", shipDate);
        w.write("ShippingServiceOptions", shippingServiceOptions);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ShipmentRequestDetails",this);
    }

    /** Value constructor. */
    public ShipmentRequestDetails(String amazonOrderId,String sellerOrderId,List<Item> itemList,Address shipFromAddress,PackageDimensions packageDimensions,Weight weight,XMLGregorianCalendar mustArriveByDate,XMLGregorianCalendar shipDate,ShippingServiceOptions shippingServiceOptions) {
        this.amazonOrderId = amazonOrderId;
        this.sellerOrderId = sellerOrderId;
        this.itemList = itemList;
        this.shipFromAddress = shipFromAddress;
        this.packageDimensions = packageDimensions;
        this.weight = weight;
        this.mustArriveByDate = mustArriveByDate;
        this.shipDate = shipDate;
        this.shippingServiceOptions = shippingServiceOptions;
    }    
    

    /** Default constructor. */
    public ShipmentRequestDetails() {
        super();
    }

}
