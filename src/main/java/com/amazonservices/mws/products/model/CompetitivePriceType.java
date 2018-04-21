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
 * Competitive Price Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * CompetitivePriceType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CompetitivePriceType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CompetitivePriceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Price" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}PriceType"/&gt;
 *          &lt;/sequence&gt;
 *          &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="subcondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;attribute name="belongsToRequester" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CompetitivePriceType", propOrder={
    "competitivePriceId",
    "price"
})
@XmlRootElement(name = "CompetitivePriceType")
public class CompetitivePriceType extends AbstractMwsObject {

    @XmlElement(name="CompetitivePriceId",required=true)
    private String competitivePriceId;

    @XmlElement(name="Price",required=true)
    private PriceType price;

    @XmlAttribute
    private String condition;

    @XmlAttribute
    private String subcondition;

    @XmlAttribute
    private Boolean belongsToRequester;

    /**
     * Get the value of CompetitivePriceId.
     *
     * @return The value of CompetitivePriceId.
     */
    public String getCompetitivePriceId() {
        return competitivePriceId;
    }

    /**
     * Set the value of CompetitivePriceId.
     *
     * @param competitivePriceId
     *            The new value to set.
     */
    public void setCompetitivePriceId(String competitivePriceId) {
        this.competitivePriceId = competitivePriceId;
    }

    /**
     * Check to see if CompetitivePriceId is set.
     *
     * @return true if CompetitivePriceId is set.
     */
    public boolean isSetCompetitivePriceId() {
        return competitivePriceId != null;
    }

    /**
     * Set the value of CompetitivePriceId, return this.
     *
     * @param competitivePriceId
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePriceType withCompetitivePriceId(String competitivePriceId) {
        this.competitivePriceId = competitivePriceId;
        return this;
    }

    /**
     * Get the value of Price.
     *
     * @return The value of Price.
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Set the value of Price.
     *
     * @param price
     *            The new value to set.
     */
    public void setPrice(PriceType price) {
        this.price = price;
    }

    /**
     * Check to see if Price is set.
     *
     * @return true if Price is set.
     */
    public boolean isSetPrice() {
        return price != null;
    }

    /**
     * Set the value of Price, return this.
     *
     * @param price
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePriceType withPrice(PriceType price) {
        this.price = price;
        return this;
    }

    /**
     * Get the value of condition.
     *
     * @return The value of condition.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Set the value of condition.
     *
     * @param condition
     *            The new value to set.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Check to see if condition is set.
     *
     * @return true if condition is set.
     */
    public boolean isSetCondition() {
        return condition != null;
    }

    /**
     * Set the value of condition, return this.
     *
     * @param condition
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePriceType withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the value of subcondition.
     *
     * @return The value of subcondition.
     */
    public String getSubcondition() {
        return subcondition;
    }

    /**
     * Set the value of subcondition.
     *
     * @param subcondition
     *            The new value to set.
     */
    public void setSubcondition(String subcondition) {
        this.subcondition = subcondition;
    }

    /**
     * Check to see if subcondition is set.
     *
     * @return true if subcondition is set.
     */
    public boolean isSetSubcondition() {
        return subcondition != null;
    }

    /**
     * Set the value of subcondition, return this.
     *
     * @param subcondition
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePriceType withSubcondition(String subcondition) {
        this.subcondition = subcondition;
        return this;
    }

    /**
     * Check the value of belongsToRequester.
     *
     * @return true if belongsToRequester is set to true.
     */
    public boolean isBelongsToRequester() {
        return belongsToRequester!=null && belongsToRequester.booleanValue();
    }

    /**
     * Get the value of belongsToRequester.
     *
     * @return The value of belongsToRequester.
     */
    public Boolean getBelongsToRequester() {
        return belongsToRequester;
    }

    /**
     * Set the value of belongsToRequester.
     *
     * @param belongsToRequester
     *            The new value to set.
     */
    public void setBelongsToRequester(Boolean belongsToRequester) {
        this.belongsToRequester = belongsToRequester;
    }

    /**
     * Check to see if belongsToRequester is set.
     *
     * @return true if belongsToRequester is set.
     */
    public boolean isSetBelongsToRequester() {
        return belongsToRequester != null;
    }

    /**
     * Set BelongsToRequester property.
     *
     * @param value
     */
    public void setBelongsToRequester(boolean value) {
        belongsToRequester = Boolean.valueOf(value);
    }

    /**
     * Set BelongsToRequester property to null.
     */
    public void unsetBelongsToRequester() {
        belongsToRequester = null;
    }

    /**
     * Set BelongsToRequester property to null.
     *
     * @param value
     *
     * @return this
     */
    public CompetitivePriceType withBelongsToRequester(boolean value) {
        belongsToRequester = Boolean.valueOf(value);
        return this;
    }

    /**
     * Set the value of belongsToRequester, return this.
     *
     * @param belongsToRequester
     *             The new value to set.
     *
     * @return This instance.
     */
    public CompetitivePriceType withBelongsToRequester(Boolean belongsToRequester) {
        this.belongsToRequester = belongsToRequester;
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
        condition = r.readAttribute("condition", String.class); 
        subcondition = r.readAttribute("subcondition", String.class); 
        belongsToRequester = r.readAttribute("belongsToRequester", Boolean.class); 
        competitivePriceId = r.read("CompetitivePriceId", String.class);
        price = r.read("Price", PriceType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeAttribute("condition",condition);
        w.writeAttribute("subcondition",subcondition);
        w.writeAttribute("belongsToRequester",belongsToRequester);
        w.write("CompetitivePriceId", competitivePriceId);
        w.write("Price", price);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "CompetitivePriceType",this);
    }

    /** Value constructor. */
    public CompetitivePriceType(String competitivePriceId,PriceType price,String condition,String subcondition,Boolean belongsToRequester) {
        this.competitivePriceId = competitivePriceId;
        this.price = price;
        this.condition = condition;
        this.subcondition = subcondition;
        this.belongsToRequester = belongsToRequester;
    }    
    

    /** Default constructor. */
    public CompetitivePriceType() {
        super();
    }

}
