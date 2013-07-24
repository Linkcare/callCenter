
package com.alcatel_lucent.test.soapstub.fwmanagement;

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
@WebServiceClient(name = "AlcFwManagementService", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementService", wsdlLocation = "file:/C:/Archivos%20de%20programa/eclipse/workspaceLC/WS_API_Test/bin/AlcFwManagement.wsdl")
public class AlcFwManagementService
    extends Service
{

    private final static URL ALCFWMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementService.class.getResource(".");
            //url = new URL(baseUrl, "file:/C:/Archivos%20de%20programa/eclipse/workspaceLC/WS_API_Test/bin/AlcFwManagement.wsdl");
            url = new URL("http://uc1.linkcare.es/api/services/AlcFwManagement?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://uc1.linkcare.es/api/services/AlcFwManagement?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ALCFWMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public AlcFwManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlcFwManagementService() {
        super(ALCFWMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementService", "AlcFwManagementService"));
    }

    /**
     * 
     * @return
     *     returns AlcFwManagementPortType
     */
    @WebEndpoint(name = "AlcFwManagementPort")
    public AlcFwManagementPortType getAlcFwManagementPort() {
        return super.getPort(new QName("http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementService", "AlcFwManagementPort"), AlcFwManagementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlcFwManagementPortType
     */
    @WebEndpoint(name = "AlcFwManagementPort")
    public AlcFwManagementPortType getAlcFwManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementService", "AlcFwManagementPort"), AlcFwManagementPortType.class, features);
    }

}
