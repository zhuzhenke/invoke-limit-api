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
 * List Matching Products Request
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import com.amazon.invoke.AmazonBaseRequest;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ListMatchingProductsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMatchingProductsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="QueryContextId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMatchingProductsRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplaceId",
    "query",
    "queryContextId"
})
@XmlRootElement(name = "ListMatchingProductsRequest")
public class ListMatchingProductsRequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    @XmlElement(name="Query",required=true)
    private String query;

    @XmlElement(name="QueryContextId")
    private String queryContextId;

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
    public ListMatchingProductsRequest withSellerId(String sellerId) {
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
    public ListMatchingProductsRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMatchingProductsRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of Query.
     *
     * @return The value of Query.
     */
    public String getQuery() {
        return query;
    }

    /**
     * Set the value of Query.
     *
     * @param query
     *            The new value to set.
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Check to see if Query is set.
     *
     * @return true if Query is set.
     */
    public boolean isSetQuery() {
        return query != null;
    }

    /**
     * Set the value of Query, return this.
     *
     * @param query
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMatchingProductsRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the value of QueryContextId.
     *
     * @return The value of QueryContextId.
     */
    public String getQueryContextId() {
        return queryContextId;
    }

    /**
     * Set the value of QueryContextId.
     *
     * @param queryContextId
     *            The new value to set.
     */
    public void setQueryContextId(String queryContextId) {
        this.queryContextId = queryContextId;
    }

    /**
     * Check to see if QueryContextId is set.
     *
     * @return true if QueryContextId is set.
     */
    public boolean isSetQueryContextId() {
        return queryContextId != null;
    }

    /**
     * Set the value of QueryContextId, return this.
     *
     * @param queryContextId
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMatchingProductsRequest withQueryContextId(String queryContextId) {
        this.queryContextId = queryContextId;
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
        marketplaceId = r.read("MarketplaceId", String.class);
        query = r.read("Query", String.class);
        queryContextId = r.read("QueryContextId", String.class);
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
        w.write("MarketplaceId", marketplaceId);
        w.write("Query", query);
        w.write("QueryContextId", queryContextId);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "ListMatchingProductsRequest",this);
    }

    /** Value constructor. */
    public ListMatchingProductsRequest(String sellerId,String mwsAuthToken,String marketplaceId,String query,String queryContextId) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplaceId = marketplaceId;
        this.query = query;
        this.queryContextId = queryContextId;
    }    

    /** Legacy value constructor. */
    public ListMatchingProductsRequest(String sellerId,String marketplaceId,String query,String queryContextId) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.query = query;
        this.queryContextId = queryContextId;
    }
    

    /** Default constructor. */
    public ListMatchingProductsRequest() {
        super();
    }

}
