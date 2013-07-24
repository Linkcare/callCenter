
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcNoeHomePage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcNoeHomePage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOME_MENU"/>
 *     &lt;enumeration value="HOME_PERSO"/>
 *     &lt;enumeration value="HOME_INFO"/>
 *     &lt;enumeration value="HOME_APPLI"/>
 *     &lt;enumeration value="HOME_CCD"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcNoeHomePage")
@XmlEnum
public enum AlcNoeHomePage {

    HOME_MENU,
    HOME_PERSO,
    HOME_INFO,
    HOME_APPLI,
    HOME_CCD,
    NONE;

    public String value() {
        return name();
    }

    public static AlcNoeHomePage fromValue(String v) {
        return valueOf(v);
    }

}
