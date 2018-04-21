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
 * Number Of Offer Listings List
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
 * NumberOfOfferListingsList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="NumberOfOfferListingsList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="OfferListingCount" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}OfferListingCountType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="NumberOfOfferListingsList", propOrder={
    "offerListingCount"
})
@XmlRootElement(name = "NumberOfOfferListingsList")
public class NumberOfOfferListingsList extends AbstractMwsObject {

    @XmlElement(name="OfferListingCount")
    private List<OfferListingCountType> offerListingCount;

    /**
     * Get the value of OfferListingCount.
     *
     * @return The value of OfferListingCount.
     */
    public List<OfferListingCountType> getOfferListingCount() {
        if (offerListingCount==null) {
            offerListingCount = new ArrayList<OfferListingCountType>();
        }
        return offerListingCount;
    }

    /**
     * Set the value of OfferListingCount.
     *
     * @param offerListingCount
     *            The new value to set.
     */
    public void setOfferListingCount(List<OfferListingCountType> offerListingCount) {
        this.offerListingCount = offerListingCount;
    }

    /**
     * Clear OfferListingCount.
     */
    public void unsetOfferListingCount() {
        this.offerListingCount = null;
    }

    /**
     * Check to see if OfferListingCount is set.
     *
     * @return true if OfferListingCount is set.
     */
    public boolean isSetOfferListingCount() {
        return offerListingCount != null && !offerListingCount.isEmpty();
    }

    /**
     * Add values for OfferListingCount, return this.
     *
     * @param offerListingCount
     *             New values to add.
     *
     * @return This instance.
     */
    public NumberOfOfferListingsList withOfferListingCount(OfferListingCountType... values) {
        List<OfferListingCountType> list = getOfferListingCount();
        for (OfferListingCountType value : values) {
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
        offerListingCount = r.readList("OfferListingCount", OfferListingCountType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("OfferListingCount", offerListingCount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "NumberOfOfferListingsList",this);
    }

    /** Value constructor. */
    public NumberOfOfferListingsList(List<OfferListingCountType> offerListingCount) {
        this.offerListingCount = offerListingCount;
    }    
    

    /** Default constructor. */
    public NumberOfOfferListingsList() {
        super();
    }

}
