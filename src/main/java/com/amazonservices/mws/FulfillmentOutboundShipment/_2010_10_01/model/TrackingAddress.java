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
 * Tracking Address
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * TrackingAddress complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TrackingAddress"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TrackingAddress", propOrder={
    "city",
    "state",
    "country"
})
@XmlRootElement(name = "TrackingAddress")
public class TrackingAddress extends AbstractMwsObject {

    @XmlElement(name="City")
    private String city;

    @XmlElement(name="State")
    private String state;

    @XmlElement(name="Country")
    private String country;

    /**
     * Get the value of City.
     *
     * @return The value of City.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of City.
     *
     * @param city
     *            The new value to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Check to see if City is set.
     *
     * @return true if City is set.
     */
    public boolean isSetCity() {
        return city != null;
    }

    /**
     * Set the value of City, return this.
     *
     * @param city
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the value of State.
     *
     * @return The value of State.
     */
    public String getState() {
        return state;
    }

    /**
     * Set the value of State.
     *
     * @param state
     *            The new value to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Check to see if State is set.
     *
     * @return true if State is set.
     */
    public boolean isSetState() {
        return state != null;
    }

    /**
     * Set the value of State, return this.
     *
     * @param state
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingAddress withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the value of Country.
     *
     * @return The value of Country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the value of Country.
     *
     * @param country
     *            The new value to set.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Check to see if Country is set.
     *
     * @return true if Country is set.
     */
    public boolean isSetCountry() {
        return country != null;
    }

    /**
     * Set the value of Country, return this.
     *
     * @param country
     *             The new value to set.
     *
     * @return This instance.
     */
    public TrackingAddress withCountry(String country) {
        this.country = country;
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
        city = r.read("City", String.class);
        state = r.read("State", String.class);
        country = r.read("Country", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("City", city);
        w.write("State", state);
        w.write("Country", country);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "TrackingAddress",this);
    }

    /** Value constructor. */
    public TrackingAddress(String city,String state,String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }    
    

    /** Default constructor. */
    public TrackingAddress() {
        super();
    }

}
