
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcLineState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcLineState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcLineState")
@XmlEnum
public enum AlcLineState {


    /**
     * The line is in service.
     * 
     */
    IN_SERVICE,

    /**
     * The line is out of service.
     * 
     */
    OUT_OF_SERVICE,

    /**
     * The line state is unknown.
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlcLineState fromValue(String v) {
        return valueOf(v);
    }

}
