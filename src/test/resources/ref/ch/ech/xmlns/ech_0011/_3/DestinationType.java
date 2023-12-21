
package ch.ech.xmlns.ech_0011._3;

import ch.ech.xmlns.ech_0007._3.SwissMunicipalityType;
import ch.ech.xmlns.ech_0008._2.CountryType;
import ch.ech.xmlns.ech_0010._3.AddressInformationType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for destinationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="destinationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="unknown" type="{http://www.ech.ch/xmlns/eCH-0011/3}unknownType"/>
 *           <element name="swissTown" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
 *           <element name="foreignCountry">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <sequence>
 *                       <element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType"/>
 *                       <element name="town" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <whiteSpace value="collapse"/>
 *                             <maxLength value="100"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                     </sequence>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="mailAddress" type="{http://www.ech.ch/xmlns/eCH-0010/3}addressInformationType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinationType", propOrder = {
    "unknown",
    "swissTown",
    "foreignCountry",
    "mailAddress"
})
public class DestinationType {

    @XmlSchemaType(name = "token")
    protected UnknownType unknown;
    protected SwissMunicipalityType swissTown;
    protected DestinationType.ForeignCountry foreignCountry;
    protected AddressInformationType mailAddress;

    /**
     * Gets the value of the unknown property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownType }
     *     
     */
    public UnknownType getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownType }
     *     
     */
    public void setUnknown(UnknownType value) {
        this.unknown = value;
    }

    public boolean isSetUnknown() {
        return (this.unknown!= null);
    }

    /**
     * Gets the value of the swissTown property.
     * 
     * @return
     *     possible object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public SwissMunicipalityType getSwissTown() {
        return swissTown;
    }

    /**
     * Sets the value of the swissTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public void setSwissTown(SwissMunicipalityType value) {
        this.swissTown = value;
    }

    public boolean isSetSwissTown() {
        return (this.swissTown!= null);
    }

    /**
     * Gets the value of the foreignCountry property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType.ForeignCountry }
     *     
     */
    public DestinationType.ForeignCountry getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Sets the value of the foreignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType.ForeignCountry }
     *     
     */
    public void setForeignCountry(DestinationType.ForeignCountry value) {
        this.foreignCountry = value;
    }

    public boolean isSetForeignCountry() {
        return (this.foreignCountry!= null);
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setMailAddress(AddressInformationType value) {
        this.mailAddress = value;
    }

    public boolean isSetMailAddress() {
        return (this.mailAddress!= null);
    }

    public SwissMunicipalityType swissTown() {
        if (null == this.swissTown) {
            this.swissTown = new SwissMunicipalityType();
        }
        return this.swissTown;
    }

    public DestinationType.ForeignCountry foreignCountry() {
        if (null == this.foreignCountry) {
            this.foreignCountry = new DestinationType.ForeignCountry();
        }
        return this.foreignCountry;
    }

    public AddressInformationType mailAddress() {
        if (null == this.mailAddress) {
            this.mailAddress = new AddressInformationType();
        }
        return this.mailAddress;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <sequence>
     *           <element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType"/>
     *           <element name="town" minOccurs="0">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <whiteSpace value="collapse"/>
     *                 <maxLength value="100"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *         </sequence>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "country",
        "town"
    })
    public static class ForeignCountry {

        protected CountryType country;
        protected String town;

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

        /**
         * Gets the value of the town property.
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
         * Sets the value of the town property.
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

        public CountryType country() {
            if (null == this.country) {
                this.country = new CountryType();
            }
            return this.country;
        }

    }

}
