
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0008._2.CountryType;


/**
 * <p>Classe Java pour nationalityType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="nationalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nationalityStatus" type="{http://www.ech.ch/xmlns/eCH-0011/3}nationalityStatusType"/&gt;
 *         &lt;element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nationalityType", propOrder = {
    "nationalityStatus",
    "country"
})
public class NationalityType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NationalityStatusType nationalityStatus;
    protected CountryType country;

    /**
     * Obtient la valeur de la propriété nationalityStatus.
     * 
     * @return
     *     possible object is
     *     {@link NationalityStatusType }
     *     
     */
    public NationalityStatusType getNationalityStatus() {
        return nationalityStatus;
    }

    /**
     * Définit la valeur de la propriété nationalityStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityStatusType }
     *     
     */
    public void setNationalityStatus(NationalityStatusType value) {
        this.nationalityStatus = value;
    }

    public boolean isSetNationalityStatus() {
        return (this.nationalityStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    public CountryType country() {
        if (null == this.country) {
            this.country = new CountryType();
        }
        return this.country;
    }

}
