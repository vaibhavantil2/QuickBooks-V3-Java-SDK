//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Tradeshift"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTypeEnum")
@XmlEnum
public enum DeliveryTypeEnum {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Tradeshift")
    TRADESHIFT("Tradeshift");
    private final String value;

    DeliveryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryTypeEnum fromValue(String v) {
        for (DeliveryTypeEnum c: DeliveryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
