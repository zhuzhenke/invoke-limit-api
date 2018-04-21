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
 * COD Settings
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * CODSettings complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CODSettings"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="IsCODRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *             &lt;element name="CODCharge" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="CODChargeTax" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ShippingCharge" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *             &lt;element name="ShippingChargeTax" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CODSettings", propOrder={
    "isCODRequired",
    "codCharge",
    "codChargeTax",
    "shippingCharge",
    "shippingChargeTax"
})
@XmlRootElement(name = "CODSettings")
public class CODSettings extends AbstractMwsObject {

    @XmlElement(name="IsCODRequired",required=true)
    private boolean isCODRequired;

    @XmlElement(name="CODCharge")
    private Currency codCharge;

    @XmlElement(name="CODChargeTax")
    private Currency codChargeTax;

    @XmlElement(name="ShippingCharge")
    private Currency shippingCharge;

    @XmlElement(name="ShippingChargeTax")
    private Currency shippingChargeTax;

    /**
     * Check the value of IsCODRequired.
     *
     * @return true if IsCODRequired is set to true.
     */
    public boolean isIsCODRequired() {
        return isCODRequired;
    }

    /**
     * Get the value of IsCODRequired.
     *
     * @return The value of IsCODRequired.
     */
    public boolean getIsCODRequired() {
        return isCODRequired;
    }

    /**
     * Set the value of IsCODRequired.
     *
     * @param isCODRequired
     *            The new value to set.
     */
    public void setIsCODRequired(boolean isCODRequired) {
        this.isCODRequired = isCODRequired;
    }

    /**
     * is IsCODRequired set.
     *
     * @return true.
     */
    public boolean isSetIsCODRequired() {
        return true;
    }

    /**
     * Set the value of IsCODRequired, return this.
     *
     * @param isCODRequired
     *             The new value to set.
     *
     * @return This instance.
     */
    public CODSettings withIsCODRequired(boolean isCODRequired) {
        this.isCODRequired = isCODRequired;
        return this;
    }

    /**
     * Get the value of CODCharge.
     *
     * @return The value of CODCharge.
     */
    public Currency getCODCharge() {
        return codCharge;
    }

    /**
     * Set the value of CODCharge.
     *
     * @param codCharge
     *            The new value to set.
     */
    public void setCODCharge(Currency codCharge) {
        this.codCharge = codCharge;
    }

    /**
     * Check to see if CODCharge is set.
     *
     * @return true if CODCharge is set.
     */
    public boolean isSetCODCharge() {
        return codCharge != null;
    }

    /**
     * Set the value of CODCharge, return this.
     *
     * @param codCharge
     *             The new value to set.
     *
     * @return This instance.
     */
    public CODSettings withCODCharge(Currency codCharge) {
        this.codCharge = codCharge;
        return this;
    }

    /**
     * Get the value of CODChargeTax.
     *
     * @return The value of CODChargeTax.
     */
    public Currency getCODChargeTax() {
        return codChargeTax;
    }

    /**
     * Set the value of CODChargeTax.
     *
     * @param codChargeTax
     *            The new value to set.
     */
    public void setCODChargeTax(Currency codChargeTax) {
        this.codChargeTax = codChargeTax;
    }

    /**
     * Check to see if CODChargeTax is set.
     *
     * @return true if CODChargeTax is set.
     */
    public boolean isSetCODChargeTax() {
        return codChargeTax != null;
    }

    /**
     * Set the value of CODChargeTax, return this.
     *
     * @param codChargeTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public CODSettings withCODChargeTax(Currency codChargeTax) {
        this.codChargeTax = codChargeTax;
        return this;
    }

    /**
     * Get the value of ShippingCharge.
     *
     * @return The value of ShippingCharge.
     */
    public Currency getShippingCharge() {
        return shippingCharge;
    }

    /**
     * Set the value of ShippingCharge.
     *
     * @param shippingCharge
     *            The new value to set.
     */
    public void setShippingCharge(Currency shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    /**
     * Check to see if ShippingCharge is set.
     *
     * @return true if ShippingCharge is set.
     */
    public boolean isSetShippingCharge() {
        return shippingCharge != null;
    }

    /**
     * Set the value of ShippingCharge, return this.
     *
     * @param shippingCharge
     *             The new value to set.
     *
     * @return This instance.
     */
    public CODSettings withShippingCharge(Currency shippingCharge) {
        this.shippingCharge = shippingCharge;
        return this;
    }

    /**
     * Get the value of ShippingChargeTax.
     *
     * @return The value of ShippingChargeTax.
     */
    public Currency getShippingChargeTax() {
        return shippingChargeTax;
    }

    /**
     * Set the value of ShippingChargeTax.
     *
     * @param shippingChargeTax
     *            The new value to set.
     */
    public void setShippingChargeTax(Currency shippingChargeTax) {
        this.shippingChargeTax = shippingChargeTax;
    }

    /**
     * Check to see if ShippingChargeTax is set.
     *
     * @return true if ShippingChargeTax is set.
     */
    public boolean isSetShippingChargeTax() {
        return shippingChargeTax != null;
    }

    /**
     * Set the value of ShippingChargeTax, return this.
     *
     * @param shippingChargeTax
     *             The new value to set.
     *
     * @return This instance.
     */
    public CODSettings withShippingChargeTax(Currency shippingChargeTax) {
        this.shippingChargeTax = shippingChargeTax;
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
        isCODRequired = r.read("IsCODRequired", boolean.class);
        codCharge = r.read("CODCharge", Currency.class);
        codChargeTax = r.read("CODChargeTax", Currency.class);
        shippingCharge = r.read("ShippingCharge", Currency.class);
        shippingChargeTax = r.read("ShippingChargeTax", Currency.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("IsCODRequired", isCODRequired);
        w.write("CODCharge", codCharge);
        w.write("CODChargeTax", codChargeTax);
        w.write("ShippingCharge", shippingCharge);
        w.write("ShippingChargeTax", shippingChargeTax);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "CODSettings",this);
    }

    /** Value constructor. */
    public CODSettings(boolean isCODRequired,Currency codCharge,Currency codChargeTax,Currency shippingCharge,Currency shippingChargeTax) {
        this.isCODRequired = isCODRequired;
        this.codCharge = codCharge;
        this.codChargeTax = codChargeTax;
        this.shippingCharge = shippingCharge;
        this.shippingChargeTax = shippingChargeTax;
    }    
    

    /** Default constructor. */
    public CODSettings() {
        super();
    }

}
