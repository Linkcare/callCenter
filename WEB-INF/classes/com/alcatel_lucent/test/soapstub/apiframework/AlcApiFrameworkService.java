
package com.alcatel_lucent.test.soapstub.apiframework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AlcApiFrameworkService", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", wsdlLocation = "file:/C:/Archivos%20de%20programa/eclipse/workspaceLC/WS_API_Test/bin/AlcApiFramework.wsdl")
public class AlcApiFrameworkService
    extends Service
{

    private final static URL ALCAPIFRAMEWORKSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.alcatel_lucent.test.soapstub.apiframework.AlcApiFrameworkService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.alcatel_lucent.test.soapstub.apiframework.AlcApiFrameworkService.class.getResource(".");
            //url = new URL(baseUrl, "file:/C:/Archivos%20de%20programa/eclipse/workspaceLC/WS_API_Test/bin/AlcApiFramework.wsdl");
            url = new URL("http://uc1.linkcare.es/api/services/AlcApiFramework?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://uc1.linkcare.es/api/services/AlcApiFramework?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ALCAPIFRAMEWORKSERVICE_WSDL_LOCATION = url;
    }

    public AlcApiFrameworkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlcApiFrameworkService() {
        super(ALCAPIFRAMEWORKSERVICE_WSDL_LOCATION, new QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkService"));
    }

    /**
     * 
     * @return
     *     returns AlcApiFrameworkPortType
     */
    @WebEndpoint(name = "AlcApiFrameworkPort")
    public AlcApiFrameworkPortType getAlcApiFrameworkPort() {
        return super.getPort(new QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkPort"), AlcApiFrameworkPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlcApiFrameworkPortType
     */
    @WebEndpoint(name = "AlcApiFrameworkPort")
    public AlcApiFrameworkPortType getAlcApiFrameworkPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkPort"), AlcApiFrameworkPortType.class, features);
    }

}
