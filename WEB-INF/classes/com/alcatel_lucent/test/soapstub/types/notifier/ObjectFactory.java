
package com.alcatel_lucent.test.soapstub.types.notifier;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.alcatel_lucent.test.soapstub.types.notifier package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.alcatel_lucent.test.soapstub.types.notifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlcSelector }
     * 
     */
    public AlcSelector createAlcSelector() {
        return new AlcSelector();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link AlcHttpHeader }
     * 
     */
    public AlcHttpHeader createAlcHttpHeader() {
        return new AlcHttpHeader();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link AlcResult }
     * 
     */
    public AlcResult createAlcResult() {
        return new AlcResult();
    }

    /**
     * Create an instance of {@link UnsubscribeRequest }
     * 
     */
    public UnsubscribeRequest createUnsubscribeRequest() {
        return new UnsubscribeRequest();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link SubscribeRequest }
     * 
     */
    public SubscribeRequest createSubscribeRequest() {
        return new SubscribeRequest();
    }

}
