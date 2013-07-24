/**
 * AlcNotifierServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService;

public class AlcNotifierServiceLocator extends org.apache.axis.client.Service implements com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierService {

    public AlcNotifierServiceLocator() {
    }


    public AlcNotifierServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlcNotifierServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlcNotifierPort
    private java.lang.String AlcNotifierPort_address = "http://192.168.1.132/api/services/AlcNotifierPort";

    public java.lang.String getAlcNotifierPortAddress() {
        return AlcNotifierPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlcNotifierPortWSDDServiceName = "AlcNotifierPort";

    public java.lang.String getAlcNotifierPortWSDDServiceName() {
        return AlcNotifierPortWSDDServiceName;
    }

    public void setAlcNotifierPortWSDDServiceName(java.lang.String name) {
        AlcNotifierPortWSDDServiceName = name;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortType getAlcNotifierPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlcNotifierPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlcNotifierPort(endpoint);
    }

    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortType getAlcNotifierPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortSoapBindingStub _stub = new com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortSoapBindingStub(portAddress, this);
            _stub.setPortName(getAlcNotifierPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlcNotifierPortEndpointAddress(java.lang.String address) {
        AlcNotifierPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortSoapBindingStub _stub = new com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortSoapBindingStub(new java.net.URL(AlcNotifierPort_address), this);
                _stub.setPortName(getAlcNotifierPortWSDDServiceName());
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
        if ("AlcNotifierPort".equals(inputPortName)) {
            return getAlcNotifierPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierService", "AlcNotifierService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierService", "AlcNotifierPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlcNotifierPort".equals(portName)) {
            setAlcNotifierPortEndpointAddress(address);
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
