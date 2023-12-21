
package ch.ech.xmlns.ech_0011._3;

import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0007._3.SwissMunicipalityType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherResidenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="otherResidenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="secondaryResidenceInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
 *                   <element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0011/3}destinationType"/>
 *                   <element name="dwellingAddress" type="{http://www.ech.ch/xmlns/eCH-0011/3}dwellingAddressType"/>
 *                   <element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0011/3}destinationType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "otherResidenceType", propOrder = {
    "secondaryResidenceInformation"
})
public class OtherResidenceType {

    @XmlElement(required = true)
    protected OtherResidenceType.SecondaryResidenceInformation secondaryResidenceInformation;

    /**
     * Gets the value of the secondaryResidenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResidenceType.SecondaryResidenceInformation }
     *     
     */
    public OtherResidenceType.SecondaryResidenceInformation getSecondaryResidenceInformation() {
        return secondaryResidenceInformation;
    }

    /**
     * Sets the value of the secondaryResidenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResidenceType.SecondaryResidenceInformation }
     *     
     */
    public void setSecondaryResidenceInformation(OtherResidenceType.SecondaryResidenceInformation value) {
        this.secondaryResidenceInformation = value;
    }

    public boolean isSetSecondaryResidenceInformation() {
        return (this.secondaryResidenceInformation!= null);
    }

    public OtherResidenceType.SecondaryResidenceInformation secondaryResidenceInformation() {
        if (null == this.secondaryResidenceInformation) {
            this.secondaryResidenceInformation = new OtherResidenceType.SecondaryResidenceInformation();
        }
        return this.secondaryResidenceInformation;
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
     *         <element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
     *         <element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0011/3}destinationType"/>
     *         <element name="dwellingAddress" type="{http://www.ech.ch/xmlns/eCH-0011/3}dwellingAddressType"/>
     *         <element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0011/3}destinationType" minOccurs="0"/>
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
        "reportingMunicipality",
        "arrivalDate",
        "comesFrom",
        "dwellingAddress",
        "departureDate",
        "goesTo"
    })
    public static class SecondaryResidenceInformation {

        @XmlElement(required = true)
        protected SwissMunicipalityType reportingMunicipality;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar arrivalDate;
        @XmlElement(required = true)
        protected DestinationType comesFrom;
        @XmlElement(required = true)
        protected DwellingAddressType dwellingAddress;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departureDate;
        protected DestinationType goesTo;

        /**
         * Gets the value of the reportingMunicipality property.
         * 
         * @return
         *     possible object is
         *     {@link SwissMunicipalityType }
         *     
         */
        public SwissMunicipalityType getReportingMunicipality() {
            return reportingMunicipality;
        }

        /**
         * Sets the value of the reportingMunicipality property.
         * 
         * @param value
         *     allowed object is
         *     {@link SwissMunicipalityType }
         *     
         */
        public void setReportingMunicipality(SwissMunicipalityType value) {
            this.reportingMunicipality = value;
        }

        public boolean isSetReportingMunicipality() {
            return (this.reportingMunicipality!= null);
        }

        /**
         * Gets the value of the arrivalDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalDate() {
            return arrivalDate;
        }

        /**
         * Sets the value of the arrivalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalDate(XMLGregorianCalendar value) {
            this.arrivalDate = value;
        }

        public boolean isSetArrivalDate() {
            return (this.arrivalDate!= null);
        }

        /**
         * Gets the value of the comesFrom property.
         * 
         * @return
         *     possible object is
         *     {@link DestinationType }
         *     
         */
        public DestinationType getComesFrom() {
            return comesFrom;
        }

        /**
         * Sets the value of the comesFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DestinationType }
         *     
         */
        public void setComesFrom(DestinationType value) {
            this.comesFrom = value;
        }

        public boolean isSetComesFrom() {
            return (this.comesFrom!= null);
        }

        /**
         * Gets the value of the dwellingAddress property.
         * 
         * @return
         *     possible object is
         *     {@link DwellingAddressType }
         *     
         */
        public DwellingAddressType getDwellingAddress() {
            return dwellingAddress;
        }

        /**
         * Sets the value of the dwellingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link DwellingAddressType }
         *     
         */
        public void setDwellingAddress(DwellingAddressType value) {
            this.dwellingAddress = value;
        }

        public boolean isSetDwellingAddress() {
            return (this.dwellingAddress!= null);
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        public boolean isSetDepartureDate() {
            return (this.departureDate!= null);
        }

        /**
         * Gets the value of the goesTo property.
         * 
         * @return
         *     possible object is
         *     {@link DestinationType }
         *     
         */
        public DestinationType getGoesTo() {
            return goesTo;
        }

        /**
         * Sets the value of the goesTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DestinationType }
         *     
         */
        public void setGoesTo(DestinationType value) {
            this.goesTo = value;
        }

        public boolean isSetGoesTo() {
            return (this.goesTo!= null);
        }

        public SwissMunicipalityType reportingMunicipality() {
            if (null == this.reportingMunicipality) {
                this.reportingMunicipality = new SwissMunicipalityType();
            }
            return this.reportingMunicipality;
        }

        public DestinationType comesFrom() {
            if (null == this.comesFrom) {
                this.comesFrom = new DestinationType();
            }
            return this.comesFrom;
        }

        public DwellingAddressType dwellingAddress() {
            if (null == this.dwellingAddress) {
                this.dwellingAddress = new DwellingAddressType();
            }
            return this.dwellingAddress;
        }

        public DestinationType goesTo() {
            if (null == this.goesTo) {
                this.goesTo = new DestinationType();
            }
            return this.goesTo;
        }

    }

}
