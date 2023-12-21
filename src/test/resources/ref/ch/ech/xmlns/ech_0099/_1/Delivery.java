
package ch.ech.xmlns.ech_0099._1;

import java.util.ArrayList;
import java.util.List;
import ch.ech.xmlns.ech_0011._3.ReportedPersonType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="reportedPerson" type="{http://www.ech.ch/xmlns/eCH-0011/3}reportedPersonType" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="version" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="1.1"/>
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
    "reportedPerson"
})
@XmlRootElement(name = "delivery")
public class Delivery {

    @XmlElement(required = true)
    protected List<ReportedPersonType> reportedPerson;
    /**
     * Versionsnummer des XML Schemas, welches dieses Element beschreibt.
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the reportedPerson property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportedPerson property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReportedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedPersonType }
     * </p>
     * 
     * 
     * @return
     *     The value of the reportedPerson property.
     */
    public List<ReportedPersonType> getReportedPerson() {
        if (reportedPerson == null) {
            reportedPerson = new ArrayList<>();
        }
        return this.reportedPerson;
    }

    public boolean isSetReportedPerson() {
        return ((this.reportedPerson!= null)&&(!this.reportedPerson.isEmpty()));
    }

    public void unsetReportedPerson() {
        this.reportedPerson = null;
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

    public ReportedPersonType reportedPerson() {
        ReportedPersonType newElement = new ReportedPersonType();
        getReportedPerson().add(newElement);
        return newElement;
    }

}
