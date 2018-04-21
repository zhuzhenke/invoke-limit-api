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
 * Fee
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Fee complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Fee"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Amount" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}Currency"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Fee", propOrder={
    "name",
    "amount"
})
@XmlRootElement(name = "Fee")
public class Fee extends AbstractMwsObject {

    @XmlElement(name="Name",required=true)
    private String name;

    @XmlElement(name="Amount",required=true)
    private Currency amount;

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
    public Fee withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of Amount.
     *
     * @return The value of Amount.
     */
    public Currency getAmount() {
        return amount;
    }

    /**
     * Set the value of Amount.
     *
     * @param amount
     *            The new value to set.
     */
    public void setAmount(Currency amount) {
        this.amount = amount;
    }

    /**
     * Check to see if Amount is set.
     *
     * @return true if Amount is set.
     */
    public boolean isSetAmount() {
        return amount != null;
    }

    /**
     * Set the value of Amount, return this.
     *
     * @param amount
     *             The new value to set.
     *
     * @return This instance.
     */
    public Fee withAmount(Currency amount) {
        this.amount = amount;
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
        amount = r.read("Amount", Currency.class);
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
        w.write("Amount", amount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "Fee",this);
    }

    /** Value constructor. */
    public Fee(String name,Currency amount) {
        this.name = name;
        this.amount = amount;
    }    
    

    /** Default constructor. */
    public Fee() {
        super();
    }

}
