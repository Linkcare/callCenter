
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcCallCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcCallCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BUSY"/>
 *     &lt;enumeration value="DEST_NOT_OBTAINABLE"/>
 *     &lt;enumeration value="DO_NOT_DISTURB"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="NOT_ANSWERED"/>
 *     &lt;enumeration value="OVERFLOW"/>
 *     &lt;enumeration value="PICKUP_INCOMING"/>
 *     &lt;enumeration value="PICKUP_OUTGOING"/>
 *     &lt;enumeration value="PICKUP_VICTIM"/>
 *     &lt;enumeration value="REDIRECTED_INCOMING"/>
 *     &lt;enumeration value="REDIRECTED_OUTGOING"/>
 *     &lt;enumeration value="REDIRECTED_TO"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="TRUNKS_BUSY"/>
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="CALL_BACK"/>
 *     &lt;enumeration value="CALL_CANCELED"/>
 *     &lt;enumeration value="CAMP_ON"/>
 *     &lt;enumeration value="CONSULTATION"/>
 *     &lt;enumeration value="FORWARD"/>
 *     &lt;enumeration value="FORWARD_ALWAYS"/>
 *     &lt;enumeration value="FORWARD_BUSY"/>
 *     &lt;enumeration value="FORWARD_NO_ANSWER"/>
 *     &lt;enumeration value="INCOMPATIBLE_DESTINATION"/>
 *     &lt;enumeration value="MAKE_CALL"/>
 *     &lt;enumeration value="NEW_CALL"/>
 *     &lt;enumeration value="RECALL"/>
 *     &lt;enumeration value="REDIRECTED"/>
 *     &lt;enumeration value="SINGLE_STEP_CONFERENCE"/>
 *     &lt;enumeration value="SINGLE_STEP_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcCallCause")
@XmlEnum
public enum AlcCallCause {


    /**
     * No cause
     * 
     */
    NONE,

    /**
     * Busy tone
     * 
     */
    BUSY,

    /**
     * Called party is not obtainable
     * 
     */
    DEST_NOT_OBTAINABLE,

    /**
     * Call was rejected because the called party was in do not disturb mode
     * 
     */
    DO_NOT_DISTURB,

    /**
     * Maintenance
     * 
     */
    MAINTENANCE,

    /**
     * Call was not answered
     * 
     */
    NOT_ANSWERED,

    /**
     * Call was overflowed
     * 
     */
    OVERFLOW,

    /**
     * Incoming call was picked up
     * 
     */
    PICKUP_INCOMING,

    /**
     * Outgoing call was picked up
     * 
     */
    PICKUP_OUTGOING,

    /**
     * Victim of a call pickup
     * 
     */
    PICKUP_VICTIM,

    /**
     * Incoming call was redirected
     * 
     */
    REDIRECTED_INCOMING,

    /**
     * Outgoing call was redirected
     * 
     */
    REDIRECTED_OUTGOING,

    /**
     * Call was redirected
     * 
     */
    REDIRECTED_TO,

    /**
     * Call was transferred
     * 
     */
    TRANSFER,

    /**
     * Trunks busy
     * 
     */
    TRUNKS_BUSY,

    /**
     * Call was blocked
     * 
     */
    BLOCKED,
    CALL_BACK,
    CALL_CANCELED,
    CAMP_ON,
    CONSULTATION,
    FORWARD,
    FORWARD_ALWAYS,
    FORWARD_BUSY,
    FORWARD_NO_ANSWER,
    INCOMPATIBLE_DESTINATION,
    MAKE_CALL,
    NEW_CALL,
    RECALL,
    REDIRECTED,
    SINGLE_STEP_CONFERENCE,
    SINGLE_STEP_TRANSFER;

    public String value() {
        return name();
    }

    public static AlcCallCause fromValue(String v) {
        return valueOf(v);
    }

}
