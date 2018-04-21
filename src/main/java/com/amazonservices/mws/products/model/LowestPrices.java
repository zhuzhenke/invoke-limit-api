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
 * Lowest Prices
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
 * LowestPrices complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LowestPrices"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="LowestPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestPriceType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="LowestPrices", propOrder={
    "lowestPrice"
})
@XmlRootElement(name = "LowestPrices")
public class LowestPrices extends AbstractMwsObject {

    @XmlElement(name="LowestPrice")
    private List<LowestPriceType> lowestPrice;

    /**
     * Get the value of LowestPrice.
     *
     * @return The value of LowestPrice.
     */
    public List<LowestPriceType> getLowestPrice() {
        if (lowestPrice==null) {
            lowestPrice = new ArrayList<LowestPriceType>();
        }
        return lowestPrice;
    }

    /**
     * Set the value of LowestPrice.
     *
     * @param lowestPrice
     *            The new value to set.
     */
    public void setLowestPrice(List<LowestPriceType> lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    /**
     * Clear LowestPrice.
     */
    public void unsetLowestPrice() {
        this.lowestPrice = null;
    }

    /**
     * Check to see if LowestPrice is set.
     *
     * @return true if LowestPrice is set.
     */
    public boolean isSetLowestPrice() {
        return lowestPrice != null && !lowestPrice.isEmpty();
    }

    /**
     * Add values for LowestPrice, return this.
     *
     * @param lowestPrice
     *             New values to add.
     *
     * @return This instance.
     */
    public LowestPrices withLowestPrice(LowestPriceType... values) {
        List<LowestPriceType> list = getLowestPrice();
        for (LowestPriceType value : values) {
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
        lowestPrice = r.readList("LowestPrice", LowestPriceType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("LowestPrice", lowestPrice);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "LowestPrices",this);
    }

    /** Value constructor. */
    public LowestPrices(List<LowestPriceType> lowestPrice) {
        this.lowestPrice = lowestPrice;
    }    
    

    /** Default constructor. */
    public LowestPrices() {
        super();
    }

}
