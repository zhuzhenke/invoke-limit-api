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
 * Message List
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
 * MessageList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="MessageList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Message" type="{https://mws.amazonservices.com/Sellers/2011-07-01}Message" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="MessageList", propOrder={
    "message"
})
@XmlRootElement(name = "MessageList")
public class MessageList extends AbstractMwsObject {

    @XmlElement(name="Message")
    private List<Message> message;

    /**
     * Get the value of Message.
     *
     * @return The value of Message.
     */
    public List<Message> getMessage() {
        if (message==null) {
            message = new ArrayList<Message>();
        }
        return message;
    }

    /**
     * Set the value of Message.
     *
     * @param message
     *            The new value to set.
     */
    public void setMessage(List<Message> message) {
        this.message = message;
    }

    /**
     * Clear Message.
     */
    public void unsetMessage() {
        this.message = null;
    }

    /**
     * Check to see if Message is set.
     *
     * @return true if Message is set.
     */
    public boolean isSetMessage() {
        return message != null && !message.isEmpty();
    }

    /**
     * Add values for Message, return this.
     *
     * @param message
     *             New values to add.
     *
     * @return This instance.
     */
    public MessageList withMessage(Message... values) {
        List<Message> list = getMessage();
        for (Message value : values) {
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
        message = r.readList("Message", Message.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Message", message);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "MessageList",this);
    }

    /** Value constructor. */
    public MessageList(List<Message> message) {
        this.message = message;
    }    
    

    /** Default constructor. */
    public MessageList() {
        super();
    }

}
