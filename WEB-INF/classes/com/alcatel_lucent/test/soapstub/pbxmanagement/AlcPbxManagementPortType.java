
package com.alcatel_lucent.test.soapstub.pbxmanagement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CheckSecretCodeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CheckSecretCodeResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateExternalSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateExternalSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateHuntingGroupRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateHuntingGroupResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSecondarySubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSecondarySubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberByProfileRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberByProfileResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableLanguagesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableLanguagesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableStationTypesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableStationTypesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllCostCentersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllCostCentersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllEntitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllEntitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllPickUpGroupsRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllPickUpGroupsResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAttendantCallPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAttendantCallPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalFeaturesPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalFeaturesPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSipGatewaysRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSipGatewaysResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersListRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersListResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetGeneralFeaturesPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetGeneralFeaturesPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsListRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsListResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetLocalFeaturesPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetLocalFeaturesPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxListRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxListResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxManagementCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxManagementCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPhoneBookRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPhoneBookResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionDisaPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionDisaPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersListRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersListResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipGatewayRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipGatewayResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipProxyRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipProxyResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetStationFeaturesPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetStationFeaturesPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberIpAddressRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberIpAddressResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberPbxAddressRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberPbxAddressResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersListRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersListResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSuffixesRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSuffixesResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadExternalSubscribersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadExternalSubscribersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadPhoneBookRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadPhoneBookResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadSubscribersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadSubscribersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.ReleasePhoneBookRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.ReleasePhoneBookResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveExternalSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveExternalSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveHuntingGroupRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveHuntingGroupResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSecondarySubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSecondarySubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetCurrentPbxRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetCurrentPbxResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetExternalSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetExternalSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetHuntingGroupRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetHuntingGroupResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetIpParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetIpParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetNoeParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetNoeParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecondarySubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecondarySubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecretCodeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecretCodeResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSeplosParametersRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSeplosParametersResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberExternalPbxNodeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberExternalPbxNodeResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberIpAddressRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberIpAddressResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxAddressRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxAddressResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxNodeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxNodeResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartAllNotificationsRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartAllNotificationsResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartNotificationsRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartNotificationsResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopAllNotificationsRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopAllNotificationsResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopNotificationsRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopNotificationsResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SubscribeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.SubscribeResponse;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.UnsubscribeRequest;
import com.alcatel_lucent.test.soapstub.types.pbxmanagement.UnsubscribeResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AlcPbxManagementPortType", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementDefinitions")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.alcatel_lucent.test.soapstub.types.huntinggroup.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.secondarysubscriber.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.pbxmanagement.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.phonebook.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.sipconfig.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.subscriber.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.externalsubscriber.ObjectFactory.class
})
public interface AlcPbxManagementPortType {


    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxListResponse
     */
    @WebMethod(action = "getPbxList")
    @WebResult(name = "getPbxListResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetPbxListResponse getPbxList(
        @WebParam(name = "getPbxListRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetPbxListRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetCurrentPbxResponse
     */
    @WebMethod(action = "setCurrentPbx")
    @WebResult(name = "setCurrentPbxResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetCurrentPbxResponse setCurrentPbx(
        @WebParam(name = "setCurrentPbxRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetCurrentPbxRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPbxManagementCapabilitiesResponse
     */
    @WebMethod(action = "getPbxManagementCapabilities")
    @WebResult(name = "getPbxManagementCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetPbxManagementCapabilitiesResponse getPbxManagementCapabilities(
        @WebParam(name = "getPbxManagementCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetPbxManagementCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SubscribeResponse
     */
    @WebMethod(action = "subscribe")
    @WebResult(name = "subscribeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SubscribeResponse subscribe(
        @WebParam(name = "subscribeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SubscribeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.UnsubscribeResponse
     */
    @WebMethod(action = "unsubscribe")
    @WebResult(name = "unsubscribeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public UnsubscribeResponse unsubscribe(
        @WebParam(name = "unsubscribeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        UnsubscribeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopNotificationsResponse
     */
    @WebMethod(action = "stopNotifications")
    @WebResult(name = "stopNotificationsResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public StopNotificationsResponse stopNotifications(
        @WebParam(name = "stopNotificationsRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        StopNotificationsRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.StopAllNotificationsResponse
     */
    @WebMethod(action = "stopAllNotifications")
    @WebResult(name = "stopAllNotificationsResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public StopAllNotificationsResponse stopAllNotifications(
        @WebParam(name = "stopAllNotificationsRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        StopAllNotificationsRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartNotificationsResponse
     */
    @WebMethod(action = "startNotifications")
    @WebResult(name = "startNotificationsResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public StartNotificationsResponse startNotifications(
        @WebParam(name = "startNotificationsRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        StartNotificationsRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.StartAllNotificationsResponse
     */
    @WebMethod(action = "startAllNotifications")
    @WebResult(name = "startAllNotificationsResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public StartAllNotificationsResponse startAllNotifications(
        @WebParam(name = "startAllNotificationsRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        StartAllNotificationsRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadPhoneBookResponse
     */
    @WebMethod(action = "loadPhoneBook")
    @WebResult(name = "loadPhoneBookResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public LoadPhoneBookResponse loadPhoneBook(
        @WebParam(name = "loadPhoneBookRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        LoadPhoneBookRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetPhoneBookResponse
     */
    @WebMethod(action = "getPhoneBook")
    @WebResult(name = "getPhoneBookResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetPhoneBookResponse getPhoneBook(
        @WebParam(name = "getPhoneBookRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetPhoneBookRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.ReleasePhoneBookResponse
     */
    @WebMethod(action = "releasePhoneBook")
    @WebResult(name = "releasePhoneBookResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public ReleasePhoneBookResponse releasePhoneBook(
        @WebParam(name = "releasePhoneBookRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        ReleasePhoneBookRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllEntitiesResponse
     */
    @WebMethod(action = "getAllEntities")
    @WebResult(name = "getAllEntitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAllEntitiesResponse getAllEntities(
        @WebParam(name = "getAllEntitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAllEntitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllCostCentersResponse
     */
    @WebMethod(action = "getAllCostCenters")
    @WebResult(name = "getAllCostCentersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAllCostCentersResponse getAllCostCenters(
        @WebParam(name = "getAllCostCentersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAllCostCentersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllPickUpGroupsResponse
     */
    @WebMethod(action = "getAllPickUpGroups")
    @WebResult(name = "getAllPickUpGroupsResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAllPickUpGroupsResponse getAllPickUpGroups(
        @WebParam(name = "getAllPickUpGroupsRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAllPickUpGroupsRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableLanguagesResponse
     */
    @WebMethod(action = "getAllAvailableLanguages")
    @WebResult(name = "getAllAvailableLanguagesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAllAvailableLanguagesResponse getAllAvailableLanguages(
        @WebParam(name = "getAllAvailableLanguagesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAllAvailableLanguagesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAllAvailableStationTypesResponse
     */
    @WebMethod(action = "getAllAvailableStationTypes")
    @WebResult(name = "getAllAvailableStationTypesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAllAvailableStationTypesResponse getAllAvailableStationTypes(
        @WebParam(name = "getAllAvailableStationTypesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAllAvailableStationTypesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersCapabilitiesResponse
     */
    @WebMethod(action = "getSubscribersCapabilities")
    @WebResult(name = "getSubscribersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSubscribersCapabilitiesResponse getSubscribersCapabilities(
        @WebParam(name = "getSubscribersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSubscribersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadSubscribersResponse
     */
    @WebMethod(action = "loadSubscribers")
    @WebResult(name = "loadSubscribersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public LoadSubscribersResponse loadSubscribers(
        @WebParam(name = "loadSubscribersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        LoadSubscribersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscribersListResponse
     */
    @WebMethod(action = "getSubscribersList")
    @WebResult(name = "getSubscribersListResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSubscribersListResponse getSubscribersList(
        @WebParam(name = "getSubscribersListRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSubscribersListRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberResponse
     */
    @WebMethod(action = "getSubscriber")
    @WebResult(name = "getSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSubscriberResponse getSubscriber(
        @WebParam(name = "getSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberResponse
     */
    @WebMethod(action = "setSubscriber")
    @WebResult(name = "setSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSubscriberResponse setSubscriber(
        @WebParam(name = "setSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberResponse
     */
    @WebMethod(action = "createSubscriber")
    @WebResult(name = "createSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CreateSubscriberResponse createSubscriber(
        @WebParam(name = "createSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CreateSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSubscriberByProfileResponse
     */
    @WebMethod(action = "createSubscriberByProfile")
    @WebResult(name = "createSubscriberByProfileResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CreateSubscriberByProfileResponse createSubscriberByProfile(
        @WebParam(name = "createSubscriberByProfileRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CreateSubscriberByProfileRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSubscriberResponse
     */
    @WebMethod(action = "removeSubscriber")
    @WebResult(name = "removeSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public RemoveSubscriberResponse removeSubscriber(
        @WebParam(name = "removeSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        RemoveSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecretCodeResponse
     */
    @WebMethod(action = "setSecretCode")
    @WebResult(name = "setSecretCodeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSecretCodeResponse setSecretCode(
        @WebParam(name = "setSecretCodeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSecretCodeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CheckSecretCodeResponse
     */
    @WebMethod(action = "checkSecretCode")
    @WebResult(name = "checkSecretCodeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CheckSecretCodeResponse checkSecretCode(
        @WebParam(name = "checkSecretCodeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CheckSecretCodeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxNodeResponse
     */
    @WebMethod(action = "setSubscriberPbxNode")
    @WebResult(name = "setSubscriberPbxNodeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSubscriberPbxNodeResponse setSubscriberPbxNode(
        @WebParam(name = "setSubscriberPbxNodeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSubscriberPbxNodeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberExternalPbxNodeResponse
     */
    @WebMethod(action = "setSubscriberExternalPbxNode")
    @WebResult(name = "setSubscriberExternalPbxNodeResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSubscriberExternalPbxNodeResponse setSubscriberExternalPbxNode(
        @WebParam(name = "setSubscriberExternalPbxNodeRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSubscriberExternalPbxNodeRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberIpAddressResponse
     */
    @WebMethod(action = "getSubscriberIpAddress")
    @WebResult(name = "getSubscriberIpAddressResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSubscriberIpAddressResponse getSubscriberIpAddress(
        @WebParam(name = "getSubscriberIpAddressRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSubscriberIpAddressRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberIpAddressResponse
     */
    @WebMethod(action = "setSubscriberIpAddress")
    @WebResult(name = "setSubscriberIpAddressResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSubscriberIpAddressResponse setSubscriberIpAddress(
        @WebParam(name = "setSubscriberIpAddressRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSubscriberIpAddressRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSubscriberPbxAddressResponse
     */
    @WebMethod(action = "getSubscriberPbxAddress")
    @WebResult(name = "getSubscriberPbxAddressResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSubscriberPbxAddressResponse getSubscriberPbxAddress(
        @WebParam(name = "getSubscriberPbxAddressRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSubscriberPbxAddressRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSubscriberPbxAddressResponse
     */
    @WebMethod(action = "setSubscriberPbxAddress")
    @WebResult(name = "setSubscriberPbxAddressResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSubscriberPbxAddressResponse setSubscriberPbxAddress(
        @WebParam(name = "setSubscriberPbxAddressRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSubscriberPbxAddressRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersCapabilitiesResponse
     */
    @WebMethod(action = "getExternalSubscribersCapabilities")
    @WebResult(name = "getExternalSubscribersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetExternalSubscribersCapabilitiesResponse getExternalSubscribersCapabilities(
        @WebParam(name = "getExternalSubscribersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetExternalSubscribersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.LoadExternalSubscribersResponse
     */
    @WebMethod(action = "loadExternalSubscribers")
    @WebResult(name = "loadExternalSubscribersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public LoadExternalSubscribersResponse loadExternalSubscribers(
        @WebParam(name = "loadExternalSubscribersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        LoadExternalSubscribersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscribersListResponse
     */
    @WebMethod(action = "getExternalSubscribersList")
    @WebResult(name = "getExternalSubscribersListResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetExternalSubscribersListResponse getExternalSubscribersList(
        @WebParam(name = "getExternalSubscribersListRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetExternalSubscribersListRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSubscriberResponse
     */
    @WebMethod(action = "getExternalSubscriber")
    @WebResult(name = "getExternalSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetExternalSubscriberResponse getExternalSubscriber(
        @WebParam(name = "getExternalSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetExternalSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetExternalSubscriberResponse
     */
    @WebMethod(action = "setExternalSubscriber")
    @WebResult(name = "setExternalSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetExternalSubscriberResponse setExternalSubscriber(
        @WebParam(name = "setExternalSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetExternalSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateExternalSubscriberResponse
     */
    @WebMethod(action = "createExternalSubscriber")
    @WebResult(name = "createExternalSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CreateExternalSubscriberResponse createExternalSubscriber(
        @WebParam(name = "createExternalSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CreateExternalSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveExternalSubscriberResponse
     */
    @WebMethod(action = "removeExternalSubscriber")
    @WebResult(name = "removeExternalSubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public RemoveExternalSubscriberResponse removeExternalSubscriber(
        @WebParam(name = "removeExternalSubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        RemoveExternalSubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersCapabilitiesResponse
     */
    @WebMethod(action = "getSecondarySubscribersCapabilities")
    @WebResult(name = "getSecondarySubscribersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSecondarySubscribersCapabilitiesResponse getSecondarySubscribersCapabilities(
        @WebParam(name = "getSecondarySubscribersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSecondarySubscribersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscribersListResponse
     */
    @WebMethod(action = "getSecondarySubscribersList")
    @WebResult(name = "getSecondarySubscribersListResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSecondarySubscribersListResponse getSecondarySubscribersList(
        @WebParam(name = "getSecondarySubscribersListRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSecondarySubscribersListRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSecondarySubscriberResponse
     */
    @WebMethod(action = "getSecondarySubscriber")
    @WebResult(name = "getSecondarySubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSecondarySubscriberResponse getSecondarySubscriber(
        @WebParam(name = "getSecondarySubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSecondarySubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSecondarySubscriberResponse
     */
    @WebMethod(action = "setSecondarySubscriber")
    @WebResult(name = "setSecondarySubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSecondarySubscriberResponse setSecondarySubscriber(
        @WebParam(name = "setSecondarySubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSecondarySubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateSecondarySubscriberResponse
     */
    @WebMethod(action = "createSecondarySubscriber")
    @WebResult(name = "createSecondarySubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CreateSecondarySubscriberResponse createSecondarySubscriber(
        @WebParam(name = "createSecondarySubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CreateSecondarySubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveSecondarySubscriberResponse
     */
    @WebMethod(action = "removeSecondarySubscriber")
    @WebResult(name = "removeSecondarySubscriberResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public RemoveSecondarySubscriberResponse removeSecondarySubscriber(
        @WebParam(name = "removeSecondarySubscriberRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        RemoveSecondarySubscriberRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsCapabilitiesResponse
     */
    @WebMethod(action = "getHuntingGroupsCapabilities")
    @WebResult(name = "getHuntingGroupsCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetHuntingGroupsCapabilitiesResponse getHuntingGroupsCapabilities(
        @WebParam(name = "getHuntingGroupsCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetHuntingGroupsCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupsListResponse
     */
    @WebMethod(action = "getHuntingGroupsList")
    @WebResult(name = "getHuntingGroupsListResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetHuntingGroupsListResponse getHuntingGroupsList(
        @WebParam(name = "getHuntingGroupsListRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetHuntingGroupsListRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetHuntingGroupResponse
     */
    @WebMethod(action = "getHuntingGroup")
    @WebResult(name = "getHuntingGroupResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetHuntingGroupResponse getHuntingGroup(
        @WebParam(name = "getHuntingGroupRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetHuntingGroupRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetHuntingGroupResponse
     */
    @WebMethod(action = "setHuntingGroup")
    @WebResult(name = "setHuntingGroupResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetHuntingGroupResponse setHuntingGroup(
        @WebParam(name = "setHuntingGroupRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetHuntingGroupRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.CreateHuntingGroupResponse
     */
    @WebMethod(action = "createHuntingGroup")
    @WebResult(name = "createHuntingGroupResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public CreateHuntingGroupResponse createHuntingGroup(
        @WebParam(name = "createHuntingGroupRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        CreateHuntingGroupRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.RemoveHuntingGroupResponse
     */
    @WebMethod(action = "removeHuntingGroup")
    @WebResult(name = "removeHuntingGroupResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public RemoveHuntingGroupResponse removeHuntingGroup(
        @WebParam(name = "removeHuntingGroupRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        RemoveHuntingGroupRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersCapabilitiesResponse
     */
    @WebMethod(action = "getNoeParametersCapabilities")
    @WebResult(name = "getNoeParametersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetNoeParametersCapabilitiesResponse getNoeParametersCapabilities(
        @WebParam(name = "getNoeParametersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetNoeParametersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetNoeParametersResponse
     */
    @WebMethod(action = "getNoeParameters")
    @WebResult(name = "getNoeParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetNoeParametersResponse getNoeParameters(
        @WebParam(name = "getNoeParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetNoeParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetNoeParametersResponse
     */
    @WebMethod(action = "setNoeParameters")
    @WebResult(name = "setNoeParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetNoeParametersResponse setNoeParameters(
        @WebParam(name = "setNoeParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetNoeParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersCapabilitiesResponse
     */
    @WebMethod(action = "getIpParametersCapabilities")
    @WebResult(name = "getIpParametersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetIpParametersCapabilitiesResponse getIpParametersCapabilities(
        @WebParam(name = "getIpParametersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetIpParametersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetIpParametersResponse
     */
    @WebMethod(action = "getIpParameters")
    @WebResult(name = "getIpParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetIpParametersResponse getIpParameters(
        @WebParam(name = "getIpParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetIpParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetIpParametersResponse
     */
    @WebMethod(action = "setIpParameters")
    @WebResult(name = "setIpParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetIpParametersResponse setIpParameters(
        @WebParam(name = "setIpParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetIpParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersCapabilitiesResponse
     */
    @WebMethod(action = "getSeplosParametersCapabilities")
    @WebResult(name = "getSeplosParametersCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSeplosParametersCapabilitiesResponse getSeplosParametersCapabilities(
        @WebParam(name = "getSeplosParametersCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSeplosParametersCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSeplosParametersResponse
     */
    @WebMethod(action = "getSeplosParameters")
    @WebResult(name = "getSeplosParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSeplosParametersResponse getSeplosParameters(
        @WebParam(name = "getSeplosParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSeplosParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.SetSeplosParametersResponse
     */
    @WebMethod(action = "setSeplosParameters")
    @WebResult(name = "setSeplosParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public SetSeplosParametersResponse setSeplosParameters(
        @WebParam(name = "setSeplosParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        SetSeplosParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipGatewayResponse
     */
    @WebMethod(action = "getSipGateway")
    @WebResult(name = "getSipGatewayResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSipGatewayResponse getSipGateway(
        @WebParam(name = "getSipGatewayRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSipGatewayRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSipProxyResponse
     */
    @WebMethod(action = "getSipProxy")
    @WebResult(name = "getSipProxyResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSipProxyResponse getSipProxy(
        @WebParam(name = "getSipProxyRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSipProxyRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalSipGatewaysResponse
     */
    @WebMethod(action = "getExternalSipGateways")
    @WebResult(name = "getExternalSipGatewaysResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetExternalSipGatewaysResponse getExternalSipGateways(
        @WebParam(name = "getExternalSipGatewaysRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetExternalSipGatewaysRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionParametersResponse
     */
    @WebMethod(action = "getRemoteExtensionParameters")
    @WebResult(name = "getRemoteExtensionParametersResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetRemoteExtensionParametersResponse getRemoteExtensionParameters(
        @WebParam(name = "getRemoteExtensionParametersRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetRemoteExtensionParametersRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetSuffixesResponse
     */
    @WebMethod(action = "getSuffixes")
    @WebResult(name = "getSuffixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetSuffixesResponse getSuffixes(
        @WebParam(name = "getSuffixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetSuffixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetAttendantCallPrefixesResponse
     */
    @WebMethod(action = "getAttendantCallPrefixes")
    @WebResult(name = "getAttendantCallPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetAttendantCallPrefixesResponse getAttendantCallPrefixes(
        @WebParam(name = "getAttendantCallPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetAttendantCallPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetRemoteExtensionDisaPrefixesResponse
     */
    @WebMethod(action = "getRemoteExtensionDisaPrefixes")
    @WebResult(name = "getRemoteExtensionDisaPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetRemoteExtensionDisaPrefixesResponse getRemoteExtensionDisaPrefixes(
        @WebParam(name = "getRemoteExtensionDisaPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetRemoteExtensionDisaPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetStationFeaturesPrefixesResponse
     */
    @WebMethod(action = "getStationFeaturesPrefixes")
    @WebResult(name = "getStationFeaturesPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetStationFeaturesPrefixesResponse getStationFeaturesPrefixes(
        @WebParam(name = "getStationFeaturesPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetStationFeaturesPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetGeneralFeaturesPrefixesResponse
     */
    @WebMethod(action = "getGeneralFeaturesPrefixes")
    @WebResult(name = "getGeneralFeaturesPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetGeneralFeaturesPrefixesResponse getGeneralFeaturesPrefixes(
        @WebParam(name = "getGeneralFeaturesPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetGeneralFeaturesPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetLocalFeaturesPrefixesResponse
     */
    @WebMethod(action = "getLocalFeaturesPrefixes")
    @WebResult(name = "getLocalFeaturesPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetLocalFeaturesPrefixesResponse getLocalFeaturesPrefixes(
        @WebParam(name = "getLocalFeaturesPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetLocalFeaturesPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.pbxmanagement.GetExternalFeaturesPrefixesResponse
     */
    @WebMethod(action = "getExternalFeaturesPrefixes")
    @WebResult(name = "getExternalFeaturesPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "output")
    public GetExternalFeaturesPrefixesResponse getExternalFeaturesPrefixes(
        @WebParam(name = "getExternalFeaturesPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema", partName = "input")
        GetExternalFeaturesPrefixesRequest input);

}
