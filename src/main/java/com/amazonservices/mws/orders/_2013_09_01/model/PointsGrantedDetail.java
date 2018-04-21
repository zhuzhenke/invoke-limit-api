/*******************************************************************************
 * Copyright 2009-2015 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Points Granted Detail
 * API Version: 2013-09-01
 * Library Version: 2015-09-24
 * Generated: Fri Sep 25 20:06:20 GMT 2015
 */
package com.amazonservices.mws.orders._2013_09_01.model;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * PointsGrantedDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PointsGrantedDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="PointsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="PointsMonetaryValue" type="{https://mws.amazonservices.com/Orders/2013-09-01}Money" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PointsGrantedDetail extends AbstractMwsObject implements Serializable {

    private Integer pointsNumber;

    private Money pointsMonetaryValue;

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
    public PointsGrantedDetail withPointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
        return this;
    }

    /**
     * Get the value of PointsMonetaryValue.
     *
     * @return The value of PointsMonetaryValue.
     */
    public Money getPointsMonetaryValue() {
        return pointsMonetaryValue;
    }

    /**
     * Set the value of PointsMonetaryValue.
     *
     * @param pointsMonetaryValue
     *            The new value to set.
     */
    public void setPointsMonetaryValue(Money pointsMonetaryValue) {
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
    public PointsGrantedDetail withPointsMonetaryValue(Money pointsMonetaryValue) {
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
        pointsMonetaryValue = r.read("PointsMonetaryValue", Money.class);
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
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "PointsGrantedDetail",this);
    }

    /** Value constructor. */
    public PointsGrantedDetail(Integer pointsNumber,Money pointsMonetaryValue) {
        this.pointsNumber = pointsNumber;
        this.pointsMonetaryValue = pointsMonetaryValue;
    }    
    

    /** Default constructor. */
    public PointsGrantedDetail() {
        super();
    }

}
