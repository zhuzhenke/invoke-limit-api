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
 * Fees Estimate
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FeesEstimate complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeesEstimate"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="TimeOfFeesEstimation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="TotalFeesEstimate" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="FeeDetailList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeeDetailList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeesEstimate", propOrder={
    "timeOfFeesEstimation",
    "totalFeesEstimate",
    "feeDetailList"
})
@XmlRootElement(name = "FeesEstimate")
public class FeesEstimate extends AbstractMwsObject {

    @XmlElement(name="TimeOfFeesEstimation")
    private XMLGregorianCalendar timeOfFeesEstimation;

    @XmlElement(name="TotalFeesEstimate")
    private MoneyType totalFeesEstimate;

    @XmlElement(name="FeeDetailList")
    private FeeDetailList feeDetailList;

    /**
     * Get the value of TimeOfFeesEstimation.
     *
     * @return The value of TimeOfFeesEstimation.
     */
    public XMLGregorianCalendar getTimeOfFeesEstimation() {
        return timeOfFeesEstimation;
    }

    /**
     * Set the value of TimeOfFeesEstimation.
     *
     * @param timeOfFeesEstimation
     *            The new value to set.
     */
    public void setTimeOfFeesEstimation(XMLGregorianCalendar timeOfFeesEstimation) {
        this.timeOfFeesEstimation = timeOfFeesEstimation;
    }

    /**
     * Check to see if TimeOfFeesEstimation is set.
     *
     * @return true if TimeOfFeesEstimation is set.
     */
    public boolean isSetTimeOfFeesEstimation() {
        return timeOfFeesEstimation != null;
    }

    /**
     * Set the value of TimeOfFeesEstimation, return this.
     *
     * @param timeOfFeesEstimation
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimate withTimeOfFeesEstimation(XMLGregorianCalendar timeOfFeesEstimation) {
        this.timeOfFeesEstimation = timeOfFeesEstimation;
        return this;
    }

    /**
     * Get the value of TotalFeesEstimate.
     *
     * @return The value of TotalFeesEstimate.
     */
    public MoneyType getTotalFeesEstimate() {
        return totalFeesEstimate;
    }

    /**
     * Set the value of TotalFeesEstimate.
     *
     * @param totalFeesEstimate
     *            The new value to set.
     */
    public void setTotalFeesEstimate(MoneyType totalFeesEstimate) {
        this.totalFeesEstimate = totalFeesEstimate;
    }

    /**
     * Check to see if TotalFeesEstimate is set.
     *
     * @return true if TotalFeesEstimate is set.
     */
    public boolean isSetTotalFeesEstimate() {
        return totalFeesEstimate != null;
    }

    /**
     * Set the value of TotalFeesEstimate, return this.
     *
     * @param totalFeesEstimate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimate withTotalFeesEstimate(MoneyType totalFeesEstimate) {
        this.totalFeesEstimate = totalFeesEstimate;
        return this;
    }

    /**
     * Get the value of FeeDetailList.
     *
     * @return The value of FeeDetailList.
     */
    public FeeDetailList getFeeDetailList() {
        return feeDetailList;
    }

    /**
     * Set the value of FeeDetailList.
     *
     * @param feeDetailList
     *            The new value to set.
     */
    public void setFeeDetailList(FeeDetailList feeDetailList) {
        this.feeDetailList = feeDetailList;
    }

    /**
     * Check to see if FeeDetailList is set.
     *
     * @return true if FeeDetailList is set.
     */
    public boolean isSetFeeDetailList() {
        return feeDetailList != null;
    }

    /**
     * Set the value of FeeDetailList, return this.
     *
     * @param feeDetailList
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimate withFeeDetailList(FeeDetailList feeDetailList) {
        this.feeDetailList = feeDetailList;
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
        timeOfFeesEstimation = r.read("TimeOfFeesEstimation", XMLGregorianCalendar.class);
        totalFeesEstimate = r.read("TotalFeesEstimate", MoneyType.class);
        feeDetailList = r.read("FeeDetailList", FeeDetailList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("TimeOfFeesEstimation", timeOfFeesEstimation);
        w.write("TotalFeesEstimate", totalFeesEstimate);
        w.write("FeeDetailList", feeDetailList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeesEstimate",this);
    }

    /** Value constructor. */
    public FeesEstimate(XMLGregorianCalendar timeOfFeesEstimation,MoneyType totalFeesEstimate,FeeDetailList feeDetailList) {
        this.timeOfFeesEstimation = timeOfFeesEstimation;
        this.totalFeesEstimate = totalFeesEstimate;
        this.feeDetailList = feeDetailList;
    }    
    

    /** Default constructor. */
    public FeesEstimate() {
        super();
    }

}
