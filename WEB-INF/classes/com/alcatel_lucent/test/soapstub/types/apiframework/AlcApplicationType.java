
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcApplicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcApplicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOME_PAGE"/>
 *     &lt;enumeration value="MY_ASSISTANT"/>
 *     &lt;enumeration value="MY_MESSAGING"/>
 *     &lt;enumeration value="MY_PHONE"/>
 *     &lt;enumeration value="MY_TEAMWORK"/>
 *     &lt;enumeration value="MY_INSTANT_COMMUNICATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcApplicationType")
@XmlEnum
public enum AlcApplicationType {


    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the Home Page application.
     * 
     */
    HOME_PAGE,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the MyAssistant application.
     * 
     */
    MY_ASSISTANT,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the MyMessaging application.
     * 
     */
    MY_MESSAGING,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the MyPhone application.
     * 
     */
    MY_PHONE,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the MyTeamwork application.
     * 
     */
    MY_TEAMWORK,

    /**
     * Can be used to open a 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework Session&lt;/i&gt;
     * </pre>
     *  (openFrameworkSession operation) from the My Instant Communicator application.
     * 
     */
    MY_INSTANT_COMMUNICATOR;

    public String value() {
        return name();
    }

    public static AlcApplicationType fromValue(String v) {
        return valueOf(v);
    }

}
