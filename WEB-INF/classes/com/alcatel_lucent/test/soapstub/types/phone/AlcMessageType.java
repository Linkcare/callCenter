
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APOLOGY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcMessageType")
@XmlEnum
public enum AlcMessageType {


    /**
     * Apology message
     * 
     */
    APOLOGY,

    /**
     * No message or unknown type
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlcMessageType fromValue(String v) {
        return valueOf(v);
    }

}
