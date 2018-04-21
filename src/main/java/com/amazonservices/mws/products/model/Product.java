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
 * Product
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Product complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Product"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Identifiers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}IdentifierType"/&gt;
 *             &lt;element name="AttributeSets" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}AttributeSetList" minOccurs="0"/&gt;
 *             &lt;element name="Relationships" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}RelationshipList" minOccurs="0"/&gt;
 *             &lt;element name="CompetitivePricing" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}CompetitivePricingType" minOccurs="0"/&gt;
 *             &lt;element name="SalesRankings" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}SalesRankList" minOccurs="0"/&gt;
 *             &lt;element name="LowestOfferListings" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestOfferListingList" minOccurs="0"/&gt;
 *             &lt;element name="Offers" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}OffersList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Product", propOrder={
    "identifiers",
    "attributeSets",
    "relationships",
    "competitivePricing",
    "salesRankings",
    "lowestOfferListings",
    "offers"
})
@XmlRootElement(name = "Product")
public class Product extends AbstractMwsObject {


    @XmlElement(name="Identifiers",required=true)
    private IdentifierType identifiers;

    @XmlElement(name="AttributeSets")
    private AttributeSetList attributeSets;

    @XmlElement(name="Relationships")
    private RelationshipList relationships;

    @XmlElement(name="CompetitivePricing")
    private CompetitivePricingType competitivePricing;

    @XmlElement(name="SalesRankings")
    private SalesRankList salesRankings;

    @XmlElement(name="LowestOfferListings")
    private LowestOfferListingList lowestOfferListings;

    @XmlElement(name="Offers")
    private OffersList offers;

    /**
     * Get the value of Identifiers.
     *
     * @return The value of Identifiers.
     */
    public IdentifierType getIdentifiers() {
        return identifiers;
    }

