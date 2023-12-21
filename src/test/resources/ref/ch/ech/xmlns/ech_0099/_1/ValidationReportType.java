
package ch.ech.xmlns.ech_0099._1;

import java.util.ArrayList;
import java.util.List;
import ch.ech.xmlns.ech_0044._1.PersonIdentificationType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Elemente dieses Typs sind die vom Bundesamt für Statistik im Fall der Validierung
 *         sowie Lieferung an die Statistik gelieferten Resultate.
 * 
 * <p>Java class for validationReportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="validationReportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="generalError" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="personError" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/>
 *                   <element name="errorInfo" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="egidAttribution" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/>
 *                   <element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EGIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="1.0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationReportType", propOrder = {
    "generalError",
    "personError",
    "egidAttribution"
})
public class ValidationReportType {

    /**
     * Auflistung der allgemeinen Fehler, die in dem angelieferten XML 
     *             Dokument gefunden wurden. Allgemeine Fehler beziehen sich nicht
     *             auf eine Person, sondern auf das angelieferte XML Dokument im Ganzen.
     * 
     */
    protected List<ErrorInfoType> generalError;
    /**
     * Auflistung der personenbezogenen Fehler, die in dem angelieferten XML 
     *             Dokument gefunden wurden. Personenbezogene Fehler beziehen sich auf
     *             eine konkrete Person.
     * 
     */
    protected List<ValidationReportType.PersonError> personError;
    /**
     * Zuteilung eines Gebäudeidentifikators (EGID) zu einer Person, deren
     *             Daten in dem angelieferten XML Dokument gefunden wurden.
     * 
     */
    protected List<ValidationReportType.EgidAttribution> egidAttribution;
    /**
     * Versionsnummer des XML Schemas, welches dieses Element beschreibt.
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Auflistung der allgemeinen Fehler, die in dem angelieferten XML 
     *             Dokument gefunden wurden. Allgemeine Fehler beziehen sich nicht
     *             auf eine Person, sondern auf das angelieferte XML Dokument im Ganzen.
     * 
     * Gets the value of the generalError property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalError property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeneralError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the generalError property.
     */
    public List<ErrorInfoType> getGeneralError() {
        if (generalError == null) {
            generalError = new ArrayList<>();
        }
        return this.generalError;
    }

    public boolean isSetGeneralError() {
        return ((this.generalError!= null)&&(!this.generalError.isEmpty()));
    }

    public void unsetGeneralError() {
        this.generalError = null;
    }

    /**
     * Auflistung der personenbezogenen Fehler, die in dem angelieferten XML 
     *             Dokument gefunden wurden. Personenbezogene Fehler beziehen sich auf
     *             eine konkrete Person.
     * 
     * Gets the value of the personError property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personError property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationReportType.PersonError }
     * </p>
     * 
     * 
     * @return
     *     The value of the personError property.
     */
    public List<ValidationReportType.PersonError> getPersonError() {
        if (personError == null) {
            personError = new ArrayList<>();
        }
        return this.personError;
    }

    public boolean isSetPersonError() {
        return ((this.personError!= null)&&(!this.personError.isEmpty()));
    }

    public void unsetPersonError() {
        this.personError = null;
    }

    /**
     * Zuteilung eines Gebäudeidentifikators (EGID) zu einer Person, deren
     *             Daten in dem angelieferten XML Dokument gefunden wurden.
     * 
     * Gets the value of the egidAttribution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egidAttribution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEgidAttribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationReportType.EgidAttribution }
     * </p>
     * 
     * 
     * @return
     *     The value of the egidAttribution property.
     */
    public List<ValidationReportType.EgidAttribution> getEgidAttribution() {
        if (egidAttribution == null) {
            egidAttribution = new ArrayList<>();
        }
        return this.egidAttribution;
    }

    public boolean isSetEgidAttribution() {
        return ((this.egidAttribution!= null)&&(!this.egidAttribution.isEmpty()));
    }

