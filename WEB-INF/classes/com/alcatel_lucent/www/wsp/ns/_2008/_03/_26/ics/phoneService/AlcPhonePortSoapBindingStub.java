/**
 * AlcPhonePortSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService;

public class AlcPhonePortSoapBindingStub extends org.apache.axis.client.Stub implements com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[56];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCapabilities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlobalPhoneState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nomadLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("permanentNomadLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nomadLogout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNomadicState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNomadicRight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLineState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makePrivateCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeBusinessCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeCorrelatorCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendAssociateData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takeCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("holdCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("conferenceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deflectCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deflectCallToVoiceMail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelConferenceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferConferenceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("releaseConferenceCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("blindTransferCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("parkCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unParkCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("overflowToVoiceMail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallRecordCapabilities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTelephonyCapabilities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendDtmf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallLogCapabilities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNbUnansweredCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyCallLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCallLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAllCallLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVoiceMailMessagesNb");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVoiceMailInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVoiceMailPrefixes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCallBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAllCallBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeCallBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeCallBackDuringCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pauseRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resumeRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecordState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentCallInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTelephonicState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBasicTelephonicState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isPcmm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMessToPcmm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isVoipReady");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

    }

    public AlcPhonePortSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AlcPhonePortSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AlcPhonePortSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcLineInfo");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcResultCode");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMailResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallBackResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLogResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallBackResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicRightResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNomadicStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicStateResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackDuringCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "invokeCallBackResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isPcmmResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "isVoipReadyResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLogResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadLogoutResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMailResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "permanentNomadLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "resumeRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateDataResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmfResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCallResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardTargetType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardTargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcForwardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcOverflowType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcOverflowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcStaticState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcStaticState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicStateInfo");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCall");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallBack");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallBackType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBackType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallCause");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCause.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallLogItem");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallLogItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcItemId");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcLineCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcLineState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcMessageType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNomadicMode");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNomadicState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNumberType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcPcmmState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcPcmmState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcRecordState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcRecordState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTelephonicState");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTypedNumber");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTypedNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse getAccountInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoRequest getAccountInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAccountInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse getCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesRequest getCapabilitiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCapabilities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCapabilitiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse getGlobalPhoneState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateRequest getGlobalPhoneStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getGlobalPhoneState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getGlobalPhoneState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getGlobalPhoneStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse nomadLogin(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginRequest nomadLoginRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("nomadLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nomadLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nomadLoginRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse permanentNomadLogin(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginRequest permanentNomadLoginRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("permanentNomadLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "permanentNomadLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {permanentNomadLoginRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse nomadLogout(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutRequest nomadLogoutRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("nomadLogout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nomadLogout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nomadLogoutRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse getNomadicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateRequest getNomadicStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNomadicState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNomadicState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNomadicStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse getNomadicRight(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightRequest getNomadicRightRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNomadicRight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNomadicRight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNomadicRightRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse getLineState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateRequest getLineStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLineState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLineState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getLineStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse makeCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallRequest makeCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("makeCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "makeCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {makeCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse makePrivateCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallRequest makePrivateCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("makePrivateCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "makePrivateCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {makePrivateCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse makeBusinessCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallRequest makeBusinessCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("makeBusinessCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "makeBusinessCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {makeBusinessCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse makeCorrelatorCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallRequest makeCorrelatorCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("makeCorrelatorCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "makeCorrelatorCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {makeCorrelatorCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse sendAssociateData(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataRequest sendAssociateDataRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendAssociateData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendAssociateData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendAssociateDataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse takeCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallRequest takeCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("takeCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "takeCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {takeCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse holdCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallRequest holdCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("holdCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "holdCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {holdCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse clearCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallRequest clearCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("clearCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "clearCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clearCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse conferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallRequest conferenceCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("conferenceCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "conferenceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {conferenceCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse transferCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallRequest transferCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "transferCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse deflectCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallRequest deflectCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deflectCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deflectCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deflectCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse deflectCallToVoiceMail(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailRequest deflectCallToVoiceMailRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deflectCallToVoiceMail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deflectCallToVoiceMail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deflectCallToVoiceMailRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse cancelConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallRequest cancelConferenceCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelConferenceCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelConferenceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelConferenceCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse transferConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallRequest transferConferenceCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferConferenceCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "transferConferenceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferConferenceCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse releaseConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallRequest releaseConferenceCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("releaseConferenceCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "releaseConferenceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseConferenceCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse blindTransferCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallRequest blindTransferCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("blindTransferCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "blindTransferCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {blindTransferCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse parkCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallRequest parkCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "parkCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parkCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse unParkCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallRequest unParkCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("unParkCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unParkCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unParkCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse overflowToVoiceMail(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailRequest overflowToVoiceMailRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("overflowToVoiceMail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "overflowToVoiceMail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {overflowToVoiceMailRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse getCallRecordCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesRequest getCallRecordCapabilitiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallRecordCapabilities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallRecordCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCallRecordCapabilitiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse getTelephonyCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesRequest getTelephonyCapabilitiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTelephonyCapabilities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTelephonyCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTelephonyCapabilitiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse sendDtmf(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfRequest sendDtmfRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendDtmf");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendDtmf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendDtmfRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse getCallLogCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesRequest getCallLogCapabilitiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallLogCapabilities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallLogCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCallLogCapabilitiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse getNbUnansweredCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallRequest getNbUnansweredCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNbUnansweredCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNbUnansweredCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNbUnansweredCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse getCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest getCallLogRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCallLogRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse modifyCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogRequest modifyCallLogRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyCallLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyCallLogRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse deleteCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogRequest deleteCallLogRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteCallLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteCallLogRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse deleteAllCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogRequest deleteAllCallLogRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteAllCallLog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteAllCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteAllCallLogRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse getVoiceMailMessagesNb(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbRequest getVoiceMailMessagesNbRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getVoiceMailMessagesNb");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVoiceMailMessagesNb"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVoiceMailMessagesNbRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse getVoiceMailInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoRequest getVoiceMailInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getVoiceMailInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVoiceMailInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVoiceMailInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse getVoiceMailPrefixes(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesRequest getVoiceMailPrefixesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getVoiceMailPrefixes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVoiceMailPrefixes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getVoiceMailPrefixesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse getCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackRequest getCallBackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallBack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCallBackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse deleteCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackRequest deleteCallBackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteCallBack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteCallBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteCallBackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse deleteAllCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackRequest deleteAllCallBackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteAllCallBack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteAllCallBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteAllCallBackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse invokeCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackRequest invokeCallBackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("invokeCallBack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "invokeCallBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invokeCallBackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse invokeCallBackDuringCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallRequest invokeCallBackDuringCallRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("invokeCallBackDuringCall");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "invokeCallBackDuringCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invokeCallBackDuringCallRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse startRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordRequest startRecordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("startRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startRecordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse stopRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordRequest stopRecordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("stopRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stopRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stopRecordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse pauseRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordRequest pauseRecordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("pauseRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pauseRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pauseRecordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse resumeRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordRequest resumeRecordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("resumeRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resumeRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resumeRecordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse getRecordState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateRequest getRecordStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRecordState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRecordState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRecordStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse getCurrentCallInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoRequest getCurrentCallInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCurrentCallInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCurrentCallInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCurrentCallInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse getTelephonicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateRequest getTelephonicStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTelephonicState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTelephonicState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTelephonicStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse getBasicTelephonicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateRequest getBasicTelephonicStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBasicTelephonicState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBasicTelephonicState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBasicTelephonicStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse isPcmm(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmRequest isPcmmRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("isPcmm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "isPcmm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isPcmmRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse sendMessToPcmm(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmRequest sendMessToPcmmRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendMessToPcmm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendMessToPcmm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendMessToPcmmRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse isVoipReady(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyRequest isVoipReadyRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("isVoipReady");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "isVoipReady"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isVoipReadyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
