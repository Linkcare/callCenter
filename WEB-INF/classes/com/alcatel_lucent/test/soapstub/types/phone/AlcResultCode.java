
package com.alcatel_lucent.test.soapstub.types.phone;

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
 *     &lt;enumeration value="ERROR_RETRY_AFTER"/>
 *     &lt;enumeration value="ERROR_PBX_LINK_NOT_CONNECTED"/>
 *     &lt;enumeration value="ERROR_LINE_NOT_MONITORED"/>
 *     &lt;enumeration value="ERROR_UNKNOWN_LINE"/>
 *     &lt;enumeration value="ERROR_OPERATION_NOT_AUTHORIZED"/>
 *     &lt;enumeration value="ERROR_INCOMPATIBLE_WITH_STATE"/>
 *     &lt;enumeration value="ERROR_SERVICE_NOT_PROVIDED"/>
 *     &lt;enumeration value="ERROR_ACAPI_NOT_READY"/>
 *     &lt;enumeration value="ERROR_INCORRECT_PARAMETER"/>
 *     &lt;enumeration value="ERROR_NOMAD_LOGIN"/>
 *     &lt;enumeration value="ERROR_ACAPI_LOCK_NOT_LOADED"/>
 *     &lt;enumeration value="ERROR_NOT_PROVIDED_ON_THIS_SERVER"/>
 *     &lt;enumeration value="ERROR_INVALID_SERVERS_CONFIG"/>
 *     &lt;enumeration value="ERROR_INVALID_USERS_CONFIG"/>
 *     &lt;enumeration value="ERROR_BAD_SOAP_PARAMETERS_NUMBER"/>
 *     &lt;enumeration value="ERROR_VALUE_OUT_OF_BOUND"/>
 *     &lt;enumeration value="ERROR_OPERATION_NOT_IMPLEMENTED"/>
 *     &lt;enumeration value="ERROR_FILE_NOT_FOUND"/>
 *     &lt;enumeration value="ERROR_ACAPI_SERVER"/>
 *     &lt;enumeration value="ERROR_UPK_REFRESH_REQUIRED"/>
 *     &lt;enumeration value="ERROR_UNEXPECTED"/>
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
     * The service cannot answer at the moment : retry later.
     * 
     */
    ERROR_RETRY_AFTER,

    /**
     * The link with the PBX has been lost.
     * 
     */
    ERROR_PBX_LINK_NOT_CONNECTED,

    /**
     * The specified line number is not monitored.
     * 
     */
    ERROR_LINE_NOT_MONITORED,

    /**
     * The specified line number is unknown.
     * 
     */
    ERROR_UNKNOWN_LINE,

    /**
     * The operation is not authorized.
     * 
     */
    ERROR_OPERATION_NOT_AUTHORIZED,

    /**
     * The operation cannot be invoked in the current state.
     * 
     */
    ERROR_INCOMPATIBLE_WITH_STATE,

    /**
     * The requested operation is not provided.
     * 
     */
    ERROR_SERVICE_NOT_PROVIDED,

    /**
     * The ACAPI server, needed to answer the request, is not ready.
     * 
     */
    ERROR_ACAPI_NOT_READY,

    /**
     * A specified parameter is not valid.
     * 
     */
    ERROR_INCORRECT_PARAMETER,

    /**
     * Nomad login cannot be executed.
     * 
     */
    ERROR_NOMAD_LOGIN,

    /**
     * Locks are not loaded from ACAPI server.
     * 
     */
    ERROR_ACAPI_LOCK_NOT_LOADED,

    /**
     * The requested operation cannot be provided by this server.
     * 
     */
    ERROR_NOT_PROVIDED_ON_THIS_SERVER,

    /**
     * The server configuration is not correct.
     * 
     */
    ERROR_INVALID_SERVERS_CONFIG,

    /**
     * The user configuration is not correct.
     * 
     */
    ERROR_INVALID_USERS_CONFIG,

    /**
     * Error in an internal SOAP message.
     * 
     */
    ERROR_BAD_SOAP_PARAMETERS_NUMBER,

    /**
     * A position or an index is out of range.
     * 
     */
    ERROR_VALUE_OUT_OF_BOUND,

    /**
     * The requested operation is not implemented.
     * 
     */
    ERROR_OPERATION_NOT_IMPLEMENTED,

    /**
     * An internal file cannot be found
     * 
     */
    ERROR_FILE_NOT_FOUND,

    /**
     * An error has been raised by the ACAPI server.
     * 
     */
    ERROR_ACAPI_SERVER,

    /**
     * The list of UPKs must be refreshed.
     * 
     */
    ERROR_UPK_REFRESH_REQUIRED,

    /**
     * An unexpected error has been raised.
     * 
     */
    ERROR_UNEXPECTED;

    public String value() {
        return name();
    }

    public static AlcResultCode fromValue(String v) {
        return valueOf(v);
    }

}
