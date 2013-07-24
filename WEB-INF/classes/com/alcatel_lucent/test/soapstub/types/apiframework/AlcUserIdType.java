
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcUserIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcUserIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOGIN_NAME"/>
 *     &lt;enumeration value="PHONE_NUMBER"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcUserIdType")
@XmlEnum
public enum AlcUserIdType {


    /**
     * Can be used to open a supervised 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (loginSupervisor operation) for a user identified by the login name.
     * 
     */
    LOGIN_NAME,

    /**
     * Can be used to open a supervised 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (loginSupervisor operation) for a user identified by the phone number.
     * 
     */
    PHONE_NUMBER,

    /**
     * Can be used to open a supervised 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (loginSupervisor operation) for a user identified by the e-mail.
     * 
     */
    EMAIL;

    public String value() {
        return name();
    }

    public static AlcUserIdType fromValue(String v) {
        return valueOf(v);
    }

}
