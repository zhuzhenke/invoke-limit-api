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
 * Get Matching Product For Id Result
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetMatchingProductForIdResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMatchingProductForIdResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Products" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ProductList" minOccurs="0"/&gt;
 *             &lt;element name="Error" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="IdType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMatchingProductForIdResult", propOrder={
    "products",
    "error"
})
@XmlRootElement(name = "GetMatchingProductForIdResult")
public class GetMatchingProductForIdResult extends AbstractMwsObject {

    @XmlElement(name="Products")
    private ProductList products;

    @XmlElement(name="Error")
    private Error error;

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String idType;

    @XmlAttribute(required=true)
    private String status;

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
    public GetMatchingProductForIdResult withProducts(ProductList products) {
        this.products = products;
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
    public GetMatchingProductForIdResult withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the value of Id.
     *
     * @return The value of Id.
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of Id.
     *
     * @param id
     *            The new value to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Check to see if Id is set.
     *
     * @return true if Id is set.
     */
    public boolean isSetId() {
        return id != null;
    }

    /**
     * Set the value of Id, return this.
     *
     * @param id
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the value of IdType.
     *
     * @return The value of IdType.
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Set the value of IdType.
     *
     * @param idType
     *            The new value to set.
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Check to see if IdType is set.
     *
     * @return true if IdType is set.
     */
    public boolean isSetIdType() {
        return idType != null;
    }

    /**
     * Set the value of IdType, return this.
     *
     * @param idType
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdResult withIdType(String idType) {
        this.idType = idType;
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
    public GetMatchingProductForIdResult withStatus(String status) {
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
        id = r.readAttribute("Id", String.class); 
        idType = r.readAttribute("IdType", String.class); 
        status = r.readAttribute("status", String.class); 
        products = r.read("Products", ProductList.class);
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
        w.writeAttribute("Id",id);
        w.writeAttribute("IdType",idType);
        w.writeAttribute("status",status);
        w.write("Products", products);
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
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMatchingProductForIdResult",this);
    }

    /** Value constructor. */
    public GetMatchingProductForIdResult(ProductList products,Error error,String id,String idType,String status) {
        this.products = products;
        this.error = error;
        this.id = id;
        this.idType = idType;
        this.status = status;
    }    
    

    /** Default constructor. */
    public GetMatchingProductForIdResult() {
        super();
    }

}
