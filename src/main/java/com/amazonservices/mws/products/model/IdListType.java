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
 * Id List Type
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
 * IdListType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="IdListType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="IdListType", propOrder={
    "id"
})
@XmlRootElement(name = "IdListType")
public class IdListType extends AbstractMwsObject {

    @XmlElement(name="Id")
    private List<String> id;

    /**
     * Get the value of Id.
     *
     * @return The value of Id.
     */
    public List<String> getId() {
        if (id==null) {
            id = new ArrayList<String>();
        }
        return id;
    }

    /**
     * Set the value of Id.
     *
     * @param id
     *            The new value to set.
     */
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Clear Id.
     */
    public void unsetId() {
        this.id = null;
    }

    /**
     * Check to see if Id is set.
     *
     * @return true if Id is set.
     */
    public boolean isSetId() {
        return id != null && !id.isEmpty();
    }

    /**
     * Add values for Id, return this.
     *
     * @param id
     *             New values to add.
     *
     * @return This instance.
     */
    public IdListType withId(String... values) {
        List<String> list = getId();
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
        id = r.readList("Id", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Id", id);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "IdListType",this);
    }

    /** Value constructor. */
    public IdListType(List<String> id) {
        this.id = id;
    }    
    

    /** Default constructor. */
    public IdListType() {
        super();
    }

}
