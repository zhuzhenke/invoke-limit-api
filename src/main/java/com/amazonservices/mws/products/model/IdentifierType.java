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
 * Identifier Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * IdentifierType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="IdentifierType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="MarketplaceASIN" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ASINIdentifier"/&gt;
 *             &lt;element name="SKUIdentifier" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}SellerSKUIdentifier" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="IdentifierType", propOrder={
    "marketplaceASIN",
    "skuIdentifier"
})
@XmlRootElement(name = "IdentifierType")
public class IdentifierType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="MarketplaceASIN",required=true)
    private ASINIdentifier marketplaceASIN;

    @XmlElement(name="SKUIdentifier")
    private SellerSKUIdentifier skuIdentifier;

    /**
     * Get the value of MarketplaceASIN.
     *
     * @return The value of MarketplaceASIN.
     */
    public ASINIdentifier getMarketplaceASIN() {
        return marketplaceASIN;
    }

    /**
     * Set the value of MarketplaceASIN.
     *
     * @param marketplaceASIN
     *            The new value to set.
     */
    public void setMarketplaceASIN(ASINIdentifier marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
    }

    /**
     * Check to see if MarketplaceASIN is set.
     *
     * @return true if MarketplaceASIN is set.
     */
    public boolean isSetMarketplaceASIN() {
        return marketplaceASIN != null;
    }

    /**
     * Set the value of MarketplaceASIN, return this.
     *
     * @param marketplaceASIN
     *             The new value to set.
     *
     * @return This instance.
     */
    public IdentifierType withMarketplaceASIN(ASINIdentifier marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
        return this;
    }

    /**
     * Get the value of SKUIdentifier.
     *
     * @return The value of SKUIdentifier.
     */
    public SellerSKUIdentifier getSKUIdentifier() {
        return skuIdentifier;
    }

    /**
     * Set the value of SKUIdentifier.
     *
     * @param skuIdentifier
     *            The new value to set.
     */
    public void setSKUIdentifier(SellerSKUIdentifier skuIdentifier) {
        this.skuIdentifier = skuIdentifier;
    }

    /**
     * Check to see if SKUIdentifier is set.
     *
     * @return true if SKUIdentifier is set.
     */
    public boolean isSetSKUIdentifier() {
        return skuIdentifier != null;
    }

    /**
     * Set the value of SKUIdentifier, return this.
     *
     * @param skuIdentifier
     *             The new value to set.
     *
     * @return This instance.
     */
    public IdentifierType withSKUIdentifier(SellerSKUIdentifier skuIdentifier) {
        this.skuIdentifier = skuIdentifier;
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
        marketplaceASIN = r.read("MarketplaceASIN", ASINIdentifier.class);
        skuIdentifier = r.read("SKUIdentifier", SellerSKUIdentifier.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("MarketplaceASIN", marketplaceASIN);
        w.write("SKUIdentifier", skuIdentifier);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "IdentifierType",this);
    }

    /** Value constructor. */
    public IdentifierType(ASINIdentifier marketplaceASIN,SellerSKUIdentifier skuIdentifier) {
        this.marketplaceASIN = marketplaceASIN;
        this.skuIdentifier = skuIdentifier;
    }    
    

    /** Default constructor. */
    public IdentifierType() {
        super();
    }

}
