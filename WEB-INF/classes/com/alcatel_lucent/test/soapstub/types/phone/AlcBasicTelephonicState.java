
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcBasicTelephonicState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcBasicTelephonicState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="RINGING_INCOMING"/>
 *     &lt;enumeration value="BUSY"/>
 *     &lt;enumeration value="OUT_OF_SERVICE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcBasicTelephonicState")
@XmlEnum
public enum AlcBasicTelephonicState {


    /**
     * The line is free.
     * 
     */
    FREE,

    /**
     * The line is ringing incoming.
     * 
     */
    RINGING_INCOMING,

    /**
     * The line is busy.
     * 
     */
    BUSY,

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

    public static AlcBasicTelephonicState fromValue(String v) {
        return valueOf(v);
    }

}
