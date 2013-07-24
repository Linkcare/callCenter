
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcPhoneBookEntryField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcPhoneBookEntryField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECTORY_NUMBER"/>
 *     &lt;enumeration value="NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcPhoneBookEntryField")
@XmlEnum
public enum AlcPhoneBookEntryField {


    /**
     * Directory number of a phone book entry.
     * 
     */
    DIRECTORY_NUMBER,

    /**
     * Name of a phone book entry.
     * 
     */
    NAME;

    public String value() {
        return name();
    }

    public static AlcPhoneBookEntryField fromValue(String v) {
        return valueOf(v);
    }

}
