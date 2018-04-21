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
 * Sales Rank List
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * SalesRankList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SalesRankList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SalesRank" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}SalesRankType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SalesRankList", propOrder={
    "salesRank"
})
@XmlRootElement(name = "SalesRankList")
public class SalesRankList extends AbstractMwsObject implements Serializable {

    @XmlElement(name="SalesRank")
    private List<SalesRankType> salesRank;

    /**
     * Get the value of SalesRank.
     *
     * @return The value of SalesRank.
     */
    public List<SalesRankType> getSalesRank() {
        if (salesRank==null) {
            salesRank = new ArrayList<SalesRankType>();
        }
        return salesRank;
    }

    /**
     * Set the value of SalesRank.
     *
     * @param salesRank
     *            The new value to set.
     */
    public void setSalesRank(List<SalesRankType> salesRank) {
        this.salesRank = salesRank;
    }

    /**
     * Clear SalesRank.
     */
    public void unsetSalesRank() {
        this.salesRank = null;
    }

    /**
     * Check to see if SalesRank is set.
     *
     * @return true if SalesRank is set.
     */
    public boolean isSetSalesRank() {
        return salesRank != null && !salesRank.isEmpty();
    }

    /**
     * Add values for SalesRank, return this.
     *
     * @param salesRank
     *             New values to add.
     *
     * @return This instance.
     */
    public SalesRankList withSalesRank(SalesRankType... values) {
        List<SalesRankType> list = getSalesRank();
        for (SalesRankType value : values) {
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
        salesRank = r.readList("SalesRank", SalesRankType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("SalesRank", salesRank);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "SalesRankList",this);
    }

    /** Value constructor. */
    public SalesRankList(List<SalesRankType> salesRank) {
        this.salesRank = salesRank;
    }    
    

    /** Default constructor. */
    public SalesRankList() {
        super();
    }

}
