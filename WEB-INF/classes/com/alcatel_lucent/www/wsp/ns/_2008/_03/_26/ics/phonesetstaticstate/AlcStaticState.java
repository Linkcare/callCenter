/**
 * AlcStaticState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate;

public class AlcStaticState  implements java.io.Serializable {
    private java.lang.Boolean locked;

    private java.lang.Boolean campOnActivated;

    private java.lang.Boolean remoteExtensionActivated;

    private java.lang.Boolean doNotDisturbActivated;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardState forwardState;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcOverflowType overflowType;

    private java.lang.String associate;

    public AlcStaticState() {
    }

    public AlcStaticState(
           java.lang.Boolean locked,
           java.lang.Boolean campOnActivated,
           java.lang.Boolean remoteExtensionActivated,
           java.lang.Boolean doNotDisturbActivated,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardState forwardState,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcOverflowType overflowType,
           java.lang.String associate) {
           this.locked = locked;
           this.campOnActivated = campOnActivated;
           this.remoteExtensionActivated = remoteExtensionActivated;
           this.doNotDisturbActivated = doNotDisturbActivated;
           this.forwardState = forwardState;
           this.overflowType = overflowType;
           this.associate = associate;
    }


    /**
     * Gets the locked value for this AlcStaticState.
     * 
     * @return locked
     */
    public java.lang.Boolean getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this AlcStaticState.
     * 
     * @param locked
     */
    public void setLocked(java.lang.Boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the campOnActivated value for this AlcStaticState.
     * 
     * @return campOnActivated
     */
    public java.lang.Boolean getCampOnActivated() {
        return campOnActivated;
    }


    /**
     * Sets the campOnActivated value for this AlcStaticState.
     * 
     * @param campOnActivated
     */
    public void setCampOnActivated(java.lang.Boolean campOnActivated) {
        this.campOnActivated = campOnActivated;
    }


    /**
     * Gets the remoteExtensionActivated value for this AlcStaticState.
     * 
     * @return remoteExtensionActivated
     */
    public java.lang.Boolean getRemoteExtensionActivated() {
        return remoteExtensionActivated;
    }


    /**
     * Sets the remoteExtensionActivated value for this AlcStaticState.
     * 
     * @param remoteExtensionActivated
     */
    public void setRemoteExtensionActivated(java.lang.Boolean remoteExtensionActivated) {
        this.remoteExtensionActivated = remoteExtensionActivated;
    }


    /**
     * Gets the doNotDisturbActivated value for this AlcStaticState.
     * 
     * @return doNotDisturbActivated
     */
    public java.lang.Boolean getDoNotDisturbActivated() {
        return doNotDisturbActivated;
    }


    /**
     * Sets the doNotDisturbActivated value for this AlcStaticState.
     * 
     * @param doNotDisturbActivated
     */
    public void setDoNotDisturbActivated(java.lang.Boolean doNotDisturbActivated) {
        this.doNotDisturbActivated = doNotDisturbActivated;
    }


    /**
     * Gets the forwardState value for this AlcStaticState.
     * 
     * @return forwardState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardState getForwardState() {
        return forwardState;
    }


    /**
     * Sets the forwardState value for this AlcStaticState.
     * 
     * @param forwardState
     */
    public void setForwardState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardState forwardState) {
        this.forwardState = forwardState;
    }


    /**
     * Gets the overflowType value for this AlcStaticState.
     * 
     * @return overflowType
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcOverflowType getOverflowType() {
        return overflowType;
    }


    /**
     * Sets the overflowType value for this AlcStaticState.
     * 
     * @param overflowType
     */
    public void setOverflowType(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcOverflowType overflowType) {
        this.overflowType = overflowType;
    }


    /**
     * Gets the associate value for this AlcStaticState.
     * 
     * @return associate
     */
    public java.lang.String getAssociate() {
        return associate;
    }


    /**
     * Sets the associate value for this AlcStaticState.
     * 
     * @param associate
     */
    public void setAssociate(java.lang.String associate) {
        this.associate = associate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcStaticState)) return false;
        AlcStaticState other = (AlcStaticState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.campOnActivated==null && other.getCampOnActivated()==null) || 
             (this.campOnActivated!=null &&
              this.campOnActivated.equals(other.getCampOnActivated()))) &&
            ((this.remoteExtensionActivated==null && other.getRemoteExtensionActivated()==null) || 
             (this.remoteExtensionActivated!=null &&
              this.remoteExtensionActivated.equals(other.getRemoteExtensionActivated()))) &&
            ((this.doNotDisturbActivated==null && other.getDoNotDisturbActivated()==null) || 
             (this.doNotDisturbActivated!=null &&
              this.doNotDisturbActivated.equals(other.getDoNotDisturbActivated()))) &&
            ((this.forwardState==null && other.getForwardState()==null) || 
             (this.forwardState!=null &&
              this.forwardState.equals(other.getForwardState()))) &&
            ((this.overflowType==null && other.getOverflowType()==null) || 
             (this.overflowType!=null &&
              this.overflowType.equals(other.getOverflowType()))) &&
            ((this.associate==null && other.getAssociate()==null) || 
             (this.associate!=null &&
              this.associate.equals(other.getAssociate())));
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
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getCampOnActivated() != null) {
            _hashCode += getCampOnActivated().hashCode();
        }
        if (getRemoteExtensionActivated() != null) {
            _hashCode += getRemoteExtensionActivated().hashCode();
        }
        if (getDoNotDisturbActivated() != null) {
            _hashCode += getDoNotDisturbActivated().hashCode();
        }
        if (getForwardState() != null) {
            _hashCode += getForwardState().hashCode();
        }
        if (getOverflowType() != null) {
            _hashCode += getOverflowType().hashCode();
        }
        if (getAssociate() != null) {
            _hashCode += getAssociate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcStaticState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcStaticState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campOnActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "campOnActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteExtensionActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "remoteExtensionActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotDisturbActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "doNotDisturbActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "forwardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overflowType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "overflowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcOverflowType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "associate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
