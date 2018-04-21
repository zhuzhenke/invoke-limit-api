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
 * Fulfillment Shipment Package
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentShipmentPackage complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentShipmentPackage"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="EstimatedArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentShipmentPackage", propOrder={
    "packageNumber",
    "carrierCode",
    "trackingNumber",
    "estimatedArrivalDateTime"
})
@XmlRootElement(name = "FulfillmentShipmentPackage")
public class FulfillmentShipmentPackage extends AbstractMwsObject {

    @XmlElement(name="PackageNumber",required=true)
    private int packageNumber;

    @XmlElement(name="CarrierCode",required=true)
    private String carrierCode;

    @XmlElement(name="TrackingNumber")
    private String trackingNumber;

    @XmlElement(name="EstimatedArrivalDateTime")
    private XMLGregorianCalendar estimatedArrivalDateTime;

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
    public FulfillmentShipmentPackage withPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
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
    public FulfillmentShipmentPackage withCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
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
    public FulfillmentShipmentPackage withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * Get the value of EstimatedArrivalDateTime.
     *
     * @return The value of EstimatedArrivalDateTime.
     */
    public XMLGregorianCalendar getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }

    /**
     * Set the value of EstimatedArrivalDateTime.
     *
     * @param estimatedArrivalDateTime
     *            The new value to set.
     */
    public void setEstimatedArrivalDateTime(XMLGregorianCalendar estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }

    /**
     * Check to see if EstimatedArrivalDateTime is set.
     *
     * @return true if EstimatedArrivalDateTime is set.
     */
    public boolean isSetEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime != null;
    }

    /**
     * Set the value of EstimatedArrivalDateTime, return this.
     *
     * @param estimatedArrivalDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentShipmentPackage withEstimatedArrivalDateTime(XMLGregorianCalendar estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
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
        carrierCode = r.read("CarrierCode", String.class);
        trackingNumber = r.read("TrackingNumber", String.class);
        estimatedArrivalDateTime = r.read("EstimatedArrivalDateTime", XMLGregorianCalendar.class);
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
        w.write("CarrierCode", carrierCode);
        w.write("TrackingNumber", trackingNumber);
        w.write("EstimatedArrivalDateTime", estimatedArrivalDateTime);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentShipmentPackage",this);
    }

    /** Value constructor. */
    public FulfillmentShipmentPackage(int packageNumber,String carrierCode,String trackingNumber,XMLGregorianCalendar estimatedArrivalDateTime) {
        this.packageNumber = packageNumber;
        this.carrierCode = carrierCode;
        this.trackingNumber = trackingNumber;
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }    
    

    /** Default constructor. */
    public FulfillmentShipmentPackage() {
        super();
    }

}
