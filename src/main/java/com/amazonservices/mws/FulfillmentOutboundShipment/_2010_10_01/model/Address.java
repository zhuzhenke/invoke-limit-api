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
 * Address
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Address complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Address"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DistrictOrCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Address", propOrder={
    "name",
    "line1",
    "line2",
    "line3",
    "districtOrCounty",
    "city",
    "stateOrProvinceCode",
    "countryCode",
    "postalCode",
    "phoneNumber"
})
@XmlRootElement(name = "Address")
public class Address extends AbstractMwsObject {

    @XmlElement(name="Name",required=true)
    private String name;

    @XmlElement(name="Line1",required=true)
    private String line1;

    @XmlElement(name="Line2")
    private String line2;

    @XmlElement(name="Line3")
    private String line3;

    @XmlElement(name="DistrictOrCounty")
    private String districtOrCounty;

    @XmlElement(name="City")
    private String city;

    @XmlElement(name="StateOrProvinceCode",required=true)
    private String stateOrProvinceCode;

    @XmlElement(name="CountryCode",required=true)
    private String countryCode;

    @XmlElement(name="PostalCode")
    private String postalCode;

    @XmlElement(name="PhoneNumber")
    private String phoneNumber;

    /**
     * Get the value of Name.
     *
     * @return The value of Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of Name.
     *
     * @param name
     *            The new value to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Check to see if Name is set.
     *
     * @return true if Name is set.
     */
    public boolean isSetName() {
        return name != null;
    }

    /**
     * Set the value of Name, return this.
     *
     * @param name
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of Line1.
     *
     * @return The value of Line1.
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Set the value of Line1.
     *
     * @param line1
     *            The new value to set.
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Check to see if Line1 is set.
     *
     * @return true if Line1 is set.
     */
    public boolean isSetLine1() {
        return line1 != null;
    }

    /**
     * Set the value of Line1, return this.
     *
     * @param line1
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * Get the value of Line2.
     *
     * @return The value of Line2.
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Set the value of Line2.
     *
     * @param line2
     *            The new value to set.
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * Check to see if Line2 is set.
     *
     * @return true if Line2 is set.
     */
    public boolean isSetLine2() {
        return line2 != null;
    }

    /**
     * Set the value of Line2, return this.
     *
     * @param line2
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * Get the value of Line3.
     *
     * @return The value of Line3.
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Set the value of Line3.
     *
     * @param line3
     *            The new value to set.
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    /**
     * Check to see if Line3 is set.
     *
     * @return true if Line3 is set.
     */
    public boolean isSetLine3() {
        return line3 != null;
    }

    /**
     * Set the value of Line3, return this.
     *
     * @param line3
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withLine3(String line3) {
        this.line3 = line3;
        return this;
    }

    /**
     * Get the value of DistrictOrCounty.
     *
     * @return The value of DistrictOrCounty.
     */
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }

    /**
     * Set the value of DistrictOrCounty.
     *
     * @param districtOrCounty
     *            The new value to set.
     */
    public void setDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
    }

    /**
     * Check to see if DistrictOrCounty is set.
     *
     * @return true if DistrictOrCounty is set.
     */
    public boolean isSetDistrictOrCounty() {
        return districtOrCounty != null;
    }

    /**
     * Set the value of DistrictOrCounty, return this.
     *
     * @param districtOrCounty
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
        return this;
    }

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
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the value of StateOrProvinceCode.
     *
     * @return The value of StateOrProvinceCode.
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Set the value of StateOrProvinceCode.
     *
     * @param stateOrProvinceCode
     *            The new value to set.
     */
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    /**
     * Check to see if StateOrProvinceCode is set.
     *
     * @return true if StateOrProvinceCode is set.
     */
    public boolean isSetStateOrProvinceCode() {
        return stateOrProvinceCode != null;
    }

    /**
     * Set the value of StateOrProvinceCode, return this.
     *
     * @param stateOrProvinceCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
        return this;
    }

    /**
     * Get the value of CountryCode.
     *
     * @return The value of CountryCode.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Set the value of CountryCode.
     *
     * @param countryCode
     *            The new value to set.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Check to see if CountryCode is set.
     *
     * @return true if CountryCode is set.
     */
    public boolean isSetCountryCode() {
        return countryCode != null;
    }

    /**
     * Set the value of CountryCode, return this.
     *
     * @param countryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the value of PostalCode.
     *
     * @return The value of PostalCode.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set the value of PostalCode.
     *
     * @param postalCode
     *            The new value to set.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Check to see if PostalCode is set.
     *
     * @return true if PostalCode is set.
     */
    public boolean isSetPostalCode() {
        return postalCode != null;
    }

    /**
     * Set the value of PostalCode, return this.
     *
     * @param postalCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the value of PhoneNumber.
     *
     * @return The value of PhoneNumber.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of PhoneNumber.
     *
     * @param phoneNumber
     *            The new value to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Check to see if PhoneNumber is set.
     *
     * @return true if PhoneNumber is set.
     */
    public boolean isSetPhoneNumber() {
        return phoneNumber != null;
    }

    /**
     * Set the value of PhoneNumber, return this.
     *
     * @param phoneNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        name = r.read("Name", String.class);
        line1 = r.read("Line1", String.class);
        line2 = r.read("Line2", String.class);
        line3 = r.read("Line3", String.class);
        districtOrCounty = r.read("DistrictOrCounty", String.class);
        city = r.read("City", String.class);
        stateOrProvinceCode = r.read("StateOrProvinceCode", String.class);
        countryCode = r.read("CountryCode", String.class);
        postalCode = r.read("PostalCode", String.class);
        phoneNumber = r.read("PhoneNumber", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Name", name);
        w.write("Line1", line1);
        w.write("Line2", line2);
        w.write("Line3", line3);
        w.write("DistrictOrCounty", districtOrCounty);
        w.write("City", city);
        w.write("StateOrProvinceCode", stateOrProvinceCode);
        w.write("CountryCode", countryCode);
        w.write("PostalCode", postalCode);
        w.write("PhoneNumber", phoneNumber);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "Address",this);
    }

    /** Value constructor. */
    public Address(String name,String line1,String line2,String line3,String districtOrCounty,String city,String stateOrProvinceCode,String countryCode,String postalCode,String phoneNumber) {
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.districtOrCounty = districtOrCounty;
        this.city = city;
        this.stateOrProvinceCode = stateOrProvinceCode;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }    
    

    /** Default constructor. */
    public Address() {
        super();
    }

}
