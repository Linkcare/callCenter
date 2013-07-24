
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the rights of a 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcSubscriberRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSubscriberRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classofService" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="externalAccessClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="externalForwardingClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="classofConnection" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="callByNameAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSubscriberRights", propOrder = {
    "classofService",
    "externalAccessClass",
    "externalForwardingClass",
    "classofConnection",
    "callByNameAllowed"
})
public class AlcSubscriberRights {

    protected int classofService;
    protected int externalAccessClass;
    protected int externalForwardingClass;
    protected int classofConnection;
    protected boolean callByNameAllowed;

    /**
     * Gets the value of the classofService property.
     * 
     */
    public int getClassofService() {
        return classofService;
    }

    /**
     * Sets the value of the classofService property.
     * 
     */
    public void setClassofService(int value) {
        this.classofService = value;
    }

    /**
     * Gets the value of the externalAccessClass property.
     * 
     */
    public int getExternalAccessClass() {
        return externalAccessClass;
    }

    /**
     * Sets the value of the externalAccessClass property.
     * 
     */
    public void setExternalAccessClass(int value) {
        this.externalAccessClass = value;
    }

    /**
     * Gets the value of the externalForwardingClass property.
     * 
     */
    public int getExternalForwardingClass() {
        return externalForwardingClass;
    }

    /**
     * Sets the value of the externalForwardingClass property.
     * 
     */
    public void setExternalForwardingClass(int value) {
        this.externalForwardingClass = value;
    }

    /**
     * Gets the value of the classofConnection property.
     * 
     */
    public int getClassofConnection() {
        return classofConnection;
    }

    /**
     * Sets the value of the classofConnection property.
     * 
     */
    public void setClassofConnection(int value) {
        this.classofConnection = value;
    }

    /**
     * Gets the value of the callByNameAllowed property.
     * 
     */
    public boolean isCallByNameAllowed() {
        return callByNameAllowed;
    }

    /**
     * Sets the value of the callByNameAllowed property.
     * 
     */
    public void setCallByNameAllowed(boolean value) {
        this.callByNameAllowed = value;
    }

}
