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
 * Delivery Window List
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * DeliveryWindowList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DeliveryWindowList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="member" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}DeliveryWindow" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DeliveryWindowList", propOrder={
    "member"
})
@XmlRootElement(name = "DeliveryWindowList")
public class DeliveryWindowList extends AbstractMwsObject {

    @XmlElement(name="member")
    private List<DeliveryWindow> member;

    /**
     * Get the value of member.
     *
     * @return The value of member.
     */
    public List<DeliveryWindow> getMember() {
        if (member==null) {
            member = new ArrayList<DeliveryWindow>();
        }
        return member;
    }

    /**
     * Set the value of member.
     *
     * @param member
     *            The new value to set.
     */
    public void setMember(List<DeliveryWindow> member) {
        this.member = member;
    }

    /**
     * Clear member.
     */
    public void unsetMember() {
        this.member = null;
    }

    /**
     * Check to see if member is set.
     *
     * @return true if member is set.
     */
    public boolean isSetMember() {
        return member != null && !member.isEmpty();
    }

    /**
     * Add values for member, return this.
     *
     * @param member
     *             New values to add.
     *
     * @return This instance.
     */
    public DeliveryWindowList withMember(DeliveryWindow... values) {
        List<DeliveryWindow> list = getMember();
        for (DeliveryWindow value : values) {
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
        member = r.readList("member", DeliveryWindow.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("member", member);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "DeliveryWindowList",this);
    }

    /** Value constructor. */
    public DeliveryWindowList(List<DeliveryWindow> member) {
        this.member = member;
    }    
    

    /** Default constructor. */
    public DeliveryWindowList() {
        super();
    }

}
