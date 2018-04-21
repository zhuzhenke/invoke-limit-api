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
 * Seller SKU List Type
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
 * SellerSKUListType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SellerSKUListType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SellerSKUListType", propOrder={
    "sellerSKU"
})
@XmlRootElement(name = "SellerSKUListType")
public class SellerSKUListType extends AbstractMwsObject {

    @XmlElement(name="SellerSKU")
    private List<String> sellerSKU;

    /**
     * Get the value of SellerSKU.
     *
     * @return The value of SellerSKU.
     */
    public List<String> getSellerSKU() {
        if (sellerSKU==null) {
            sellerSKU = new ArrayList<String>();
        }
        return sellerSKU;
    }

    /**
     * Set the value of SellerSKU.
     *
     * @param sellerSKU
     *            The new value to set.
     */
    public void setSellerSKU(List<String> sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * Clear SellerSKU.
     */
    public void unsetSellerSKU() {
        this.sellerSKU = null;
    }

    /**
     * Check to see if SellerSKU is set.
     *
     * @return true if SellerSKU is set.
     */
    public boolean isSetSellerSKU() {
        return sellerSKU != null && !sellerSKU.isEmpty();
    }

    /**
     * Add values for SellerSKU, return this.
     *
     * @param sellerSKU
     *             New values to add.
     *
     * @return This instance.
     */
    public SellerSKUListType withSellerSKU(String... values) {
        List<String> list = getSellerSKU();
        for (String value : values) {
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
        sellerSKU = r.readList("SellerSKU", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("SellerSKU", sellerSKU);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "SellerSKUListType",this);
    }

    /** Value constructor. */
    public SellerSKUListType(List<String> sellerSKU) {
        this.sellerSKU = sellerSKU;
    }    
    

    /** Default constructor. */
    public SellerSKUListType() {
        super();
    }

}
