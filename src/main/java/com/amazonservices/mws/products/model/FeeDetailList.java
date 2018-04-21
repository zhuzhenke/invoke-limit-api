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
 * Fee Detail List
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
 * FeeDetailList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeeDetailList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeeDetail" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeeDetail" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeeDetailList", propOrder={
    "feeDetail"
})
@XmlRootElement(name = "FeeDetailList")
public class FeeDetailList extends AbstractMwsObject {

    @XmlElement(name="FeeDetail")
    private List<FeeDetail> feeDetail;

    /**
     * Get the value of FeeDetail.
     *
     * @return The value of FeeDetail.
     */
    public List<FeeDetail> getFeeDetail() {
        if (feeDetail==null) {
            feeDetail = new ArrayList<FeeDetail>();
        }
        return feeDetail;
    }

    /**
     * Set the value of FeeDetail.
     *
     * @param feeDetail
     *            The new value to set.
     */
    public void setFeeDetail(List<FeeDetail> feeDetail) {
        this.feeDetail = feeDetail;
    }

    /**
     * Clear FeeDetail.
     */
    public void unsetFeeDetail() {
        this.feeDetail = null;
    }

    /**
     * Check to see if FeeDetail is set.
     *
     * @return true if FeeDetail is set.
     */
    public boolean isSetFeeDetail() {
        return feeDetail != null && !feeDetail.isEmpty();
    }

    /**
     * Add values for FeeDetail, return this.
     *
     * @param feeDetail
     *             New values to add.
     *
     * @return This instance.
     */
    public FeeDetailList withFeeDetail(FeeDetail... values) {
        List<FeeDetail> list = getFeeDetail();
        for (FeeDetail value : values) {
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
        feeDetail = r.readList("FeeDetail", FeeDetail.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("FeeDetail", feeDetail);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeeDetailList",this);
    }

    /** Value constructor. */
    public FeeDetailList(List<FeeDetail> feeDetail) {
        this.feeDetail = feeDetail;
    }    
    

    /** Default constructor. */
    public FeeDetailList() {
        super();
    }

}
