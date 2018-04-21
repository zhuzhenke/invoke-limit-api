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
 * Fee Detail
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * FeeDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FeeDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="FeeAmount" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="FeePromotion" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="TaxAmount" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="FinalFee" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType" minOccurs="0"/&gt;
 *             &lt;element name="IncludedFeeDetailList" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}FeeDetailList" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="FeeDetail", propOrder={
    "feeType",
    "feeAmount",
    "feePromotion",
    "taxAmount",
    "finalFee",
    "includedFeeDetailList"
})
@XmlRootElement(name = "FeeDetail")
public class FeeDetail extends AbstractMwsObject {

    @XmlElement(name="FeeType")
    private String feeType;

    @XmlElement(name="FeeAmount")
    private MoneyType feeAmount;

    @XmlElement(name="FeePromotion")
    private MoneyType feePromotion;

    @XmlElement(name="TaxAmount")
    private MoneyType taxAmount;

    @XmlElement(name="FinalFee")
    private MoneyType finalFee;

    @XmlElement(name="IncludedFeeDetailList")
    private FeeDetailList includedFeeDetailList;

    /**
     * Get the value of FeeType.
     *
     * @return The value of FeeType.
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Set the value of FeeType.
     *
     * @param feeType
     *            The new value to set.
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * Check to see if FeeType is set.
     *
     * @return true if FeeType is set.
     */
    public boolean isSetFeeType() {
        return feeType != null;
    }

    /**
     * Set the value of FeeType, return this.
     *
     * @param feeType
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get the value of FeeAmount.
     *
     * @return The value of FeeAmount.
     */
    public MoneyType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Set the value of FeeAmount.
     *
     * @param feeAmount
     *            The new value to set.
     */
    public void setFeeAmount(MoneyType feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Check to see if FeeAmount is set.
     *
     * @return true if FeeAmount is set.
     */
    public boolean isSetFeeAmount() {
        return feeAmount != null;
    }

    /**
     * Set the value of FeeAmount, return this.
     *
     * @param feeAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withFeeAmount(MoneyType feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Get the value of FeePromotion.
     *
     * @return The value of FeePromotion.
     */
    public MoneyType getFeePromotion() {
        return feePromotion;
    }

    /**
     * Set the value of FeePromotion.
     *
     * @param feePromotion
     *            The new value to set.
     */
    public void setFeePromotion(MoneyType feePromotion) {
        this.feePromotion = feePromotion;
    }

    /**
     * Check to see if FeePromotion is set.
     *
     * @return true if FeePromotion is set.
     */
    public boolean isSetFeePromotion() {
        return feePromotion != null;
    }

    /**
     * Set the value of FeePromotion, return this.
     *
     * @param feePromotion
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withFeePromotion(MoneyType feePromotion) {
        this.feePromotion = feePromotion;
        return this;
    }

    /**
     * Get the value of TaxAmount.
     *
     * @return The value of TaxAmount.
     */
    public MoneyType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Set the value of TaxAmount.
     *
     * @param taxAmount
     *            The new value to set.
     */
    public void setTaxAmount(MoneyType taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Check to see if TaxAmount is set.
     *
     * @return true if TaxAmount is set.
     */
    public boolean isSetTaxAmount() {
        return taxAmount != null;
    }

    /**
     * Set the value of TaxAmount, return this.
     *
     * @param taxAmount
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withTaxAmount(MoneyType taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get the value of FinalFee.
     *
     * @return The value of FinalFee.
     */
    public MoneyType getFinalFee() {
        return finalFee;
    }

    /**
     * Set the value of FinalFee.
     *
     * @param finalFee
     *            The new value to set.
     */
    public void setFinalFee(MoneyType finalFee) {
        this.finalFee = finalFee;
    }

    /**
     * Check to see if FinalFee is set.
     *
     * @return true if FinalFee is set.
     */
    public boolean isSetFinalFee() {
        return finalFee != null;
    }

    /**
     * Set the value of FinalFee, return this.
     *
     * @param finalFee
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withFinalFee(MoneyType finalFee) {
        this.finalFee = finalFee;
        return this;
    }

    /**
     * Get the value of IncludedFeeDetailList.
     *
     * @return The value of IncludedFeeDetailList.
     */
    public FeeDetailList getIncludedFeeDetailList() {
        return includedFeeDetailList;
    }

    /**
     * Set the value of IncludedFeeDetailList.
     *
     * @param includedFeeDetailList
     *            The new value to set.
     */
    public void setIncludedFeeDetailList(FeeDetailList includedFeeDetailList) {
        this.includedFeeDetailList = includedFeeDetailList;
    }

    /**
     * Check to see if IncludedFeeDetailList is set.
     *
     * @return true if IncludedFeeDetailList is set.
     */
    public boolean isSetIncludedFeeDetailList() {
        return includedFeeDetailList != null;
    }

    /**
     * Set the value of IncludedFeeDetailList, return this.
     *
     * @param includedFeeDetailList
     *             The new value to set.
     *
     * @return This instance.
     */
    public FeeDetail withIncludedFeeDetailList(FeeDetailList includedFeeDetailList) {
        this.includedFeeDetailList = includedFeeDetailList;
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
        feeType = r.read("FeeType", String.class);
        feeAmount = r.read("FeeAmount", MoneyType.class);
        feePromotion = r.read("FeePromotion", MoneyType.class);
        taxAmount = r.read("TaxAmount", MoneyType.class);
        finalFee = r.read("FinalFee", MoneyType.class);
        includedFeeDetailList = r.read("IncludedFeeDetailList", FeeDetailList.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("FeeType", feeType);
        w.write("FeeAmount", feeAmount);
        w.write("FeePromotion", feePromotion);
        w.write("TaxAmount", taxAmount);
        w.write("FinalFee", finalFee);
        w.write("IncludedFeeDetailList", includedFeeDetailList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "FeeDetail",this);
    }

    /** Value constructor. */
    public FeeDetail(String feeType,MoneyType feeAmount,MoneyType feePromotion,MoneyType taxAmount,MoneyType finalFee,FeeDetailList includedFeeDetailList) {
        this.feeType = feeType;
        this.feeAmount = feeAmount;
        this.feePromotion = feePromotion;
        this.taxAmount = taxAmount;
        this.finalFee = finalFee;
        this.includedFeeDetailList = includedFeeDetailList;
    }    
    

    /** Default constructor. */
    public FeeDetail() {
        super();
    }

}
