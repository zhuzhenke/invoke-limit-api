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
 * Fulfillment Preview Shipment
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FulfillmentPreviewShipment complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FulfillmentPreviewShipment"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="EarliestShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="LatestShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="EarliestArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="LatestArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="FulfillmentPreviewItems" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentPreviewItemList"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FulfillmentPreviewShipment", propOrder={
    "earliestShipDate",
    "latestShipDate",
    "earliestArrivalDate",
    "latestArrivalDate",
    "fulfillmentPreviewItems"
})
@XmlRootElement(name = "FulfillmentPreviewShipment")
public class FulfillmentPreviewShipment extends AbstractMwsObject {

    @XmlElement(name="EarliestShipDate",required=true)
    private XMLGregorianCalendar earliestShipDate;

    @XmlElement(name="LatestShipDate",required=true)
    private XMLGregorianCalendar latestShipDate;

    @XmlElement(name="EarliestArrivalDate",required=true)
    private XMLGregorianCalendar earliestArrivalDate;

    @XmlElement(name="LatestArrivalDate",required=true)
    private XMLGregorianCalendar latestArrivalDate;

    @XmlElement(name="FulfillmentPreviewItems",required=true)
    private FulfillmentPreviewItemList fulfillmentPreviewItems;

    /**
     * Get the value of EarliestShipDate.
     *
     * @return The value of EarliestShipDate.
     */
    public XMLGregorianCalendar getEarliestShipDate() {
        return earliestShipDate;
    }

    /**
     * Set the value of EarliestShipDate.
     *
     * @param earliestShipDate
     *            The new value to set.
     */
    public void setEarliestShipDate(XMLGregorianCalendar earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    /**
     * Check to see if EarliestShipDate is set.
     *
     * @return true if EarliestShipDate is set.
     */
    public boolean isSetEarliestShipDate() {
        return earliestShipDate != null;
    }

    /**
     * Set the value of EarliestShipDate, return this.
     *
     * @param earliestShipDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewShipment withEarliestShipDate(XMLGregorianCalendar earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
        return this;
    }

    /**
     * Get the value of LatestShipDate.
     *
     * @return The value of LatestShipDate.
     */
    public XMLGregorianCalendar getLatestShipDate() {
        return latestShipDate;
    }

    /**
     * Set the value of LatestShipDate.
     *
     * @param latestShipDate
     *            The new value to set.
     */
    public void setLatestShipDate(XMLGregorianCalendar latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    /**
     * Check to see if LatestShipDate is set.
     *
     * @return true if LatestShipDate is set.
     */
    public boolean isSetLatestShipDate() {
        return latestShipDate != null;
    }

    /**
     * Set the value of LatestShipDate, return this.
     *
     * @param latestShipDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewShipment withLatestShipDate(XMLGregorianCalendar latestShipDate) {
        this.latestShipDate = latestShipDate;
        return this;
    }

    /**
     * Get the value of EarliestArrivalDate.
     *
     * @return The value of EarliestArrivalDate.
     */
    public XMLGregorianCalendar getEarliestArrivalDate() {
        return earliestArrivalDate;
    }

    /**
     * Set the value of EarliestArrivalDate.
     *
     * @param earliestArrivalDate
     *            The new value to set.
     */
    public void setEarliestArrivalDate(XMLGregorianCalendar earliestArrivalDate) {
        this.earliestArrivalDate = earliestArrivalDate;
    }

    /**
     * Check to see if EarliestArrivalDate is set.
     *
     * @return true if EarliestArrivalDate is set.
     */
    public boolean isSetEarliestArrivalDate() {
        return earliestArrivalDate != null;
    }

    /**
     * Set the value of EarliestArrivalDate, return this.
     *
     * @param earliestArrivalDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewShipment withEarliestArrivalDate(XMLGregorianCalendar earliestArrivalDate) {
        this.earliestArrivalDate = earliestArrivalDate;
        return this;
    }

    /**
     * Get the value of LatestArrivalDate.
     *
     * @return The value of LatestArrivalDate.
     */
    public XMLGregorianCalendar getLatestArrivalDate() {
        return latestArrivalDate;
    }

    /**
     * Set the value of LatestArrivalDate.
     *
     * @param latestArrivalDate
     *            The new value to set.
     */
    public void setLatestArrivalDate(XMLGregorianCalendar latestArrivalDate) {
        this.latestArrivalDate = latestArrivalDate;
    }

    /**
     * Check to see if LatestArrivalDate is set.
     *
     * @return true if LatestArrivalDate is set.
     */
    public boolean isSetLatestArrivalDate() {
        return latestArrivalDate != null;
    }

    /**
     * Set the value of LatestArrivalDate, return this.
     *
     * @param latestArrivalDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewShipment withLatestArrivalDate(XMLGregorianCalendar latestArrivalDate) {
        this.latestArrivalDate = latestArrivalDate;
        return this;
    }

    /**
     * Get the value of FulfillmentPreviewItems.
     *
     * @return The value of FulfillmentPreviewItems.
     */
    public FulfillmentPreviewItemList getFulfillmentPreviewItems() {
        return fulfillmentPreviewItems;
    }

    /**
     * Set the value of FulfillmentPreviewItems.
     *
     * @param fulfillmentPreviewItems
     *            The new value to set.
     */
    public void setFulfillmentPreviewItems(FulfillmentPreviewItemList fulfillmentPreviewItems) {
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
    }

    /**
     * Check to see if FulfillmentPreviewItems is set.
     *
     * @return true if FulfillmentPreviewItems is set.
     */
    public boolean isSetFulfillmentPreviewItems() {
        return fulfillmentPreviewItems != null;
    }

    /**
     * Set the value of FulfillmentPreviewItems, return this.
     *
     * @param fulfillmentPreviewItems
     *             The new value to set.
     *
     * @return This instance.
     */
    public FulfillmentPreviewShipment withFulfillmentPreviewItems(FulfillmentPreviewItemList fulfillmentPreviewItems) {
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
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
        earliestShipDate = r.read("EarliestShipDate", XMLGregorianCalendar.class);
        latestShipDate = r.read("LatestShipDate", XMLGregorianCalendar.class);
        earliestArrivalDate = r.read("EarliestArrivalDate", XMLGregorianCalendar.class);
        latestArrivalDate = r.read("LatestArrivalDate", XMLGregorianCalendar.class);
        fulfillmentPreviewItems = r.read("FulfillmentPreviewItems", FulfillmentPreviewItemList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("EarliestShipDate", earliestShipDate);
        w.write("LatestShipDate", latestShipDate);
        w.write("EarliestArrivalDate", earliestArrivalDate);
        w.write("LatestArrivalDate", latestArrivalDate);
        w.write("FulfillmentPreviewItems", fulfillmentPreviewItems);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "FulfillmentPreviewShipment",this);
    }

    /** Value constructor. */
    public FulfillmentPreviewShipment(XMLGregorianCalendar earliestShipDate,XMLGregorianCalendar latestShipDate,XMLGregorianCalendar earliestArrivalDate,XMLGregorianCalendar latestArrivalDate,FulfillmentPreviewItemList fulfillmentPreviewItems) {
        this.earliestShipDate = earliestShipDate;
        this.latestShipDate = latestShipDate;
        this.earliestArrivalDate = earliestArrivalDate;
        this.latestArrivalDate = latestArrivalDate;
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
    }    
    

    /** Default constructor. */
    public FulfillmentPreviewShipment() {
        super();
    }

}
