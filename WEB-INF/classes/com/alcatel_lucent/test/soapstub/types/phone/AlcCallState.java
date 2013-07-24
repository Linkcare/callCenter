
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcCallState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcCallState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INIT"/>
 *     &lt;enumeration value="RINGING_INCOMING"/>
 *     &lt;enumeration value="RINGING_OUTGOING"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="HELD"/>
 *     &lt;enumeration value="CONFERENCED"/>
 *     &lt;enumeration value="RECORDING"/>
 *     &lt;enumeration value="WAITING"/>
 *     &lt;enumeration value="DIALING"/>
 *     &lt;enumeration value="RELEASING"/>
 *     &lt;enumeration value="IDLE"/>
 *     &lt;enumeration value="UNREACHABLE"/>
 *     &lt;enumeration value="MONITORED"/>
 *     &lt;enumeration value="CONSULTING"/>
 *     &lt;enumeration value="BUSY_TONE"/>
 *     &lt;enumeration value="OPE_RESERVED"/>
 *     &lt;enumeration value="PAGING"/>
 *     &lt;enumeration value="PAUSE"/>
 *     &lt;enumeration value="WRAPUP"/>
 *     &lt;enumeration value="PCMM_DEGRADED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcCallState")
@XmlEnum
public enum AlcCallState {


    /**
     * Call in initialization state. It means that the call is not really already created.
     * 
     */
    INIT,

    /**
     * The incoming call is ringing.
     * 
     */
    RINGING_INCOMING,

    /**
     * The outgoing call is ringing.
     * 
     */
    RINGING_OUTGOING,

    /**
     * The call is active (means in conversation).
     * 
     */
    ACTIVE,

    /**
     * The call is held.
     * 
     */
    HELD,

    /**
     * The call is part of a conference.
     * 
     */
    CONFERENCED,

    /**
     * The call is active and recording is started on it.
     * 
     */
    RECORDING,

    /**
     * Waiting has been requested for this call.
     * 
     */
    WAITING,

    /**
     * Dialing state : the phone set is off hook but the called phone number is not completely dialed.
     * 
     */
    DIALING,

    /**
     * Call release is in progress.
     * 
     */
    RELEASING,

    /**
     * Call is in idle state
     * 
     */
    IDLE,

    /**
     * Call is going to be released because the called party cannot be reached.
     * 
     */
    UNREACHABLE,

    /**
     * Call is monitored
     * 
     */
    MONITORED,

    /**
     * Consultation call.
     * 
     */
    CONSULTING,

    /**
     * Call is going to be released: busy tone can be heard.
     * 
     */
    BUSY_TONE,

    /**
     * Reserved by the operator.
     * 
     */
    OPE_RESERVED,

    /**
     * Paging in progress.
     * 
     */
    PAGING,

    /**
     * TO BE COMPLETED
     * 
     */
    PAUSE,

    /**
     * TO BE COMPLETED
     * 
     */
    WRAPUP,

    /**
     * TO BE COMPLETED
     * 
     */
    PCMM_DEGRADED,

    /**
     * Unknown state : aims to support state evolutions for compatibility.
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlcCallState fromValue(String v) {
        return valueOf(v);
    }

}
