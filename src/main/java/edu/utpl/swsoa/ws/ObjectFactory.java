
package edu.utpl.swsoa.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.utpl.swsoa.ws package. 
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

    private final static QName _BuscarPersonaPorIdentificacion_QNAME = new QName("http://ws.swsoa.utpl.edu/", "buscarPersonaPorIdentificacion");
    private final static QName _BuscarPersonaPorIdentificacionResponse_QNAME = new QName("http://ws.swsoa.utpl.edu/", "buscarPersonaPorIdentificacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.utpl.swsoa.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPersonaPorIdentificacion }
     * 
     */
    public BuscarPersonaPorIdentificacion createBuscarPersonaPorIdentificacion() {
        return new BuscarPersonaPorIdentificacion();
    }

    /**
     * Create an instance of {@link BuscarPersonaPorIdentificacionResponse }
     * 
     */
    public BuscarPersonaPorIdentificacionResponse createBuscarPersonaPorIdentificacionResponse() {
        return new BuscarPersonaPorIdentificacionResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersonaPorIdentificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.swsoa.utpl.edu/", name = "buscarPersonaPorIdentificacion")
    public JAXBElement<BuscarPersonaPorIdentificacion> createBuscarPersonaPorIdentificacion(BuscarPersonaPorIdentificacion value) {
        return new JAXBElement<BuscarPersonaPorIdentificacion>(_BuscarPersonaPorIdentificacion_QNAME, BuscarPersonaPorIdentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersonaPorIdentificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.swsoa.utpl.edu/", name = "buscarPersonaPorIdentificacionResponse")
    public JAXBElement<BuscarPersonaPorIdentificacionResponse> createBuscarPersonaPorIdentificacionResponse(BuscarPersonaPorIdentificacionResponse value) {
        return new JAXBElement<BuscarPersonaPorIdentificacionResponse>(_BuscarPersonaPorIdentificacionResponse_QNAME, BuscarPersonaPorIdentificacionResponse.class, null, value);
    }

}
