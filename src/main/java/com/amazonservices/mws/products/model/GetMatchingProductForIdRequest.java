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
 * Get Matching Product For Id Request
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
 * GetMatchingProductForIdRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMatchingProductForIdRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="IdList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}IdListType"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMatchingProductForIdRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "marketplaceId",
    "idType",
    "idList"
})
@XmlRootElement(name = "GetMatchingProductForIdRequest")
public class GetMatchingProductForIdRequest extends AbstractMwsObject implements AmazonBaseRequest {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="MarketplaceId",required=true)
    private String marketplaceId;

    @XmlElement(name="IdType",required=true)
    private String idType;

    @XmlElement(name="IdList",required=true)
    private IdListType idList;

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
    public GetMatchingProductForIdRequest withSellerId(String sellerId) {
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
    public GetMatchingProductForIdRequest withMWSAuthToken(String mwsAuthToken) {
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
    public GetMatchingProductForIdRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the value of IdType.
     *
     * @return The value of IdType.
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Set the value of IdType.
     *
     * @param idType
     *            The new value to set.
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Check to see if IdType is set.
     *
     * @return true if IdType is set.
     */
    public boolean isSetIdType() {
        return idType != null;
    }

    /**
     * Set the value of IdType, return this.
     *
     * @param idType
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdRequest withIdType(String idType) {
        this.idType = idType;
        return this;
    }

    /**
     * Get the value of IdList.
     *
     * @return The value of IdList.
     */
    public IdListType getIdList() {
        return idList;
    }

    /**
     * Set the value of IdList.
     *
     * @param idList
     *            The new value to set.
     */
    public void setIdList(IdListType idList) {
        this.idList = idList;
    }

    /**
     * Check to see if IdList is set.
     *
     * @return true if IdList is set.
     */
    public boolean isSetIdList() {
        return idList != null;
    }

    /**
     * Set the value of IdList, return this.
     *
     * @param idList
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdRequest withIdList(IdListType idList) {
        this.idList = idList;
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
        idType = r.read("IdType", String.class);
        idList = r.read("IdList", IdListType.class);
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
        w.write("IdType", idType);
        w.write("IdList", idList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMatchingProductForIdRequest",this);
    }

    /** Value constructor. */
    public GetMatchingProductForIdRequest(String sellerId,String mwsAuthToken,String marketplaceId,String idType,IdListType idList) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.marketplaceId = marketplaceId;
        this.idType = idType;
        this.idList = idList;
    }    

    /** Legacy value constructor. */
    public GetMatchingProductForIdRequest(String sellerId,String marketplaceId,String idType,IdListType idList) {
        this.sellerId = sellerId;
        this.marketplaceId = marketplaceId;
        this.idType = idType;
        this.idList = idList;
    }
    

    /** Default constructor. */
    public GetMatchingProductForIdRequest() {
        super();
    }

}
