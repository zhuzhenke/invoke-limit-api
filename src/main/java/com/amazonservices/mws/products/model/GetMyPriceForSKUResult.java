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
 * Get My Price For SKU Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetMyPriceForSKUResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMyPriceForSKUResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Product" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Product" minOccurs="0"/&gt;
 *             &lt;element name="Error" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMyPriceForSKUResult", propOrder={
    "product",
    "error"
})
@XmlRootElement(name = "GetMyPriceForSKUResult")
public class GetMyPriceForSKUResult extends AbstractMwsObject {

    @XmlElement(name="Product")
    private Product product;

    @XmlElement(name="Error")
    private Error error;

    @XmlAttribute
    private String sellerSKU;

    @XmlAttribute(required=true)
    private String status;

    /**
     * Get the value of Product.
     *
     * @return The value of Product.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set the value of Product.
     *
     * @param product
     *            The new value to set.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Check to see if Product is set.
     *
     * @return true if Product is set.
     */
    public boolean isSetProduct() {
        return product != null;
    }

    /**
     * Set the value of Product, return this.
     *
     * @param product
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMyPriceForSKUResult withProduct(Product product) {
        this.product = product;
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
    public GetMyPriceForSKUResult withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null;
    }

    /**
     * Set the value of SellerSKU, return this.
     *
     * @param sellerSKU
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMyPriceForSKUResult withSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get the value of status.
     *
     * @return The value of status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Check to see if status is set.
     *
     * @return true if status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMyPriceForSKUResult withStatus(String status) {
        this.status = status;
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
        sellerSKU = r.readAttribute("SellerSKU", String.class); 
        status = r.readAttribute("status", String.class); 
        product = r.read("Product", Product.class);
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
        w.writeAttribute("SellerSKU",sellerSKU);
        w.writeAttribute("status",status);
        w.write("Product", product);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMyPriceForSKUResult",this);
    }

    /** Value constructor. */
    public GetMyPriceForSKUResult(Product product,Error error,String sellerSKU,String status) {
        this.product = product;
        this.error = error;
        this.sellerSKU = sellerSKU;
        this.status = status;
    }    
    

    /** Default constructor. */
    public GetMyPriceForSKUResult() {
        super();
    }

}
