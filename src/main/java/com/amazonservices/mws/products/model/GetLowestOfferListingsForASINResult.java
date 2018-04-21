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
 * Get Lowest Offer Listings For ASIN Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetLowestOfferListingsForASINResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetLowestOfferListingsForASINResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AllOfferListingsConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="Product" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Product" minOccurs="0"/&gt;
 *             &lt;element name="Error" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetLowestOfferListingsForASINResult", propOrder={
    "allOfferListingsConsidered",
    "product",
    "error"
})
@XmlRootElement(name = "GetLowestOfferListingsForASINResult")
public class GetLowestOfferListingsForASINResult extends AbstractMwsObject {

    @XmlElement(name="AllOfferListingsConsidered")
    private Boolean allOfferListingsConsidered;

    @XmlElement(name="Product")
    private Product product;

    @XmlElement(name="Error")
    private Error error;

    @XmlAttribute
    private String asin;

    @XmlAttribute(required=true)
    private String status;

    /**
     * Check the value of AllOfferListingsConsidered.
     *
     * @return true if AllOfferListingsConsidered is set to true.
     */
    public boolean isAllOfferListingsConsidered() {
        return allOfferListingsConsidered!=null && allOfferListingsConsidered.booleanValue();
    }

    /**
     * Get the value of AllOfferListingsConsidered.
     *
     * @return The value of AllOfferListingsConsidered.
     */
    public Boolean getAllOfferListingsConsidered() {
        return allOfferListingsConsidered;
    }

    /**
     * Set the value of AllOfferListingsConsidered.
     *
     * @param allOfferListingsConsidered
     *            The new value to set.
     */
    public void setAllOfferListingsConsidered(Boolean allOfferListingsConsidered) {
        this.allOfferListingsConsidered = allOfferListingsConsidered;
    }

    /**
     * Check to see if AllOfferListingsConsidered is set.
     *
     * @return true if AllOfferListingsConsidered is set.
     */
    public boolean isSetAllOfferListingsConsidered() {
        return allOfferListingsConsidered != null;
    }

    /**
     * Set the value of AllOfferListingsConsidered, return this.
     *
     * @param allOfferListingsConsidered
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForASINResult withAllOfferListingsConsidered(Boolean allOfferListingsConsidered) {
        this.allOfferListingsConsidered = allOfferListingsConsidered;
        return this;
    }

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
    public GetLowestOfferListingsForASINResult withProduct(Product product) {
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
    public GetLowestOfferListingsForASINResult withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(String asin) {
        this.asin = asin;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null;
    }

    /**
     * Set the value of ASIN, return this.
     *
     * @param asin
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetLowestOfferListingsForASINResult withASIN(String asin) {
        this.asin = asin;
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
    public GetLowestOfferListingsForASINResult withStatus(String status) {
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
        asin = r.readAttribute("ASIN", String.class); 
        status = r.readAttribute("status", String.class); 
        allOfferListingsConsidered = r.read("AllOfferListingsConsidered", Boolean.class);
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
        w.writeAttribute("ASIN",asin);
        w.writeAttribute("status",status);
        w.write("AllOfferListingsConsidered", allOfferListingsConsidered);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetLowestOfferListingsForASINResult",this);
    }

    /** Value constructor. */
    public GetLowestOfferListingsForASINResult(Boolean allOfferListingsConsidered,Product product,Error error,String asin,String status) {
        this.allOfferListingsConsidered = allOfferListingsConsidered;
        this.product = product;
        this.error = error;
        this.asin = asin;
        this.status = status;
    }    
    

    /** Default constructor. */
    public GetLowestOfferListingsForASINResult() {
        super();
    }

}
