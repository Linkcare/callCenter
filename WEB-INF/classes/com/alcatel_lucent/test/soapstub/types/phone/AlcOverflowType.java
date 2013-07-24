
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcOverflowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcOverflowType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_OVERFLOW"/>
 *     &lt;enumeration value="ON_BUSY"/>
 *     &lt;enumeration value="ON_NO_ANSWER"/>
 *     &lt;enumeration value="ON_BUSY_OR_NO_ANSWER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcOverflowType", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate")
@XmlEnum
public enum AlcOverflowType {


    /**
     * Overflow is disabled
     * 
     */
    NO_OVERFLOW,

    /**
     * Incoming calls are forwarded to the associate when the phone is busy
     * 
     */
    ON_BUSY,

    /**
     * Incoming calls are forwarded to the associate after a ringing duration
     * 
     */
    ON_NO_ANSWER,

    /**
     * Incoming calls are forwarded to the associate when one of the two last cases occurs
     * 
     */
    ON_BUSY_OR_NO_ANSWER;

    public String value() {
        return name();
    }

    public static AlcOverflowType fromValue(String v) {
        return valueOf(v);
    }

}
