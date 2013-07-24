
package com.alcatel_lucent.test.soapstub.types.phone;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainLine" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcLineInfo"/>
 *         &lt;element name="secondaryLines" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcLineInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otsAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otsPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atapiPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tftpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pbxMain1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pbxMain2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstName",
    "name",
    "mainLine",
    "secondaryLines",
    "otsAddress",
    "otsPort",
    "otsId",
    "atapiPort",
    "tftpServer",
    "pbxMain1",
    "pbxMain2"
})
@XmlRootElement(name = "getAccountInfoResponse")
public class GetAccountInfoResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected AlcLineInfo mainLine;
    @XmlElement(nillable = true)
    protected List<AlcLineInfo> secondaryLines;
    @XmlElement(required = true, nillable = true)
    protected String otsAddress;
    @XmlElement(required = true, nillable = true)
    protected String otsPort;
    @XmlElement(required = true, nillable = true)
    protected String otsId;
    @XmlElement(required = true, nillable = true)
    protected String atapiPort;
    @XmlElementRef(name = "tftpServer", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", type = JAXBElement.class)
    protected JAXBElement<String> tftpServer;
    @XmlElementRef(name = "pbxMain1", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", type = JAXBElement.class)
    protected JAXBElement<String> pbxMain1;
    @XmlElementRef(name = "pbxMain2", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", type = JAXBElement.class)
    protected JAXBElement<String> pbxMain2;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mainLine property.
     * 
     * @return
     *     possible object is
     *     {@link AlcLineInfo }
     *     
     */
    public AlcLineInfo getMainLine() {
        return mainLine;
    }

    /**
     * Sets the value of the mainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcLineInfo }
     *     
     */
    public void setMainLine(AlcLineInfo value) {
        this.mainLine = value;
    }

    /**
     * Gets the value of the secondaryLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcLineInfo }
     * 
     * 
     */
    public List<AlcLineInfo> getSecondaryLines() {
        if (secondaryLines == null) {
            secondaryLines = new ArrayList<AlcLineInfo>();
        }
        return this.secondaryLines;
    }

    /**
     * Gets the value of the otsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtsAddress() {
        return otsAddress;
    }

    /**
     * Sets the value of the otsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtsAddress(String value) {
        this.otsAddress = value;
    }

    /**
     * Gets the value of the otsPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtsPort() {
        return otsPort;
    }

    /**
     * Sets the value of the otsPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtsPort(String value) {
        this.otsPort = value;
    }

    /**
     * Gets the value of the otsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtsId() {
        return otsId;
    }

    /**
     * Sets the value of the otsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtsId(String value) {
        this.otsId = value;
    }

    /**
     * Gets the value of the atapiPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtapiPort() {
        return atapiPort;
    }

    /**
     * Sets the value of the atapiPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtapiPort(String value) {
        this.atapiPort = value;
    }

    /**
     * Gets the value of the tftpServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTftpServer() {
        return tftpServer;
    }

    /**
     * Sets the value of the tftpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTftpServer(JAXBElement<String> value) {
        this.tftpServer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pbxMain1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPbxMain1() {
        return pbxMain1;
    }

    /**
     * Sets the value of the pbxMain1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPbxMain1(JAXBElement<String> value) {
        this.pbxMain1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pbxMain2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPbxMain2() {
        return pbxMain2;
    }

    /**
     * Sets the value of the pbxMain2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPbxMain2(JAXBElement<String> value) {
        this.pbxMain2 = ((JAXBElement<String> ) value);
    }

}
