
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
 *         &lt;element name="brokerCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="threePartyConference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="intrude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bookingOnFreeOrBusySet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="busyCampOn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loudspeakerPaging" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="callAnnouncement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enquiryCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pagingRequest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decimalEndToEndSignalling" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dtmfEndToEndSignalling" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maliciousCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceMailDeposit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campOnControl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doNotDistrubOverride" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "brokerCall",
    "threePartyConference",
    "intrude",
    "bookingOnFreeOrBusySet",
    "busyCampOn",
    "loudspeakerPaging",
    "callAnnouncement",
    "enquiryCall",
    "pagingRequest",
    "businessNumber",
    "decimalEndToEndSignalling",
    "dtmfEndToEndSignalling",
    "maliciousCall",
    "voiceMailDeposit",
    "campOnControl",
    "doNotDistrubOverride"
})
@XmlRootElement(name = "getSuffixesResponse")
public class GetSuffixesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<String> brokerCall;
    @XmlElement(nillable = true)
    protected List<String> threePartyConference;
    @XmlElement(nillable = true)
    protected List<String> intrude;
    @XmlElement(nillable = true)
    protected List<String> bookingOnFreeOrBusySet;
    @XmlElement(nillable = true)
    protected List<String> busyCampOn;
    @XmlElement(nillable = true)
    protected List<String> loudspeakerPaging;
    @XmlElement(nillable = true)
    protected List<String> callAnnouncement;
    @XmlElement(nillable = true)
    protected List<String> enquiryCall;
    @XmlElement(nillable = true)
    protected List<String> pagingRequest;
    @XmlElement(nillable = true)
    protected List<String> businessNumber;
    @XmlElement(nillable = true)
    protected List<String> decimalEndToEndSignalling;
    @XmlElement(nillable = true)
    protected List<String> dtmfEndToEndSignalling;
    @XmlElement(nillable = true)
    protected List<String> maliciousCall;
    @XmlElement(nillable = true)
    protected List<String> voiceMailDeposit;
    @XmlElement(nillable = true)
    protected List<String> campOnControl;
    @XmlElement(nillable = true)
    protected List<String> doNotDistrubOverride;

    /**
     * Gets the value of the brokerCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBrokerCall() {
        if (brokerCall == null) {
            brokerCall = new ArrayList<String>();
        }
        return this.brokerCall;
    }

    /**
     * Gets the value of the threePartyConference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threePartyConference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreePartyConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getThreePartyConference() {
        if (threePartyConference == null) {
            threePartyConference = new ArrayList<String>();
        }
        return this.threePartyConference;
    }

    /**
     * Gets the value of the intrude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntrude() {
        if (intrude == null) {
            intrude = new ArrayList<String>();
        }
        return this.intrude;
    }

    /**
     * Gets the value of the bookingOnFreeOrBusySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingOnFreeOrBusySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingOnFreeOrBusySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBookingOnFreeOrBusySet() {
        if (bookingOnFreeOrBusySet == null) {
            bookingOnFreeOrBusySet = new ArrayList<String>();
        }
        return this.bookingOnFreeOrBusySet;
    }

    /**
     * Gets the value of the busyCampOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busyCampOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusyCampOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBusyCampOn() {
        if (busyCampOn == null) {
            busyCampOn = new ArrayList<String>();
        }
        return this.busyCampOn;
    }

    /**
     * Gets the value of the loudspeakerPaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loudspeakerPaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoudspeakerPaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLoudspeakerPaging() {
        if (loudspeakerPaging == null) {
            loudspeakerPaging = new ArrayList<String>();
        }
        return this.loudspeakerPaging;
    }

    /**
     * Gets the value of the callAnnouncement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callAnnouncement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallAnnouncement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCallAnnouncement() {
        if (callAnnouncement == null) {
            callAnnouncement = new ArrayList<String>();
        }
        return this.callAnnouncement;
    }

    /**
     * Gets the value of the enquiryCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enquiryCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnquiryCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnquiryCall() {
        if (enquiryCall == null) {
            enquiryCall = new ArrayList<String>();
        }
        return this.enquiryCall;
    }

    /**
     * Gets the value of the pagingRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagingRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagingRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPagingRequest() {
        if (pagingRequest == null) {
            pagingRequest = new ArrayList<String>();
        }
        return this.pagingRequest;
    }

    /**
     * Gets the value of the businessNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBusinessNumber() {
        if (businessNumber == null) {
            businessNumber = new ArrayList<String>();
        }
        return this.businessNumber;
    }

    /**
     * Gets the value of the decimalEndToEndSignalling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decimalEndToEndSignalling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecimalEndToEndSignalling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDecimalEndToEndSignalling() {
        if (decimalEndToEndSignalling == null) {
            decimalEndToEndSignalling = new ArrayList<String>();
        }
        return this.decimalEndToEndSignalling;
    }

    /**
     * Gets the value of the dtmfEndToEndSignalling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtmfEndToEndSignalling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtmfEndToEndSignalling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDtmfEndToEndSignalling() {
        if (dtmfEndToEndSignalling == null) {
            dtmfEndToEndSignalling = new ArrayList<String>();
        }
        return this.dtmfEndToEndSignalling;
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
     * Gets the value of the voiceMailDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailDeposit() {
        if (voiceMailDeposit == null) {
            voiceMailDeposit = new ArrayList<String>();
        }
        return this.voiceMailDeposit;
    }

    /**
     * Gets the value of the campOnControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campOnControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampOnControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCampOnControl() {
        if (campOnControl == null) {
            campOnControl = new ArrayList<String>();
        }
        return this.campOnControl;
    }

    /**
     * Gets the value of the doNotDistrubOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doNotDistrubOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoNotDistrubOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoNotDistrubOverride() {
        if (doNotDistrubOverride == null) {
            doNotDistrubOverride = new ArrayList<String>();
        }
        return this.doNotDistrubOverride;
    }

}
