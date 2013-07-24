
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcBooleanOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcBooleanOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="AND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcBooleanOperator")
@XmlEnum
public enum AlcBooleanOperator {


    /**
     * 
     *                     Apply the logical OR command between one filter and the others 
     *                 
     * 
     */
    OR,

    /**
     * 
     *                     Apply the logical AND command between one filter and the others
     *                 
     * 
     */
    AND;

    public String value() {
        return name();
    }

    public static AlcBooleanOperator fromValue(String v) {
        return valueOf(v);
    }

}
