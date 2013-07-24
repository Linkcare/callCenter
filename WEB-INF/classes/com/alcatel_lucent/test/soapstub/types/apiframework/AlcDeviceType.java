
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTENSION"/>
 *     &lt;enumeration value="NOE"/>
 *     &lt;enumeration value="PDA"/>
 *     &lt;enumeration value="THICK"/>
 *     &lt;enumeration value="TUI"/>
 *     &lt;enumeration value="WEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcDeviceType")
@XmlEnum
public enum AlcDeviceType {


    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from an extension.
     * 
     */
    EXTENSION,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from an IP Touch application.
     * 
     */
    NOE,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from a PDA or smartphone application.
     * 
     */
    PDA,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from a thick application.
     * 
     */
    THICK,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from a TUI (Telephony User Interface) application.
     * 
     */
    TUI,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from a Web application.
     * 
     */
    WEB;

    public String value() {
        return name();
    }

    public static AlcDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
