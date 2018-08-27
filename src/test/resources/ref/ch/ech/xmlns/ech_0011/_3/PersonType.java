
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0010._3.MailAddressType;
import ch.ech.xmlns.ech_0044._1.PersonIdentificationPartnerType;
import ch.ech.xmlns.ech_0044._1.PersonIdentificationType;


/**
 * <p>Java class for personType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
 *         &lt;element name="coredata"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="originalName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
 *                   &lt;element name="alliancePartnershipName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
 *                   &lt;element name="aliasName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
 *                   &lt;element name="otherName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
 *                   &lt;element name="callName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
 *                   &lt;element name="placeOfBirth" type="{http://www.ech.ch/xmlns/eCH-0011/3}birthplaceType"/&gt;
 *                   &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="maritalData" type="{http://www.ech.ch/xmlns/eCH-0011/3}maritalDataType"/&gt;
 *                   &lt;element name="nationality" type="{http://www.ech.ch/xmlns/eCH-0011/3}nationalityType"/&gt;
 *                   &lt;element name="contact" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice minOccurs="0"&gt;
 *                               &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
 *                               &lt;element name="personIdentificationPartner" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationPartnerType"/&gt;
 *                               &lt;element name="partnerIdOrgnisation" type="{http://www.ech.ch/xmlns/eCH-0011/3}partnerIdOrganisationType"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="contactAddress" type="{http://www.ech.ch/xmlns/eCH-0010/3}mailAddressType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="languageOfCorrespondance" type="{http://www.ech.ch/xmlns/eCH-0011/3}languageType" minOccurs="0"/&gt;
 *                   &lt;element name="religion" type="{http://www.ech.ch/xmlns/eCH-0011/3}religionType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personType", propOrder = {
    "personIdentification",
    "coredata"
})
public class PersonType {

    @XmlElement(required = true)
    protected PersonIdentificationType personIdentification;
    @XmlElement(required = true)
    protected PersonType.Coredata coredata;

    /**
     * Gets the value of the personIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationType }
     *     
     */
    public PersonIdentificationType getPersonIdentification() {
        return personIdentification;
    }

    /**
     * Sets the value of the personIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationType }
     *     
     */
    public void setPersonIdentification(PersonIdentificationType value) {
        this.personIdentification = value;
    }

    public boolean isSetPersonIdentification() {
        return (this.personIdentification!= null);
    }

    /**
     * Gets the value of the coredata property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType.Coredata }
     *     
     */
    public PersonType.Coredata getCoredata() {
        return coredata;
    }

    /**
     * Sets the value of the coredata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType.Coredata }
     *     
     */
    public void setCoredata(PersonType.Coredata value) {
        this.coredata = value;
    }

    public boolean isSetCoredata() {
        return (this.coredata!= null);
    }

    public PersonIdentificationType personIdentification() {
        if (null == this.personIdentification) {
            this.personIdentification = new PersonIdentificationType();
        }
        return this.personIdentification;
    }

    public PersonType.Coredata coredata() {
        if (null == this.coredata) {
            this.coredata = new PersonType.Coredata();
        }
        return this.coredata;
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
     *         &lt;element name="originalName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
     *         &lt;element name="alliancePartnershipName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
     *         &lt;element name="aliasName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
     *         &lt;element name="otherName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
     *         &lt;element name="callName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/&gt;
     *         &lt;element name="placeOfBirth" type="{http://www.ech.ch/xmlns/eCH-0011/3}birthplaceType"/&gt;
     *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="maritalData" type="{http://www.ech.ch/xmlns/eCH-0011/3}maritalDataType"/&gt;
     *         &lt;element name="nationality" type="{http://www.ech.ch/xmlns/eCH-0011/3}nationalityType"/&gt;
     *         &lt;element name="contact" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
     *                     &lt;element name="personIdentificationPartner" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationPartnerType"/&gt;
     *                     &lt;element name="partnerIdOrgnisation" type="{http://www.ech.ch/xmlns/eCH-0011/3}partnerIdOrganisationType"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="contactAddress" type="{http://www.ech.ch/xmlns/eCH-0010/3}mailAddressType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="languageOfCorrespondance" type="{http://www.ech.ch/xmlns/eCH-0011/3}languageType" minOccurs="0"/&gt;
     *         &lt;element name="religion" type="{http://www.ech.ch/xmlns/eCH-0011/3}religionType"/&gt;
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
        "originalName",
        "alliancePartnershipName",
        "aliasName",
        "otherName",
        "callName",
        "placeOfBirth",
        "dateOfDeath",
        "maritalData",
        "nationality",
        "contact",
        "languageOfCorrespondance",
        "religion"
    })
    public static class Coredata {

        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String originalName;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String alliancePartnershipName;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String aliasName;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String otherName;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String callName;
        @XmlElement(required = true)
        protected BirthplaceType placeOfBirth;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfDeath;
        @XmlElement(required = true)
        protected MaritalDataType maritalData;
        @XmlElement(required = true)
        protected NationalityType nationality;
        protected PersonType.Coredata.Contact contact;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String languageOfCorrespondance;
        @XmlElement(required = true)
        protected String religion;

        /**
         * Gets the value of the originalName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalName() {
            return originalName;
        }

        /**
         * Sets the value of the originalName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalName(String value) {
            this.originalName = value;
        }

        public boolean isSetOriginalName() {
            return (this.originalName!= null);
        }

        /**
         * Gets the value of the alliancePartnershipName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlliancePartnershipName() {
            return alliancePartnershipName;
        }

        /**
         * Sets the value of the alliancePartnershipName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlliancePartnershipName(String value) {
            this.alliancePartnershipName = value;
        }

        public boolean isSetAlliancePartnershipName() {
            return (this.alliancePartnershipName!= null);
        }

        /**
         * Gets the value of the aliasName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAliasName() {
            return aliasName;
        }

        /**
         * Sets the value of the aliasName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAliasName(String value) {
            this.aliasName = value;
        }

        public boolean isSetAliasName() {
            return (this.aliasName!= null);
        }

        /**
         * Gets the value of the otherName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherName() {
            return otherName;
        }

        /**
         * Sets the value of the otherName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherName(String value) {
            this.otherName = value;
        }

        public boolean isSetOtherName() {
            return (this.otherName!= null);
        }

        /**
         * Gets the value of the callName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallName() {
            return callName;
        }

        /**
         * Sets the value of the callName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallName(String value) {
            this.callName = value;
        }

        public boolean isSetCallName() {
            return (this.callName!= null);
        }

        /**
         * Gets the value of the placeOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link BirthplaceType }
         *     
         */
        public BirthplaceType getPlaceOfBirth() {
            return placeOfBirth;
        }

        /**
         * Sets the value of the placeOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BirthplaceType }
         *     
         */
        public void setPlaceOfBirth(BirthplaceType value) {
            this.placeOfBirth = value;
        }

        public boolean isSetPlaceOfBirth() {
            return (this.placeOfBirth!= null);
        }

        /**
         * Gets the value of the dateOfDeath property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfDeath() {
            return dateOfDeath;
        }

        /**
         * Sets the value of the dateOfDeath property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfDeath(XMLGregorianCalendar value) {
            this.dateOfDeath = value;
        }

        public boolean isSetDateOfDeath() {
            return (this.dateOfDeath!= null);
        }

        /**
         * Gets the value of the maritalData property.
         * 
         * @return
         *     possible object is
         *     {@link MaritalDataType }
         *     
         */
        public MaritalDataType getMaritalData() {
            return maritalData;
        }

        /**
         * Sets the value of the maritalData property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaritalDataType }
         *     
         */
        public void setMaritalData(MaritalDataType value) {
            this.maritalData = value;
        }

        public boolean isSetMaritalData() {
            return (this.maritalData!= null);
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link NationalityType }
         *     
         */
        public NationalityType getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link NationalityType }
         *     
         */
        public void setNationality(NationalityType value) {
            this.nationality = value;
        }

        public boolean isSetNationality() {
            return (this.nationality!= null);
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType.Coredata.Contact }
         *     
         */
        public PersonType.Coredata.Contact getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType.Coredata.Contact }
         *     
         */
        public void setContact(PersonType.Coredata.Contact value) {
            this.contact = value;
        }

        public boolean isSetContact() {
            return (this.contact!= null);
        }

        /**
         * Gets the value of the languageOfCorrespondance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguageOfCorrespondance() {
            return languageOfCorrespondance;
        }

        /**
         * Sets the value of the languageOfCorrespondance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguageOfCorrespondance(String value) {
            this.languageOfCorrespondance = value;
        }

        public boolean isSetLanguageOfCorrespondance() {
            return (this.languageOfCorrespondance!= null);
        }

        /**
         * Gets the value of the religion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReligion() {
            return religion;
        }

        /**
         * Sets the value of the religion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReligion(String value) {
            this.religion = value;
        }

        public boolean isSetReligion() {
            return (this.religion!= null);
        }

        public BirthplaceType placeOfBirth() {
            if (null == this.placeOfBirth) {
                this.placeOfBirth = new BirthplaceType();
            }
            return this.placeOfBirth;
        }

        public MaritalDataType maritalData() {
            if (null == this.maritalData) {
                this.maritalData = new MaritalDataType();
            }
            return this.maritalData;
        }

        public NationalityType nationality() {
            if (null == this.nationality) {
                this.nationality = new NationalityType();
            }
            return this.nationality;
        }

        public PersonType.Coredata.Contact contact() {
            if (null == this.contact) {
                this.contact = new PersonType.Coredata.Contact();
            }
            return this.contact;
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
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
         *           &lt;element name="personIdentificationPartner" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationPartnerType"/&gt;
         *           &lt;element name="partnerIdOrgnisation" type="{http://www.ech.ch/xmlns/eCH-0011/3}partnerIdOrganisationType"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="contactAddress" type="{http://www.ech.ch/xmlns/eCH-0010/3}mailAddressType"/&gt;
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
            "personIdentification",
            "personIdentificationPartner",
            "partnerIdOrgnisation",
            "contactAddress"
        })
        public static class Contact {

            protected PersonIdentificationType personIdentification;
            protected PersonIdentificationPartnerType personIdentificationPartner;
            protected PartnerIdOrganisationType partnerIdOrgnisation;
            @XmlElement(required = true)
            protected MailAddressType contactAddress;

            /**
             * Gets the value of the personIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link PersonIdentificationType }
             *     
             */
            public PersonIdentificationType getPersonIdentification() {
                return personIdentification;
            }

            /**
             * Sets the value of the personIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonIdentificationType }
             *     
             */
            public void setPersonIdentification(PersonIdentificationType value) {
                this.personIdentification = value;
            }

            public boolean isSetPersonIdentification() {
                return (this.personIdentification!= null);
            }

            /**
             * Gets the value of the personIdentificationPartner property.
             * 
             * @return
             *     possible object is
             *     {@link PersonIdentificationPartnerType }
             *     
             */
            public PersonIdentificationPartnerType getPersonIdentificationPartner() {
                return personIdentificationPartner;
            }

            /**
             * Sets the value of the personIdentificationPartner property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonIdentificationPartnerType }
             *     
             */
            public void setPersonIdentificationPartner(PersonIdentificationPartnerType value) {
                this.personIdentificationPartner = value;
            }

            public boolean isSetPersonIdentificationPartner() {
                return (this.personIdentificationPartner!= null);
            }

            /**
             * Gets the value of the partnerIdOrgnisation property.
             * 
             * @return
             *     possible object is
             *     {@link PartnerIdOrganisationType }
             *     
             */
            public PartnerIdOrganisationType getPartnerIdOrgnisation() {
                return partnerIdOrgnisation;
            }

            /**
             * Sets the value of the partnerIdOrgnisation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PartnerIdOrganisationType }
             *     
             */
            public void setPartnerIdOrgnisation(PartnerIdOrganisationType value) {
                this.partnerIdOrgnisation = value;
            }

            public boolean isSetPartnerIdOrgnisation() {
                return (this.partnerIdOrgnisation!= null);
            }

            /**
             * Gets the value of the contactAddress property.
             * 
             * @return
             *     possible object is
             *     {@link MailAddressType }
             *     
             */
            public MailAddressType getContactAddress() {
                return contactAddress;
            }

            /**
             * Sets the value of the contactAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link MailAddressType }
             *     
             */
            public void setContactAddress(MailAddressType value) {
                this.contactAddress = value;
            }

            public boolean isSetContactAddress() {
                return (this.contactAddress!= null);
            }

            public PersonIdentificationType personIdentification() {
                if (null == this.personIdentification) {
                    this.personIdentification = new PersonIdentificationType();
                }
                return this.personIdentification;
            }

            public PersonIdentificationPartnerType personIdentificationPartner() {
                if (null == this.personIdentificationPartner) {
                    this.personIdentificationPartner = new PersonIdentificationPartnerType();
                }
                return this.personIdentificationPartner;
            }

            public PartnerIdOrganisationType partnerIdOrgnisation() {
                if (null == this.partnerIdOrgnisation) {
                    this.partnerIdOrgnisation = new PartnerIdOrganisationType();
                }
                return this.partnerIdOrgnisation;
            }

            public MailAddressType contactAddress() {
                if (null == this.contactAddress) {
                    this.contactAddress = new MailAddressType();
                }
                return this.contactAddress;
            }

        }

    }

}
