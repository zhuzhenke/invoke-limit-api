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
 * Get Service Status Result
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetServiceStatusResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetServiceStatusResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Messages" type="{https://mws.amazonservices.com/Sellers/2011-07-01}MessageList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetServiceStatusResult", propOrder={
    "status",
    "timestamp",
    "messageId",
    "messages"
})
@XmlRootElement(name = "GetServiceStatusResult")
public class GetServiceStatusResult extends AbstractMwsObject {

    @XmlElement(name="Status")
    private ServiceStatusEnum status;

    @XmlElement(name="Timestamp")
    private XMLGregorianCalendar timestamp;

    @XmlElement(name="MessageId")
    private String messageId;

    @XmlElement(name="Messages")
    private MessageList messages;

    /**
     * Get the value of Status.
     *
     * @return The value of Status.
     */
    public ServiceStatusEnum getStatus() {
        return status;
    }

    /**
     * Set the value of Status.
     *
     * @param status
     *            The new value to set.
     */
    public void setStatus(ServiceStatusEnum status) {
        this.status = status;
    }

    /**
     * Check to see if Status is set.
     *
     * @return true if Status is set.
     */
    public boolean isSetStatus() {
        return status != null;
    }

    /**
     * Set the value of Status, return this.
     *
     * @param status
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResult withStatus(ServiceStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get the value of Timestamp.
     *
     * @return The value of Timestamp.
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Set the value of Timestamp.
     *
     * @param timestamp
     *            The new value to set.
     */
    public void setTimestamp(XMLGregorianCalendar timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Check to see if Timestamp is set.
     *
     * @return true if Timestamp is set.
     */
    public boolean isSetTimestamp() {
        return timestamp != null;
    }

    /**
     * Set the value of Timestamp, return this.
     *
     * @param timestamp
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResult withTimestamp(XMLGregorianCalendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the value of MessageId.
     *
     * @return The value of MessageId.
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Set the value of MessageId.
     *
     * @param messageId
     *            The new value to set.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Check to see if MessageId is set.
     *
     * @return true if MessageId is set.
     */
    public boolean isSetMessageId() {
        return messageId != null;
    }

    /**
     * Set the value of MessageId, return this.
     *
     * @param messageId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the value of Messages.
     *
     * @return The value of Messages.
     */
    public MessageList getMessages() {
        return messages;
    }

    /**
     * Set the value of Messages.
     *
     * @param messages
     *            The new value to set.
     */
    public void setMessages(MessageList messages) {
        this.messages = messages;
    }

    /**
     * Check to see if Messages is set.
     *
     * @return true if Messages is set.
     */
    public boolean isSetMessages() {
        return messages != null;
    }

    /**
     * Set the value of Messages, return this.
     *
     * @param messages
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetServiceStatusResult withMessages(MessageList messages) {
        this.messages = messages;
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
        status = r.read("Status", ServiceStatusEnum.class);
        timestamp = r.read("Timestamp", XMLGregorianCalendar.class);
        messageId = r.read("MessageId", String.class);
        messages = r.read("Messages", MessageList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Status", status);
        w.write("Timestamp", timestamp);
        w.write("MessageId", messageId);
        w.write("Messages", messages);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "GetServiceStatusResult",this);
    }

    /** Value constructor. */
    public GetServiceStatusResult(ServiceStatusEnum status,XMLGregorianCalendar timestamp,String messageId,MessageList messages) {
        this.status = status;
        this.timestamp = timestamp;
        this.messageId = messageId;
        this.messages = messages;
    }    
    

    /** Default constructor. */
    public GetServiceStatusResult() {
        super();
    }

}
