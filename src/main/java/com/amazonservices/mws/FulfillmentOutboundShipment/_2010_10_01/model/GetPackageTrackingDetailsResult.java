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
 * Get Package Tracking Details Result
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetPackageTrackingDetailsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPackageTrackingDetailsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CarrierPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="CarrierURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="ShipToAddress" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}TrackingAddress" minOccurs="0"/&gt;
 *             &lt;element name="CurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="SignedForBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AdditionalLocationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="TrackingEvents" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}TrackingEventList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPackageTrackingDetailsResult", propOrder={
    "packageNumber",
    "trackingNumber",
    "carrierCode",
    "carrierPhoneNumber",
    "carrierURL",
    "shipDate",
    "estimatedArrivalDate",
    "shipToAddress",
    "currentStatus",
    "signedForBy",
    "additionalLocationInfo",
    "trackingEvents"
})
@XmlRootElement(name = "GetPackageTrackingDetailsResult")
public class GetPackageTrackingDetailsResult extends AbstractMwsObject {

    @XmlElement(name="PackageNumber",required=true)
    private int packageNumber;

    @XmlElement(name="TrackingNumber")
    private String trackingNumber;

    @XmlElement(name="CarrierCode")
    private String carrierCode;

    @XmlElement(name="CarrierPhoneNumber")
    private String carrierPhoneNumber;

    @XmlElement(name="CarrierURL")
    private String carrierURL;

    @XmlElement(name="ShipDate")
    private XMLGregorianCalendar shipDate;

    @XmlElement(name="EstimatedArrivalDate")
    private XMLGregorianCalendar estimatedArrivalDate;

    @XmlElement(name="ShipToAddress")
    private TrackingAddress shipToAddress;

    @XmlElement(name="CurrentStatus")
    private String currentStatus;

    @XmlElement(name="SignedForBy")
    private String signedForBy;

    @XmlElement(name="AdditionalLocationInfo")
    private String additionalLocationInfo;

    @XmlElement(name="TrackingEvents")
    private TrackingEventList trackingEvents;

    /**
     * Get the value of PackageNumber.
     *
     * @return The value of PackageNumber.
     */
    public int getPackageNumber() {
        return packageNumber;
    }

    /**
     * Set the value of PackageNumber.
     *
     * @param packageNumber
     *            The new value to set.
     */
    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public boolean isSetPackageNumber() {
        return true;
    }

    /**
     * Set the value of PackageNumber, return this.
     *
     * @param packageNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
        return this;
    }

    /**
     * Get the value of TrackingNumber.
     *
     * @return The value of TrackingNumber.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Set the value of TrackingNumber.
     *
     * @param trackingNumber
     *            The new value to set.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * Check to see if TrackingNumber is set.
     *
     * @return true if TrackingNumber is set.
     */
    public boolean isSetTrackingNumber() {
        return trackingNumber != null;
    }

    /**
     * Set the value of TrackingNumber, return this.
     *
     * @param trackingNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * Get the value of CarrierCode.
     *
     * @return The value of CarrierCode.
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Set the value of CarrierCode.
     *
     * @param carrierCode
     *            The new value to set.
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /**
     * Check to see if CarrierCode is set.
     *
     * @return true if CarrierCode is set.
     */
    public boolean isSetCarrierCode() {
        return carrierCode != null;
    }

    /**
     * Set the value of CarrierCode, return this.
     *
     * @param carrierCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    /**
     * Get the value of CarrierPhoneNumber.
     *
     * @return The value of CarrierPhoneNumber.
     */
    public String getCarrierPhoneNumber() {
        return carrierPhoneNumber;
    }

    /**
     * Set the value of CarrierPhoneNumber.
     *
     * @param carrierPhoneNumber
     *            The new value to set.
     */
    public void setCarrierPhoneNumber(String carrierPhoneNumber) {
        this.carrierPhoneNumber = carrierPhoneNumber;
    }

    /**
     * Check to see if CarrierPhoneNumber is set.
     *
     * @return true if CarrierPhoneNumber is set.
     */
    public boolean isSetCarrierPhoneNumber() {
        return carrierPhoneNumber != null;
    }

