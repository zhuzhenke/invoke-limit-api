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
 * List All Fulfillment Orders Request
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * ListAllFulfillmentOrdersRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListAllFulfillmentOrdersRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="QueryStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="FulfillmentMethod" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentMethodList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListAllFulfillmentOrdersRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplace",
    "queryStartDateTime",
    "fulfillmentMethod"
})
@XmlRootElement(name = "ListAllFulfillmentOrdersRequest")
public class ListAllFulfillmentOrdersRequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="Marketplace")
    private String marketplace;

    @XmlElement(name="QueryStartDateTime")
    private XMLGregorianCalendar queryStartDateTime;

    @XmlElement(name="FulfillmentMethod")
    private FulfillmentMethodList fulfillmentMethod;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of Marketplace.
     *
     * @return The value of Marketplace.
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Set the value of Marketplace.
     *
     * @param marketplace
     *            The new value to set.
     */
    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * Check to see if Marketplace is set.
     *
     * @return true if Marketplace is set.
     */
    public boolean isSetMarketplace() {
        return marketplace != null;
    }

    /**
     * Set the value of Marketplace, return this.
     *
     * @param marketplace
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersRequest withMarketplace(String marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the value of QueryStartDateTime.
     *
     * @return The value of QueryStartDateTime.
     */
    public XMLGregorianCalendar getQueryStartDateTime() {
        return queryStartDateTime;
    }

    /**
     * Set the value of QueryStartDateTime.
     *
     * @param queryStartDateTime
     *            The new value to set.
     */
    public void setQueryStartDateTime(XMLGregorianCalendar queryStartDateTime) {
        this.queryStartDateTime = queryStartDateTime;
    }

    /**
     * Check to see if QueryStartDateTime is set.
     *
     * @return true if QueryStartDateTime is set.
     */
    public boolean isSetQueryStartDateTime() {
        return queryStartDateTime != null;
    }

    /**
     * Set the value of QueryStartDateTime, return this.
     *
     * @param queryStartDateTime
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersRequest withQueryStartDateTime(XMLGregorianCalendar queryStartDateTime) {
        this.queryStartDateTime = queryStartDateTime;
        return this;
    }

    /**
     * Get the value of FulfillmentMethod.
     *
     * @return The value of FulfillmentMethod.
     */
    public FulfillmentMethodList getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    /**
     * Set the value of FulfillmentMethod.
     *
     * @param fulfillmentMethod
     *            The new value to set.
     */
    public void setFulfillmentMethod(FulfillmentMethodList fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }

    /**
     * Check to see if FulfillmentMethod is set.
     *
     * @return true if FulfillmentMethod is set.
     */
    public boolean isSetFulfillmentMethod() {
        return fulfillmentMethod != null;
    }

    /**
     * Set the value of FulfillmentMethod, return this.
     *
     * @param fulfillmentMethod
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersRequest withFulfillmentMethod(FulfillmentMethodList fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        marketplace = r.read("Marketplace", String.class);
        queryStartDateTime = r.read("QueryStartDateTime", XMLGregorianCalendar.class);
        fulfillmentMethod = r.read("FulfillmentMethod", FulfillmentMethodList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("Marketplace", marketplace);
        w.write("QueryStartDateTime", queryStartDateTime);
        w.write("FulfillmentMethod", fulfillmentMethod);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ListAllFulfillmentOrdersRequest",this);
    }

    /** Value constructor. */
    public ListAllFulfillmentOrdersRequest(String sellerId,String mwsAuthToken,String marketplace,XMLGregorianCalendar queryStartDateTime,FulfillmentMethodList fulfillmentMethod) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplace = marketplace;
        this.queryStartDateTime = queryStartDateTime;
        this.fulfillmentMethod = fulfillmentMethod;
    }    

    /** Legacy value constructor. */
    public ListAllFulfillmentOrdersRequest(String sellerId,String marketplace,XMLGregorianCalendar queryStartDateTime,FulfillmentMethodList fulfillmentMethod) {
        this.sellerId = sellerId;
        this.marketplace = marketplace;
        this.queryStartDateTime = queryStartDateTime;
        this.fulfillmentMethod = fulfillmentMethod;
    }
    

    /** Default constructor. */
    public ListAllFulfillmentOrdersRequest() {
        super();
    }

}
