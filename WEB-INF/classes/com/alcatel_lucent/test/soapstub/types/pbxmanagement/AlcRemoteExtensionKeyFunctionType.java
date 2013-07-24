
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcRemoteExtensionKeyFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcRemoteExtensionKeyFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_ASSIGNED"/>
 *     &lt;enumeration value="ENQUIRY"/>
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="THREE_PARTY_CONFERENCE"/>
 *     &lt;enumeration value="MPK_ACTIVATION"/>
 *     &lt;enumeration value="SOFT_RELEASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcRemoteExtensionKeyFunctionType")
@XmlEnum
public enum AlcRemoteExtensionKeyFunctionType {


    /**
     * Not Assigned
     * 
     */
    NOT_ASSIGNED,

    /**
     * Enquiry
     * 
     */
    ENQUIRY,

    /**
     * Broker
     * 
     */
    BROKER,

    /**
     * Transfer
     * 
     */
    TRANSFER,

    /**
     * Three-Party Conference
     * 
     */
    THREE_PARTY_CONFERENCE,

    /**
     * MPK activation
     * 
     */
    MPK_ACTIVATION,

    /**
     * Soft release
     * 
     */
    SOFT_RELEASE;

    public String value() {
        return name();
    }

    public static AlcRemoteExtensionKeyFunctionType fromValue(String v) {
        return valueOf(v);
    }

}
