
package com.alcatel_lucent.test.soapstub.types.sipconfig;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSipTransportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcSipTransportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="TCP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcSipTransportType")
@XmlEnum
public enum AlcSipTransportType {


    /**
     * UDP
     * 
     */
    UDP,

    /**
     * TCP
     * 
     */
    TCP;

    public String value() {
        return name();
    }

    public static AlcSipTransportType fromValue(String v) {
        return valueOf(v);
    }

}
