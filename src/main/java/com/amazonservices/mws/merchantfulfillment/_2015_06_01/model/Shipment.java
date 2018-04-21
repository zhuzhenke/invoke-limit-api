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
 * Shipment
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
 * Shipment complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Shipment"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ItemList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Item" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ShipFromAddress" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Address"/&gt;
 *             &lt;element name="ShipToAddress" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Address"/&gt;
 *             &lt;element name="PackageDimensions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}PackageDimensions"/&gt;
 *             &lt;element name="Weight" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Weight"/&gt;
 *             &lt;element name="Insurance" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount" minOccurs="0"/&gt;
 *             &lt;element name="ShippingService" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShippingService"/&gt;
 *             &lt;element name="Label" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Label" minOccurs="0"/&gt;
 *             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TrackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="LastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Shipment extends AbstractMwsObject {

    private String shipmentId;

    private String amazonOrderId;

    private String sellerOrderId;

    private List<Item> itemList;

    private Address shipFromAddress;

    private Address shipToAddress;

    private PackageDimensions packageDimensions;

    private Weight weight;

    private CurrencyAmount insurance;

    private ShippingService shippingService;

    private Label label;

    private String status;

    private String trackingId;

    private XMLGregorianCalendar createdDate;

    private XMLGregorianCalendar lastUpdatedDate;

    /**
     * Get the value of ShipmentId.
     *
     * @return The value of ShipmentId.
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Set the value of ShipmentId.
     *
     * @param shipmentId
     *            The new value to set.
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * Check to see if ShipmentId is set.
     *
     * @return true if ShipmentId is set.
     */
    public boolean isSetShipmentId() {
        return shipmentId != null;
    }

    /**
     * Set the value of ShipmentId, return this.
     *
     * @param shipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

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
    public Shipment withAmazonOrderId(String amazonOrderId) {
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
    public Shipment withSellerOrderId(String sellerOrderId) {
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
    public Shipment withItemList(Item... values) {
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
    public Shipment withShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get the value of ShipToAddress.
     *
     * @return The value of ShipToAddress.
     */
    public Address getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Set the value of ShipToAddress.
     *
     * @param shipToAddress
     *            The new value to set.
     */
    public void setShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    /**
     * Check to see if ShipToAddress is set.
     *
     * @return true if ShipToAddress is set.
     */
    public boolean isSetShipToAddress() {
        return shipToAddress != null;
    }

    /**
     * Set the value of ShipToAddress, return this.
     *
     * @param shipToAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
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
    public Shipment withPackageDimensions(PackageDimensions packageDimensions) {
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
    public Shipment withWeight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the value of Insurance.
     *
     * @return The value of Insurance.
     */
    public CurrencyAmount getInsurance() {
        return insurance;
    }

    /**
     * Set the value of Insurance.
     *
     * @param insurance
     *            The new value to set.
     */
    public void setInsurance(CurrencyAmount insurance) {
        this.insurance = insurance;
    }

    /**
     * Check to see if Insurance is set.
     *
     * @return true if Insurance is set.
     */
    public boolean isSetInsurance() {
        return insurance != null;
    }

    /**
     * Set the value of Insurance, return this.
     *
     * @param insurance
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withInsurance(CurrencyAmount insurance) {
        this.insurance = insurance;
        return this;
    }

    /**
     * Get the value of ShippingService.
     *
     * @return The value of ShippingService.
     */
    public ShippingService getShippingService() {
        return shippingService;
    }

    /**
     * Set the value of ShippingService.
     *
     * @param shippingService
     *            The new value to set.
     */
    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    /**
     * Check to see if ShippingService is set.
     *
     * @return true if ShippingService is set.
     */
    public boolean isSetShippingService() {
        return shippingService != null;
    }

    /**
     * Set the value of ShippingService, return this.
     *
     * @param shippingService
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
        return this;
    }

    /**
     * Get the value of Label.
     *
     * @return The value of Label.
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Set the value of Label.
     *
     * @param label
     *            The new value to set.
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * Check to see if Label is set.
     *
     * @return true if Label is set.
     */
    public boolean isSetLabel() {
        return label != null;
    }

    /**
     * Set the value of Label, return this.
     *
     * @param label
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withLabel(Label label) {
        this.label = label;
        return this;
    }

    /**
     * Get the value of Status.
     *
     * @return The value of Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of Status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if Status is set.
     *
     * @return true if Status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of Status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of TrackingId.
     *
     * @return The value of TrackingId.
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Set the value of TrackingId.
     *
     * @param trackingId
     *            The new value to set.
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * Check to see if TrackingId is set.
     *
     * @return true if TrackingId is set.
     */
    public boolean isSetTrackingId() {
        return trackingId != null;
    }

    /**
     * Set the value of TrackingId, return this.
     *
     * @param trackingId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the value of CreatedDate.
     *
     * @return The value of CreatedDate.
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Set the value of CreatedDate.
     *
     * @param createdDate
     *            The new value to set.
     */
    public void setCreatedDate(XMLGregorianCalendar createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Check to see if CreatedDate is set.
     *
     * @return true if CreatedDate is set.
     */
    public boolean isSetCreatedDate() {
        return createdDate != null;
    }

    /**
     * Set the value of CreatedDate, return this.
     *
     * @param createdDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withCreatedDate(XMLGregorianCalendar createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the value of LastUpdatedDate.
     *
     * @return The value of LastUpdatedDate.
     */
    public XMLGregorianCalendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Set the value of LastUpdatedDate.
     *
     * @param lastUpdatedDate
     *            The new value to set.
     */
    public void setLastUpdatedDate(XMLGregorianCalendar lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * Check to see if LastUpdatedDate is set.
     *
     * @return true if LastUpdatedDate is set.
     */
    public boolean isSetLastUpdatedDate() {
        return lastUpdatedDate != null;
    }

    /**
     * Set the value of LastUpdatedDate, return this.
     *
     * @param lastUpdatedDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public Shipment withLastUpdatedDate(XMLGregorianCalendar lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
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
        shipmentId = r.read("ShipmentId", String.class);
        amazonOrderId = r.read("AmazonOrderId", String.class);
        sellerOrderId = r.read("SellerOrderId", String.class);
        itemList = r.readList("ItemList", "Item", Item.class);
        shipFromAddress = r.read("ShipFromAddress", Address.class);
        shipToAddress = r.read("ShipToAddress", Address.class);
        packageDimensions = r.read("PackageDimensions", PackageDimensions.class);
        weight = r.read("Weight", Weight.class);
        insurance = r.read("Insurance", CurrencyAmount.class);
        shippingService = r.read("ShippingService", ShippingService.class);
        label = r.read("Label", Label.class);
        status = r.read("Status", String.class);
        trackingId = r.read("TrackingId", String.class);
        createdDate = r.read("CreatedDate", XMLGregorianCalendar.class);
        lastUpdatedDate = r.read("LastUpdatedDate", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ShipmentId", shipmentId);
        w.write("AmazonOrderId", amazonOrderId);
        w.write("SellerOrderId", sellerOrderId);
        w.writeList("ItemList", "Item", itemList);
        w.write("ShipFromAddress", shipFromAddress);
        w.write("ShipToAddress", shipToAddress);
        w.write("PackageDimensions", packageDimensions);
        w.write("Weight", weight);
        w.write("Insurance", insurance);
        w.write("ShippingService", shippingService);
        w.write("Label", label);
        w.write("Status", status);
        w.write("TrackingId", trackingId);
        w.write("CreatedDate", createdDate);
        w.write("LastUpdatedDate", lastUpdatedDate);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Shipment",this);
    }

    /** Value constructor. */
    public Shipment(String shipmentId,String amazonOrderId,String sellerOrderId,List<Item> itemList,Address shipFromAddress,Address shipToAddress,PackageDimensions packageDimensions,Weight weight,CurrencyAmount insurance,ShippingService shippingService,Label label,String status,String trackingId,XMLGregorianCalendar createdDate,XMLGregorianCalendar lastUpdatedDate) {
        this.shipmentId = shipmentId;
        this.amazonOrderId = amazonOrderId;
        this.sellerOrderId = sellerOrderId;
        this.itemList = itemList;
        this.shipFromAddress = shipFromAddress;
        this.shipToAddress = shipToAddress;
        this.packageDimensions = packageDimensions;
        this.weight = weight;
        this.insurance = insurance;
        this.shippingService = shippingService;
        this.label = label;
        this.status = status;
        this.trackingId = trackingId;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }    
    

    /** Default constructor. */
    public Shipment() {
        super();
    }

}
