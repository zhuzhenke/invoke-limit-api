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
 * Categories
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Categories complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Categories"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ProductCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ProductCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Parent" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Categories" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Categories", propOrder={
    "productCategoryId",
    "productCategoryName",
    "parent"
})
@XmlRootElement(name = "Categories")
public class Categories extends AbstractMwsObject {

    @XmlElement(name="ProductCategoryId")
    private String productCategoryId;

    @XmlElement(name="ProductCategoryName")
    private String productCategoryName;

    @XmlElement(name="Parent")
    private Categories parent;

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
    public Categories withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    /**
     * Get the value of ProductCategoryName.
     *
     * @return The value of ProductCategoryName.
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * Set the value of ProductCategoryName.
     *
     * @param productCategoryName
     *            The new value to set.
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    /**
     * Check to see if ProductCategoryName is set.
     *
     * @return true if ProductCategoryName is set.
     */
    public boolean isSetProductCategoryName() {
        return productCategoryName != null;
    }

    /**
     * Set the value of ProductCategoryName, return this.
     *
     * @param productCategoryName
     *             The new value to set.
     *
     * @return This instance.
     */
    public Categories withProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
        return this;
    }

    /**
     * Get the value of Parent.
     *
     * @return The value of Parent.
     */
    public Categories getParent() {
        return parent;
    }

    /**
     * Set the value of Parent.
     *
     * @param parent
     *            The new value to set.
     */
    public void setParent(Categories parent) {
        this.parent = parent;
    }

    /**
     * Check to see if Parent is set.
     *
     * @return true if Parent is set.
     */
    public boolean isSetParent() {
        return parent != null;
    }

    /**
     * Set the value of Parent, return this.
     *
     * @param parent
     *             The new value to set.
     *
     * @return This instance.
     */
    public Categories withParent(Categories parent) {
        this.parent = parent;
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
        productCategoryName = r.read("ProductCategoryName", String.class);
        parent = r.read("Parent", Categories.class);
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
        w.write("ProductCategoryName", productCategoryName);
        w.write("Parent", parent);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Categories",this);
    }

    /** Value constructor. */
    public Categories(String productCategoryId,String productCategoryName,Categories parent) {
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.parent = parent;
    }    
    

    /** Default constructor. */
    public Categories() {
        super();
    }

}
