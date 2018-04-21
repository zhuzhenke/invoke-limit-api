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
 * Get My Fees Estimate Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetMyFeesEstimateResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMyFeesEstimateResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeesEstimateResultList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimateResultList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMyFeesEstimateResult", propOrder={
    "feesEstimateResultList"
})
@XmlRootElement(name = "GetMyFeesEstimateResult")
public class GetMyFeesEstimateResult extends AbstractMwsObject {

    @XmlElement(name="FeesEstimateResultList")
    private FeesEstimateResultList feesEstimateResultList;

    /**
     * Get the value of FeesEstimateResultList.
     *
     * @return The value of FeesEstimateResultList.
     */
    public FeesEstimateResultList getFeesEstimateResultList() {
        return feesEstimateResultList;
    }

    /**
     * Set the value of FeesEstimateResultList.
     *
     * @param feesEstimateResultList
     *            The new value to set.
     */
    public void setFeesEstimateResultList(FeesEstimateResultList feesEstimateResultList) {
        this.feesEstimateResultList = feesEstimateResultList;
    }

    /**
     * Check to see if FeesEstimateResultList is set.
     *
     * @return true if FeesEstimateResultList is set.
     */
    public boolean isSetFeesEstimateResultList() {
        return feesEstimateResultList != null;
    }

    /**
     * Set the value of FeesEstimateResultList, return this.
     *
     * @param feesEstimateResultList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMyFeesEstimateResult withFeesEstimateResultList(FeesEstimateResultList feesEstimateResultList) {
        this.feesEstimateResultList = feesEstimateResultList;
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
        feesEstimateResultList = r.read("FeesEstimateResultList", FeesEstimateResultList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FeesEstimateResultList", feesEstimateResultList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMyFeesEstimateResult",this);
    }

    /** Value constructor. */
    public GetMyFeesEstimateResult(FeesEstimateResultList feesEstimateResultList) {
        this.feesEstimateResultList = feesEstimateResultList;
    }    
    

    /** Default constructor. */
    public GetMyFeesEstimateResult() {
        super();
    }

}
