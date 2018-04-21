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
 * Label
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.*;

/**
 * Label complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Label"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Dimensions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}LabelDimensions"/&gt;
 *             &lt;element name="FileContents" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}FileContents"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class Label extends AbstractMwsObject {

    private LabelDimensions dimensions;

    private FileContents fileContents;

    /**
     * Get the value of Dimensions.
     *
     * @return The value of Dimensions.
     */
    public LabelDimensions getDimensions() {
        return dimensions;
    }

    /**
     * Set the value of Dimensions.
     *
     * @param dimensions
     *            The new value to set.
     */
    public void setDimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Check to see if Dimensions is set.
     *
     * @return true if Dimensions is set.
     */
    public boolean isSetDimensions() {
        return dimensions != null;
    }

    /**
     * Set the value of Dimensions, return this.
     *
     * @param dimensions
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withDimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the value of FileContents.
     *
     * @return The value of FileContents.
     */
    public FileContents getFileContents() {
        return fileContents;
    }

    /**
     * Set the value of FileContents.
     *
     * @param fileContents
     *            The new value to set.
     */
    public void setFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
    }

    /**
     * Check to see if FileContents is set.
     *
     * @return true if FileContents is set.
     */
    public boolean isSetFileContents() {
        return fileContents != null;
    }

    /**
     * Set the value of FileContents, return this.
     *
     * @param fileContents
     *             The new value to set.
     *
     * @return This instance.
     */
    public Label withFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
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
        dimensions = r.read("Dimensions", LabelDimensions.class);
        fileContents = r.read("FileContents", FileContents.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Dimensions", dimensions);
        w.write("FileContents", fileContents);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "Label",this);
    }

    /** Value constructor. */
    public Label(LabelDimensions dimensions,FileContents fileContents) {
        this.dimensions = dimensions;
        this.fileContents = fileContents;
    }    
    

    /** Default constructor. */
    public Label() {
        super();
    }

}
