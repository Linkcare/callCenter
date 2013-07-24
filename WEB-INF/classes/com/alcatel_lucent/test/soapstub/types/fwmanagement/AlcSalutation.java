
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSalutation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcSalutation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MRS"/>
 *     &lt;enumeration value="MISS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcSalutation")
@XmlEnum
public enum AlcSalutation {


    /**
     * MR
     * 
     */
    MR,

    /**
     * MRS
     * 
     */
    MRS,

    /**
     * MISS
     * 
     */
    MISS;

    public String value() {
        return name();
    }

    public static AlcSalutation fromValue(String v) {
        return valueOf(v);
    }

}
