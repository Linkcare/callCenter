
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Each operation published by this 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Web Service&lt;/i&gt;
 * </pre>
 *  returns this kind of result.
 *         
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
 *         &lt;element name="resultCode" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResultCode"/>
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
    SetSubscriberPbxNodeResponse.class,
    CreateSubscriberByProfileResponse.class,
    GetHuntingGroupResponse.class,
    SetSubscriberResponse.class,
    GetSeplosParametersCapabilitiesResponse.class,
    GetRemoteExtensionDisaPrefixesResponse.class,
    StartAllNotificationsResponse.class,
    GetPhoneBookResponse.class,
    GetGeneralFeaturesPrefixesResponse.class,
    LoadSubscribersResponse.class,
    SetExternalSubscriberResponse.class,
    GetAllEntitiesResponse.class,
    StopAllNotificationsResponse.class,
    UnsubscribeResponse.class,
    LoadPhoneBookResponse.class,
    CreateSecondarySubscriberResponse.class,
    GetSecondarySubscribersListResponse.class,
    RemoveHuntingGroupResponse.class,
    GetSipProxyResponse.class,
    SetHuntingGroupResponse.class,
    GetIpParametersResponse.class,
    GetStationFeaturesPrefixesResponse.class,
    GetNoeParametersResponse.class,
    GetSubscribersListResponse.class,
    SetSubscriberPbxAddressResponse.class,
    SetCurrentPbxResponse.class,
    GetAllAvailableLanguagesResponse.class,
    GetSubscriberResponse.class,
    GetSuffixesResponse.class,
    SetSubscriberIpAddressResponse.class,
    GetPbxListResponse.class,
    GetExternalSubscribersListResponse.class,
    GetExternalSubscribersCapabilitiesResponse.class,
    GetSeplosParametersResponse.class,
    SetSecondarySubscriberResponse.class,
    GetSecondarySubscriberResponse.class,
    CreateHuntingGroupResponse.class,
    GetHuntingGroupsCapabilitiesResponse.class,
    GetLocalFeaturesPrefixesResponse.class,
    RemoveExternalSubscriberResponse.class,
    GetExternalFeaturesPrefixesResponse.class,
    ReleasePhoneBookResponse.class,
    GetExternalSipGatewaysResponse.class,
    GetRemoteExtensionParametersResponse.class,
    GetSecondarySubscribersCapabilitiesResponse.class,
    CreateSubscriberResponse.class,
    SetIpParametersResponse.class,
    GetExternalSubscriberResponse.class,
    StopNotificationsResponse.class,
    GetAttendantCallPrefixesResponse.class,
    GetNoeParametersCapabilitiesResponse.class,
    GetSipGatewayResponse.class,
    RemoveSubscriberResponse.class,
    GetAllAvailableStationTypesResponse.class,
    SetSubscriberExternalPbxNodeResponse.class,
    StartNotificationsResponse.class,
    SubscribeResponse.class,
    GetSubscribersCapabilitiesResponse.class,
    GetAllCostCentersResponse.class,
    CheckSecretCodeResponse.class,
    GetHuntingGroupsListResponse.class,
    RemoveSecondarySubscriberResponse.class,
    GetPbxManagementCapabilitiesResponse.class,
    CreateExternalSubscriberResponse.class,
    GetSubscriberPbxAddressResponse.class,
    GetSubscriberIpAddressResponse.class,
    LoadExternalSubscribersResponse.class,
    SetSeplosParametersResponse.class,
    GetAllPickUpGroupsResponse.class,
    GetIpParametersCapabilitiesResponse.class,
    SetNoeParametersResponse.class,
    SetSecretCodeResponse.class
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