    public void unsetEgidAttribution() {
        this.egidAttribution = null;
    }

    /**
     * Versionsnummer des XML Schemas, welches dieses Element beschreibt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    public ErrorInfoType generalError() {
        ErrorInfoType newElement = new ErrorInfoType();
        getGeneralError().add(newElement);
        return newElement;
    }

    public ValidationReportType.PersonError personError() {
        ValidationReportType.PersonError newElement = new ValidationReportType.PersonError();
        getPersonError().add(newElement);
        return newElement;
    }

    public ValidationReportType.EgidAttribution egidAttribution() {
        ValidationReportType.EgidAttribution newElement = new ValidationReportType.EgidAttribution();
        getEgidAttribution().add(newElement);
        return newElement;
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
     *         <element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/>
     *         <element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EGIDType"/>
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
        "personIdentification",
        "egid"
    })
    public static class EgidAttribution {

        /**
         * Identifikation der Person, auf welche sich diese Zuteilung bezieht.
         * 
         */
        @XmlElement(required = true)
        protected PersonIdentificationType personIdentification;
        /**
         * Gebäudeidentifikator, der vom BFS zugeteilt wurde.
         * 
         */
        @XmlElement(name = "EGID")
        @XmlSchemaType(name = "unsignedInt")
        protected long egid;

        /**
         * Identifikation der Person, auf welche sich diese Zuteilung bezieht.
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
         * @see #getPersonIdentification()
         */
        public void setPersonIdentification(PersonIdentificationType value) {
            this.personIdentification = value;
        }

        public boolean isSetPersonIdentification() {
            return (this.personIdentification!= null);
        }

        /**
         * Gebäudeidentifikator, der vom BFS zugeteilt wurde.
         * 
         */
        public long getEGID() {
            return egid;
        }

        /**
         * Sets the value of the egid property.
         * 
         */
        public void setEGID(long value) {
            this.egid = value;
        }

        public boolean isSetEGID() {
            return true;
        }

        public PersonIdentificationType personIdentification() {
            if (null == this.personIdentification) {
                this.personIdentification = new PersonIdentificationType();
            }
            return this.personIdentification;
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
     *         <element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/>
     *         <element name="errorInfo" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded"/>
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
        "personIdentification",
        "errorInfo"
    })
    public static class PersonError {

        /**
         * Identifikation der Person, auf welche sich der Fehler bezieht.
         * 
         */
        @XmlElement(required = true)
        protected PersonIdentificationType personIdentification;
        /**
         * Informationen über den Fehler, der für diese Person gefunden wurde.
         * 
         */
        @XmlElement(required = true)
        protected List<ErrorInfoType> errorInfo;

        /**
         * Identifikation der Person, auf welche sich der Fehler bezieht.
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
         * @see #getPersonIdentification()
         */
        public void setPersonIdentification(PersonIdentificationType value) {
            this.personIdentification = value;
        }

        public boolean isSetPersonIdentification() {
            return (this.personIdentification!= null);
        }

        /**
         * Informationen über den Fehler, der für diese Person gefunden wurde.
         * 
         * Gets the value of the errorInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getErrorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorInfoType }
         * </p>
         * 
         * 
         * @return
         *     The value of the errorInfo property.
         */
        public List<ErrorInfoType> getErrorInfo() {
            if (errorInfo == null) {
                errorInfo = new ArrayList<>();
            }
            return this.errorInfo;
        }

        public boolean isSetErrorInfo() {
            return ((this.errorInfo!= null)&&(!this.errorInfo.isEmpty()));
        }

        public void unsetErrorInfo() {
            this.errorInfo = null;
        }

        public PersonIdentificationType personIdentification() {
            if (null == this.personIdentification) {
                this.personIdentification = new PersonIdentificationType();
            }
            return this.personIdentification;
        }

        public ErrorInfoType errorInfo() {
            ErrorInfoType newElement = new ErrorInfoType();
            getErrorInfo().add(newElement);
            return newElement;
        }

    }

}
