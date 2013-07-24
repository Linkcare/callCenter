
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcForwardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcForwardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_FORWARD"/>
 *     &lt;enumeration value="IMMEDIATE"/>
 *     &lt;enumeration value="ON_BUSY"/>
 *     &lt;enumeration value="ON_NO_ANSWER"/>
 *     &lt;enumeration value="ON_BUSY_OR_NO_ANSWER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcForwardType", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate")
@XmlEnum
public enum AlcForwardType {


    /**
     * Forward is disabled
     * 
     */
    NO_FORWARD,

    /**
     * Incoming calls are immediately forwarded to the target
     * 
     */
    IMMEDIATE,

    /**
     * Incoming calls are forwarded when the phone is busy
     * 
     */
    ON_BUSY,

    /**
     * Incoming calls are forwarded after a ringing duration
     * 
     */
    ON_NO_ANSWER,

    /**
     * Incoming calls are forwarded when the phone is busy or after a ringing duration
     * 
     */
    ON_BUSY_OR_NO_ANSWER;

    public String value() {
        return name();
    }

    public static AlcForwardType fromValue(String v) {
        return valueOf(v);
    }

}
