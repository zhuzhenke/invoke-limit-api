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
 * Label Dimensions
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import java.math.BigDecimal;

import com.amazonservices.mws.client.*;

/**
 * LabelDimensions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LabelDimensions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class LabelDimensions extends AbstractMwsObject {

    private BigDecimal length;

    private BigDecimal width;

    private String unit;

    /**
     * Get the value of Length.
     *
     * @return The value of Length.
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Set the value of Length.
     *
     * @param length
     *            The new value to set.
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Check to see if Length is set.
     *
     * @return true if Length is set.
     */
    public boolean isSetLength() {
        return length != null;
    }

    /**
     * Set the value of Length, return this.
     *
     * @param length
     *             The new value to set.
     *
     * @return This instance.
     */
    public LabelDimensions withLength(BigDecimal length) {
        this.length = length;
        return this;
    }

    /**
     * Get the value of Width.
     *
     * @return The value of Width.
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Set the value of Width.
     *
     * @param width
     *            The new value to set.
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Check to see if Width is set.
     *
     * @return true if Width is set.
     */
    public boolean isSetWidth() {
        return width != null;
    }

    /**
     * Set the value of Width, return this.
     *
     * @param width
     *             The new value to set.
     *
     * @return This instance.
     */
    public LabelDimensions withWidth(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * Get the value of Unit.
     *
     * @return The value of Unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the value of Unit.
     *
     * @param unit
     *            The new value to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Check to see if Unit is set.
     *
     * @return true if Unit is set.
     */
    public boolean isSetUnit() {
        return unit != null;
    }

    /**
     * Set the value of Unit, return this.
     *
     * @param unit
     *             The new value to set.
     *
     * @return This instance.
     */
    public LabelDimensions withUnit(String unit) {
        this.unit = unit;
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
        length = r.read("Length", BigDecimal.class);
        width = r.read("Width", BigDecimal.class);
        unit = r.read("Unit", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Length", length);
        w.write("Width", width);
        w.write("Unit", unit);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "LabelDimensions",this);
    }

    /** Value constructor. */
    public LabelDimensions(BigDecimal length,BigDecimal width,String unit) {
        this.length = length;
        this.width = width;
        this.unit = unit;
    }    
    

    /** Default constructor. */
    public LabelDimensions() {
        super();
    }

}
