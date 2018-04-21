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
 * List All Fulfillment Orders By Next Token Result
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListAllFulfillmentOrdersByNextTokenResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListAllFulfillmentOrdersByNextTokenResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FulfillmentOrders" type="{http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/}FulfillmentOrderList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListAllFulfillmentOrdersByNextTokenResult", propOrder={
    "nextToken",
    "fulfillmentOrders"
})
@XmlRootElement(name = "ListAllFulfillmentOrdersByNextTokenResult")
public class ListAllFulfillmentOrdersByNextTokenResult extends AbstractMwsObject {

    @XmlElement(name="NextToken",required=true)
    private String nextToken;

    @XmlElement(name="FulfillmentOrders")
    private FulfillmentOrderList fulfillmentOrders;

    /**
     * Get the value of NextToken.
     *
     * @return The value of NextToken.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Set the value of NextToken.
     *
     * @param nextToken
     *            The new value to set.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Check to see if NextToken is set.
     *
     * @return true if NextToken is set.
     */
    public boolean isSetNextToken() {
        return nextToken != null;
    }

    /**
     * Set the value of NextToken, return this.
     *
     * @param nextToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersByNextTokenResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Get the value of FulfillmentOrders.
     *
     * @return The value of FulfillmentOrders.
     */
    public FulfillmentOrderList getFulfillmentOrders() {
        return fulfillmentOrders;
    }

    /**
     * Set the value of FulfillmentOrders.
     *
     * @param fulfillmentOrders
     *            The new value to set.
     */
    public void setFulfillmentOrders(FulfillmentOrderList fulfillmentOrders) {
        this.fulfillmentOrders = fulfillmentOrders;
    }

    /**
     * Check to see if FulfillmentOrders is set.
     *
     * @return true if FulfillmentOrders is set.
     */
    public boolean isSetFulfillmentOrders() {
        return fulfillmentOrders != null;
    }

    /**
     * Set the value of FulfillmentOrders, return this.
     *
     * @param fulfillmentOrders
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListAllFulfillmentOrdersByNextTokenResult withFulfillmentOrders(FulfillmentOrderList fulfillmentOrders) {
        this.fulfillmentOrders = fulfillmentOrders;
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
        nextToken = r.read("NextToken", String.class);
        fulfillmentOrders = r.read("FulfillmentOrders", FulfillmentOrderList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("NextToken", nextToken);
        w.write("FulfillmentOrders", fulfillmentOrders);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentOutboundShipment/2010-10-01/", "ListAllFulfillmentOrdersByNextTokenResult",this);
    }

    /** Value constructor. */
    public ListAllFulfillmentOrdersByNextTokenResult(String nextToken,FulfillmentOrderList fulfillmentOrders) {
        this.nextToken = nextToken;
        this.fulfillmentOrders = fulfillmentOrders;
    }    
    

    /** Default constructor. */
    public ListAllFulfillmentOrdersByNextTokenResult() {
        super();
    }

}
