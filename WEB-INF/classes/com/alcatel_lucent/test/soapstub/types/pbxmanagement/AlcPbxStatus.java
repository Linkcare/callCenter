
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcPbxStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcPbxStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ANSWER"/>
 *     &lt;enumeration value="STARTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcPbxStatus")
@XmlEnum
public enum AlcPbxStatus {


    /**
     * PBX cannot be contacted by ACAPI (PBX is down, ...).
     * 
     */
    NO_ANSWER,

    /**
     * PBX can be contacted by ACAPI.
     * 
     */
    STARTED;

    public String value() {
        return name();
    }

    public static AlcPbxStatus fromValue(String v) {
        return valueOf(v);
    }

}
