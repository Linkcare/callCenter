/**
 * AlcApiFrameworkServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService;

public class AlcApiFrameworkServiceLocator extends org.apache.axis.client.Service implements com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkService {

    public AlcApiFrameworkServiceLocator() {
    }


    public AlcApiFrameworkServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlcApiFrameworkServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlcApiFrameworkPort
    private java.lang.String AlcApiFrameworkPort_address = "http://192.168.1.132/api/services/AlcApiFrameworkPort";

    public java.lang.String getAlcApiFrameworkPortAddress() {
        return AlcApiFrameworkPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlcApiFrameworkPortWSDDServiceName = "AlcApiFrameworkPort";

    public java.lang.String getAlcApiFrameworkPortWSDDServiceName() {
        return AlcApiFrameworkPortWSDDServiceName;
    }

    public void setAlcApiFrameworkPortWSDDServiceName(java.lang.String name) {
        AlcApiFrameworkPortWSDDServiceName = name;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType getAlcApiFrameworkPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlcApiFrameworkPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlcApiFrameworkPort(endpoint);
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType getAlcApiFrameworkPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortSoapBindingStub _stub = new com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortSoapBindingStub(portAddress, this);
            _stub.setPortName(getAlcApiFrameworkPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlcApiFrameworkPortEndpointAddress(java.lang.String address) {
        AlcApiFrameworkPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortSoapBindingStub _stub = new com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortSoapBindingStub(new java.net.URL(AlcApiFrameworkPort_address), this);
                _stub.setPortName(getAlcApiFrameworkPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AlcApiFrameworkPort".equals(inputPortName)) {
            return getAlcApiFrameworkPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlcApiFrameworkPort".equals(portName)) {
            setAlcApiFrameworkPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
