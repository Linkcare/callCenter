/**
 * AlcSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema;

public class AlcSelector  implements java.io.Serializable {
    private java.lang.String[] ids;

    private java.lang.String[] names;

    public AlcSelector() {
    }

    public AlcSelector(
           java.lang.String[] ids,
           java.lang.String[] names) {
           this.ids = ids;
           this.names = names;
    }


    /**
     * Gets the ids value for this AlcSelector.
     * 
     * @return ids
     */
    public java.lang.String[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this AlcSelector.
     * 
     * @param ids
     */
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }

    public java.lang.String getIds(int i) {
        return this.ids[i];
    }

    public void setIds(int i, java.lang.String _value) {
        this.ids[i] = _value;
    }


    /**
     * Gets the names value for this AlcSelector.
     * 
     * @return names
     */
    public java.lang.String[] getNames() {
        return names;
    }


    /**
     * Sets the names value for this AlcSelector.
     * 
     * @param names
     */
    public void setNames(java.lang.String[] names) {
        this.names = names;
    }

    public java.lang.String getNames(int i) {
        return this.names[i];
    }

    public void setNames(int i, java.lang.String _value) {
        this.names[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcSelector)) return false;
        AlcSelector other = (AlcSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            ((this.names==null && other.getNames()==null) || 
             (this.names!=null &&
              java.util.Arrays.equals(this.names, other.getNames())));
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
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
