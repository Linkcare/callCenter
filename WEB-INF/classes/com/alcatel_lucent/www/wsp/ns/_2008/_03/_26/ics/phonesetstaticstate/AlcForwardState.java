/**
 * AlcForwardState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate;

public class AlcForwardState  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardType type;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardTargetType targetType;

    private java.lang.String targetNumber;

    private java.lang.String name;

    private java.lang.String firstName;

    private org.apache.axis.types.PositiveInteger ringingDuration;

    public AlcForwardState() {
    }

    public AlcForwardState(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardType type,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardTargetType targetType,
           java.lang.String targetNumber,
           java.lang.String name,
           java.lang.String firstName,
           org.apache.axis.types.PositiveInteger ringingDuration) {
           this.type = type;
           this.targetType = targetType;
           this.targetNumber = targetNumber;
           this.name = name;
           this.firstName = firstName;
           this.ringingDuration = ringingDuration;
    }


    /**
     * Gets the type value for this AlcForwardState.
     * 
     * @return type
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardType getType() {
        return type;
    }


    /**
     * Sets the type value for this AlcForwardState.
     * 
     * @param type
     */
    public void setType(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardType type) {
        this.type = type;
    }


    /**
     * Gets the targetType value for this AlcForwardState.
     * 
     * @return targetType
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this AlcForwardState.
     * 
     * @param targetType
     */
    public void setTargetType(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardTargetType targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the targetNumber value for this AlcForwardState.
     * 
     * @return targetNumber
     */
    public java.lang.String getTargetNumber() {
        return targetNumber;
    }


    /**
     * Sets the targetNumber value for this AlcForwardState.
     * 
     * @param targetNumber
     */
    public void setTargetNumber(java.lang.String targetNumber) {
        this.targetNumber = targetNumber;
    }


    /**
     * Gets the name value for this AlcForwardState.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AlcForwardState.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the firstName value for this AlcForwardState.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this AlcForwardState.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the ringingDuration value for this AlcForwardState.
     * 
     * @return ringingDuration
     */
    public org.apache.axis.types.PositiveInteger getRingingDuration() {
        return ringingDuration;
    }


    /**
     * Sets the ringingDuration value for this AlcForwardState.
     * 
     * @param ringingDuration
     */
    public void setRingingDuration(org.apache.axis.types.PositiveInteger ringingDuration) {
        this.ringingDuration = ringingDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcForwardState)) return false;
        AlcForwardState other = (AlcForwardState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.targetNumber==null && other.getTargetNumber()==null) || 
             (this.targetNumber!=null &&
              this.targetNumber.equals(other.getTargetNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.ringingDuration==null && other.getRingingDuration()==null) || 
             (this.ringingDuration!=null &&
              this.ringingDuration.equals(other.getRingingDuration())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getTargetNumber() != null) {
            _hashCode += getTargetNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getRingingDuration() != null) {
            _hashCode += getRingingDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcForwardState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardTargetType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "targetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ringingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "ringingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
