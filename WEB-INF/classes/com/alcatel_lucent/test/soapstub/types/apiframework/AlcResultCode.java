
package com.alcatel_lucent.test.soapstub.types.apiframework;

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
 *     &lt;enumeration value="ERROR_AUTHENTICATION_FAILED"/>
 *     &lt;enumeration value="ERROR_DTA_CONNECTION"/>
 *     &lt;enumeration value="ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER"/>
 *     &lt;enumeration value="ERROR_INVALID_OPERATION"/>
 *     &lt;enumeration value="ERROR_LICENSE_REQUIRED"/>
 *     &lt;enumeration value="ERROR_LOGIN_REQUIRED"/>
 *     &lt;enumeration value="ERROR_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="ERROR_BAD_PARAMETER_VALUE"/>
 *     &lt;enumeration value="ERROR_UNAUTHORIZED"/>
 *     &lt;enumeration value="ERROR_SERVICE"/>
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
     * The operation failed due to an authentication error.
     * 
     */
    ERROR_AUTHENTICATION_FAILED,

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
     * A session must be opened to invoke this operation.
     * 
     */
    ERROR_LOGIN_REQUIRED,

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
