
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *             Describes an OTS line.
 *          &lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AlcOtsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcOtsLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cellular" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dirNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multimedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nomadic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="static" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcOtsLine", propOrder = {
    "autoAnswer",
    "cellular",
    "dirNumber",
    "dynamic",
    "multimedia",
    "nomadic",
    "_static"
})
public class AlcOtsLine {

    protected boolean autoAnswer;
    protected boolean cellular;
    @XmlElement(required = true, nillable = true)
    protected String dirNumber;
    protected boolean dynamic;
    protected boolean multimedia;
    protected boolean nomadic;
    @XmlElement(name = "static")
    protected boolean _static;

    /**
     * Gets the value of the autoAnswer property.
     * 
     */
    public boolean isAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     */
    public void setAutoAnswer(boolean value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the cellular property.
     * 
     */
    public boolean isCellular() {
        return cellular;
    }

    /**
     * Sets the value of the cellular property.
     * 
     */
    public void setCellular(boolean value) {
        this.cellular = value;
    }

    /**
     * Gets the value of the dirNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirNumber() {
        return dirNumber;
    }

    /**
     * Sets the value of the dirNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirNumber(String value) {
        this.dirNumber = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     */
    public boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     */
    public void setDynamic(boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     */
    public boolean isMultimedia() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     */
    public void setMultimedia(boolean value) {
        this.multimedia = value;
    }

    /**
     * Gets the value of the nomadic property.
     * 
     */
    public boolean isNomadic() {
        return nomadic;
    }

    /**
     * Sets the value of the nomadic property.
     * 
     */
    public void setNomadic(boolean value) {
        this.nomadic = value;
    }

    /**
     * Gets the value of the static property.
     * 
     */
    public boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     */
    public void setStatic(boolean value) {
        this._static = value;
    }

}
