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
 * Money Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * MoneyType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="MoneyType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="MoneyType", propOrder={
    "currencyCode",
    "amount"
})
@XmlRootElement(name = "MoneyType")
public class MoneyType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="CurrencyCode")
    private String currencyCode;

    @XmlElement(name="Amount")
    private BigDecimal amount;

    /**
     * Get the value of CurrencyCode.
     *
     * @return The value of CurrencyCode.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Set the value of CurrencyCode.
     *
     * @param currencyCode
     *            The new value to set.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Check to see if CurrencyCode is set.
     *
     * @return true if CurrencyCode is set.
     */
    public boolean isSetCurrencyCode() {
        return currencyCode != null;
    }

    /**
     * Set the value of CurrencyCode, return this.
     *
     * @param currencyCode
     *             The new value to set.
     *
     * @return This instance.
     */
    public MoneyType withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get the value of Amount.
     *
     * @return The value of Amount.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Set the value of Amount.
     *
     * @param amount
     *            The new value to set.
     */
    public void setAmount(BigDecimal amount) {
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
    public MoneyType withAmount(BigDecimal amount) {
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
        currencyCode = r.read("CurrencyCode", String.class);
        amount = r.read("Amount", BigDecimal.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CurrencyCode", currencyCode);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "MoneyType",this);
    }

    /** Value constructor. */
    public MoneyType(String currencyCode,BigDecimal amount) {
        this.currencyCode = currencyCode;
        this.amount = amount;
    }    
    

    /** Default constructor. */
    public MoneyType() {
        super();
    }

}
