
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcResultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcResultCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="ERROR_DTA_CONNECTION"/>
 *     &lt;enumeration value="ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER"/>
 *     &lt;enumeration value="ERROR_INVALID_OPERATION"/>
 *     &lt;enumeration value="ERROR_LICENSE_REQUIRED"/>
 *     &lt;enumeration value="ERROR_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="ERROR_BAD_PARAMETER_VALUE"/>
 *     &lt;enumeration value="ERROR_UNAUTHORIZED"/>
 *     &lt;enumeration value="ERROR_SERVICE"/>
 *     &lt;enumeration value="ERROR_INVALID_PBX_NAME"/>
 *     &lt;enumeration value="ERROR_NO_LOAD_DONE"/>
 *     &lt;enumeration value="ERROR_BAD_CONNECTION_TO_LICENSE_SERVER"/>
 *     &lt;enumeration value="ERROR_UNEXPECTED"/>
 *     &lt;enumeration value="ERROR_RETRY_AFTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcResultCode")
@XmlEnum
public enum AlcResultCode {


    /**
     * The operation succeeded.
     * 
     */
    SUCCESS,

    /**
     * The operation failed due to a connection error with the data access service.
     * 
     */
    ERROR_DTA_CONNECTION,

    /**
     * The operation failed because the given session identifier is not valid.
     * 
     */
    ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER,

    /**
     * The invoked operation is not valid.
     * 
     */
    ERROR_INVALID_OPERATION,

    /**
     * A license is required to invoke this operation.
     * 
     */
    ERROR_LICENSE_REQUIRED,

    /**
     * An internal service, needed to answer the operation, is not available.
     * 
     */
    ERROR_SERVICE_UNAVAILABLE,

    /**
     * A parameter given in the operation is not valid or is missing.
     * 
     */
    ERROR_BAD_PARAMETER_VALUE,

    /**
     * The user is not authorized to invoke this operation.
     * 
     */
    ERROR_UNAUTHORIZED,

    /**
     * An internal service raised an error.
     * 
     */
    ERROR_SERVICE,

    /**
     * The PBX name is not known: use 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;code&gt;getPbxList&lt;/code&gt;&lt;/b&gt;
     * </pre>
     *  to list the available PBXs
     * 
     */
    ERROR_INVALID_PBX_NAME,

    /**
     * A load operation must be performed before using the current one.
     * 
     */
    ERROR_NO_LOAD_DONE,

    /**
     * The connection with the license server failed.
     * 
     */
    ERROR_BAD_CONNECTION_TO_LICENSE_SERVER,

    /**
     * An unexpected error has been raised.
     * 
     */
    ERROR_UNEXPECTED,

    /**
     * The service cannot answer at the moment : retry later.
     * 
     */
    ERROR_RETRY_AFTER;

    public String value() {
        return name();
    }

    public static AlcResultCode fromValue(String v) {
        return valueOf(v);
    }

}
