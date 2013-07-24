
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcAddOnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcAddOnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_EXTENSION"/>
 *     &lt;enumeration value="ADD_ON_10_KEYS"/>
 *     &lt;enumeration value="ADD_ON_16_KEYS"/>
 *     &lt;enumeration value="ADD_ON_20_KEYS"/>
 *     &lt;enumeration value="ADD_ON_40_KEYS"/>
 *     &lt;enumeration value="ADD_ON_EL_14_KEYS"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcAddOnType")
@XmlEnum
public enum AlcAddOnType {

    NO_EXTENSION,
    ADD_ON_10_KEYS,
    ADD_ON_16_KEYS,
    ADD_ON_20_KEYS,
    ADD_ON_40_KEYS,
    ADD_ON_EL_14_KEYS,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static AlcAddOnType fromValue(String v) {
        return valueOf(v);
    }

}
