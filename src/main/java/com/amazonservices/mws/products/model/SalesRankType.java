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
 * Sales Rank Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

import java.io.Serializable;

/**
 * SalesRankType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SalesRankType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ProductCategoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SalesRankType", propOrder={
    "productCategoryId",
    "rank"
})
@XmlRootElement(name = "SalesRankType")
public class SalesRankType extends AbstractMwsObject implements Serializable {

    @XmlElement(name="ProductCategoryId",required=true)
    private String productCategoryId;

    @XmlElement(name="Rank",required=true)
    private int rank;

    /**
     * Get the value of ProductCategoryId.
     *
     * @return The value of ProductCategoryId.
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * Set the value of ProductCategoryId.
     *
     * @param productCategoryId
     *            The new value to set.
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * Check to see if ProductCategoryId is set.
     *
     * @return true if ProductCategoryId is set.
     */
    public boolean isSetProductCategoryId() {
        return productCategoryId != null;
    }

    /**
     * Set the value of ProductCategoryId, return this.
     *
     * @param productCategoryId
     *             The new value to set.
     *
     * @return This instance.
     */
    public SalesRankType withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    /**
     * Get the value of Rank.
     *
     * @return The value of Rank.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Set the value of Rank.
     *
     * @param rank
     *            The new value to set.
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * is Rank set.
     *
     * @return true.
     */
    public boolean isSetRank() {
        return true;
    }

    /**
     * Set the value of Rank, return this.
     *
     * @param rank
     *             The new value to set.
     *
     * @return This instance.
     */
    public SalesRankType withRank(int rank) {
        this.rank = rank;
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
        productCategoryId = r.read("ProductCategoryId", String.class);
        rank = r.read("Rank", int.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ProductCategoryId", productCategoryId);
        w.write("Rank", rank);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "SalesRankType",this);
    }

    /** Value constructor. */
    public SalesRankType(String productCategoryId,int rank) {
        this.productCategoryId = productCategoryId;
        this.rank = rank;
    }    
    

    /** Default constructor. */
    public SalesRankType() {
        super();
    }

}
