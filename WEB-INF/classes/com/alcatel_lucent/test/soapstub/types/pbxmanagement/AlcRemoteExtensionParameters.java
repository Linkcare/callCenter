
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcRemoteExtensionParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcRemoteExtensionParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key1" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key2" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key3" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key4" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key5" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key6" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key7" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key8" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key9" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="key0" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="keyStar" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="keySharp" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionKeyFunctionType"/>
 *         &lt;element name="escapeSequence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cliFormat" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcCliFormatType"/>
 *         &lt;element name="redirectingNumberIEAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcRemoteExtensionParameters", propOrder = {
    "key1",
    "key2",
    "key3",
    "key4",
    "key5",
    "key6",
    "key7",
    "key8",
    "key9",
    "key0",
    "keyStar",
    "keySharp",
    "escapeSequence",
    "cliFormat",
    "redirectingNumberIEAvailable"
})
public class AlcRemoteExtensionParameters {

    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key1;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key2;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key3;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key4;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key5;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key6;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key7;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key8;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key9;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType key0;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType keyStar;
    @XmlElement(required = true)
    protected AlcRemoteExtensionKeyFunctionType keySharp;
    @XmlElement(required = true)
    protected String escapeSequence;
    @XmlElement(required = true)
    protected AlcCliFormatType cliFormat;
    protected boolean redirectingNumberIEAvailable;

    /**
     * Gets the value of the key1 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey1() {
        return key1;
    }

    /**
     * Sets the value of the key1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey1(AlcRemoteExtensionKeyFunctionType value) {
        this.key1 = value;
    }

    /**
     * Gets the value of the key2 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey2() {
        return key2;
    }

    /**
     * Sets the value of the key2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey2(AlcRemoteExtensionKeyFunctionType value) {
        this.key2 = value;
    }

    /**
     * Gets the value of the key3 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey3() {
        return key3;
    }

    /**
     * Sets the value of the key3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey3(AlcRemoteExtensionKeyFunctionType value) {
        this.key3 = value;
    }

    /**
     * Gets the value of the key4 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey4() {
        return key4;
    }

    /**
     * Sets the value of the key4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey4(AlcRemoteExtensionKeyFunctionType value) {
        this.key4 = value;
    }

    /**
     * Gets the value of the key5 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey5() {
        return key5;
    }

    /**
     * Sets the value of the key5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey5(AlcRemoteExtensionKeyFunctionType value) {
        this.key5 = value;
    }

    /**
     * Gets the value of the key6 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey6() {
        return key6;
    }

    /**
     * Sets the value of the key6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey6(AlcRemoteExtensionKeyFunctionType value) {
        this.key6 = value;
    }

    /**
     * Gets the value of the key7 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey7() {
        return key7;
    }

    /**
     * Sets the value of the key7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey7(AlcRemoteExtensionKeyFunctionType value) {
        this.key7 = value;
    }

    /**
     * Gets the value of the key8 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey8() {
        return key8;
    }

    /**
     * Sets the value of the key8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey8(AlcRemoteExtensionKeyFunctionType value) {
        this.key8 = value;
    }

    /**
     * Gets the value of the key9 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey9() {
        return key9;
    }

    /**
     * Sets the value of the key9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey9(AlcRemoteExtensionKeyFunctionType value) {
        this.key9 = value;
    }

    /**
     * Gets the value of the key0 property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKey0() {
        return key0;
    }

    /**
     * Sets the value of the key0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKey0(AlcRemoteExtensionKeyFunctionType value) {
        this.key0 = value;
    }

    /**
     * Gets the value of the keyStar property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKeyStar() {
        return keyStar;
    }

    /**
     * Sets the value of the keyStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKeyStar(AlcRemoteExtensionKeyFunctionType value) {
        this.keyStar = value;
    }

    /**
     * Gets the value of the keySharp property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public AlcRemoteExtensionKeyFunctionType getKeySharp() {
        return keySharp;
    }

    /**
     * Sets the value of the keySharp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionKeyFunctionType }
     *     
     */
    public void setKeySharp(AlcRemoteExtensionKeyFunctionType value) {
        this.keySharp = value;
    }

    /**
     * Gets the value of the escapeSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapeSequence() {
        return escapeSequence;
    }

    /**
     * Sets the value of the escapeSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapeSequence(String value) {
        this.escapeSequence = value;
    }

    /**
     * Gets the value of the cliFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCliFormatType }
     *     
     */
    public AlcCliFormatType getCliFormat() {
        return cliFormat;
    }

    /**
     * Sets the value of the cliFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCliFormatType }
     *     
     */
    public void setCliFormat(AlcCliFormatType value) {
        this.cliFormat = value;
    }

    /**
     * Gets the value of the redirectingNumberIEAvailable property.
     * 
     */
    public boolean isRedirectingNumberIEAvailable() {
        return redirectingNumberIEAvailable;
    }

    /**
     * Sets the value of the redirectingNumberIEAvailable property.
     * 
     */
    public void setRedirectingNumberIEAvailable(boolean value) {
        this.redirectingNumberIEAvailable = value;
    }

}
