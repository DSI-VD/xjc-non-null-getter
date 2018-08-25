
package ch.ech.xmlns.ech_0007._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice&gt;
 *         &lt;element name="swissMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/&gt;
 *         &lt;element name="swissAndFlMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissAndFlMunicipalityType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swissMunicipality",
    "swissAndFlMunicipality"
})
@XmlRootElement(name = "municipalityRoot")
public class MunicipalityRoot {

    protected SwissMunicipalityType swissMunicipality;
    protected SwissAndFlMunicipalityType swissAndFlMunicipality;

    /**
     * Obtient la valeur de la propriété swissMunicipality.
     * 
     * @return
     *     possible object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public SwissMunicipalityType getSwissMunicipality() {
        return swissMunicipality;
    }

    /**
     * Définit la valeur de la propriété swissMunicipality.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public void setSwissMunicipality(SwissMunicipalityType value) {
        this.swissMunicipality = value;
    }

    public boolean isSetSwissMunicipality() {
        return (this.swissMunicipality!= null);
    }

    /**
     * Obtient la valeur de la propriété swissAndFlMunicipality.
     * 
     * @return
     *     possible object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public SwissAndFlMunicipalityType getSwissAndFlMunicipality() {
        return swissAndFlMunicipality;
    }

    /**
     * Définit la valeur de la propriété swissAndFlMunicipality.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public void setSwissAndFlMunicipality(SwissAndFlMunicipalityType value) {
        this.swissAndFlMunicipality = value;
    }

    public boolean isSetSwissAndFlMunicipality() {
        return (this.swissAndFlMunicipality!= null);
    }

    public SwissMunicipalityType swissMunicipality() {
        if (null == this.swissMunicipality) {
            this.swissMunicipality = new SwissMunicipalityType();
        }
        return this.swissMunicipality;
    }

    public SwissAndFlMunicipalityType swissAndFlMunicipality() {
        if (null == this.swissAndFlMunicipality) {
            this.swissAndFlMunicipality = new SwissAndFlMunicipalityType();
        }
        return this.swissAndFlMunicipality;
    }

}
