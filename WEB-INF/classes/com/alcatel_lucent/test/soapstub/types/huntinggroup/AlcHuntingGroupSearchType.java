
package com.alcatel_lucent.test.soapstub.types.huntinggroup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcHuntingGroupSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcHuntingGroupSearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CYCLICAL_SEARCH"/>
 *     &lt;enumeration value="SEQUENTIAL_SEARCH"/>
 *     &lt;enumeration value="PARALLEL_SEARCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcHuntingGroupSearchType")
@XmlEnum
public enum AlcHuntingGroupSearchType {


    /**
     * 
     *                     Each station is rung in the order given in the list; the system rings the free
     *                     station which follows the station previously called
     *                 
     * 
     */
    CYCLICAL_SEARCH,

    /**
     * 
     *                     The search is made from the station at the head of the hunt group (the
     *                     first found to be free rings)
     *                 
     * 
     */
    SEQUENTIAL_SEARCH,

    /**
     * 
     *                     A parallel grouping enables several sets to be rung simultaneously using
     *                     just one number (the sets cannot be multilines in a parallel group)
     *                 
     * 
     */
    PARALLEL_SEARCH;

    public String value() {
        return name();
    }

    public static AlcHuntingGroupSearchType fromValue(String v) {
        return valueOf(v);
    }

}
