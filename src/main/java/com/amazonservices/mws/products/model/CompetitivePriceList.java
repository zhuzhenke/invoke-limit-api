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
 * Competitive Price List
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
 * CompetitivePriceList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CompetitivePriceList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CompetitivePrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}CompetitivePriceType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CompetitivePriceList", propOrder={
    "competitivePrice"
})
@XmlRootElement(name = "CompetitivePriceList")
public class CompetitivePriceList extends AbstractMwsObject {

    @XmlElement(name="CompetitivePrice")
    private List<CompetitivePriceType> competitivePrice;

    /**
     * Get the value of CompetitivePrice.
     *
     * @return The value of CompetitivePrice.
     */
    public List<CompetitivePriceType> getCompetitivePrice() {
        if (competitivePrice==null) {
            competitivePrice = new ArrayList<CompetitivePriceType>();
        }
        return competitivePrice;
    }

    /**
     * Set the value of CompetitivePrice.
     *
     * @param competitivePrice
     *            The new value to set.
     */
    public void setCompetitivePrice(List<CompetitivePriceType> competitivePrice) {
        this.competitivePrice = competitivePrice;
    }

    /**
     * Clear CompetitivePrice.
     */
    public void unsetCompetitivePrice() {
        this.competitivePrice = null;
    }

    /**
     * Check to see if CompetitivePrice is set.
     *
     * @return true if CompetitivePrice is set.
     */
    public boolean isSetCompetitivePrice() {
        return competitivePrice != null && !competitivePrice.isEmpty();
    }

    /**
     * Add values for CompetitivePrice, return this.
     *
     * @param competitivePrice
     *             New values to add.
     *
     * @return This instance.
     */
    public CompetitivePriceList withCompetitivePrice(CompetitivePriceType... values) {
        List<CompetitivePriceType> list = getCompetitivePrice();
        for (CompetitivePriceType value : values) {
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
        competitivePrice = r.readList("CompetitivePrice", CompetitivePriceType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("CompetitivePrice", competitivePrice);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "CompetitivePriceList",this);
    }

    /** Value constructor. */
    public CompetitivePriceList(List<CompetitivePriceType> competitivePrice) {
        this.competitivePrice = competitivePrice;
    }    
    

    /** Default constructor. */
    public CompetitivePriceList() {
        super();
    }

}
