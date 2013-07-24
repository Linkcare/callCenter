
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *          Used to manage a password. This definition is used for the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * 's
 *          password (used to open the Framework Sessions) and the TUI password.
 * 
 * <p>Java class for AlcPasswordData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcPasswordData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forceEnrollmentActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lockDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="logonFailuresNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resetLogonFailuresNb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resetPasswordHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcPasswordData", propOrder = {
    "forceEnrollmentActivated",
    "lastModificationDate",
    "lockDate",
    "logonFailuresNb",
    "password",
    "resetLogonFailuresNb",
    "resetPasswordHistory"
})
public class AlcPasswordData {

    protected boolean forceEnrollmentActivated;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModificationDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockDate;
    protected int logonFailuresNb;
    @XmlElement(required = true, nillable = true)
    protected String password;
    protected boolean resetLogonFailuresNb;
    protected boolean resetPasswordHistory;

    /**
     * Gets the value of the forceEnrollmentActivated property.
     * 
     */
    public boolean isForceEnrollmentActivated() {
        return forceEnrollmentActivated;
    }

    /**
     * Sets the value of the forceEnrollmentActivated property.
     * 
     */
    public void setForceEnrollmentActivated(boolean value) {
        this.forceEnrollmentActivated = value;
    }

    /**
     * Gets the value of the lastModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Sets the value of the lastModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModificationDate(XMLGregorianCalendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Gets the value of the lockDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockDate() {
        return lockDate;
    }

    /**
     * Sets the value of the lockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockDate(XMLGregorianCalendar value) {
        this.lockDate = value;
    }

    /**
     * Gets the value of the logonFailuresNb property.
     * 
     */
    public int getLogonFailuresNb() {
        return logonFailuresNb;
    }

    /**
     * Sets the value of the logonFailuresNb property.
     * 
     */
    public void setLogonFailuresNb(int value) {
        this.logonFailuresNb = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the resetLogonFailuresNb property.
     * 
     */
    public boolean isResetLogonFailuresNb() {
        return resetLogonFailuresNb;
    }

    /**
     * Sets the value of the resetLogonFailuresNb property.
     * 
     */
    public void setResetLogonFailuresNb(boolean value) {
        this.resetLogonFailuresNb = value;
    }

    /**
     * Gets the value of the resetPasswordHistory property.
     * 
     */
    public boolean isResetPasswordHistory() {
        return resetPasswordHistory;
    }

    /**
     * Sets the value of the resetPasswordHistory property.
     * 
     */
    public void setResetPasswordHistory(boolean value) {
        this.resetPasswordHistory = value;
    }

}
