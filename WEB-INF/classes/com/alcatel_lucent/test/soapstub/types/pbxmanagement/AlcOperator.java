
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS_TO"/>
 *     &lt;enumeration value="DIFFERENT_FROM"/>
 *     &lt;enumeration value="EQUALS_OR_GREATER_THAN"/>
 *     &lt;enumeration value="EQUALS_OR_LESS_THAN"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcOperator")
@XmlEnum
public enum AlcOperator {


    /**
     * 
     *                     Load the attributes that are equal to the specified value
     *                 
     * 
     */
    EQUALS_TO,

    /**
     * 
     *                     Load the attributes that are different from the specified value
     *                 
     * 
     */
    DIFFERENT_FROM,

    /**
     * 
     *                     Load the attributes that are equal to or greater than the specified value
     *                 
     * 
     */
    EQUALS_OR_GREATER_THAN,

    /**
     * 
     *                     Load the attributes that are equal to or less than the specified value
     *                 
     * 
     */
    EQUALS_OR_LESS_THAN,

    /**
     * 
     *                     Load the attributes that begin with the specified value
     *                 
     * 
     */
    BEGINS_WITH,

    /**
     * 
     *                     Load the attributes that end with the specified value
     *                 
     * 
     */
    ENDS_WITH;

    public String value() {
        return name();
    }

    public static AlcOperator fromValue(String v) {
        return valueOf(v);
    }

}
