
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcCliFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcCliFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD_PLAN"/>
 *     &lt;enumeration value="PRIVATE_PLAN"/>
 *     &lt;enumeration value="SUB_ADDRESS"/>
 *     &lt;enumeration value="REMOTE_EXTENSION_NUMBER_IN_CLI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcCliFormatType")
@XmlEnum
public enum AlcCliFormatType {


    /**
     * Standard Plan
     * 
     */
    STANDARD_PLAN,

    /**
     * Private Plan
     * 
     */
    PRIVATE_PLAN,

    /**
     * Sub Address
     * 
     */
    SUB_ADDRESS,

    /**
     * Remote extension number in CLI
     * 
     */
    REMOTE_EXTENSION_NUMBER_IN_CLI;

    public String value() {
        return name();
    }

    public static AlcCliFormatType fromValue(String v) {
        return valueOf(v);
    }

}
