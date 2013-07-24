/**
 * AlcNotifierPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService;

public interface AlcNotifierPortType extends java.rmi.Remote {
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.SubscribeResponse subscribe(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.SubscribeRequest subscribeRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.UnsubscribeResponse unsubscribe(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.UnsubscribeRequest unsubscribeRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.PingResponse ping(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.PingRequest pingRequest) throws java.rmi.RemoteException;
}