    /**
     * Set the value of CarrierPhoneNumber, return this.
     *
     * @param carrierPhoneNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withCarrierPhoneNumber(String carrierPhoneNumber) {
        this.carrierPhoneNumber = carrierPhoneNumber;
        return this;
    }

    /**
     * Get the value of CarrierURL.
     *
     * @return The value of CarrierURL.
     */
    public String getCarrierURL() {
        return carrierURL;
    }

    /**
     * Set the value of CarrierURL.
     *
     * @param carrierURL
     *            The new value to set.
     */
    public void setCarrierURL(String carrierURL) {
        this.carrierURL = carrierURL;
    }

    /**
     * Check to see if CarrierURL is set.
     *
     * @return true if CarrierURL is set.
     */
    public boolean isSetCarrierURL() {
        return carrierURL != null;
    }

    /**
     * Set the value of CarrierURL, return this.
     *
     * @param carrierURL
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withCarrierURL(String carrierURL) {
        this.carrierURL = carrierURL;
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
    public GetPackageTrackingDetailsResult withShipDate(XMLGregorianCalendar shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get the value of EstimatedArrivalDate.
     *
     * @return The value of EstimatedArrivalDate.
     */
    public XMLGregorianCalendar getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    /**
     * Set the value of EstimatedArrivalDate.
     *
     * @param estimatedArrivalDate
     *            The new value to set.
     */
    public void setEstimatedArrivalDate(XMLGregorianCalendar estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    /**
     * Check to see if EstimatedArrivalDate is set.
     *
     * @return true if EstimatedArrivalDate is set.
     */
    public boolean isSetEstimatedArrivalDate() {
        return estimatedArrivalDate != null;
    }

    /**
     * Set the value of EstimatedArrivalDate, return this.
     *
     * @param estimatedArrivalDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withEstimatedArrivalDate(XMLGregorianCalendar estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
        return this;
    }

    /**
     * Get the value of ShipToAddress.
     *
     * @return The value of ShipToAddress.
     */
    public TrackingAddress getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Set the value of ShipToAddress.
     *
     * @param shipToAddress
     *            The new value to set.
     */
    public void setShipToAddress(TrackingAddress shipToAddress) {
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
    public GetPackageTrackingDetailsResult withShipToAddress(TrackingAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * Get the value of CurrentStatus.
     *
     * @return The value of CurrentStatus.
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Set the value of CurrentStatus.
     *
     * @param currentStatus
     *            The new value to set.
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * Check to see if CurrentStatus is set.
     *
     * @return true if CurrentStatus is set.
     */
    public boolean isSetCurrentStatus() {
        return currentStatus != null;
    }

    /**
     * Set the value of CurrentStatus, return this.
     *
     * @param currentStatus
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    /**
     * Get the value of SignedForBy.
     *
     * @return The value of SignedForBy.
     */
    public String getSignedForBy() {
        return signedForBy;
    }

    /**
     * Set the value of SignedForBy.
     *
     * @param signedForBy
     *            The new value to set.
     */
    public void setSignedForBy(String signedForBy) {
        this.signedForBy = signedForBy;
    }

    /**
     * Check to see if SignedForBy is set.
     *
     * @return true if SignedForBy is set.
     */
    public boolean isSetSignedForBy() {
        return signedForBy != null;
    }

    /**
     * Set the value of SignedForBy, return this.
     *
     * @param signedForBy
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withSignedForBy(String signedForBy) {
        this.signedForBy = signedForBy;
        return this;
    }

    /**
     * Get the value of AdditionalLocationInfo.
     *
     * @return The value of AdditionalLocationInfo.
     */
    public String getAdditionalLocationInfo() {
        return additionalLocationInfo;
    }

    /**
     * Set the value of AdditionalLocationInfo.
     *
     * @param additionalLocationInfo
     *            The new value to set.
     */
    public void setAdditionalLocationInfo(String additionalLocationInfo) {
        this.additionalLocationInfo = additionalLocationInfo;
    }

    /**
     * Check to see if AdditionalLocationInfo is set.
     *
     * @return true if AdditionalLocationInfo is set.
     */
    public boolean isSetAdditionalLocationInfo() {
        return additionalLocationInfo != null;
    }

    /**
     * Set the value of AdditionalLocationInfo, return this.
     *
     * @param additionalLocationInfo
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withAdditionalLocationInfo(String additionalLocationInfo) {
        this.additionalLocationInfo = additionalLocationInfo;
        return this;
    }

    /**
     * Get the value of TrackingEvents.
     *
     * @return The value of TrackingEvents.
     */
    public TrackingEventList getTrackingEvents() {
        return trackingEvents;
    }

    /**
     * Set the value of TrackingEvents.
     *
     * @param trackingEvents
     *            The new value to set.
     */
    public void setTrackingEvents(TrackingEventList trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    /**
     * Check to see if TrackingEvents is set.
     *
     * @return true if TrackingEvents is set.
     */
    public boolean isSetTrackingEvents() {
        return trackingEvents != null;
    }

    /**
     * Set the value of TrackingEvents, return this.
     *
     * @param trackingEvents
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPackageTrackingDetailsResult withTrackingEvents(TrackingEventList trackingEvents) {
        this.trackingEvents = trackingEvents;
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
        packageNumber = r.read("PackageNumber", int.class);
        trackingNumber = r.read("TrackingNumber", String.class);
        carrierCode = r.read("CarrierCode", String.class);
        carrierPhoneNumber = r.read("CarrierPhoneNumber", String.class);
        carrierURL = r.read("CarrierURL", String.class);
        shipDate = r.read("ShipDate", XMLGregorianCalendar.class);
        estimatedArrivalDate = r.read("EstimatedArrivalDate", XMLGregorianCalendar.class);
        shipToAddress = r.read("ShipToAddress", TrackingAddress.class);
        currentStatus = r.read("CurrentStatus", String.class);
        signedForBy = r.read("SignedForBy", String.class);
        additionalLocationInfo = r.read("AdditionalLocationInfo", String.class);
        trackingEvents = r.read("TrackingEvents", TrackingEventList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PackageNumber", packageNumber);
        w.write("TrackingNumber", trackingNumber);
        w.write("CarrierCode", carrierCode);
        w.write("CarrierPhoneNumber", carrierPhoneNumber);
        w.write("CarrierURL", carrierURL);
        w.write("ShipDate", shipDate);
        w.write("EstimatedArrivalDate", estimatedArrivalDate);
        w.write("ShipToAddress", shipToAddress);
        w.write("CurrentStatus", currentStatus);
        w.write("SignedForBy", signedForBy);
        w.write("AdditionalLocationInfo", additionalLocationInfo);
        w.write("TrackingEvents", trackingEvents);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "GetPackageTrackingDetailsResult",this);
    }

    /** Value constructor. */
    public GetPackageTrackingDetailsResult(int packageNumber,String trackingNumber,String carrierCode,String carrierPhoneNumber,String carrierURL,XMLGregorianCalendar shipDate,XMLGregorianCalendar estimatedArrivalDate,TrackingAddress shipToAddress,String currentStatus,String signedForBy,String additionalLocationInfo,TrackingEventList trackingEvents) {
        this.packageNumber = packageNumber;
        this.trackingNumber = trackingNumber;
        this.carrierCode = carrierCode;
        this.carrierPhoneNumber = carrierPhoneNumber;
        this.carrierURL = carrierURL;
        this.shipDate = shipDate;
        this.estimatedArrivalDate = estimatedArrivalDate;
        this.shipToAddress = shipToAddress;
        this.currentStatus = currentStatus;
        this.signedForBy = signedForBy;
        this.additionalLocationInfo = additionalLocationInfo;
        this.trackingEvents = trackingEvents;
    }    
    

    /** Default constructor. */
    public GetPackageTrackingDetailsResult() {
        super();
    }

}
