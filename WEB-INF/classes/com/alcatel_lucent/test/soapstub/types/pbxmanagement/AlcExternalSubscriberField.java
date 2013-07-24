
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcExternalSubscriberField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcExternalSubscriberField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPEED_DIALING_NUMBER"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="EXTERNAL_CALL_NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcExternalSubscriberField")
@XmlEnum
public enum AlcExternalSubscriberField {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;External Subscriber&lt;/i&gt;
     * </pre>
     *  speed dialing number
     * 
     */
    SPEED_DIALING_NUMBER,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;External Subscriber&lt;/i&gt;
     * </pre>
     *  name
     * 
     */
    NAME,

    /**
     * External called number
     * 
     */
    EXTERNAL_CALL_NUMBER;

    public String value() {
        return name();
    }

    public static AlcExternalSubscriberField fromValue(String v) {
        return valueOf(v);
    }

}
