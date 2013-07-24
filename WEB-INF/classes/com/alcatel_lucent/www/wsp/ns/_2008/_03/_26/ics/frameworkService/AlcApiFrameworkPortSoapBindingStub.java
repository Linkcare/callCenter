/**
 * AlcApiFrameworkPortSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService;

public class AlcApiFrameworkPortSoapBindingStub extends org.apache.axis.client.Stub implements com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openFrameworkSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginSupervisor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFrameworkAccountInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFrameworkAccountRights");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSessionTimerValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("restartSessionTimer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerRequest"), com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerResponse"));
        oper.setReturnClass(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public AlcApiFrameworkPortSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AlcApiFrameworkPortSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AlcApiFrameworkPortSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcApplicationType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcApplicationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcDeviceRights");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceRights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcDeviceType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcFrameworkAccountInfo");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcFrameworkAccountRights");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountRights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcResultCode");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcUserIdType");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcUserIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "restartSessionTimerResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueRequest");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "setSessionTimerValueResponse");
            cachedSerQNames.add(qName);
            cls = com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse.class;
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

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse login(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest loginRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loginRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse openFrameworkSession(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionRequest openFrameworkSessionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("openFrameworkSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "openFrameworkSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {openFrameworkSessionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse loginSupervisor(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorRequest loginSupervisorRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("loginSupervisor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loginSupervisor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loginSupervisorRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse changePassword(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordRequest changePasswordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changePasswordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse logout(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest logoutRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logoutRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse getFrameworkAccountInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest getFrameworkAccountInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFrameworkAccountInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFrameworkAccountInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFrameworkAccountInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse getFrameworkAccountRights(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsRequest getFrameworkAccountRightsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFrameworkAccountRights");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFrameworkAccountRights"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFrameworkAccountRightsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse setSessionTimerValue(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueRequest setSessionTimerValueRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setSessionTimerValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setSessionTimerValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setSessionTimerValueRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse restartSessionTimer(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerRequest restartSessionTimerRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("restartSessionTimer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "restartSessionTimer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {restartSessionTimerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
