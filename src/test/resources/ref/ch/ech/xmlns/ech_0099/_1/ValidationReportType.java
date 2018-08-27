
package ch.ech.xmlns.ech_0099._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0044._1.PersonIdentificationType;


/**
 * 
 *         Elemente dieses Typs sind die vom Bundesamt für Statistik im Fall der Validierung
 *         sowie Lieferung an die Statistik gelieferten Resultate.
 *       
 * 
 * <p>Java class for validationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validationReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalError" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="personError" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
 *                   &lt;element name="errorInfo" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="egidAttribution" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
 *                   &lt;element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EGIDType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="1.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

    protected List<ErrorInfoType> generalError;
    protected List<ValidationReportType.PersonError> personError;
    protected List<ValidationReportType.EgidAttribution> egidAttribution;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the generalError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInfoType }
     * 
     * 
     */
    public List<ErrorInfoType> getGeneralError() {
        if (generalError == null) {
            generalError = new ArrayList<ErrorInfoType>();
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
     * Gets the value of the personError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationReportType.PersonError }
     * 
     * 
     */
    public List<ValidationReportType.PersonError> getPersonError() {
        if (personError == null) {
            personError = new ArrayList<ValidationReportType.PersonError>();
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
     * Gets the value of the egidAttribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egidAttribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgidAttribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationReportType.EgidAttribution }
     * 
     * 
     */
    public List<ValidationReportType.EgidAttribution> getEgidAttribution() {
        if (egidAttribution == null) {
            egidAttribution = new ArrayList<ValidationReportType.EgidAttribution>();
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
     * Gets the value of the version property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
     *         &lt;element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/3}EGIDType"/&gt;
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
        "egid"
    })
    public static class EgidAttribution {

        @XmlElement(required = true)
        protected PersonIdentificationType personIdentification;
        @XmlElement(name = "EGID")
        @XmlSchemaType(name = "unsignedInt")
        protected long egid;

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
         * Gets the value of the egid property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/1}personIdentificationType"/&gt;
     *         &lt;element name="errorInfo" type="{http://www.ech.ch/xmlns/eCH-0099/1}errorInfoType" maxOccurs="unbounded"/&gt;
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
        "errorInfo"
    })
    public static class PersonError {

        @XmlElement(required = true)
        protected PersonIdentificationType personIdentification;
        @XmlElement(required = true)
        protected List<ErrorInfoType> errorInfo;

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
         * Gets the value of the errorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorInfoType }
         * 
         * 
         */
        public List<ErrorInfoType> getErrorInfo() {
            if (errorInfo == null) {
                errorInfo = new ArrayList<ErrorInfoType>();
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
