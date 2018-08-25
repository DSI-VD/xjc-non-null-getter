
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="reportetPerson" type="{http://www.ech.ch/xmlns/eCH-0011/3}reportedPersonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportetPerson"
})
@XmlRootElement(name = "personRoot")
public class PersonRoot {

    @XmlElement(required = true)
    protected ReportedPersonType reportetPerson;

    /**
     * Obtient la valeur de la propriété reportetPerson.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPersonType }
     *     
     */
    public ReportedPersonType getReportetPerson() {
        return reportetPerson;
    }

    /**
     * Définit la valeur de la propriété reportetPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPersonType }
     *     
     */
    public void setReportetPerson(ReportedPersonType value) {
        this.reportetPerson = value;
    }

    public boolean isSetReportetPerson() {
        return (this.reportetPerson!= null);
    }

    public ReportedPersonType reportetPerson() {
        if (null == this.reportetPerson) {
            this.reportetPerson = new ReportedPersonType();
        }
        return this.reportetPerson;
    }

}
