
package com.alcatel_lucent.test.soapstub.types.notifier;

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
 *     &lt;enumeration value="ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER"/>
 *     &lt;enumeration value="ERROR_INVALID_SUBSCRIPTION"/>
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
     * The operation failed because the given session identifier is not valid.
     * 
     */
    ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER,

    /**
     * The subscription identifier is invalid : no subscription is opened.
     * 
     */
    ERROR_INVALID_SUBSCRIPTION,

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
