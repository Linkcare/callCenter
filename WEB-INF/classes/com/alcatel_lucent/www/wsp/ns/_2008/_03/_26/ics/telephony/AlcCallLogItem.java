/**
 * AlcCallLogItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcCallLogItem  implements java.io.Serializable {
    private boolean acknowledged;

    private boolean answeredCall;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCause cause;

    private java.lang.String corrFirstName;

    private java.lang.String corrName;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber corrNumber;

    private java.lang.String corrCanonicalNumber;

    private java.util.Calendar dateOfBegin;

    private java.util.Calendar dateOfConvers;

    private java.util.Calendar dateOfEnd;

    private java.lang.String dirNumber;

    private boolean externalCall;

    private boolean incomingCall;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber initialNumber;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId itemId;

    private java.lang.String newDestNumber;

    private boolean redirectedCall;

    public AlcCallLogItem() {
    }

    public AlcCallLogItem(
           boolean acknowledged,
           boolean answeredCall,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCause cause,
           java.lang.String corrFirstName,
           java.lang.String corrName,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber corrNumber,
           java.lang.String corrCanonicalNumber,
           java.util.Calendar dateOfBegin,
           java.util.Calendar dateOfConvers,
           java.util.Calendar dateOfEnd,
           java.lang.String dirNumber,
           boolean externalCall,
           boolean incomingCall,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber initialNumber,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId itemId,
           java.lang.String newDestNumber,
           boolean redirectedCall) {
           this.acknowledged = acknowledged;
           this.answeredCall = answeredCall;
           this.cause = cause;
           this.corrFirstName = corrFirstName;
           this.corrName = corrName;
           this.corrNumber = corrNumber;
           this.corrCanonicalNumber = corrCanonicalNumber;
           this.dateOfBegin = dateOfBegin;
           this.dateOfConvers = dateOfConvers;
           this.dateOfEnd = dateOfEnd;
           this.dirNumber = dirNumber;
           this.externalCall = externalCall;
           this.incomingCall = incomingCall;
           this.initialNumber = initialNumber;
           this.itemId = itemId;
           this.newDestNumber = newDestNumber;
           this.redirectedCall = redirectedCall;
    }


    /**
     * Gets the acknowledged value for this AlcCallLogItem.
     * 
     * @return acknowledged
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }


    /**
     * Sets the acknowledged value for this AlcCallLogItem.
     * 
     * @param acknowledged
     */
    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }


    /**
     * Gets the answeredCall value for this AlcCallLogItem.
     * 
     * @return answeredCall
     */
    public boolean isAnsweredCall() {
        return answeredCall;
    }


    /**
     * Sets the answeredCall value for this AlcCallLogItem.
     * 
     * @param answeredCall
     */
    public void setAnsweredCall(boolean answeredCall) {
        this.answeredCall = answeredCall;
    }


    /**
     * Gets the cause value for this AlcCallLogItem.
     * 
     * @return cause
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCause getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this AlcCallLogItem.
     * 
     * @param cause
     */
    public void setCause(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCause cause) {
        this.cause = cause;
    }


    /**
     * Gets the corrFirstName value for this AlcCallLogItem.
     * 
     * @return corrFirstName
     */
    public java.lang.String getCorrFirstName() {
        return corrFirstName;
    }


    /**
     * Sets the corrFirstName value for this AlcCallLogItem.
     * 
     * @param corrFirstName
     */
    public void setCorrFirstName(java.lang.String corrFirstName) {
        this.corrFirstName = corrFirstName;
    }


    /**
     * Gets the corrName value for this AlcCallLogItem.
     * 
     * @return corrName
     */
    public java.lang.String getCorrName() {
        return corrName;
    }


    /**
     * Sets the corrName value for this AlcCallLogItem.
     * 
     * @param corrName
     */
    public void setCorrName(java.lang.String corrName) {
        this.corrName = corrName;
    }


    /**
     * Gets the corrNumber value for this AlcCallLogItem.
     * 
     * @return corrNumber
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber getCorrNumber() {
        return corrNumber;
    }


    /**
     * Sets the corrNumber value for this AlcCallLogItem.
     * 
     * @param corrNumber
     */
    public void setCorrNumber(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber corrNumber) {
        this.corrNumber = corrNumber;
    }


    /**
     * Gets the corrCanonicalNumber value for this AlcCallLogItem.
     * 
     * @return corrCanonicalNumber
     */
    public java.lang.String getCorrCanonicalNumber() {
        return corrCanonicalNumber;
    }


    /**
     * Sets the corrCanonicalNumber value for this AlcCallLogItem.
     * 
     * @param corrCanonicalNumber
     */
    public void setCorrCanonicalNumber(java.lang.String corrCanonicalNumber) {
        this.corrCanonicalNumber = corrCanonicalNumber;
    }


    /**
     * Gets the dateOfBegin value for this AlcCallLogItem.
     * 
     * @return dateOfBegin
     */
    public java.util.Calendar getDateOfBegin() {
        return dateOfBegin;
    }


    /**
     * Sets the dateOfBegin value for this AlcCallLogItem.
     * 
     * @param dateOfBegin
     */
    public void setDateOfBegin(java.util.Calendar dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }


    /**
     * Gets the dateOfConvers value for this AlcCallLogItem.
     * 
     * @return dateOfConvers
     */
    public java.util.Calendar getDateOfConvers() {
        return dateOfConvers;
    }


    /**
     * Sets the dateOfConvers value for this AlcCallLogItem.
     * 
     * @param dateOfConvers
     */
    public void setDateOfConvers(java.util.Calendar dateOfConvers) {
        this.dateOfConvers = dateOfConvers;
    }


    /**
     * Gets the dateOfEnd value for this AlcCallLogItem.
     * 
     * @return dateOfEnd
     */
    public java.util.Calendar getDateOfEnd() {
        return dateOfEnd;
    }


    /**
     * Sets the dateOfEnd value for this AlcCallLogItem.
     * 
     * @param dateOfEnd
     */
    public void setDateOfEnd(java.util.Calendar dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }


    /**
     * Gets the dirNumber value for this AlcCallLogItem.
     * 
     * @return dirNumber
     */
    public java.lang.String getDirNumber() {
        return dirNumber;
    }


    /**
     * Sets the dirNumber value for this AlcCallLogItem.
     * 
     * @param dirNumber
     */
    public void setDirNumber(java.lang.String dirNumber) {
        this.dirNumber = dirNumber;
    }


    /**
     * Gets the externalCall value for this AlcCallLogItem.
     * 
     * @return externalCall
     */
    public boolean isExternalCall() {
        return externalCall;
    }


    /**
     * Sets the externalCall value for this AlcCallLogItem.
     * 
     * @param externalCall
     */
    public void setExternalCall(boolean externalCall) {
        this.externalCall = externalCall;
    }


    /**
     * Gets the incomingCall value for this AlcCallLogItem.
     * 
     * @return incomingCall
     */
    public boolean isIncomingCall() {
        return incomingCall;
    }


    /**
     * Sets the incomingCall value for this AlcCallLogItem.
     * 
     * @param incomingCall
     */
    public void setIncomingCall(boolean incomingCall) {
        this.incomingCall = incomingCall;
    }


    /**
     * Gets the initialNumber value for this AlcCallLogItem.
     * 
     * @return initialNumber
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber getInitialNumber() {
        return initialNumber;
    }


    /**
     * Sets the initialNumber value for this AlcCallLogItem.
     * 
     * @param initialNumber
     */
    public void setInitialNumber(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber initialNumber) {
        this.initialNumber = initialNumber;
    }


    /**
     * Gets the itemId value for this AlcCallLogItem.
     * 
     * @return itemId
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this AlcCallLogItem.
     * 
     * @param itemId
     */
    public void setItemId(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the newDestNumber value for this AlcCallLogItem.
     * 
     * @return newDestNumber
     */
    public java.lang.String getNewDestNumber() {
        return newDestNumber;
    }


    /**
     * Sets the newDestNumber value for this AlcCallLogItem.
     * 
     * @param newDestNumber
     */
    public void setNewDestNumber(java.lang.String newDestNumber) {
        this.newDestNumber = newDestNumber;
    }


    /**
     * Gets the redirectedCall value for this AlcCallLogItem.
     * 
     * @return redirectedCall
     */
    public boolean isRedirectedCall() {
        return redirectedCall;
    }


    /**
     * Sets the redirectedCall value for this AlcCallLogItem.
     * 
     * @param redirectedCall
     */
    public void setRedirectedCall(boolean redirectedCall) {
        this.redirectedCall = redirectedCall;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcCallLogItem)) return false;
        AlcCallLogItem other = (AlcCallLogItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.acknowledged == other.isAcknowledged() &&
            this.answeredCall == other.isAnsweredCall() &&
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            ((this.corrFirstName==null && other.getCorrFirstName()==null) || 
             (this.corrFirstName!=null &&
              this.corrFirstName.equals(other.getCorrFirstName()))) &&
            ((this.corrName==null && other.getCorrName()==null) || 
             (this.corrName!=null &&
              this.corrName.equals(other.getCorrName()))) &&
            ((this.corrNumber==null && other.getCorrNumber()==null) || 
             (this.corrNumber!=null &&
              this.corrNumber.equals(other.getCorrNumber()))) &&
            ((this.corrCanonicalNumber==null && other.getCorrCanonicalNumber()==null) || 
             (this.corrCanonicalNumber!=null &&
              this.corrCanonicalNumber.equals(other.getCorrCanonicalNumber()))) &&
            ((this.dateOfBegin==null && other.getDateOfBegin()==null) || 
             (this.dateOfBegin!=null &&
              this.dateOfBegin.equals(other.getDateOfBegin()))) &&
            ((this.dateOfConvers==null && other.getDateOfConvers()==null) || 
             (this.dateOfConvers!=null &&
              this.dateOfConvers.equals(other.getDateOfConvers()))) &&
            ((this.dateOfEnd==null && other.getDateOfEnd()==null) || 
             (this.dateOfEnd!=null &&
              this.dateOfEnd.equals(other.getDateOfEnd()))) &&
            ((this.dirNumber==null && other.getDirNumber()==null) || 
             (this.dirNumber!=null &&
              this.dirNumber.equals(other.getDirNumber()))) &&
            this.externalCall == other.isExternalCall() &&
            this.incomingCall == other.isIncomingCall() &&
            ((this.initialNumber==null && other.getInitialNumber()==null) || 
             (this.initialNumber!=null &&
              this.initialNumber.equals(other.getInitialNumber()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.newDestNumber==null && other.getNewDestNumber()==null) || 
             (this.newDestNumber!=null &&
              this.newDestNumber.equals(other.getNewDestNumber()))) &&
            this.redirectedCall == other.isRedirectedCall();
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
        _hashCode += (isAcknowledged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAnsweredCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        if (getCorrFirstName() != null) {
            _hashCode += getCorrFirstName().hashCode();
        }
        if (getCorrName() != null) {
            _hashCode += getCorrName().hashCode();
        }
        if (getCorrNumber() != null) {
            _hashCode += getCorrNumber().hashCode();
        }
        if (getCorrCanonicalNumber() != null) {
            _hashCode += getCorrCanonicalNumber().hashCode();
        }
        if (getDateOfBegin() != null) {
            _hashCode += getDateOfBegin().hashCode();
        }
        if (getDateOfConvers() != null) {
            _hashCode += getDateOfConvers().hashCode();
        }
        if (getDateOfEnd() != null) {
            _hashCode += getDateOfEnd().hashCode();
        }
        if (getDirNumber() != null) {
            _hashCode += getDirNumber().hashCode();
        }
        _hashCode += (isExternalCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncomingCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInitialNumber() != null) {
            _hashCode += getInitialNumber().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getNewDestNumber() != null) {
            _hashCode += getNewDestNumber().hashCode();
        }
        _hashCode += (isRedirectedCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcCallLogItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallLogItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "acknowledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answeredCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "answeredCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallCause"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "corrFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "corrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "corrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTypedNumber"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrCanonicalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "corrCanonicalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "dateOfBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfConvers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "dateOfConvers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "dateOfEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "dirNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "externalCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "incomingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "initialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTypedNumber"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcItemId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "newDestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectedCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "redirectedCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
