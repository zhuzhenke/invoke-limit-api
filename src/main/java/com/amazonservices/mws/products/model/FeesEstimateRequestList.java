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
 * Fees Estimate Request List
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
 * FeesEstimateRequestList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeesEstimateRequestList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeesEstimateRequest" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeesEstimateRequest" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeesEstimateRequestList", propOrder={
    "feesEstimateRequest"
})
@XmlRootElement(name = "FeesEstimateRequestList")
public class FeesEstimateRequestList extends AbstractMwsObject {

    @XmlElement(name="FeesEstimateRequest")
    private List<FeesEstimateRequest> feesEstimateRequest;

    /**
     * Get the value of FeesEstimateRequest.
     *
     * @return The value of FeesEstimateRequest.
     */
    public List<FeesEstimateRequest> getFeesEstimateRequest() {
        if (feesEstimateRequest==null) {
            feesEstimateRequest = new ArrayList<FeesEstimateRequest>();
        }
        return feesEstimateRequest;
    }

    /**
     * Set the value of FeesEstimateRequest.
     *
     * @param feesEstimateRequest
     *            The new value to set.
     */
    public void setFeesEstimateRequest(List<FeesEstimateRequest> feesEstimateRequest) {
        this.feesEstimateRequest = feesEstimateRequest;
    }

    /**
     * Clear FeesEstimateRequest.
     */
    public void unsetFeesEstimateRequest() {
        this.feesEstimateRequest = null;
    }

    /**
     * Check to see if FeesEstimateRequest is set.
     *
     * @return true if FeesEstimateRequest is set.
     */
    public boolean isSetFeesEstimateRequest() {
        return feesEstimateRequest != null && !feesEstimateRequest.isEmpty();
    }

    /**
     * Add values for FeesEstimateRequest, return this.
     *
     * @param feesEstimateRequest
     *             New values to add.
     *
     * @return This instance.
     */
    public FeesEstimateRequestList withFeesEstimateRequest(FeesEstimateRequest... values) {
        List<FeesEstimateRequest> list = getFeesEstimateRequest();
        for (FeesEstimateRequest value : values) {
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
        feesEstimateRequest = r.readList("FeesEstimateRequest", FeesEstimateRequest.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("FeesEstimateRequest", feesEstimateRequest);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeesEstimateRequestList",this);
    }

    /** Value constructor. */
    public FeesEstimateRequestList(List<FeesEstimateRequest> feesEstimateRequest) {
        this.feesEstimateRequest = feesEstimateRequest;
    }    
    

    /** Default constructor. */
    public FeesEstimateRequestList() {
        super();
    }

}
