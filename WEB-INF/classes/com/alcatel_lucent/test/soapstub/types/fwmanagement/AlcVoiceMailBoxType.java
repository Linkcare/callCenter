
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcVoiceMailBoxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcVoiceMailBoxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IM_4635"/>
 *     &lt;enumeration value="IM_4645"/>
 *     &lt;enumeration value="IM_OXO"/>
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="EMAIL_ONLY"/>
 *     &lt;enumeration value="LOCAL_STORAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcVoiceMailBoxType")
@XmlEnum
public enum AlcVoiceMailBoxType {


    /**
     *  4635 voice mail
     * 
     */
    IM_4635,

    /**
     *  4645 voice mail
     * 
     */
    IM_4645,

    /**
     * OXO voice mail
     * 
     */
    IM_OXO,

    /**
     * UM
     * 
     */
    UM,

    /**
     * E-mail voice mail
     * 
     */
    EMAIL_ONLY,

    /**
     * Local storage voice mail
     * 
     */
    LOCAL_STORAGE;

    public String value() {
        return name();
    }

    public static AlcVoiceMailBoxType fromValue(String v) {
        return valueOf(v);
    }

}
