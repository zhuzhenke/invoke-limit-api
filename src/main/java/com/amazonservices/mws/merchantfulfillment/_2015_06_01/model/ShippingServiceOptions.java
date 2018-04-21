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
 * Shipping Service Options
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.*;

/**
 * ShippingServiceOptions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ShippingServiceOptions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="DeliveryExperience" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DeclaredValue" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount" minOccurs="0"/&gt;
 *             &lt;element name="CarrierWillPickUp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ShippingServiceOptions extends AbstractMwsObject {

    private String deliveryExperience;

    private CurrencyAmount declaredValue;

    private boolean carrierWillPickUp;

    /**
     * Get the value of DeliveryExperience.
     *
     * @return The value of DeliveryExperience.
     */
    public String getDeliveryExperience() {
        return deliveryExperience;
    }

    /**
     * Set the value of DeliveryExperience.
     *
     * @param deliveryExperience
     *            The new value to set.
     */
    public void setDeliveryExperience(String deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
    }

    /**
     * Check to see if DeliveryExperience is set.
     *
     * @return true if DeliveryExperience is set.
     */
    public boolean isSetDeliveryExperience() {
        return deliveryExperience != null;
    }

    /**
     * Set the value of DeliveryExperience, return this.
     *
     * @param deliveryExperience
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withDeliveryExperience(String deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
        return this;
    }

    /**
     * Get the value of DeclaredValue.
     *
     * @return The value of DeclaredValue.
     */
    public CurrencyAmount getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Set the value of DeclaredValue.
     *
     * @param declaredValue
     *            The new value to set.
     */
    public void setDeclaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
    }

    /**
     * Check to see if DeclaredValue is set.
     *
     * @return true if DeclaredValue is set.
     */
    public boolean isSetDeclaredValue() {
        return declaredValue != null;
    }

    /**
     * Set the value of DeclaredValue, return this.
     *
     * @param declaredValue
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withDeclaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
        return this;
    }

    /**
     * Check the value of CarrierWillPickUp.
     *
     * @return true if CarrierWillPickUp is set to true.
     */
    public boolean isCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    /**
     * Get the value of CarrierWillPickUp.
     *
     * @return The value of CarrierWillPickUp.
     */
    public boolean getCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    /**
     * Set the value of CarrierWillPickUp.
     *
     * @param carrierWillPickUp
     *            The new value to set.
     */
    public void setCarrierWillPickUp(boolean carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
    }

    /**
     * Set the value of CarrierWillPickUp, return this.
     *
     * @param carrierWillPickUp
     *             The new value to set.
     *
     * @return This instance.
     */
    public ShippingServiceOptions withCarrierWillPickUp(boolean carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
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
        deliveryExperience = r.read("DeliveryExperience", String.class);
        declaredValue = r.read("DeclaredValue", CurrencyAmount.class);
        carrierWillPickUp = r.read("CarrierWillPickUp", boolean.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("DeliveryExperience", deliveryExperience);
        w.write("DeclaredValue", declaredValue);
        w.write("CarrierWillPickUp", carrierWillPickUp);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "ShippingServiceOptions",this);
    }

    /** Value constructor. */
    public ShippingServiceOptions(String deliveryExperience,CurrencyAmount declaredValue,boolean carrierWillPickUp) {
        this.deliveryExperience = deliveryExperience;
        this.declaredValue = declaredValue;
        this.carrierWillPickUp = carrierWillPickUp;
    }    
    

    /** Default constructor. */
    public ShippingServiceOptions() {
        super();
    }

}
