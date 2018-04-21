package com.amazonservices.mws.sellers.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for HasSellerSuspendedListingsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HasSellerSuspendedListingsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HasSellerSuspendedListingsEnum")
@XmlEnum
public enum HasSellerSuspendedListingsEnum {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    HasSellerSuspendedListingsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HasSellerSuspendedListingsEnum fromValue(String v) {
        for (HasSellerSuspendedListingsEnum c: HasSellerSuspendedListingsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
