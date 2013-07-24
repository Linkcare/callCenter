/**
 * AlcFrameworkAccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class AlcFrameworkAccountInfo  implements java.io.Serializable {
    private java.lang.String loginName;

    private java.lang.String firstName;

    private java.lang.String name;

    private java.lang.String language;

    private java.lang.String companyPhone;

    private java.lang.String companyDect;

    private java.lang.String mobilePhone;

    private java.lang.String email;

    private java.lang.String presenceId;

    private int timeToLive;

    public AlcFrameworkAccountInfo() {
    }

    public AlcFrameworkAccountInfo(
           java.lang.String loginName,
           java.lang.String firstName,
           java.lang.String name,
           java.lang.String language,
           java.lang.String companyPhone,
           java.lang.String companyDect,
           java.lang.String mobilePhone,
           java.lang.String email,
           java.lang.String presenceId,
           int timeToLive) {
           this.loginName = loginName;
           this.firstName = firstName;
           this.name = name;
           this.language = language;
           this.companyPhone = companyPhone;
           this.companyDect = companyDect;
           this.mobilePhone = mobilePhone;
           this.email = email;
           this.presenceId = presenceId;
           this.timeToLive = timeToLive;
    }


    /**
     * Gets the loginName value for this AlcFrameworkAccountInfo.
     * 
     * @return loginName
     */
    public java.lang.String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this AlcFrameworkAccountInfo.
     * 
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the firstName value for this AlcFrameworkAccountInfo.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this AlcFrameworkAccountInfo.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the name value for this AlcFrameworkAccountInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AlcFrameworkAccountInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the language value for this AlcFrameworkAccountInfo.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AlcFrameworkAccountInfo.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the companyPhone value for this AlcFrameworkAccountInfo.
     * 
     * @return companyPhone
     */
    public java.lang.String getCompanyPhone() {
        return companyPhone;
    }


    /**
     * Sets the companyPhone value for this AlcFrameworkAccountInfo.
     * 
     * @param companyPhone
     */
    public void setCompanyPhone(java.lang.String companyPhone) {
        this.companyPhone = companyPhone;
    }


    /**
     * Gets the companyDect value for this AlcFrameworkAccountInfo.
     * 
     * @return companyDect
     */
    public java.lang.String getCompanyDect() {
        return companyDect;
    }


    /**
     * Sets the companyDect value for this AlcFrameworkAccountInfo.
     * 
     * @param companyDect
     */
    public void setCompanyDect(java.lang.String companyDect) {
        this.companyDect = companyDect;
    }


    /**
     * Gets the mobilePhone value for this AlcFrameworkAccountInfo.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this AlcFrameworkAccountInfo.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the email value for this AlcFrameworkAccountInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AlcFrameworkAccountInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the presenceId value for this AlcFrameworkAccountInfo.
     * 
     * @return presenceId
     */
    public java.lang.String getPresenceId() {
        return presenceId;
    }


    /**
     * Sets the presenceId value for this AlcFrameworkAccountInfo.
     * 
     * @param presenceId
     */
    public void setPresenceId(java.lang.String presenceId) {
        this.presenceId = presenceId;
    }


    /**
     * Gets the timeToLive value for this AlcFrameworkAccountInfo.
     * 
     * @return timeToLive
     */
    public int getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this AlcFrameworkAccountInfo.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcFrameworkAccountInfo)) return false;
        AlcFrameworkAccountInfo other = (AlcFrameworkAccountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.companyPhone==null && other.getCompanyPhone()==null) || 
             (this.companyPhone!=null &&
              this.companyPhone.equals(other.getCompanyPhone()))) &&
            ((this.companyDect==null && other.getCompanyDect()==null) || 
             (this.companyDect!=null &&
              this.companyDect.equals(other.getCompanyDect()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.presenceId==null && other.getPresenceId()==null) || 
             (this.presenceId!=null &&
              this.presenceId.equals(other.getPresenceId()))) &&
            this.timeToLive == other.getTimeToLive();
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
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getCompanyPhone() != null) {
            _hashCode += getCompanyPhone().hashCode();
        }
        if (getCompanyDect() != null) {
            _hashCode += getCompanyDect().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPresenceId() != null) {
            _hashCode += getPresenceId().hashCode();
        }
        _hashCode += getTimeToLive();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcFrameworkAccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcFrameworkAccountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "companyPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyDect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "companyDect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "presenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "timeToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