    /**
     * Set the value of Identifiers.
     *
     * @param identifiers
     *            The new value to set.
     */
    public void setIdentifiers(IdentifierType identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * Check to see if Identifiers is set.
     *
     * @return true if Identifiers is set.
     */
    public boolean isSetIdentifiers() {
        return identifiers != null;
    }

    /**
     * Set the value of Identifiers, return this.
     *
     * @param identifiers
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withIdentifiers(IdentifierType identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get the value of AttributeSets.
     *
     * @return The value of AttributeSets.
     */
    public AttributeSetList getAttributeSets() {
        return attributeSets;
    }

    /**
     * Set the value of AttributeSets.
     *
     * @param attributeSets
     *            The new value to set.
     */
    public void setAttributeSets(AttributeSetList attributeSets) {
        this.attributeSets = attributeSets;
    }

    /**
     * Check to see if AttributeSets is set.
     *
     * @return true if AttributeSets is set.
     */
    public boolean isSetAttributeSets() {
        return attributeSets != null;
    }

    /**
     * Set the value of AttributeSets, return this.
     *
     * @param attributeSets
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withAttributeSets(AttributeSetList attributeSets) {
        this.attributeSets = attributeSets;
        return this;
    }

    /**
     * Get the value of Relationships.
     *
     * @return The value of Relationships.
     */
    public RelationshipList getRelationships() {
        return relationships;
    }

    /**
     * Set the value of Relationships.
     *
     * @param relationships
     *            The new value to set.
     */
    public void setRelationships(RelationshipList relationships) {
        this.relationships = relationships;
    }

    /**
     * Check to see if Relationships is set.
     *
     * @return true if Relationships is set.
     */
    public boolean isSetRelationships() {
        return relationships != null;
    }

    /**
     * Set the value of Relationships, return this.
     *
     * @param relationships
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withRelationships(RelationshipList relationships) {
        this.relationships = relationships;
        return this;
    }

    /**
     * Get the value of CompetitivePricing.
     *
     * @return The value of CompetitivePricing.
     */
    public CompetitivePricingType getCompetitivePricing() {
        return competitivePricing;
    }

    /**
     * Set the value of CompetitivePricing.
     *
     * @param competitivePricing
     *            The new value to set.
     */
    public void setCompetitivePricing(CompetitivePricingType competitivePricing) {
        this.competitivePricing = competitivePricing;
    }

    /**
     * Check to see if CompetitivePricing is set.
     *
     * @return true if CompetitivePricing is set.
     */
    public boolean isSetCompetitivePricing() {
        return competitivePricing != null;
    }

    /**
     * Set the value of CompetitivePricing, return this.
     *
     * @param competitivePricing
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withCompetitivePricing(CompetitivePricingType competitivePricing) {
        this.competitivePricing = competitivePricing;
        return this;
    }

    /**
     * Get the value of SalesRankings.
     *
     * @return The value of SalesRankings.
     */
    public SalesRankList getSalesRankings() {
        return salesRankings;
    }

    /**
     * Set the value of SalesRankings.
     *
     * @param salesRankings
     *            The new value to set.
     */
    public void setSalesRankings(SalesRankList salesRankings) {
        this.salesRankings = salesRankings;
    }

    /**
     * Check to see if SalesRankings is set.
     *
     * @return true if SalesRankings is set.
     */
    public boolean isSetSalesRankings() {
        return salesRankings != null;
    }

    /**
     * Set the value of SalesRankings, return this.
     *
     * @param salesRankings
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withSalesRankings(SalesRankList salesRankings) {
        this.salesRankings = salesRankings;
        return this;
    }

    /**
     * Get the value of LowestOfferListings.
     *
     * @return The value of LowestOfferListings.
     */
    public LowestOfferListingList getLowestOfferListings() {
        return lowestOfferListings;
    }

    /**
     * Set the value of LowestOfferListings.
     *
     * @param lowestOfferListings
     *            The new value to set.
     */
    public void setLowestOfferListings(LowestOfferListingList lowestOfferListings) {
        this.lowestOfferListings = lowestOfferListings;
    }

    /**
     * Check to see if LowestOfferListings is set.
     *
     * @return true if LowestOfferListings is set.
     */
    public boolean isSetLowestOfferListings() {
        return lowestOfferListings != null;
    }

    /**
     * Set the value of LowestOfferListings, return this.
     *
     * @param lowestOfferListings
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withLowestOfferListings(LowestOfferListingList lowestOfferListings) {
        this.lowestOfferListings = lowestOfferListings;
        return this;
    }

    /**
     * Get the value of Offers.
     *
     * @return The value of Offers.
     */
    public OffersList getOffers() {
        return offers;
    }

    /**
     * Set the value of Offers.
     *
     * @param offers
     *            The new value to set.
     */
    public void setOffers(OffersList offers) {
        this.offers = offers;
    }

    /**
     * Check to see if Offers is set.
     *
     * @return true if Offers is set.
     */
    public boolean isSetOffers() {
        return offers != null;
    }

    /**
     * Set the value of Offers, return this.
     *
     * @param offers
     *             The new value to set.
     *
     * @return This instance.
     */
    public Product withOffers(OffersList offers) {
        this.offers = offers;
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
        identifiers = r.read("Identifiers", IdentifierType.class);
        attributeSets = r.read("AttributeSets", AttributeSetList.class);
        relationships = r.read("Relationships", RelationshipList.class);
        competitivePricing = r.read("CompetitivePricing", CompetitivePricingType.class);
        salesRankings = r.read("SalesRankings", SalesRankList.class);
        lowestOfferListings = r.read("LowestOfferListings", LowestOfferListingList.class);
        offers = r.read("Offers", OffersList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Identifiers", identifiers);
        w.write("AttributeSets", attributeSets);
        w.write("Relationships", relationships);
        w.write("CompetitivePricing", competitivePricing);
        w.write("SalesRankings", salesRankings);
        w.write("LowestOfferListings", lowestOfferListings);
        w.write("Offers", offers);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Product",this);
    }

    /** Value constructor. */
    public Product(IdentifierType identifiers,AttributeSetList attributeSets,RelationshipList relationships,CompetitivePricingType competitivePricing,SalesRankList salesRankings,LowestOfferListingList lowestOfferListings,OffersList offers) {
        this.identifiers = identifiers;
        this.attributeSets = attributeSets;
        this.relationships = relationships;
        this.competitivePricing = competitivePricing;
        this.salesRankings = salesRankings;
        this.lowestOfferListings = lowestOfferListings;
        this.offers = offers;
    }    
    

    /** Default constructor. */
    public Product() {
        super();
    }

}
