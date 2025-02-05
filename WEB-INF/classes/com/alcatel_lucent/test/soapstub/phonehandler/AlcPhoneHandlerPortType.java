
package com.alcatel_lucent.test.soapstub.phonehandler;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnCallBackNotificationChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnCallLogModifiedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnLineStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnNomadicStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnOtsLinkDownRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnOtsLinkUpRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnPhoneSetLanguageChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnPhoneSetStaticStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnTelephonicStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnUnansweredCallRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnVoiceMailMessagesNbChangedRequest;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AlcPhoneHandlerPortType", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerDefinitions")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.alcatel_lucent.test.soapstub.types.phonehandler.ObjectFactory.class,
    com.alcatel_lucent.test.soapstub.types.phone.ObjectFactory.class
})
public interface AlcPhoneHandlerPortType {


    /**
     * 
     * @param input
     */
    @WebMethod(action = "onLineStateChanged")
    public void onLineStateChanged(
        @WebParam(name = "onLineStateChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnLineStateChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onNomadicStateChanged")
    public void onNomadicStateChanged(
        @WebParam(name = "onNomadicStateChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnNomadicStateChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onTelephonicStateChanged")
    public void onTelephonicStateChanged(
        @WebParam(name = "onTelephonicStateChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnTelephonicStateChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onUnansweredCall")
    public void onUnansweredCall(
        @WebParam(name = "onUnansweredCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnUnansweredCallRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onCallLogModified")
    public void onCallLogModified(
        @WebParam(name = "onCallLogModifiedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnCallLogModifiedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onCallBackNotificationChanged")
    public void onCallBackNotificationChanged(
        @WebParam(name = "onCallBackNotificationChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnCallBackNotificationChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onVoiceMailMessagesNbChanged")
    public void onVoiceMailMessagesNbChanged(
        @WebParam(name = "onVoiceMailMessagesNbChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnVoiceMailMessagesNbChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onPhoneSetLanguageChanged")
    public void onPhoneSetLanguageChanged(
        @WebParam(name = "onPhoneSetLanguageChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnPhoneSetLanguageChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onPhoneSetStaticStateChanged")
    public void onPhoneSetStaticStateChanged(
        @WebParam(name = "onPhoneSetStaticStateChangedRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnPhoneSetStaticStateChangedRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onOtsLinkDown")
    public void onOtsLinkDown(
        @WebParam(name = "onOtsLinkDownRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnOtsLinkDownRequest input);

    /**
     * 
     * @param input
     */
    @WebMethod(action = "onOtsLinkUp")
    public void onOtsLinkUp(
        @WebParam(name = "onOtsLinkUpRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/05/27/ics/phonehandlerSchema", partName = "input")
        OnOtsLinkUpRequest input);

}
