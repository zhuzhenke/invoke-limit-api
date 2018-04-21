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
 * File Contents
 * API Version: 2015-06-01
 * Library Version: 2016-03-30
 * Generated: Tue Mar 29 18:59:55 UTC 2016
 */
package com.amazonservices.mws.merchantfulfillment._2015_06_01.model;

import com.amazonservices.mws.client.*;

/**
 * FileContents complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FileContents"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Contents" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="FileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FileContents extends AbstractMwsObject {

    private String contents;

    private String fileType;

    private String checksum;

    /**
     * Get the value of Contents.
     *
     * @return The value of Contents.
     */
    public String getContents() {
        return contents;
    }

    /**
     * Set the value of Contents.
     *
     * @param contents
     *            The new value to set.
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Check to see if Contents is set.
     *
     * @return true if Contents is set.
     */
    public boolean isSetContents() {
        return contents != null;
    }

    /**
     * Set the value of Contents, return this.
     *
     * @param contents
     *             The new value to set.
     *
     * @return This instance.
     */
    public FileContents withContents(String contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get the value of FileType.
     *
     * @return The value of FileType.
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Set the value of FileType.
     *
     * @param fileType
     *            The new value to set.
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * Check to see if FileType is set.
     *
     * @return true if FileType is set.
     */
    public boolean isSetFileType() {
        return fileType != null;
    }

    /**
     * Set the value of FileType, return this.
     *
     * @param fileType
     *             The new value to set.
     *
     * @return This instance.
     */
    public FileContents withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get the value of Checksum.
     *
     * @return The value of Checksum.
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Set the value of Checksum.
     *
     * @param checksum
     *            The new value to set.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Check to see if Checksum is set.
     *
     * @return true if Checksum is set.
     */
    public boolean isSetChecksum() {
        return checksum != null;
    }

    /**
     * Set the value of Checksum, return this.
     *
     * @param checksum
     *             The new value to set.
     *
     * @return This instance.
     */
    public FileContents withChecksum(String checksum) {
        this.checksum = checksum;
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
        contents = r.read("Contents", String.class);
        fileType = r.read("FileType", String.class);
        checksum = r.read("Checksum", String.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Contents", contents);
        w.write("FileType", fileType);
        w.write("Checksum", checksum);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "FileContents",this);
    }

    /** Value constructor. */
    public FileContents(String contents,String fileType,String checksum) {
        this.contents = contents;
        this.fileType = fileType;
        this.checksum = checksum;
    }    
    

    /** Default constructor. */
    public FileContents() {
        super();
    }

}
