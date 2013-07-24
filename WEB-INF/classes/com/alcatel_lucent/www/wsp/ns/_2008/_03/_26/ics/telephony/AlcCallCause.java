/**
 * AlcCallCause.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcCallCause implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcCallCause(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _BUSY = "BUSY";
    public static final java.lang.String _DEST_NOT_OBTAINABLE = "DEST_NOT_OBTAINABLE";
    public static final java.lang.String _DO_NOT_DISTURB = "DO_NOT_DISTURB";
    public static final java.lang.String _MAINTENANCE = "MAINTENANCE";
    public static final java.lang.String _NOT_ANSWERED = "NOT_ANSWERED";
    public static final java.lang.String _OVERFLOW = "OVERFLOW";
    public static final java.lang.String _PICKUP_INCOMING = "PICKUP_INCOMING";
    public static final java.lang.String _PICKUP_OUTGOING = "PICKUP_OUTGOING";
    public static final java.lang.String _PICKUP_VICTIM = "PICKUP_VICTIM";
    public static final java.lang.String _REDIRECTED_INCOMING = "REDIRECTED_INCOMING";
    public static final java.lang.String _REDIRECTED_OUTGOING = "REDIRECTED_OUTGOING";
    public static final java.lang.String _REDIRECTED_TO = "REDIRECTED_TO";
    public static final java.lang.String _TRANSFER = "TRANSFER";
    public static final java.lang.String _TRUNKS_BUSY = "TRUNKS_BUSY";
    public static final java.lang.String _BLOCKED = "BLOCKED";
    public static final java.lang.String _CALL_BACK = "CALL_BACK";
    public static final java.lang.String _CALL_CANCELED = "CALL_CANCELED";
    public static final java.lang.String _CAMP_ON = "CAMP_ON";
    public static final java.lang.String _CONSULTATION = "CONSULTATION";
    public static final java.lang.String _FORWARD = "FORWARD";
    public static final java.lang.String _FORWARD_ALWAYS = "FORWARD_ALWAYS";
    public static final java.lang.String _FORWARD_BUSY = "FORWARD_BUSY";
    public static final java.lang.String _FORWARD_NO_ANSWER = "FORWARD_NO_ANSWER";
    public static final java.lang.String _INCOMPATIBLE_DESTINATION = "INCOMPATIBLE_DESTINATION";
    public static final java.lang.String _MAKE_CALL = "MAKE_CALL";
    public static final java.lang.String _NEW_CALL = "NEW_CALL";
    public static final java.lang.String _RECALL = "RECALL";
    public static final java.lang.String _REDIRECTED = "REDIRECTED";
    public static final java.lang.String _SINGLE_STEP_CONFERENCE = "SINGLE_STEP_CONFERENCE";
    public static final java.lang.String _SINGLE_STEP_TRANSFER = "SINGLE_STEP_TRANSFER";
    public static final AlcCallCause NONE = new AlcCallCause(_NONE);
    public static final AlcCallCause BUSY = new AlcCallCause(_BUSY);
    public static final AlcCallCause DEST_NOT_OBTAINABLE = new AlcCallCause(_DEST_NOT_OBTAINABLE);
    public static final AlcCallCause DO_NOT_DISTURB = new AlcCallCause(_DO_NOT_DISTURB);
    public static final AlcCallCause MAINTENANCE = new AlcCallCause(_MAINTENANCE);
    public static final AlcCallCause NOT_ANSWERED = new AlcCallCause(_NOT_ANSWERED);
    public static final AlcCallCause OVERFLOW = new AlcCallCause(_OVERFLOW);
    public static final AlcCallCause PICKUP_INCOMING = new AlcCallCause(_PICKUP_INCOMING);
    public static final AlcCallCause PICKUP_OUTGOING = new AlcCallCause(_PICKUP_OUTGOING);
    public static final AlcCallCause PICKUP_VICTIM = new AlcCallCause(_PICKUP_VICTIM);
    public static final AlcCallCause REDIRECTED_INCOMING = new AlcCallCause(_REDIRECTED_INCOMING);
    public static final AlcCallCause REDIRECTED_OUTGOING = new AlcCallCause(_REDIRECTED_OUTGOING);
    public static final AlcCallCause REDIRECTED_TO = new AlcCallCause(_REDIRECTED_TO);
    public static final AlcCallCause TRANSFER = new AlcCallCause(_TRANSFER);
    public static final AlcCallCause TRUNKS_BUSY = new AlcCallCause(_TRUNKS_BUSY);
    public static final AlcCallCause BLOCKED = new AlcCallCause(_BLOCKED);
    public static final AlcCallCause CALL_BACK = new AlcCallCause(_CALL_BACK);
    public static final AlcCallCause CALL_CANCELED = new AlcCallCause(_CALL_CANCELED);
    public static final AlcCallCause CAMP_ON = new AlcCallCause(_CAMP_ON);
    public static final AlcCallCause CONSULTATION = new AlcCallCause(_CONSULTATION);
    public static final AlcCallCause FORWARD = new AlcCallCause(_FORWARD);
    public static final AlcCallCause FORWARD_ALWAYS = new AlcCallCause(_FORWARD_ALWAYS);
    public static final AlcCallCause FORWARD_BUSY = new AlcCallCause(_FORWARD_BUSY);
    public static final AlcCallCause FORWARD_NO_ANSWER = new AlcCallCause(_FORWARD_NO_ANSWER);
    public static final AlcCallCause INCOMPATIBLE_DESTINATION = new AlcCallCause(_INCOMPATIBLE_DESTINATION);
    public static final AlcCallCause MAKE_CALL = new AlcCallCause(_MAKE_CALL);
    public static final AlcCallCause NEW_CALL = new AlcCallCause(_NEW_CALL);
    public static final AlcCallCause RECALL = new AlcCallCause(_RECALL);
    public static final AlcCallCause REDIRECTED = new AlcCallCause(_REDIRECTED);
    public static final AlcCallCause SINGLE_STEP_CONFERENCE = new AlcCallCause(_SINGLE_STEP_CONFERENCE);
    public static final AlcCallCause SINGLE_STEP_TRANSFER = new AlcCallCause(_SINGLE_STEP_TRANSFER);
    public java.lang.String getValue() { return _value_;}
    public static AlcCallCause fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcCallCause enumeration = (AlcCallCause)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcCallCause fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcCallCause.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallCause"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
