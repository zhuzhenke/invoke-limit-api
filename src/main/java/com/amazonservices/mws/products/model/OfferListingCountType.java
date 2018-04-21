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
 * Offer Listing Count Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * OfferListingCountType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="OfferListingCountType"&gt;
 *    &lt;simpleContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *          &lt;attribute name="condition" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *     &lt;/extension&gt;
 *    &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="OfferListingCountType", propOrder={
    "value"
})
@XmlRootElement(name = "OfferListingCountType")
public class OfferListingCountType extends AbstractMwsObject {

    @XmlValue
    private int value;

    @XmlAttribute(required=true)
    private String condition;

    /**
     * Get the value of Value.
     *
     * @return The value of Value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of Value.
     *
     * @param value
     *            The new value to set.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * is Value set.
     *
     * @return true
     */
    public boolean isSetValue() {
        return true;
    }

    /**
     * Set the value of Value, return this.
     *
     * @param value
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferListingCountType withValue(int value) {
        this.value = value;
        return this;
    }

    /**
     * Get the value of condition.
     *
     * @return The value of condition.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of condition.
     *
     * @param condition
     *            The new value to set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Check to see if condition is set.
     *
     * @return true if condition is set.
     */
    public boolean isSetCondition() {
        return condition != null;
    }

    /**
     * Set the value of condition, return this.
     *
     * @param condition
     *             The new value to set.
     *
     * @return This instance.
     */
    public OfferListingCountType withCondition(String condition) {
        this.condition = condition;
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
        condition = r.readAttribute("condition", String.class); 
        value = r.readValue(int.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeAttribute("condition",condition);
        w.writeValue(value);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "OfferListingCountType",this);
    }

    /** Value constructor. */
    public OfferListingCountType(int value,String condition) {
        this.value = value;
        this.condition = condition;
    }    
    

    /** Default constructor. */
    public OfferListingCountType() {
        super();
    }

}
