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
 * Fees Estimate Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FeesEstimateResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeesEstimateResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeesEstimateIdentifier" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimateIdentifier" minOccurs="0"/&gt;
 *             &lt;element name="FeesEstimate" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimate" minOccurs="0"/&gt;
 *             &lt;element name="Error" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeesEstimateResult", propOrder={
    "status",
    "feesEstimateIdentifier",
    "feesEstimate",
    "error"
})
@XmlRootElement(name = "FeesEstimateResult")
public class FeesEstimateResult extends AbstractMwsObject {

    @XmlElement(name="Status")
    private String status;

    @XmlElement(name="FeesEstimateIdentifier")
    private FeesEstimateIdentifier feesEstimateIdentifier;

    @XmlElement(name="FeesEstimate")
    private FeesEstimate feesEstimate;

    @XmlElement(name="Error")
    private Error error;

    /**
     * Get the value of Status.
     *
     * @return The value of Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of Status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if Status is set.
     *
     * @return true if Status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of Status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimateResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of FeesEstimateIdentifier.
     *
     * @return The value of FeesEstimateIdentifier.
     */
    public FeesEstimateIdentifier getFeesEstimateIdentifier() {
        return feesEstimateIdentifier;
    }

    /**
     * Set the value of FeesEstimateIdentifier.
     *
     * @param feesEstimateIdentifier
     *            The new value to set.
     */
    public void setFeesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
        this.feesEstimateIdentifier = feesEstimateIdentifier;
    }

    /**
     * Check to see if FeesEstimateIdentifier is set.
     *
     * @return true if FeesEstimateIdentifier is set.
     */
    public boolean isSetFeesEstimateIdentifier() {
        return feesEstimateIdentifier != null;
    }

    /**
     * Set the value of FeesEstimateIdentifier, return this.
     *
     * @param feesEstimateIdentifier
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimateResult withFeesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
        this.feesEstimateIdentifier = feesEstimateIdentifier;
        return this;
    }

    /**
     * Get the value of FeesEstimate.
     *
     * @return The value of FeesEstimate.
     */
    public FeesEstimate getFeesEstimate() {
        return feesEstimate;
    }

    /**
     * Set the value of FeesEstimate.
     *
     * @param feesEstimate
     *            The new value to set.
     */
    public void setFeesEstimate(FeesEstimate feesEstimate) {
        this.feesEstimate = feesEstimate;
    }

    /**
     * Check to see if FeesEstimate is set.
     *
     * @return true if FeesEstimate is set.
     */
    public boolean isSetFeesEstimate() {
        return feesEstimate != null;
    }

    /**
     * Set the value of FeesEstimate, return this.
     *
     * @param feesEstimate
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimateResult withFeesEstimate(FeesEstimate feesEstimate) {
        this.feesEstimate = feesEstimate;
        return this;
    }

    /**
     * Get the value of Error.
     *
     * @return The value of Error.
     */
    public Error getError() {
        return error;
    }

    /**
     * Set the value of Error.
     *
     * @param error
     *            The new value to set.
     */
    public void setError(Error error) {
        this.error = error;
    }

    /**
     * Check to see if Error is set.
     *
     * @return true if Error is set.
     */
    public boolean isSetError() {
        return error != null;
    }

    /**
     * Set the value of Error, return this.
     *
     * @param error
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeesEstimateResult withError(Error error) {
        this.error = error;
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
        status = r.read("Status", String.class);
        feesEstimateIdentifier = r.read("FeesEstimateIdentifier", FeesEstimateIdentifier.class);
        feesEstimate = r.read("FeesEstimate", FeesEstimate.class);
        error = r.read("Error", Error.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Status", status);
        w.write("FeesEstimateIdentifier", feesEstimateIdentifier);
        w.write("FeesEstimate", feesEstimate);
        w.write("Error", error);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeesEstimateResult",this);
    }

    /** Value constructor. */
    public FeesEstimateResult(String status,FeesEstimateIdentifier feesEstimateIdentifier,FeesEstimate feesEstimate,Error error) {
        this.status = status;
        this.feesEstimateIdentifier = feesEstimateIdentifier;
        this.feesEstimate = feesEstimate;
        this.error = error;
    }    
    

    /** Default constructor. */
    public FeesEstimateResult() {
        super();
    }

}
