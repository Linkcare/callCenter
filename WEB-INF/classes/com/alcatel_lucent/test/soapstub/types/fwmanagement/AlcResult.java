
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Each operation published by this 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Web Service&lt;/i&gt;
 * </pre>
 *  returns this kind of result.
 * 
 * <p>Java class for AlcResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCode" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcResultCode"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcResult", propOrder = {
    "resultCode",
    "comment"
})
@XmlSeeAlso({
    GetFrameworkUsersResponse.class,
    UpdateVoiceMailBoxResponse.class,
    GetAvailableDtmfMappingsResponse.class,
    LoadVoiceMailBoxesResponse.class,
    GetAvailableVoiceMailSystemsResponse.class,
    CreateVoiceMailBoxResponse.class,
    UpdateOtsAccountResponse.class,
    GetFrameworkUserResponse.class,
    DeleteVoiceMailBoxResponse.class,
    GetVoiceMailProfileResponse.class,
    GetAvailableDepartmentsResponse.class,
    GetAvailableVoiceMailProfilesResponse.class,
    GetOtsAccountResponse.class,
    CreateFrameworkUserResponse.class,
    LoadFrameworkUsersResponse.class,
    GetAvailableDialingRulesResponse.class,
    GetVoiceMailBoxResponse.class,
    DeleteFrameworkUserResponse.class,
    UpdateFrameworkUserResponse.class,
    GetSystemInfoResponse.class,
    GetVoiceMailBoxesResponse.class
})
public class AlcResult {

    @XmlElement(required = true)
    protected AlcResultCode resultCode;
    @XmlElement(required = true, nillable = true)
    protected String comment;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlcResultCode }
     *     
     */
    public AlcResultCode getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcResultCode }
     *     
     */
    public void setResultCode(AlcResultCode value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
