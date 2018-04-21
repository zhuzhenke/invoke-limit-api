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
 * List Marketplace Participations By Next Token Result
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListMarketplaceParticipationsByNextTokenResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListMarketplaceParticipationsByNextTokenResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ListParticipations" type="{https://mws.amazonservices.com/Sellers/2011-07-01}ListParticipations" minOccurs="0"/&gt;
 *             &lt;element name="ListMarketplaces" type="{https://mws.amazonservices.com/Sellers/2011-07-01}ListMarketplaces" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListMarketplaceParticipationsByNextTokenResult", propOrder={
    "nextToken",
    "listParticipations",
    "listMarketplaces"
})
@XmlRootElement(name = "ListMarketplaceParticipationsByNextTokenResult")
public class ListMarketplaceParticipationsByNextTokenResult extends AbstractMwsObject {

    @XmlElement(name="NextToken")
    private String nextToken;

    @XmlElement(name="ListParticipations")
    private ListParticipations listParticipations;

    @XmlElement(name="ListMarketplaces")
    private ListMarketplaces listMarketplaces;

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
    public ListMarketplaceParticipationsByNextTokenResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Get the value of ListParticipations.
     *
     * @return The value of ListParticipations.
     */
    public ListParticipations getListParticipations() {
        return listParticipations;
    }

    /**
     * Set the value of ListParticipations.
     *
     * @param listParticipations
     *            The new value to set.
     */
    public void setListParticipations(ListParticipations listParticipations) {
        this.listParticipations = listParticipations;
    }

    /**
     * Check to see if ListParticipations is set.
     *
     * @return true if ListParticipations is set.
     */
    public boolean isSetListParticipations() {
        return listParticipations != null;
    }

    /**
     * Set the value of ListParticipations, return this.
     *
     * @param listParticipations
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMarketplaceParticipationsByNextTokenResult withListParticipations(ListParticipations listParticipations) {
        this.listParticipations = listParticipations;
        return this;
    }

    /**
     * Get the value of ListMarketplaces.
     *
     * @return The value of ListMarketplaces.
     */
    public ListMarketplaces getListMarketplaces() {
        return listMarketplaces;
    }

    /**
     * Set the value of ListMarketplaces.
     *
     * @param listMarketplaces
     *            The new value to set.
     */
    public void setListMarketplaces(ListMarketplaces listMarketplaces) {
        this.listMarketplaces = listMarketplaces;
    }

    /**
     * Check to see if ListMarketplaces is set.
     *
     * @return true if ListMarketplaces is set.
     */
    public boolean isSetListMarketplaces() {
        return listMarketplaces != null;
    }

    /**
     * Set the value of ListMarketplaces, return this.
     *
     * @param listMarketplaces
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListMarketplaceParticipationsByNextTokenResult withListMarketplaces(ListMarketplaces listMarketplaces) {
        this.listMarketplaces = listMarketplaces;
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
        listParticipations = r.read("ListParticipations", ListParticipations.class);
        listMarketplaces = r.read("ListMarketplaces", ListMarketplaces.class);
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
        w.write("ListParticipations", listParticipations);
        w.write("ListMarketplaces", listMarketplaces);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "ListMarketplaceParticipationsByNextTokenResult",this);
    }

    /** Value constructor. */
    public ListMarketplaceParticipationsByNextTokenResult(String nextToken,ListParticipations listParticipations,ListMarketplaces listMarketplaces) {
        this.nextToken = nextToken;
        this.listParticipations = listParticipations;
        this.listMarketplaces = listMarketplaces;
    }    
    

    /** Default constructor. */
    public ListMarketplaceParticipationsByNextTokenResult() {
        super();
    }

}
