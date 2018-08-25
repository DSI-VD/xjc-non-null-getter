
package ch.ech.xmlns.ech_0099._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0011._3.ReportedPersonType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportedPerson" type="{http://www.ech.ch/xmlns/eCH-0011/3}reportedPersonType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="1.1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the reportedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedPersonType }
     * 
     * 
     */
    public List<ReportedPersonType> getReportedPerson() {
        if (reportedPerson == null) {
            reportedPerson = new ArrayList<ReportedPersonType>();
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
     * Obtient la valeur de la propriété version.
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
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
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
