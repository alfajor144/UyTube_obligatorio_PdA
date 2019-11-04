
package logica.controladores;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CUsuarioService", targetNamespace = "http://Controladores.Logica/", wsdlLocation = "http://localhost:9789/UyTube_ws?wsdl")
public class CUsuarioService
    extends Service
{

    private final static URL CUSUARIOSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSUARIOSERVICE_EXCEPTION;
    private final static QName CUSUARIOSERVICE_QNAME = new QName("http://Controladores.Logica/", "CUsuarioService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9789/UyTube_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSUARIOSERVICE_WSDL_LOCATION = url;
        CUSUARIOSERVICE_EXCEPTION = e;
    }

    public CUsuarioService() {
        super(__getWsdlLocation(), CUSUARIOSERVICE_QNAME);
    }

    public CUsuarioService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSUARIOSERVICE_QNAME, features);
    }

    public CUsuarioService(URL wsdlLocation) {
        super(wsdlLocation, CUSUARIOSERVICE_QNAME);
    }

    public CUsuarioService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSUARIOSERVICE_QNAME, features);
    }

    public CUsuarioService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CUsuarioService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CUsuario
     */
    @WebEndpoint(name = "CUsuarioPort")
    public CUsuario getCUsuarioPort() {
        return super.getPort(new QName("http://Controladores.Logica/", "CUsuarioPort"), CUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CUsuario
     */
    @WebEndpoint(name = "CUsuarioPort")
    public CUsuario getCUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Controladores.Logica/", "CUsuarioPort"), CUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSUARIOSERVICE_EXCEPTION!= null) {
            throw CUSUARIOSERVICE_EXCEPTION;
        }
        return CUSUARIOSERVICE_WSDL_LOCATION;
    }

}
