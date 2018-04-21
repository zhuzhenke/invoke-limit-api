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
 * Seller Feedback Type
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * SellerFeedbackType complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SellerFeedbackType"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerPositiveFeedbackRating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *             &lt;element name="FeedbackCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SellerFeedbackType", propOrder={
    "sellerPositiveFeedbackRating",
    "feedbackCount"
})
@XmlRootElement(name = "SellerFeedbackType")
public class SellerFeedbackType extends AbstractMwsObject {

    @XmlElement(name="SellerPositiveFeedbackRating")
    private Double sellerPositiveFeedbackRating;

    @XmlElement(name="FeedbackCount",required=true)
    private long feedbackCount;

    /**
     * Get the value of SellerPositiveFeedbackRating.
     *
     * @return The value of SellerPositiveFeedbackRating.
     */
    public Double getSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating;
    }

    /**
     * Set the value of SellerPositiveFeedbackRating.
     *
     * @param sellerPositiveFeedbackRating
     *            The new value to set.
     */
    public void setSellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    }

    /**
     * Check to see if SellerPositiveFeedbackRating is set.
     *
     * @return true if SellerPositiveFeedbackRating is set.
     */
    public boolean isSetSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating != null;
    }

    /**
     * Set the value of SellerPositiveFeedbackRating, return this.
     *
     * @param sellerPositiveFeedbackRating
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerFeedbackType withSellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
        return this;
    }

    /**
     * Get the value of FeedbackCount.
     *
     * @return The value of FeedbackCount.
     */
    public long getFeedbackCount() {
        return feedbackCount;
    }

    /**
     * Set the value of FeedbackCount.
     *
     * @param feedbackCount
     *            The new value to set.
     */
    public void setFeedbackCount(long feedbackCount) {
        this.feedbackCount = feedbackCount;
    }

    /**
     * Set the value of FeedbackCount, return this.
     *
     * @param feedbackCount
     *             The new value to set.
     *
     * @return This instance.
     */
    public SellerFeedbackType withFeedbackCount(long feedbackCount) {
        this.feedbackCount = feedbackCount;
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
        sellerPositiveFeedbackRating = r.read("SellerPositiveFeedbackRating", Double.class);
        feedbackCount = r.read("FeedbackCount", long.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerPositiveFeedbackRating", sellerPositiveFeedbackRating);
        w.write("FeedbackCount", feedbackCount);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "SellerFeedbackType",this);
    }

    /** Value constructor. */
    public SellerFeedbackType(Double sellerPositiveFeedbackRating,long feedbackCount) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
        this.feedbackCount = feedbackCount;
    }    
    

    /** Default constructor. */
    public SellerFeedbackType() {
        super();
    }

}
