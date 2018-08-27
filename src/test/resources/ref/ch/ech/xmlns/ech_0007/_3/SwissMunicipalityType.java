
package ch.ech.xmlns.ech_0007._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for swissMunicipalityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swissMunicipalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="municipalityId" type="{http://www.ech.ch/xmlns/eCH-0007/3}municipalityIdType" minOccurs="0"/&gt;
 *         &lt;element name="municipalityName" type="{http://www.ech.ch/xmlns/eCH-0007/3}municipalityNameType"/&gt;
 *         &lt;element name="cantonAbbreviation" type="{http://www.ech.ch/xmlns/eCH-0007/3}cantonAbbreviationType" minOccurs="0"/&gt;
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
@XmlType(name = "swissMunicipalityType", propOrder = {
    "municipalityId",
    "municipalityName",
    "cantonAbbreviation",
    "historyMunicipialityId"
})
public class SwissMunicipalityType {

    protected Integer municipalityId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String municipalityName;
    @XmlSchemaType(name = "token")
    protected CantonAbbreviationType cantonAbbreviation;
    protected Integer historyMunicipialityId;

    /**
     * Gets the value of the municipalityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipalityId() {
        return municipalityId;
    }

    /**
     * Sets the value of the municipalityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipalityId(Integer value) {
        this.municipalityId = value;
    }

    public boolean isSetMunicipalityId() {
        return (this.municipalityId!= null);
    }

    /**
     * Gets the value of the municipalityName property.
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
     * Sets the value of the municipalityName property.
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
     * Gets the value of the cantonAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link CantonAbbreviationType }
     *     
     */
    public CantonAbbreviationType getCantonAbbreviation() {
        return cantonAbbreviation;
    }

    /**
     * Sets the value of the cantonAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAbbreviationType }
     *     
     */
    public void setCantonAbbreviation(CantonAbbreviationType value) {
        this.cantonAbbreviation = value;
    }

    public boolean isSetCantonAbbreviation() {
        return (this.cantonAbbreviation!= null);
    }

    /**
     * Gets the value of the historyMunicipialityId property.
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
     * Sets the value of the historyMunicipialityId property.
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
