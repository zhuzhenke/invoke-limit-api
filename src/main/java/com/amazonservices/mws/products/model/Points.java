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
 * Points
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * Points complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Points"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PointsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="PointsMonetaryValue" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Points", propOrder={
    "pointsNumber",
    "pointsMonetaryValue"
})
@XmlRootElement(name = "Points")
public class Points extends AbstractMwsObject implements Serializable {

    @XmlElement(name="PointsNumber")
    private Integer pointsNumber;

    @XmlElement(name="PointsMonetaryValue")
    private MoneyType pointsMonetaryValue;

    /**
     * Get the value of PointsNumber.
     *
     * @return The value of PointsNumber.
     */
    public Integer getPointsNumber() {
        return pointsNumber;
    }

    /**
     * Set the value of PointsNumber.
     *
     * @param pointsNumber
     *            The new value to set.
     */
    public void setPointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    /**
     * Check to see if PointsNumber is set.
     *
     * @return true if PointsNumber is set.
     */
    public boolean isSetPointsNumber() {
        return pointsNumber != null;
    }

    /**
     * Set the value of PointsNumber, return this.
     *
     * @param pointsNumber
     *             The new value to set.
     *
     * @return This instance.
     */
    public Points withPointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
        return this;
    }

    /**
     * Get the value of PointsMonetaryValue.
     *
     * @return The value of PointsMonetaryValue.
     */
    public MoneyType getPointsMonetaryValue() {
        return pointsMonetaryValue;
    }

    /**
     * Set the value of PointsMonetaryValue.
     *
     * @param pointsMonetaryValue
     *            The new value to set.
     */
    public void setPointsMonetaryValue(MoneyType pointsMonetaryValue) {
        this.pointsMonetaryValue = pointsMonetaryValue;
    }

    /**
     * Check to see if PointsMonetaryValue is set.
     *
     * @return true if PointsMonetaryValue is set.
     */
    public boolean isSetPointsMonetaryValue() {
        return pointsMonetaryValue != null;
    }

    /**
     * Set the value of PointsMonetaryValue, return this.
     *
     * @param pointsMonetaryValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public Points withPointsMonetaryValue(MoneyType pointsMonetaryValue) {
        this.pointsMonetaryValue = pointsMonetaryValue;
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
        pointsNumber = r.read("PointsNumber", Integer.class);
        pointsMonetaryValue = r.read("PointsMonetaryValue", MoneyType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("PointsNumber", pointsNumber);
        w.write("PointsMonetaryValue", pointsMonetaryValue);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Points",this);
    }

    /** Value constructor. */
    public Points(Integer pointsNumber,MoneyType pointsMonetaryValue) {
        this.pointsNumber = pointsNumber;
        this.pointsMonetaryValue = pointsMonetaryValue;
    }    
    

    /** Default constructor. */
    public Points() {
        super();
    }

}
