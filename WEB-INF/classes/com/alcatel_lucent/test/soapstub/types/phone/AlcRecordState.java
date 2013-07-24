
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcRecordState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcRecordState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="IN_PROGRESS_PAUSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcRecordState")
@XmlEnum
public enum AlcRecordState {


    /**
     * Record can be started using the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;startRecord&lt;/code&gt;
     * </pre>
     *  operation of the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AlcPhone&lt;/b&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Web Service&lt;/i&gt;
     * </pre>
     * 
     * 
     */
    ENABLED,

    /**
     * Record is not available
     * 
     */
    DISABLED,

    /**
     * Record is in progress
     * 
     */
    IN_PROGRESS,

    /**
     * Record is paused
     * 
     */
    IN_PROGRESS_PAUSED;

    public String value() {
        return name();
    }

    public static AlcRecordState fromValue(String v) {
        return valueOf(v);
    }

}
