
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcNomadicMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcNomadicMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privatePhone"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="voip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcNomadicMode")
@XmlEnum
public enum AlcNomadicMode {


    /**
     * Nomadic mode is activated on a private phone (home, mobile,...)
     * 
     */
    @XmlEnumValue("privatePhone")
    PRIVATE_PHONE("privatePhone"),

    /**
     * Nomadic mode is deactivated
     * 
     */
    @XmlEnumValue("local")
    LOCAL("local"),

    /**
     * Nomadic mode is activated on VOIP (Alcatel-Lucent PRIVATE feature)
     * 
     */
    @XmlEnumValue("voip")
    VOIP("voip");
    private final String value;

    AlcNomadicMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcNomadicMode fromValue(String v) {
        for (AlcNomadicMode c: AlcNomadicMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
