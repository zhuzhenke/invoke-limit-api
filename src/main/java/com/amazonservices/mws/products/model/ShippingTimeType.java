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
 * Shipping Time Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * ShippingTimeType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShippingTimeType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ShippingTimeType", propOrder={
    "max"
})
@XmlRootElement(name = "ShippingTimeType")
public class ShippingTimeType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="Max")
    private String max;

    /**
     * Get the value of Max.
     *
     * @return The value of Max.
     */
    public String getMax() {
        return max;
    }

    /**
     * Set the value of Max.
     *
     * @param max
     *            The new value to set.
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Check to see if Max is set.
     *
     * @return true if Max is set.
     */
    public boolean isSetMax() {
        return max != null;
    }

    /**
     * Set the value of Max, return this.
     *
     * @param max
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingTimeType withMax(String max) {
        this.max = max;
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
        max = r.read("Max", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Max", max);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ShippingTimeType",this);
    }

    /** Value constructor. */
    public ShippingTimeType(String max) {
        this.max = max;
    }    
    

    /** Default constructor. */
    public ShippingTimeType() {
        super();
    }

}
