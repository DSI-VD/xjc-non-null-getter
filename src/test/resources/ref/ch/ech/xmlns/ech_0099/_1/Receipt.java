
package ch.ech.xmlns.ech_0099._1;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *       <attribute name="version" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="1.0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventTime"
})
@XmlRootElement(name = "receipt")
public class Receipt {

    /**
     * Zeitstempfel. Gibt den Zeitpunkt an, wann das angelieferte XML Dokument
     *               in den Verarbeitungsprozess übertragen wurde.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventTime;
    /**
     * Versionsnummer des XML Schemas, welches dieses Element beschreibt.
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Zeitstempfel. Gibt den Zeitpunkt an, wann das angelieferte XML Dokument
     *               in den Verarbeitungsprozess übertragen wurde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEventTime()
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    public boolean isSetEventTime() {
        return (this.eventTime!= null);
    }

    /**
     * Versionsnummer des XML Schemas, welches dieses Element beschreibt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
