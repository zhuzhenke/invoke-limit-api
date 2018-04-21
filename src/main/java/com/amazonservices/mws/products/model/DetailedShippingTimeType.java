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
 * Detailed Shipping Time Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * DetailedShippingTimeType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DetailedShippingTimeType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="minimumHours" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *          &lt;attribute name="maximumHours" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *          &lt;attribute name="availableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *          &lt;attribute name="availabilityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DetailedShippingTimeType", propOrder={

})
@XmlRootElement(name = "DetailedShippingTimeType")
public class DetailedShippingTimeType extends AbstractMwsObject {

    @XmlAttribute
    private Long minimumHours;

    @XmlAttribute
    private Long maximumHours;

    @XmlAttribute
    private XMLGregorianCalendar availableDate;

    @XmlAttribute
    private String availabilityType;

    /**
     * Get the value of minimumHours.
     *
     * @return The value of minimumHours.
     */
    public Long getMinimumHours() {
        return minimumHours;
    }

    /**
     * Set the value of minimumHours.
     *
     * @param minimumHours
     *            The new value to set.
     */
    public void setMinimumHours(Long minimumHours) {
        this.minimumHours = minimumHours;
    }

    /**
     * Check to see if minimumHours is set.
     *
     * @return true if minimumHours is set.
     */
    public boolean isSetMinimumHours() {
        return minimumHours != null;
    }

    /**
     * Set the value of minimumHours, return this.
     *
     * @param minimumHours
     *             The new value to set.
     *
     * @return This instance.
     */
    public DetailedShippingTimeType withMinimumHours(Long minimumHours) {
        this.minimumHours = minimumHours;
        return this;
    }

    /**
     * Get the value of maximumHours.
     *
     * @return The value of maximumHours.
     */
    public Long getMaximumHours() {
        return maximumHours;
    }

    /**
     * Set the value of maximumHours.
     *
     * @param maximumHours
     *            The new value to set.
     */
    public void setMaximumHours(Long maximumHours) {
        this.maximumHours = maximumHours;
    }

    /**
     * Check to see if maximumHours is set.
     *
     * @return true if maximumHours is set.
     */
    public boolean isSetMaximumHours() {
        return maximumHours != null;
    }

    /**
     * Set the value of maximumHours, return this.
     *
     * @param maximumHours
     *             The new value to set.
     *
     * @return This instance.
     */
    public DetailedShippingTimeType withMaximumHours(Long maximumHours) {
        this.maximumHours = maximumHours;
        return this;
    }

    /**
     * Get the value of availableDate.
     *
     * @return The value of availableDate.
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Set the value of availableDate.
     *
     * @param availableDate
     *            The new value to set.
     */
    public void setAvailableDate(XMLGregorianCalendar availableDate) {
        this.availableDate = availableDate;
    }

    /**
     * Check to see if availableDate is set.
     *
     * @return true if availableDate is set.
     */
    public boolean isSetAvailableDate() {
        return availableDate != null;
    }

    /**
     * Set the value of availableDate, return this.
     *
     * @param availableDate
     *             The new value to set.
     *
     * @return This instance.
     */
    public DetailedShippingTimeType withAvailableDate(XMLGregorianCalendar availableDate) {
        this.availableDate = availableDate;
        return this;
    }

    /**
     * Get the value of availabilityType.
     *
     * @return The value of availabilityType.
     */
    public String getAvailabilityType() {
        return availabilityType;
    }

    /**
     * Set the value of availabilityType.
     *
     * @param availabilityType
     *            The new value to set.
     */
    public void setAvailabilityType(String availabilityType) {
        this.availabilityType = availabilityType;
    }

    /**
     * Check to see if availabilityType is set.
     *
     * @return true if availabilityType is set.
     */
    public boolean isSetAvailabilityType() {
        return availabilityType != null;
    }

    /**
     * Set the value of availabilityType, return this.
     *
     * @param availabilityType
     *             The new value to set.
     *
     * @return This instance.
     */
    public DetailedShippingTimeType withAvailabilityType(String availabilityType) {
        this.availabilityType = availabilityType;
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
        minimumHours = r.readAttribute("minimumHours", Long.class); 
        maximumHours = r.readAttribute("maximumHours", Long.class); 
        availableDate = r.readAttribute("availableDate", XMLGregorianCalendar.class); 
        availabilityType = r.readAttribute("availabilityType", String.class); 
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeAttribute("minimumHours",minimumHours);
        w.writeAttribute("maximumHours",maximumHours);
        w.writeAttribute("availableDate",availableDate);
        w.writeAttribute("availabilityType",availabilityType);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "DetailedShippingTimeType",this);
    }

    /** Value constructor. */
    public DetailedShippingTimeType(Long minimumHours,Long maximumHours,XMLGregorianCalendar availableDate,String availabilityType) {
        this.minimumHours = minimumHours;
        this.maximumHours = maximumHours;
        this.availableDate = availableDate;
        this.availabilityType = availabilityType;
    }    
    

    /** Default constructor. */
    public DetailedShippingTimeType() {
        super();
    }

}
