
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcVoiceCodingAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcVoiceCodingAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="COMPRESSION"/>
 *     &lt;enumeration value="NO_COMPRESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcVoiceCodingAlgorithm")
@XmlEnum
public enum AlcVoiceCodingAlgorithm {

    DEFAULT,
    COMPRESSION,
    NO_COMPRESSION;

    public String value() {
        return name();
    }

    public static AlcVoiceCodingAlgorithm fromValue(String v) {
        return valueOf(v);
    }

}
