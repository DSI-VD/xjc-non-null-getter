
package ch.ech.xmlns.ech_0010._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour addressInformationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addressInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressLine1" type="{http://www.ech.ch/xmlns/eCH-0010/3}addressLineType" minOccurs="0"/&gt;
 *         &lt;element name="addressLine2" type="{http://www.ech.ch/xmlns/eCH-0010/3}addressLineType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="street" type="{http://www.ech.ch/xmlns/eCH-0010/3}streetType"/&gt;
 *           &lt;element name="houseNumber" type="{http://www.ech.ch/xmlns/eCH-0010/3}houseNumberType" minOccurs="0"/&gt;
 *           &lt;element name="dwellingNumber" type="{http://www.ech.ch/xmlns/eCH-0010/3}dwellingNumberType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="postOfficeBoxNumber" type="{http://www.ech.ch/xmlns/eCH-0010/3}postOfficeBoxNumberType" minOccurs="0"/&gt;
 *           &lt;element name="postOfficeBoxText" type="{http://www.ech.ch/xmlns/eCH-0010/3}postOfficeBoxTextType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="locality" type="{http://www.ech.ch/xmlns/eCH-0010/3}localityType" minOccurs="0"/&gt;
 *         &lt;element name="town" type="{http://www.ech.ch/xmlns/eCH-0010/3}townType"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="swissZipCode" type="{http://www.ech.ch/xmlns/eCH-0010/3}swissZipCodeType"/&gt;
 *             &lt;element name="swissZipCodeAddOn" type="{http://www.ech.ch/xmlns/eCH-0010/3}swissZipCodeAddOnType" minOccurs="0"/&gt;
 *             &lt;element name="swissZipCodeId" type="{http://www.ech.ch/xmlns/eCH-0010/3}swissZipCodeIdType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="foreignZipCode" type="{http://www.ech.ch/xmlns/eCH-0010/3}foreignZipCodeType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="country" type="{http://www.ech.ch/xmlns/eCH-0010/3}countryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressInformationType", propOrder = {
    "addressLine1",
    "addressLine2",
    "street",
    "houseNumber",
    "dwellingNumber",
    "postOfficeBoxNumber",
    "postOfficeBoxText",
    "locality",
    "town",
    "swissZipCode",
    "swissZipCodeAddOn",
    "swissZipCodeId",
    "foreignZipCode",
    "country"
})
public class AddressInformationType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressLine1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressLine2;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String street;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dwellingNumber;
    @XmlSchemaType(name = "unsignedInt")
    protected Long postOfficeBoxNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postOfficeBoxText;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locality;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String town;
    @XmlSchemaType(name = "unsignedInt")
    protected Long swissZipCode;
    protected String swissZipCodeAddOn;
    protected Integer swissZipCodeId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foreignZipCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;

    /**
     * Obtient la valeur de la propriété addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Définit la valeur de la propriété addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    public boolean isSetAddressLine1() {
        return (this.addressLine1 != null);
    }

    /**
     * Obtient la valeur de la propriété addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Définit la valeur de la propriété addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    public boolean isSetAddressLine2() {
        return (this.addressLine2 != null);
    }

    /**
     * Obtient la valeur de la propriété street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Définit la valeur de la propriété street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    public boolean isSetStreet() {
        return (this.street!= null);
    }

    /**
     * Obtient la valeur de la propriété houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Définit la valeur de la propriété houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    public boolean isSetHouseNumber() {
        return (this.houseNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété dwellingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwellingNumber() {
        return dwellingNumber;
    }

    /**
     * Définit la valeur de la propriété dwellingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellingNumber(String value) {
        this.dwellingNumber = value;
    }

    public boolean isSetDwellingNumber() {
        return (this.dwellingNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété postOfficeBoxNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    /**
     * Définit la valeur de la propriété postOfficeBoxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostOfficeBoxNumber(Long value) {
        this.postOfficeBoxNumber = value;
    }

    public boolean isSetPostOfficeBoxNumber() {
        return (this.postOfficeBoxNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété postOfficeBoxText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBoxText() {
        return postOfficeBoxText;
    }

    /**
     * Définit la valeur de la propriété postOfficeBoxText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBoxText(String value) {
        this.postOfficeBoxText = value;
    }

    public boolean isSetPostOfficeBoxText() {
        return (this.postOfficeBoxText!= null);
    }

    /**
     * Obtient la valeur de la propriété locality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Définit la valeur de la propriété locality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    public boolean isSetLocality() {
        return (this.locality!= null);
    }

    /**
     * Obtient la valeur de la propriété town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Définit la valeur de la propriété town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    public boolean isSetTown() {
        return (this.town!= null);
    }

    /**
     * Obtient la valeur de la propriété swissZipCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwissZipCode() {
        return swissZipCode;
    }

    /**
     * Définit la valeur de la propriété swissZipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwissZipCode(Long value) {
        this.swissZipCode = value;
    }

    public boolean isSetSwissZipCode() {
        return (this.swissZipCode!= null);
    }

    /**
     * Obtient la valeur de la propriété swissZipCodeAddOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwissZipCodeAddOn() {
        return swissZipCodeAddOn;
    }

    /**
     * Définit la valeur de la propriété swissZipCodeAddOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwissZipCodeAddOn(String value) {
        this.swissZipCodeAddOn = value;
    }

    public boolean isSetSwissZipCodeAddOn() {
        return (this.swissZipCodeAddOn!= null);
    }

    /**
     * Obtient la valeur de la propriété swissZipCodeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwissZipCodeId() {
        return swissZipCodeId;
    }

    /**
     * Définit la valeur de la propriété swissZipCodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwissZipCodeId(Integer value) {
        this.swissZipCodeId = value;
    }

    public boolean isSetSwissZipCodeId() {
        return (this.swissZipCodeId!= null);
    }

    /**
     * Obtient la valeur de la propriété foreignZipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignZipCode() {
        return foreignZipCode;
    }

    /**
     * Définit la valeur de la propriété foreignZipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignZipCode(String value) {
        this.foreignZipCode = value;
    }

    public boolean isSetForeignZipCode() {
        return (this.foreignZipCode!= null);
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

}
