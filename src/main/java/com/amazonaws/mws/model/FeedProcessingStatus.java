
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedProcessingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedProcessingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_UNKNOWN_"/>
 *     &lt;enumeration value="_UNCONFIRMED_"/>
 *     &lt;enumeration value="_SUBMITTED_"/>
 *     &lt;enumeration value="_IN_PROGRESS_"/>
 *     &lt;enumeration value="_CANCELLED_"/>
 *     &lt;enumeration value="_DONE_"/>
 *     &lt;enumeration value="_IN_SAFETY_NET_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedProcessingStatus")
@XmlEnum
public enum FeedProcessingStatus {

    @XmlEnumValue("_UNKNOWN_")
    UNKNOWN("_UNKNOWN_"),
    @XmlEnumValue("_UNCONFIRMED_")
    UNCONFIRMED("_UNCONFIRMED_"),
    @XmlEnumValue("_SUBMITTED_")
    SUBMITTED("_SUBMITTED_"),
    @XmlEnumValue("_IN_PROGRESS_")
    IN_PROGRESS("_IN_PROGRESS_"),
    @XmlEnumValue("_CANCELLED_")
    CANCELLED("_CANCELLED_"),
    @XmlEnumValue("_DONE_")
    DONE("_DONE_"),
    @XmlEnumValue("_IN_SAFETY_NET_")
    IN_SAFETY_NET("_IN_SAFETY_NET_");
    private final String value;

    FeedProcessingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedProcessingStatus fromValue(String v) {
        for (FeedProcessingStatus c: FeedProcessingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
