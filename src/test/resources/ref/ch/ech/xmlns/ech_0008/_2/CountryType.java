
package ch.ech.xmlns.ech_0008._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour countryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="countryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryId" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryIdType" minOccurs="0"/&gt;
 *         &lt;element name="countryIdISO2" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryIdISO2Type" minOccurs="0"/&gt;
 *         &lt;element name="countryNameShort" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryNameShortType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryType", propOrder = {
    "countryId",
    "countryIdISO2",
    "countryNameShort"
})
public class CountryType {

    @XmlSchemaType(name = "integer")
    protected Integer countryId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryIdISO2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryNameShort;

    /**
     * Obtient la valeur de la propriété countryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * Définit la valeur de la propriété countryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryId(Integer value) {
        this.countryId = value;
    }

    public boolean isSetCountryId() {
        return (this.countryId!= null);
    }

    /**
     * Obtient la valeur de la propriété countryIdISO2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIdISO2() {
        return countryIdISO2;
    }

    /**
     * Définit la valeur de la propriété countryIdISO2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIdISO2(String value) {
        this.countryIdISO2 = value;
    }

    public boolean isSetCountryIdISO2() {
        return (this.countryIdISO2 != null);
    }

    /**
     * Obtient la valeur de la propriété countryNameShort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameShort() {
        return countryNameShort;
    }

    /**
     * Définit la valeur de la propriété countryNameShort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameShort(String value) {
        this.countryNameShort = value;
    }

    public boolean isSetCountryNameShort() {
        return (this.countryNameShort!= null);
    }

}
