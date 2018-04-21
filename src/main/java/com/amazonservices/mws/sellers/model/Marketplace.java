/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Marketplace complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Marketplace"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DefaultCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DefaultCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DefaultLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Marketplace", propOrder={
    "marketplaceId",
    "name",
    "defaultCountryCode",
    "defaultCurrencyCode",
    "defaultLanguageCode",
    "domainName"
})
@XmlRootElement(name = "Marketplace")
public class Marketplace extends AbstractMwsObject {

    @XmlElement(name="MarketplaceId")
    private String marketplaceId;

    @XmlElement(name="Name")
    private String name;

    @XmlElement(name="DefaultCountryCode")
    private String defaultCountryCode;

    @XmlElement(name="DefaultCurrencyCode")
    private String defaultCurrencyCode;

    @XmlElement(name="DefaultLanguageCode")
    private String defaultLanguageCode;

    @XmlElement(name="DomainName")
    private String domainName;

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public Marketplace withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

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
    public Marketplace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of DefaultCountryCode.
     *
     * @return The value of DefaultCountryCode.
     */
    public String getDefaultCountryCode() {
        return defaultCountryCode;
    }

    /**
     * Set the value of DefaultCountryCode.
     *
     * @param defaultCountryCode
     *            The new value to set.
     */
    public void setDefaultCountryCode(String defaultCountryCode) {
        this.defaultCountryCode = defaultCountryCode;
    }

    /**
     * Check to see if DefaultCountryCode is set.
     *
     * @return true if DefaultCountryCode is set.
     */
    public boolean isSetDefaultCountryCode() {
        return defaultCountryCode != null;
    }

    /**
     * Set the value of DefaultCountryCode, return this.
     *
     * @param defaultCountryCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Marketplace withDefaultCountryCode(String defaultCountryCode) {
        this.defaultCountryCode = defaultCountryCode;
        return this;
    }

    /**
     * Get the value of DefaultCurrencyCode.
     *
     * @return The value of DefaultCurrencyCode.
     */
    public String getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    /**
     * Set the value of DefaultCurrencyCode.
     *
     * @param defaultCurrencyCode
     *            The new value to set.
     */
    public void setDefaultCurrencyCode(String defaultCurrencyCode) {
        this.defaultCurrencyCode = defaultCurrencyCode;
    }

    /**
     * Check to see if DefaultCurrencyCode is set.
     *
     * @return true if DefaultCurrencyCode is set.
     */
    public boolean isSetDefaultCurrencyCode() {
        return defaultCurrencyCode != null;
    }

    /**
     * Set the value of DefaultCurrencyCode, return this.
     *
     * @param defaultCurrencyCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Marketplace withDefaultCurrencyCode(String defaultCurrencyCode) {
        this.defaultCurrencyCode = defaultCurrencyCode;
        return this;
    }

    /**
     * Get the value of DefaultLanguageCode.
     *
     * @return The value of DefaultLanguageCode.
     */
    public String getDefaultLanguageCode() {
        return defaultLanguageCode;
    }

    /**
     * Set the value of DefaultLanguageCode.
     *
     * @param defaultLanguageCode
     *            The new value to set.
     */
    public void setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
    }

    /**
     * Check to see if DefaultLanguageCode is set.
     *
     * @return true if DefaultLanguageCode is set.
     */
    public boolean isSetDefaultLanguageCode() {
        return defaultLanguageCode != null;
    }

    /**
     * Set the value of DefaultLanguageCode, return this.
     *
     * @param defaultLanguageCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public Marketplace withDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the value of DomainName.
     *
     * @return The value of DomainName.
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Set the value of DomainName.
     *
     * @param domainName
     *            The new value to set.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Check to see if DomainName is set.
     *
     * @return true if DomainName is set.
     */
    public boolean isSetDomainName() {
        return domainName != null;
    }

    /**
     * Set the value of DomainName, return this.
     *
     * @param domainName
     *             The new value to set.
     *
     * @return This instance.
     */
    public Marketplace withDomainName(String domainName) {
        this.domainName = domainName;
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
        marketplaceId = r.read("MarketplaceId", String.class);
        name = r.read("Name", String.class);
        defaultCountryCode = r.read("DefaultCountryCode", String.class);
        defaultCurrencyCode = r.read("DefaultCurrencyCode", String.class);
        defaultLanguageCode = r.read("DefaultLanguageCode", String.class);
        domainName = r.read("DomainName", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("MarketplaceId", marketplaceId);
        w.write("Name", name);
        w.write("DefaultCountryCode", defaultCountryCode);
        w.write("DefaultCurrencyCode", defaultCurrencyCode);
        w.write("DefaultLanguageCode", defaultLanguageCode);
        w.write("DomainName", domainName);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "Marketplace",this);
    }

    /** Value constructor. */
    public Marketplace(String marketplaceId,String name,String defaultCountryCode,String defaultCurrencyCode,String defaultLanguageCode,String domainName) {
        this.marketplaceId = marketplaceId;
        this.name = name;
        this.defaultCountryCode = defaultCountryCode;
        this.defaultCurrencyCode = defaultCurrencyCode;
        this.defaultLanguageCode = defaultLanguageCode;
        this.domainName = domainName;
    }    
    

    /** Default constructor. */
    public Marketplace() {
        super();
    }

}
