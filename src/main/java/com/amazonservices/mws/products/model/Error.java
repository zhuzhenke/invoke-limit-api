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
 * Error
 * API Version: 2011-10-01
 * Library Version: 2016-06-01
 * Generated: Mon Jun 13 10:07:47 PDT 2016
 */
package com.amazonservices.mws.products.model;

import java.util.ArrayList;
import java.util.List;

    import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * Error complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="Error"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Detail" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error.Detail"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Error", propOrder={
    "type",
    "code",
    "message",
    "detail"
})
@XmlRootElement(name = "Error")
public class Error extends AbstractMwsObject {

    /** Error Detail. */
    public static class Detail extends AbstractMwsObject {

        protected List<Object> any;

        /** Default constructor */
        public Detail() {
            super();
        }

        /** Value constructor */
        public Detail(List<Object> any) {
            this.any = any;
        }

        /**
         * Gets the value of the any property.
         *
         * @return Underlying list.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public boolean isSetAny() {
            return ((this.any!= null)&&(!this.any.isEmpty()));
        }

        public void unsetAny() {
            this.any = null;
        }

        /**
         * Sets the value of the Any property.
         * 
         * @param values
         * @return this
         */
        public Detail withAny(Object... values) {
            for (Object value: values) {
                getAny().add(value);
            }
            return this;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param any
         */
        public void setAny(List<Object> any) {
            this.any = any;
        }

        @Override
        public void readFragmentFrom(MwsReader r) {
            any = r.readList("any",Object.class);
        }

        @Override
        public void writeFragmentTo(MwsWriter w) {
            w.writeList("any",any);
        }

        @Override
        public void writeTo(MwsWriter w) {
            w.write(null, "ErrorDetail", this);
        }

    }

    @XmlElement(name="Type",required=true)
    private String type;

    @XmlElement(name="Code",required=true)
    private String code;

    @XmlElement(name="Message",required=true)
    private String message;

    @XmlElement(name="Detail",required=true)
    private Detail detail;

    /**
     * Get the value of Type.
     *
     * @return The value of Type.
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of Type.
     *
     * @param type
     *            The new value to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Check to see if Type is set.
     *
     * @return true if Type is set.
     */
    public boolean isSetType() {
        return type != null;
    }

    /**
     * Set the value of Type, return this.
     *
     * @param type
     *             The new value to set.
     *
     * @return This instance.
     */
    public Error withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value of Code.
     *
     * @return The value of Code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the value of Code.
     *
     * @param code
     *            The new value to set.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Check to see if Code is set.
     *
     * @return true if Code is set.
     */
    public boolean isSetCode() {
        return code != null;
    }

    /**
     * Set the value of Code, return this.
     *
     * @param code
     *             The new value to set.
     *
     * @return This instance.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the value of Message.
     *
     * @return The value of Message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of Message.
     *
     * @param message
     *            The new value to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Check to see if Message is set.
     *
     * @return true if Message is set.
     */
    public boolean isSetMessage() {
        return message != null;
    }

    /**
     * Set the value of Message, return this.
     *
     * @param message
     *             The new value to set.
     *
     * @return This instance.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the value of Detail.
     *
     * @return The value of Detail.
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Set the value of Detail.
     *
     * @param detail
     *            The new value to set.
     */
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    /**
     * Check to see if Detail is set.
     *
     * @return true if Detail is set.
     */
    public boolean isSetDetail() {
        return detail != null;
    }

    /**
     * Set the value of Detail, return this.
     *
     * @param detail
     *             The new value to set.
     *
     * @return This instance.
     */
    public Error withDetail(Detail detail) {
        this.detail = detail;
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
        type = r.read("Type", String.class);
        code = r.read("Code", String.class);
        message = r.read("Message", String.class);
        detail = r.read("Detail", Detail.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Type", type);
        w.write("Code", code);
        w.write("Message", message);
        w.write("Detail", detail);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "Error",this);
    }

    /** Value constructor. */
    public Error(String type,String code,String message,Detail detail) {
        this.type = type;
        this.code = code;
        this.message = message;
        this.detail = detail;
    }    
    

    /** Default constructor. */
    public Error() {
        super();
    }

}
