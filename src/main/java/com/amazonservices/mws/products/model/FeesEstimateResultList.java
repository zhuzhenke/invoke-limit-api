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
 * Fees Estimate Result List
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FeesEstimateResultList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeesEstimateResultList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeesEstimateResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimateResult" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeesEstimateResultList", propOrder={
    "feesEstimateResult"
})
@XmlRootElement(name = "FeesEstimateResultList")
public class FeesEstimateResultList extends AbstractMwsObject {

    @XmlElement(name="FeesEstimateResult")
    private List<FeesEstimateResult> feesEstimateResult;

    /**
     * Get the value of FeesEstimateResult.
     *
     * @return The value of FeesEstimateResult.
     */
    public List<FeesEstimateResult> getFeesEstimateResult() {
        if (feesEstimateResult==null) {
            feesEstimateResult = new ArrayList<FeesEstimateResult>();
        }
        return feesEstimateResult;
    }

    /**
     * Set the value of FeesEstimateResult.
     *
     * @param feesEstimateResult
     *            The new value to set.
     */
    public void setFeesEstimateResult(List<FeesEstimateResult> feesEstimateResult) {
        this.feesEstimateResult = feesEstimateResult;
    }

    /**
     * Clear FeesEstimateResult.
     */
    public void unsetFeesEstimateResult() {
        this.feesEstimateResult = null;
    }

    /**
     * Check to see if FeesEstimateResult is set.
     *
     * @return true if FeesEstimateResult is set.
     */
    public boolean isSetFeesEstimateResult() {
        return feesEstimateResult != null && !feesEstimateResult.isEmpty();
    }

    /**
     * Add values for FeesEstimateResult, return this.
     *
     * @param feesEstimateResult
     *             New values to add.
     *
     * @return This instance.
     */
    public FeesEstimateResultList withFeesEstimateResult(FeesEstimateResult... values) {
        List<FeesEstimateResult> list = getFeesEstimateResult();
        for (FeesEstimateResult value : values) {
            list.add(value);
        }
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
        feesEstimateResult = r.readList("FeesEstimateResult", FeesEstimateResult.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("FeesEstimateResult", feesEstimateResult);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeesEstimateResultList",this);
    }

    /** Value constructor. */
    public FeesEstimateResultList(List<FeesEstimateResult> feesEstimateResult) {
        this.feesEstimateResult = feesEstimateResult;
    }    
    

    /** Default constructor. */
    public FeesEstimateResultList() {
        super();
    }

}
