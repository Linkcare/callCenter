
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcVoiceMailBoxGreetings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcVoiceMailBoxGreetings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="PERSONAL"/>
 *     &lt;enumeration value="PERSONAL_AND_INTERNAL"/>
 *     &lt;enumeration value="EXTENDED_ABSENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcVoiceMailBoxGreetings")
@XmlEnum
public enum AlcVoiceMailBoxGreetings {


    /**
     * Standard greeting
     * 
     */
    STANDARD,

    /**
     * Personal greeting
     * 
     */
    PERSONAL,

    /**
     * Internal greeting
     * 
     */
    PERSONAL_AND_INTERNAL,

    /**
     * Extended absence greeting
     * 
     */
    EXTENDED_ABSENCE;

    public String value() {
        return name();
    }

    public static AlcVoiceMailBoxGreetings fromValue(String v) {
        return valueOf(v);
    }

}
