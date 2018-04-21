package com.amazonservices.mws.sellers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ServiceStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="GREEN_I"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="RED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatusEnum")
@XmlEnum
public enum ServiceStatusEnum {

    GREEN,
    GREEN_I,
    YELLOW,
    RED;

    public String value() {
        return name();
    }

    public static ServiceStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
