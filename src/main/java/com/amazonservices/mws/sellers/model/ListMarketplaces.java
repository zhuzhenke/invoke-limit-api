/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * List Marketplaces
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListMarketplaces complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMarketplaces"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Marketplace" type="{https://mws.amazonservices.com/Sellers/2011-07-01}Marketplace" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMarketplaces", propOrder={
    "marketplace"
})
@XmlRootElement(name = "ListMarketplaces")
public class ListMarketplaces extends AbstractMwsObject {

    @XmlElement(name="Marketplace")
    private List<Marketplace> marketplace;

    /**
     * Get the value of Marketplace.
     *
     * @return The value of Marketplace.
     */
    public List<Marketplace> getMarketplace() {
        if (marketplace==null) {
            marketplace = new ArrayList<Marketplace>();
        }
        return marketplace;
    }

    /**
     * Set the value of Marketplace.
     *
     * @param marketplace
     *            The new value to set.
     */
    public void setMarketplace(List<Marketplace> marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * Clear Marketplace.
     */
    public void unsetMarketplace() {
        this.marketplace = null;
    }

    /**
     * Check to see if Marketplace is set.
     *
     * @return true if Marketplace is set.
     */
    public boolean isSetMarketplace() {
        return marketplace != null && !marketplace.isEmpty();
    }

    /**
     * Add values for Marketplace, return this.
     *
     * @param marketplace
     *             New values to add.
     *
     * @return This instance.
     */
    public ListMarketplaces withMarketplace(Marketplace... values) {
        List<Marketplace> list = getMarketplace();
        for (Marketplace value : values) {
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
        marketplace = r.readList("Marketplace", Marketplace.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Marketplace", marketplace);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "ListMarketplaces",this);
    }

    /** Value constructor. */
    public ListMarketplaces(List<Marketplace> marketplace) {
        this.marketplace = marketplace;
    }    
    

    /** Default constructor. */
    public ListMarketplaces() {
        super();
    }

}
