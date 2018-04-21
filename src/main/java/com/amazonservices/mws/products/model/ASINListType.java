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
 * ASIN List Type
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
 * ASINListType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ASINListType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ASINListType", propOrder={
    "asin"
})
@XmlRootElement(name = "ASINListType")
public class ASINListType extends AbstractMwsObject {

    @XmlElement(name="ASIN")
    private List<String> asin;

    /**
     * Get the value of ASIN.
     *
     * @return The value of ASIN.
     */
    public List<String> getASIN() {
        if (asin==null) {
            asin = new ArrayList<String>();
        }
        return asin;
    }

    /**
     * Set the value of ASIN.
     *
     * @param asin
     *            The new value to set.
     */
    public void setASIN(List<String> asin) {
        this.asin = asin;
    }

    /**
     * Clear ASIN.
     */
    public void unsetASIN() {
        this.asin = null;
    }

    /**
     * Check to see if ASIN is set.
     *
     * @return true if ASIN is set.
     */
    public boolean isSetASIN() {
        return asin != null && !asin.isEmpty();
    }

    /**
     * Add values for ASIN, return this.
     *
     * @param asin
     *             New values to add.
     *
     * @return This instance.
     */
    public ASINListType withASIN(String... values) {
        List<String> list = getASIN();
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
        asin = r.readList("ASIN", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ASIN", asin);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ASINListType",this);
    }

    /** Value constructor. */
    public ASINListType(List<String> asin) {
        this.asin = asin;
    }    
    

    /** Default constructor. */
    public ASINListType() {
        super();
    }

}
