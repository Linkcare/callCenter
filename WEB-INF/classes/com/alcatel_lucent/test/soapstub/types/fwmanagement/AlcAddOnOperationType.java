
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcAddOnOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcAddOnOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_OPERATION"/>
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="REMOVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcAddOnOperationType")
@XmlEnum
public enum AlcAddOnOperationType {

    NO_OPERATION,
    ADD,
    UPDATE,
    REMOVE;

    public String value() {
        return name();
    }

    public static AlcAddOnOperationType fromValue(String v) {
        return valueOf(v);
    }

}
