/**
 * AlcCallState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcCallState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcCallState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INIT = "INIT";
    public static final java.lang.String _RINGING_INCOMING = "RINGING_INCOMING";
    public static final java.lang.String _RINGING_OUTGOING = "RINGING_OUTGOING";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _HELD = "HELD";
    public static final java.lang.String _CONFERENCED = "CONFERENCED";
    public static final java.lang.String _RECORDING = "RECORDING";
    public static final java.lang.String _WAITING = "WAITING";
    public static final java.lang.String _DIALING = "DIALING";
    public static final java.lang.String _RELEASING = "RELEASING";
    public static final java.lang.String _IDLE = "IDLE";
    public static final java.lang.String _UNREACHABLE = "UNREACHABLE";
    public static final java.lang.String _MONITORED = "MONITORED";
    public static final java.lang.String _CONSULTING = "CONSULTING";
    public static final java.lang.String _BUSY_TONE = "BUSY_TONE";
    public static final java.lang.String _OPE_RESERVED = "OPE_RESERVED";
    public static final java.lang.String _PAGING = "PAGING";
    public static final java.lang.String _PAUSE = "PAUSE";
    public static final java.lang.String _WRAPUP = "WRAPUP";
    public static final java.lang.String _PCMM_DEGRADED = "PCMM_DEGRADED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AlcCallState INIT = new AlcCallState(_INIT);
    public static final AlcCallState RINGING_INCOMING = new AlcCallState(_RINGING_INCOMING);
    public static final AlcCallState RINGING_OUTGOING = new AlcCallState(_RINGING_OUTGOING);
    public static final AlcCallState ACTIVE = new AlcCallState(_ACTIVE);
    public static final AlcCallState HELD = new AlcCallState(_HELD);
    public static final AlcCallState CONFERENCED = new AlcCallState(_CONFERENCED);
    public static final AlcCallState RECORDING = new AlcCallState(_RECORDING);
    public static final AlcCallState WAITING = new AlcCallState(_WAITING);
    public static final AlcCallState DIALING = new AlcCallState(_DIALING);
    public static final AlcCallState RELEASING = new AlcCallState(_RELEASING);
    public static final AlcCallState IDLE = new AlcCallState(_IDLE);
    public static final AlcCallState UNREACHABLE = new AlcCallState(_UNREACHABLE);
    public static final AlcCallState MONITORED = new AlcCallState(_MONITORED);
    public static final AlcCallState CONSULTING = new AlcCallState(_CONSULTING);
    public static final AlcCallState BUSY_TONE = new AlcCallState(_BUSY_TONE);
    public static final AlcCallState OPE_RESERVED = new AlcCallState(_OPE_RESERVED);
    public static final AlcCallState PAGING = new AlcCallState(_PAGING);
    public static final AlcCallState PAUSE = new AlcCallState(_PAUSE);
    public static final AlcCallState WRAPUP = new AlcCallState(_WRAPUP);
    public static final AlcCallState PCMM_DEGRADED = new AlcCallState(_PCMM_DEGRADED);
    public static final AlcCallState UNKNOWN = new AlcCallState(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AlcCallState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcCallState enumeration = (AlcCallState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcCallState fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcCallState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
