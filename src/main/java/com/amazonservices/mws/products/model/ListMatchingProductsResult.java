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
 * List Matching Products Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListMatchingProductsResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMatchingProductsResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Products" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ProductList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMatchingProductsResult", propOrder={
    "products"
})
@XmlRootElement(name = "ListMatchingProductsResult")
public class ListMatchingProductsResult extends AbstractMwsObject {

    @XmlElement(name="Products")
    private ProductList products;

    /**
     * Get the value of Products.
     *
     * @return The value of Products.
     */
    public ProductList getProducts() {
        return products;
    }

    /**
     * Set the value of Products.
     *
     * @param products
     *            The new value to set.
     */
    public void setProducts(ProductList products) {
        this.products = products;
    }

    /**
     * Check to see if Products is set.
     *
     * @return true if Products is set.
     */
    public boolean isSetProducts() {
        return products != null;
    }

    /**
     * Set the value of Products, return this.
     *
     * @param products
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMatchingProductsResult withProducts(ProductList products) {
        this.products = products;
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
        products = r.read("Products", ProductList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Products", products);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ListMatchingProductsResult",this);
    }

    /** Value constructor. */
    public ListMatchingProductsResult(ProductList products) {
        this.products = products;
    }    
    

    /** Default constructor. */
    public ListMatchingProductsResult() {
        super();
    }

}
