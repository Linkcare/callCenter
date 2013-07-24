
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcNumberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BOSS"/>
 *     &lt;enumeration value="SECRETARY"/>
 *     &lt;enumeration value="GROUP"/>
 *     &lt;enumeration value="ASSOCIATE"/>
 *     &lt;enumeration value="VOICEMAIL"/>
 *     &lt;enumeration value="VOICEMAILCONSULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcNumberType")
@XmlEnum
public enum AlcNumberType {


    /**
     * No type
     * 
     */
    NONE,

    /**
     * Manager phone number for an assistant
     * 
     */
    BOSS,

    /**
     * Assistant phone number for a manager
     * 
     */
    SECRETARY,

    /**
     * Group phone number
     * 
     */
    GROUP,

    /**
     * Phone number of the associate
     * 
     */
    ASSOCIATE,

    /**
     * Phone number of a voicemail
     * 
     */
    VOICEMAIL,

    /**
     * Phone number of a voicemail consultation
     * 
     */
    VOICEMAILCONSULT;

    public String value() {
        return name();
    }

    public static AlcNumberType fromValue(String v) {
        return valueOf(v);
    }

}
