
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcPcmmState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcPcmmState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VOIPInit"/>
 *     &lt;enumeration value="VOIPReady"/>
 *     &lt;enumeration value="VOIPNotReady"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcPcmmState")
@XmlEnum
public enum AlcPcmmState {


    /**
     * VOIP in initialization phase
     * 
     */
    @XmlEnumValue("VOIPInit")
    VOIP_INIT("VOIPInit"),

    /**
     * VOIP is ready to be used
     * 
     */
    @XmlEnumValue("VOIPReady")
    VOIP_READY("VOIPReady"),

    /**
     * VOIP is not ready and cannot be used
     * 
     */
    @XmlEnumValue("VOIPNotReady")
    VOIP_NOT_READY("VOIPNotReady");
    private final String value;

    AlcPcmmState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcPcmmState fromValue(String v) {
        for (AlcPcmmState c: AlcPcmmState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
