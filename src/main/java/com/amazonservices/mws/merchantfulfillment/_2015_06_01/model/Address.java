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
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

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
 *             &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DistrictOrCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Address extends AbstractMwsObject {

    private String name;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String districtOrCounty;

    private String email;

    private String city;

    private String stateOrProvinceCode;

    private String postalCode;

    private String countryCode;

    private String phone;

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
     * Get the value of AddressLine1.
     *
     * @return The value of AddressLine1.
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Set the value of AddressLine1.
     *
     * @param addressLine1
     *            The new value to set.
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Check to see if AddressLine1 is set.
     *
     * @return true if AddressLine1 is set.
     */
    public boolean isSetAddressLine1() {
        return addressLine1 != null;
    }

    /**
     * Set the value of AddressLine1, return this.
     *
     * @param addressLine1
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the value of AddressLine2.
     *
     * @return The value of AddressLine2.
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Set the value of AddressLine2.
     *
     * @param addressLine2
     *            The new value to set.
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Check to see if AddressLine2 is set.
     *
     * @return true if AddressLine2 is set.
     */
    public boolean isSetAddressLine2() {
        return addressLine2 != null;
    }

    /**
     * Set the value of AddressLine2, return this.
     *
     * @param addressLine2
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the value of AddressLine3.
     *
     * @return The value of AddressLine3.
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Set the value of AddressLine3.
     *
     * @param addressLine3
     *            The new value to set.
     */
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * Check to see if AddressLine3 is set.
     *
     * @return true if AddressLine3 is set.
     */
    public boolean isSetAddressLine3() {
        return addressLine3 != null;
    }

    /**
     * Set the value of AddressLine3, return this.
     *
     * @param addressLine3
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
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
     * Get the value of Email.
     *
     * @return The value of Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of Email.
     *
     * @param email
     *            The new value to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Check to see if Email is set.
     *
     * @return true if Email is set.
     */
    public boolean isSetEmail() {
        return email != null;
    }

    /**
     * Set the value of Email, return this.
     *
     * @param email
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withEmail(String email) {
        this.email = email;
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
     * Get the value of Phone.
     *
     * @return The value of Phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of Phone.
     *
     * @param phone
     *            The new value to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Check to see if Phone is set.
     *
     * @return true if Phone is set.
     */
    public boolean isSetPhone() {
        return phone != null;
    }

    /**
     * Set the value of Phone, return this.
     *
     * @param phone
     *             The new value to set.
     *
     * @return This instance.
     */
    public Address withPhone(String phone) {
        this.phone = phone;
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
        addressLine1 = r.read("AddressLine1", String.class);
        addressLine2 = r.read("AddressLine2", String.class);
        addressLine3 = r.read("AddressLine3", String.class);
        districtOrCounty = r.read("DistrictOrCounty", String.class);
        email = r.read("Email", String.class);
        city = r.read("City", String.class);
        stateOrProvinceCode = r.read("StateOrProvinceCode", String.class);
        postalCode = r.read("PostalCode", String.class);
        countryCode = r.read("CountryCode", String.class);
        phone = r.read("Phone", String.class);
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
        w.write("AddressLine1", addressLine1);
        w.write("AddressLine2", addressLine2);
        w.write("AddressLine3", addressLine3);
        w.write("DistrictOrCounty", districtOrCounty);
        w.write("Email", email);
        w.write("City", city);
        w.write("StateOrProvinceCode", stateOrProvinceCode);
        w.write("PostalCode", postalCode);
        w.write("CountryCode", countryCode);
        w.write("Phone", phone);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Address",this);
    }

    /** Value constructor. */
    public Address(String name,String addressLine1,String addressLine2,String addressLine3,String districtOrCounty,String email,String city,String stateOrProvinceCode,String postalCode,String countryCode,String phone) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.districtOrCounty = districtOrCounty;
        this.email = email;
        this.city = city;
        this.stateOrProvinceCode = stateOrProvinceCode;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.phone = phone;
    }    
    

    /** Default constructor. */
    public Address() {
        super();
    }

}
