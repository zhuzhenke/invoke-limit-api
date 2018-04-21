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
 * Scheduled Delivery Info
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ScheduledDeliveryInfo complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ScheduledDeliveryInfo"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeliveryTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="DeliveryWindows" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}DeliveryWindowList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ScheduledDeliveryInfo", propOrder={
    "deliveryTimeZone",
    "deliveryWindows"
})
@XmlRootElement(name = "ScheduledDeliveryInfo")
public class ScheduledDeliveryInfo extends AbstractMwsObject {

    @XmlElement(name="DeliveryTimeZone")
    private String deliveryTimeZone;

    @XmlElement(name="DeliveryWindows")
    private DeliveryWindowList deliveryWindows;

    /**
     * Get the value of DeliveryTimeZone.
     *
     * @return The value of DeliveryTimeZone.
     */
    public String getDeliveryTimeZone() {
        return deliveryTimeZone;
    }

    /**
     * Set the value of DeliveryTimeZone.
     *
     * @param deliveryTimeZone
     *            The new value to set.
     */
    public void setDeliveryTimeZone(String deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
    }

    /**
     * Check to see if DeliveryTimeZone is set.
     *
     * @return true if DeliveryTimeZone is set.
     */
    public boolean isSetDeliveryTimeZone() {
        return deliveryTimeZone != null;
    }

    /**
     * Set the value of DeliveryTimeZone, return this.
     *
     * @param deliveryTimeZone
     *             The new value to set.
     *
     * @return This instance.
     */
    public ScheduledDeliveryInfo withDeliveryTimeZone(String deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
        return this;
    }

    /**
     * Get the value of DeliveryWindows.
     *
     * @return The value of DeliveryWindows.
     */
    public DeliveryWindowList getDeliveryWindows() {
        return deliveryWindows;
    }

    /**
     * Set the value of DeliveryWindows.
     *
     * @param deliveryWindows
     *            The new value to set.
     */
    public void setDeliveryWindows(DeliveryWindowList deliveryWindows) {
        this.deliveryWindows = deliveryWindows;
    }

    /**
     * Check to see if DeliveryWindows is set.
     *
     * @return true if DeliveryWindows is set.
     */
    public boolean isSetDeliveryWindows() {
        return deliveryWindows != null;
    }

    /**
     * Set the value of DeliveryWindows, return this.
     *
     * @param deliveryWindows
     *             The new value to set.
     *
     * @return This instance.
     */
    public ScheduledDeliveryInfo withDeliveryWindows(DeliveryWindowList deliveryWindows) {
        this.deliveryWindows = deliveryWindows;
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
        deliveryTimeZone = r.read("DeliveryTimeZone", String.class);
        deliveryWindows = r.read("DeliveryWindows", DeliveryWindowList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeliveryTimeZone", deliveryTimeZone);
        w.write("DeliveryWindows", deliveryWindows);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ScheduledDeliveryInfo",this);
    }

    /** Value constructor. */
    public ScheduledDeliveryInfo(String deliveryTimeZone,DeliveryWindowList deliveryWindows) {
        this.deliveryTimeZone = deliveryTimeZone;
        this.deliveryWindows = deliveryWindows;
    }    
    

    /** Default constructor. */
    public ScheduledDeliveryInfo() {
        super();
    }

}
