
package ch.ech.xmlns.ech_0007._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour swissAndFlMunicipalityType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="swissAndFlMunicipalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="municipalityId" type="{http://www.ech.ch/xmlns/eCH-0007/3}municipalityIdType"/&gt;
 *         &lt;element name="municipalityName" type="{http://www.ech.ch/xmlns/eCH-0007/3}municipalityNameType"/&gt;
 *         &lt;element name="cantonFlAbbreviation" type="{http://www.ech.ch/xmlns/eCH-0007/3}cantonFlAbbreviationType"/&gt;
 *         &lt;element name="historyMunicipialityId" type="{http://www.ech.ch/xmlns/eCH-0007/3}historyMunicipalityId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "swissAndFlMunicipalityType", propOrder = {
    "municipalityId",
    "municipalityName",
    "cantonFlAbbreviation",
    "historyMunicipialityId"
})
public class SwissAndFlMunicipalityType {

    protected int municipalityId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String municipalityName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CantonFlAbbreviationType cantonFlAbbreviation;
    protected Integer historyMunicipialityId;

    /**
     * Obtient la valeur de la propriété municipalityId.
     * 
     */
    public int getMunicipalityId() {
        return municipalityId;
    }

    /**
     * Définit la valeur de la propriété municipalityId.
     * 
     */
    public void setMunicipalityId(int value) {
        this.municipalityId = value;
    }

    public boolean isSetMunicipalityId() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété municipalityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Définit la valeur de la propriété municipalityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityName(String value) {
        this.municipalityName = value;
    }

    public boolean isSetMunicipalityName() {
        return (this.municipalityName!= null);
    }

    /**
     * Obtient la valeur de la propriété cantonFlAbbreviation.
     * 
     * @return
     *     possible object is
     *     {@link CantonFlAbbreviationType }
     *     
     */
    public CantonFlAbbreviationType getCantonFlAbbreviation() {
        return cantonFlAbbreviation;
    }

    /**
     * Définit la valeur de la propriété cantonFlAbbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonFlAbbreviationType }
     *     
     */
    public void setCantonFlAbbreviation(CantonFlAbbreviationType value) {
        this.cantonFlAbbreviation = value;
    }

    public boolean isSetCantonFlAbbreviation() {
        return (this.cantonFlAbbreviation!= null);
    }

    /**
     * Obtient la valeur de la propriété historyMunicipialityId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoryMunicipialityId() {
        return historyMunicipialityId;
    }

    /**
     * Définit la valeur de la propriété historyMunicipialityId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoryMunicipialityId(Integer value) {
        this.historyMunicipialityId = value;
    }

    public boolean isSetHistoryMunicipialityId() {
        return (this.historyMunicipialityId!= null);
    }

}
