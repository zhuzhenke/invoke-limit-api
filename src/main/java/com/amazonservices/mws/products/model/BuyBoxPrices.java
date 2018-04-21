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
 * Buy Box Prices
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
 * BuyBoxPrices complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="BuyBoxPrices"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="BuyBoxPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}BuyBoxPriceType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BuyBoxPrices", propOrder={
    "buyBoxPrice"
})
@XmlRootElement(name = "BuyBoxPrices")
public class BuyBoxPrices extends AbstractMwsObject {

    @XmlElement(name="BuyBoxPrice")
    private List<BuyBoxPriceType> buyBoxPrice;

    /**
     * Get the value of BuyBoxPrice.
     *
     * @return The value of BuyBoxPrice.
     */
    public List<BuyBoxPriceType> getBuyBoxPrice() {
        if (buyBoxPrice==null) {
            buyBoxPrice = new ArrayList<BuyBoxPriceType>();
        }
        return buyBoxPrice;
    }

    /**
     * Set the value of BuyBoxPrice.
     *
     * @param buyBoxPrice
     *            The new value to set.
     */
    public void setBuyBoxPrice(List<BuyBoxPriceType> buyBoxPrice) {
        this.buyBoxPrice = buyBoxPrice;
    }

    /**
     * Clear BuyBoxPrice.
     */
    public void unsetBuyBoxPrice() {
        this.buyBoxPrice = null;
    }

    /**
     * Check to see if BuyBoxPrice is set.
     *
     * @return true if BuyBoxPrice is set.
     */
    public boolean isSetBuyBoxPrice() {
        return buyBoxPrice != null && !buyBoxPrice.isEmpty();
    }

    /**
     * Add values for BuyBoxPrice, return this.
     *
     * @param buyBoxPrice
     *             New values to add.
     *
     * @return This instance.
     */
    public BuyBoxPrices withBuyBoxPrice(BuyBoxPriceType... values) {
        List<BuyBoxPriceType> list = getBuyBoxPrice();
        for (BuyBoxPriceType value : values) {
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
        buyBoxPrice = r.readList("BuyBoxPrice", BuyBoxPriceType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("BuyBoxPrice", buyBoxPrice);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "BuyBoxPrices",this);
    }

    /** Value constructor. */
    public BuyBoxPrices(List<BuyBoxPriceType> buyBoxPrice) {
        this.buyBoxPrice = buyBoxPrice;
    }    
    

    /** Default constructor. */
    public BuyBoxPrices() {
        super();
    }

}
