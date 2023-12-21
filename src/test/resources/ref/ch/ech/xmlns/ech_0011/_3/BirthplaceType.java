
package ch.ech.xmlns.ech_0011._3;

import ch.ech.xmlns.ech_0007._3.SwissMunicipalityType;
import ch.ech.xmlns.ech_0008._2.CountryType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for birthplaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="birthplaceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="unknown" type="{http://www.ech.ch/xmlns/eCH-0011/3}unknownType"/>
 *         <element name="swissTown">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="country">
 *                     <simpleType>
 *                       <restriction base="{http://www.ech.ch/xmlns/eCH-0010/3}countryType">
 *                         <enumeration value="CH"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="municipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="foreignCountry">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType"/>
 *                   <element name="foreignBirthTown" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <whiteSpace value="collapse"/>
 *                         <maxLength value="100"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "birthplaceType", propOrder = {
    "unknown",
    "swissTown",
    "foreignCountry"
})
public class BirthplaceType {

    @XmlSchemaType(name = "token")
    protected UnknownType unknown;
    protected BirthplaceType.SwissTown swissTown;
    protected BirthplaceType.ForeignCountry foreignCountry;

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
     *     {@link BirthplaceType.SwissTown }
     *     
     */
    public BirthplaceType.SwissTown getSwissTown() {
        return swissTown;
    }

    /**
     * Sets the value of the swissTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthplaceType.SwissTown }
     *     
     */
    public void setSwissTown(BirthplaceType.SwissTown value) {
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
     *     {@link BirthplaceType.ForeignCountry }
     *     
     */
    public BirthplaceType.ForeignCountry getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Sets the value of the foreignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthplaceType.ForeignCountry }
     *     
     */
    public void setForeignCountry(BirthplaceType.ForeignCountry value) {
        this.foreignCountry = value;
    }

    public boolean isSetForeignCountry() {
        return (this.foreignCountry!= null);
    }

    public BirthplaceType.SwissTown swissTown() {
        if (null == this.swissTown) {
            this.swissTown = new BirthplaceType.SwissTown();
        }
        return this.swissTown;
    }

    public BirthplaceType.ForeignCountry foreignCountry() {
        if (null == this.foreignCountry) {
            this.foreignCountry = new BirthplaceType.ForeignCountry();
        }
        return this.foreignCountry;
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
     *       <sequence>
     *         <element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryType"/>
     *         <element name="foreignBirthTown" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <whiteSpace value="collapse"/>
     *               <maxLength value="100"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
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
        "foreignBirthTown"
    })
    public static class ForeignCountry {

        @XmlElement(required = true)
        protected CountryType country;
        protected String foreignBirthTown;

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
         * Gets the value of the foreignBirthTown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForeignBirthTown() {
            return foreignBirthTown;
        }

        /**
         * Sets the value of the foreignBirthTown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForeignBirthTown(String value) {
            this.foreignBirthTown = value;
        }

        public boolean isSetForeignBirthTown() {
            return (this.foreignBirthTown!= null);
        }

        public CountryType country() {
            if (null == this.country) {
                this.country = new CountryType();
            }
            return this.country;
        }

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
     *       <sequence>
     *         <element name="country">
     *           <simpleType>
     *             <restriction base="{http://www.ech.ch/xmlns/eCH-0010/3}countryType">
     *               <enumeration value="CH"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="municipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
     *       </sequence>
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
        "municipality"
    })
    public static class SwissTown {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String country;
        @XmlElement(required = true)
        protected SwissMunicipalityType municipality;

        /**
         * Gets the value of the country property.
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
         * Sets the value of the country property.
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

        /**
         * Gets the value of the municipality property.
         * 
         * @return
         *     possible object is
         *     {@link SwissMunicipalityType }
         *     
         */
        public SwissMunicipalityType getMunicipality() {
            return municipality;
        }

        /**
         * Sets the value of the municipality property.
         * 
         * @param value
         *     allowed object is
         *     {@link SwissMunicipalityType }
         *     
         */
        public void setMunicipality(SwissMunicipalityType value) {
            this.municipality = value;
        }

        public boolean isSetMunicipality() {
            return (this.municipality!= null);
        }

        public SwissMunicipalityType municipality() {
            if (null == this.municipality) {
                this.municipality = new SwissMunicipalityType();
            }
            return this.municipality;
        }

    }

}
