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
 * Delivery Window
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * DeliveryWindow complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DeliveryWindow"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DeliveryWindow", propOrder={
    "startDateTime",
    "endDateTime"
})
@XmlRootElement(name = "DeliveryWindow")
public class DeliveryWindow extends AbstractMwsObject {

    @XmlElement(name="StartDateTime",required=true)
    private XMLGregorianCalendar startDateTime;

    @XmlElement(name="EndDateTime",required=true)
    private XMLGregorianCalendar endDateTime;

    /**
     * Get the value of StartDateTime.
     *
     * @return The value of StartDateTime.
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Set the value of StartDateTime.
     *
     * @param startDateTime
     *            The new value to set.
     */
    public void setStartDateTime(XMLGregorianCalendar startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * Check to see if StartDateTime is set.
     *
     * @return true if StartDateTime is set.
     */
    public boolean isSetStartDateTime() {
        return startDateTime != null;
    }

    /**
     * Set the value of StartDateTime, return this.
     *
     * @param startDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public DeliveryWindow withStartDateTime(XMLGregorianCalendar startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the value of EndDateTime.
     *
     * @return The value of EndDateTime.
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Set the value of EndDateTime.
     *
     * @param endDateTime
     *            The new value to set.
     */
    public void setEndDateTime(XMLGregorianCalendar endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * Check to see if EndDateTime is set.
     *
     * @return true if EndDateTime is set.
     */
    public boolean isSetEndDateTime() {
        return endDateTime != null;
    }

    /**
     * Set the value of EndDateTime, return this.
     *
     * @param endDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public DeliveryWindow withEndDateTime(XMLGregorianCalendar endDateTime) {
        this.endDateTime = endDateTime;
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
        startDateTime = r.read("StartDateTime", XMLGregorianCalendar.class);
        endDateTime = r.read("EndDateTime", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("StartDateTime", startDateTime);
        w.write("EndDateTime", endDateTime);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "DeliveryWindow",this);
    }

    /** Value constructor. */
    public DeliveryWindow(XMLGregorianCalendar startDateTime,XMLGregorianCalendar endDateTime) {
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }    
    

    /** Default constructor. */
    public DeliveryWindow() {
        super();
    }

}
