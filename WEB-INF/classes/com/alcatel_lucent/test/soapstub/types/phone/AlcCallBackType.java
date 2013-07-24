
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcCallBackType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcCallBackType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_FREE_SET"/>
 *     &lt;enumeration value="ON_NO_ANSWER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcCallBackType")
@XmlEnum
public enum AlcCallBackType {


    /**
     * Call back sent on free set
     * 
     */
    ON_FREE_SET,

    /**
     * Call back sent on no answer
     * 
     */
    ON_NO_ANSWER;

    public String value() {
        return name();
    }

    public static AlcCallBackType fromValue(String v) {
        return valueOf(v);
    }

}
