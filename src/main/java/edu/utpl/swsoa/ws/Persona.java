package edu.utpl.swsoa.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para persona complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="generoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perSegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "fechaNacimiento",
    "generoId",
    "id",
    "identificacion",
    "nombre",
    "perSegundoApellido",
    "primerApellido",
    "primerNombre",
    "segundoNombre"
})
public class Persona {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String generoId;
    protected Integer id;
    protected String identificacion;
    protected String nombre;
    protected String perSegundoApellido;
    protected String primerApellido;
    protected String primerNombre;
    protected String segundoNombre;

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad generoId.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGeneroId() {
        return generoId;
    }

    /**
     * Define el valor de la propiedad generoId.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGeneroId(String value) {
        this.generoId = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad perSegundoApellido.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPerSegundoApellido() {
        return perSegundoApellido;
    }

    /**
     * Define el valor de la propiedad perSegundoApellido.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPerSegundoApellido(String value) {
        this.perSegundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    @Override
    public String toString() {
        return "Persona {id=" + getId()
                + " identiciacion= " + getIdentificacion()
                + " primer nombre= " + getPrimerApellido()
                + " primer apellido= " + getPrimerApellido()
                + " fecha nacimiento= " + getFechaNacimiento()
                + " }";
    }

}
