
package com.alcatel_lucent.test.soapstub.types.sipconfig;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSipAuthenticationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcSipAuthenticationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="DIGEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcSipAuthenticationMethod")
@XmlEnum
public enum AlcSipAuthenticationMethod {


    /**
     * No authentication
     * 
     */
    NONE,

    /**
     * DIGEST authentication with login (security level: medium)
     * 
     */
    DIGEST;

    public String value() {
        return name();
    }

    public static AlcSipAuthenticationMethod fromValue(String v) {
        return valueOf(v);
    }

}
