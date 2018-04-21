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
 * Timepoint
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory._2010_10_01.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Timepoint complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Timepoint"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TimepointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Timepoint", propOrder={
    "timepointType",
    "dateTime"
})
@XmlRootElement(name = "Timepoint")
public class Timepoint extends AbstractMwsObject {

    @XmlElement(name="TimepointType",required=true)
    private String timepointType;

    @XmlElement(name="DateTime")
    private XMLGregorianCalendar dateTime;

    /**
     * Get the value of TimepointType.
     *
     * @return The value of TimepointType.
     */
    public String getTimepointType() {
        return timepointType;
    }

    /**
     * Set the value of TimepointType.
     *
     * @param timepointType
     *            The new value to set.
     */
    public void setTimepointType(String timepointType) {
        this.timepointType = timepointType;
    }

    /**
     * Check to see if TimepointType is set.
     *
     * @return true if TimepointType is set.
     */
    public boolean isSetTimepointType() {
        return timepointType != null;
    }

    /**
     * Set the value of TimepointType, return this.
     *
     * @param timepointType
     *             The new value to set.
     *
     * @return This instance.
     */
    public Timepoint withTimepointType(String timepointType) {
        this.timepointType = timepointType;
        return this;
    }

    /**
     * Get the value of DateTime.
     *
     * @return The value of DateTime.
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Set the value of DateTime.
     *
     * @param dateTime
     *            The new value to set.
     */
    public void setDateTime(XMLGregorianCalendar dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Check to see if DateTime is set.
     *
     * @return true if DateTime is set.
     */
    public boolean isSetDateTime() {
        return dateTime != null;
    }

    /**
     * Set the value of DateTime, return this.
     *
     * @param dateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public Timepoint withDateTime(XMLGregorianCalendar dateTime) {
        this.dateTime = dateTime;
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
        timepointType = r.read("TimepointType", String.class);
        dateTime = r.read("DateTime", XMLGregorianCalendar.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TimepointType", timepointType);
        w.write("DateTime", dateTime);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "Timepoint",this);
    }

    /** Value constructor. */
    public Timepoint(String timepointType,XMLGregorianCalendar dateTime) {
        this.timepointType = timepointType;
        this.dateTime = dateTime;
    }    
    

    /** Default constructor. */
    public Timepoint() {
        super();
    }

}
