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
 * Product List
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
 * ProductList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ProductList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Product" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Product" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ProductList", propOrder={
    "product"
})
@XmlRootElement(name = "ProductList")
public class ProductList extends AbstractMwsObject {

    @XmlElement(name="Product")
    private List<Product> product;

    /**
     * Get the value of Product.
     *
     * @return The value of Product.
     */
    public List<Product> getProduct() {
        if (product==null) {
            product = new ArrayList<Product>();
        }
        return product;
    }

    /**
     * Set the value of Product.
     *
     * @param product
     *            The new value to set.
     */
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    /**
     * Clear Product.
     */
    public void unsetProduct() {
        this.product = null;
    }

    /**
     * Check to see if Product is set.
     *
     * @return true if Product is set.
     */
    public boolean isSetProduct() {
        return product != null && !product.isEmpty();
    }

    /**
     * Add values for Product, return this.
     *
     * @param product
     *             New values to add.
     *
     * @return This instance.
     */
    public ProductList withProduct(Product... values) {
        List<Product> list = getProduct();
        for (Product value : values) {
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
        product = r.readList("Product", Product.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Product", product);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ProductList",this);
    }

    /** Value constructor. */
    public ProductList(List<Product> product) {
        this.product = product;
    }    
    

    /** Default constructor. */
    public ProductList() {
        super();
    }

}
