
package com.alcatel_lucent.test.soapstub.types.phonebook;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcPhoneBookEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcPhoneBookEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INTERNAL"/>
 *     &lt;enumeration value="EXTERNAL"/>
 *     &lt;enumeration value="REMOTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcPhoneBookEntryType")
@XmlEnum
public enum AlcPhoneBookEntryType {


    /**
     * Unknown type or unavailable type (OXE in this release)
     * 
     */
    UNKNOWN,

    /**
     * Matches a local 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/i&gt;
     * </pre>
     *  (on this PCX)
     * 
     */
    INTERNAL,

    /**
     * Matches an 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;External Subscriber&lt;/i&gt;
     * </pre>
     * 
     * 
     */
    EXTERNAL,

    /**
     * Matches a remote 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/i&gt;
     * </pre>
     *  (on another PCX in the network)
     * 
     */
    REMOTE;

    public String value() {
        return name();
    }

    public static AlcPhoneBookEntryType fromValue(String v) {
        return valueOf(v);
    }

}
