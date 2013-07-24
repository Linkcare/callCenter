
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="directTrunkSeizure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redialLastNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nightServiceAnswering" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dtmfFrequenciesTest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parkCallRetrieve" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waitingCallConsultation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decimalEndToEndDialing" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dtmfEndToEndDialing" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maliciousCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commonHold" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diallingKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secretIdentity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alphapage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manualHold" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "directTrunkSeizure",
    "businessAccountCode",
    "redialLastNumber",
    "nightServiceAnswering",
    "dtmfFrequenciesTest",
    "parkCallRetrieve",
    "waitingCallConsultation",
    "decimalEndToEndDialing",
    "dtmfEndToEndDialing",
    "maliciousCall",
    "commonHold",
    "diallingKey",
    "secretIdentity",
    "alphapage",
    "manualHold"
})
@XmlRootElement(name = "getExternalFeaturesPrefixesResponse")
public class GetExternalFeaturesPrefixesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<String> directTrunkSeizure;
    @XmlElement(nillable = true)
    protected List<String> businessAccountCode;
    @XmlElement(nillable = true)
    protected List<String> redialLastNumber;
    @XmlElement(nillable = true)
    protected List<String> nightServiceAnswering;
    @XmlElement(nillable = true)
    protected List<String> dtmfFrequenciesTest;
    @XmlElement(nillable = true)
    protected List<String> parkCallRetrieve;
    @XmlElement(nillable = true)
    protected List<String> waitingCallConsultation;
    @XmlElement(nillable = true)
    protected List<String> decimalEndToEndDialing;
    @XmlElement(nillable = true)
    protected List<String> dtmfEndToEndDialing;
    @XmlElement(nillable = true)
    protected List<String> maliciousCall;
    @XmlElement(nillable = true)
    protected List<String> commonHold;
    @XmlElement(nillable = true)
    protected List<String> diallingKey;
    @XmlElement(nillable = true)
    protected List<String> secretIdentity;
    @XmlElement(nillable = true)
    protected List<String> alphapage;
    @XmlElement(nillable = true)
    protected List<String> manualHold;

    /**
     * Gets the value of the directTrunkSeizure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directTrunkSeizure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectTrunkSeizure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDirectTrunkSeizure() {
        if (directTrunkSeizure == null) {
            directTrunkSeizure = new ArrayList<String>();
        }
        return this.directTrunkSeizure;
    }

    /**
     * Gets the value of the businessAccountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessAccountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBusinessAccountCode() {
        if (businessAccountCode == null) {
            businessAccountCode = new ArrayList<String>();
        }
        return this.businessAccountCode;
    }

    /**
     * Gets the value of the redialLastNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redialLastNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedialLastNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRedialLastNumber() {
        if (redialLastNumber == null) {
            redialLastNumber = new ArrayList<String>();
        }
        return this.redialLastNumber;
    }

    /**
     * Gets the value of the nightServiceAnswering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nightServiceAnswering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNightServiceAnswering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNightServiceAnswering() {
        if (nightServiceAnswering == null) {
            nightServiceAnswering = new ArrayList<String>();
        }
        return this.nightServiceAnswering;
    }

    /**
     * Gets the value of the dtmfFrequenciesTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtmfFrequenciesTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtmfFrequenciesTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDtmfFrequenciesTest() {
        if (dtmfFrequenciesTest == null) {
            dtmfFrequenciesTest = new ArrayList<String>();
        }
        return this.dtmfFrequenciesTest;
    }

    /**
     * Gets the value of the parkCallRetrieve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkCallRetrieve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkCallRetrieve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParkCallRetrieve() {
        if (parkCallRetrieve == null) {
            parkCallRetrieve = new ArrayList<String>();
        }
        return this.parkCallRetrieve;
    }

    /**
     * Gets the value of the waitingCallConsultation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitingCallConsultation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitingCallConsultation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWaitingCallConsultation() {
        if (waitingCallConsultation == null) {
            waitingCallConsultation = new ArrayList<String>();
        }
        return this.waitingCallConsultation;
    }

    /**
     * Gets the value of the decimalEndToEndDialing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decimalEndToEndDialing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecimalEndToEndDialing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDecimalEndToEndDialing() {
        if (decimalEndToEndDialing == null) {
            decimalEndToEndDialing = new ArrayList<String>();
        }
        return this.decimalEndToEndDialing;
    }

    /**
     * Gets the value of the dtmfEndToEndDialing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtmfEndToEndDialing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtmfEndToEndDialing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDtmfEndToEndDialing() {
        if (dtmfEndToEndDialing == null) {
            dtmfEndToEndDialing = new ArrayList<String>();
        }
        return this.dtmfEndToEndDialing;
    }

    /**
     * Gets the value of the maliciousCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maliciousCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaliciousCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaliciousCall() {
        if (maliciousCall == null) {
            maliciousCall = new ArrayList<String>();
        }
        return this.maliciousCall;
    }

    /**
     * Gets the value of the commonHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommonHold() {
        if (commonHold == null) {
            commonHold = new ArrayList<String>();
        }
        return this.commonHold;
    }

    /**
     * Gets the value of the diallingKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diallingKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiallingKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiallingKey() {
        if (diallingKey == null) {
            diallingKey = new ArrayList<String>();
        }
        return this.diallingKey;
    }

    /**
     * Gets the value of the secretIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secretIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecretIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecretIdentity() {
        if (secretIdentity == null) {
            secretIdentity = new ArrayList<String>();
        }
        return this.secretIdentity;
    }

    /**
     * Gets the value of the alphapage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alphapage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlphapage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlphapage() {
        if (alphapage == null) {
            alphapage = new ArrayList<String>();
        }
        return this.alphapage;
    }

    /**
     * Gets the value of the manualHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManualHold() {
        if (manualHold == null) {
            manualHold = new ArrayList<String>();
        }
        return this.manualHold;
    }

}
