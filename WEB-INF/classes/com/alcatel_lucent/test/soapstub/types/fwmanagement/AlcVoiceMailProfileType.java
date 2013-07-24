
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcVoiceMailProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcVoiceMailProfileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="LOCAL_STORAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcVoiceMailProfileType")
@XmlEnum
public enum AlcVoiceMailProfileType {


    /**
     * UM
     * 
     */
    UM,

    /**
     * Local storage voice mail
     * 
     */
    LOCAL_STORAGE;

    public String value() {
        return name();
    }

    public static AlcVoiceMailProfileType fromValue(String v) {
        return valueOf(v);
    }

}
