
package ch.ech.xmlns.ech_0011._3;

import ch.ech.xmlns.ech_0008._2.CountryType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nationalityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="nationalityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nationalityStatus" type="{http://www.ech.ch/xmlns/eCH-0011/3}nationalityStatusType"/>
 *         <element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * Gets the value of the nationalityStatus property.
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
     * Sets the value of the nationalityStatus property.
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
     * Gets the value of the country property.
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
     * Sets the value of the country property.
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
