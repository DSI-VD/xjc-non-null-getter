
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0010._3.SwissAddressInformationType;


/**
 * <p>Java class for dwellingAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dwellingAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EGIDType"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="EWID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EWIDType"/&gt;
 *               &lt;element name="householdID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="withoutEGID"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="householdID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="address" type="{http://www.ech.ch/xmlns/eCH-0010/3}swissAddressInformationType"/&gt;
 *         &lt;element name="typeOfHousehold" type="{http://www.ech.ch/xmlns/eCH-0011/3}typeOfHouseholdType"/&gt;
 *         &lt;element name="movingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dwellingAddressType", propOrder = {
    "egid",
    "ewid",
    "householdID",
    "withoutEGID",
    "address",
    "typeOfHousehold",
    "movingDate"
})
public class DwellingAddressType {

    @XmlElement(name = "EGID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long egid;
    @XmlElement(name = "EWID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ewid;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String householdID;
    protected DwellingAddressType.WithoutEGID withoutEGID;
    @XmlElement(required = true)
    protected SwissAddressInformationType address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfHouseholdType typeOfHousehold;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar movingDate;

    /**
     * Gets the value of the egid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEGID() {
        return egid;
    }

    /**
     * Sets the value of the egid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEGID(Long value) {
        this.egid = value;
    }

    public boolean isSetEGID() {
        return (this.egid!= null);
    }

    /**
     * Gets the value of the ewid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEWID() {
        return ewid;
    }

    /**
     * Sets the value of the ewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEWID(Long value) {
        this.ewid = value;
    }

    public boolean isSetEWID() {
        return (this.ewid!= null);
    }

    /**
     * Gets the value of the householdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdID() {
        return householdID;
    }

    /**
     * Sets the value of the householdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdID(String value) {
        this.householdID = value;
    }

    public boolean isSetHouseholdID() {
        return (this.householdID!= null);
    }

    /**
     * Gets the value of the withoutEGID property.
     * 
     * @return
     *     possible object is
     *     {@link DwellingAddressType.WithoutEGID }
     *     
     */
    public DwellingAddressType.WithoutEGID getWithoutEGID() {
        return withoutEGID;
    }

    /**
     * Sets the value of the withoutEGID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DwellingAddressType.WithoutEGID }
     *     
     */
    public void setWithoutEGID(DwellingAddressType.WithoutEGID value) {
        this.withoutEGID = value;
    }

    public boolean isSetWithoutEGID() {
        return (this.withoutEGID!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SwissAddressInformationType }
     *     
     */
    public SwissAddressInformationType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissAddressInformationType }
     *     
     */
    public void setAddress(SwissAddressInformationType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the typeOfHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfHouseholdType }
     *     
     */
    public TypeOfHouseholdType getTypeOfHousehold() {
        return typeOfHousehold;
    }

    /**
     * Sets the value of the typeOfHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfHouseholdType }
     *     
     */
    public void setTypeOfHousehold(TypeOfHouseholdType value) {
        this.typeOfHousehold = value;
    }

    public boolean isSetTypeOfHousehold() {
        return (this.typeOfHousehold!= null);
    }

    /**
     * Gets the value of the movingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovingDate() {
        return movingDate;
    }

    /**
     * Sets the value of the movingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovingDate(XMLGregorianCalendar value) {
        this.movingDate = value;
    }

    public boolean isSetMovingDate() {
        return (this.movingDate!= null);
    }

    public DwellingAddressType.WithoutEGID withoutEGID() {
        if (null == this.withoutEGID) {
            this.withoutEGID = new DwellingAddressType.WithoutEGID();
        }
        return this.withoutEGID;
    }

    public SwissAddressInformationType address() {
        if (null == this.address) {
            this.address = new SwissAddressInformationType();
        }
        return this.address;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="householdID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
        "householdID"
    })
    public static class WithoutEGID {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String householdID;

        /**
         * Gets the value of the householdID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHouseholdID() {
            return householdID;
        }

        /**
         * Sets the value of the householdID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHouseholdID(String value) {
            this.householdID = value;
        }

        public boolean isSetHouseholdID() {
            return (this.householdID!= null);
        }

    }

}
