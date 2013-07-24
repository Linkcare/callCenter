
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcForwardTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcForwardTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="VOICE_MAIL"/>
 *     &lt;enumeration value="ROUTING_SERVICE"/>
 *     &lt;enumeration value="PERSONAL_ATTENDANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcForwardTargetType", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate")
@XmlEnum
public enum AlcForwardTargetType {


    /**
     * Forward is disabled
     * 
     */
    NONE,

    /**
     * The target of the forward is an untyped phone number (destination is targetNumber field of 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AlcForwardState&lt;/code&gt;
     * </pre>
     * )
     * 
     */
    NUMBER,

    /**
     * The target of the forward is the voicemail
     * 
     */
    VOICE_MAIL,

    /**
     * The target of the forward is the routing service
     * 
     */
    ROUTING_SERVICE,

    /**
     * The target of the forward is the personal attendant
     * 
     */
    PERSONAL_ATTENDANT;

    public String value() {
        return name();
    }

    public static AlcForwardTargetType fromValue(String v) {
        return valueOf(v);
    }

}
