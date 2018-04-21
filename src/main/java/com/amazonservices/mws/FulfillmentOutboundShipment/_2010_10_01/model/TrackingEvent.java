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
 * Tracking Event
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * TrackingEvent complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TrackingEvent"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="EventAddress" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}TrackingAddress" minOccurs="0"/&gt;
 *             &lt;element name="EventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TrackingEvent", propOrder={
    "eventDate",
    "eventAddress",
    "eventCode"
})
@XmlRootElement(name = "TrackingEvent")
public class TrackingEvent extends AbstractMwsObject {

    @XmlElement(name="EventDate")
    private XMLGregorianCalendar eventDate;

    @XmlElement(name="EventAddress")
    private TrackingAddress eventAddress;

    @XmlElement(name="EventCode")
    private String eventCode;

    /**
     * Get the value of EventDate.
     *
     * @return The value of EventDate.
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Set the value of EventDate.
     *
     * @param eventDate
     *            The new value to set.
     */
    public void setEventDate(XMLGregorianCalendar eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * Check to see if EventDate is set.
     *
     * @return true if EventDate is set.
     */
    public boolean isSetEventDate() {
        return eventDate != null;
    }

    /**
     * Set the value of EventDate, return this.
     *
     * @param eventDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingEvent withEventDate(XMLGregorianCalendar eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * Get the value of EventAddress.
     *
     * @return The value of EventAddress.
     */
    public TrackingAddress getEventAddress() {
        return eventAddress;
    }

    /**
     * Set the value of EventAddress.
     *
     * @param eventAddress
     *            The new value to set.
     */
    public void setEventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
    }

    /**
     * Check to see if EventAddress is set.
     *
     * @return true if EventAddress is set.
     */
    public boolean isSetEventAddress() {
        return eventAddress != null;
    }

    /**
     * Set the value of EventAddress, return this.
     *
     * @param eventAddress
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingEvent withEventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
        return this;
    }

    /**
     * Get the value of EventCode.
     *
     * @return The value of EventCode.
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Set the value of EventCode.
     *
     * @param eventCode
     *            The new value to set.
     */
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * Check to see if EventCode is set.
     *
     * @return true if EventCode is set.
     */
    public boolean isSetEventCode() {
        return eventCode != null;
    }

    /**
     * Set the value of EventCode, return this.
     *
     * @param eventCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingEvent withEventCode(String eventCode) {
        this.eventCode = eventCode;
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
        eventDate = r.read("EventDate", XMLGregorianCalendar.class);
        eventAddress = r.read("EventAddress", TrackingAddress.class);
        eventCode = r.read("EventCode", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("EventDate", eventDate);
        w.write("EventAddress", eventAddress);
        w.write("EventCode", eventCode);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "TrackingEvent",this);
    }

    /** Value constructor. */
    public TrackingEvent(XMLGregorianCalendar eventDate,TrackingAddress eventAddress,String eventCode) {
        this.eventDate = eventDate;
        this.eventAddress = eventAddress;
        this.eventCode = eventCode;
    }    
    

    /** Default constructor. */
    public TrackingEvent() {
        super();
    }

}
