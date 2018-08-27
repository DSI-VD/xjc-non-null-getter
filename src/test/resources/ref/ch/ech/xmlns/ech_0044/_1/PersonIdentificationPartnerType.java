
package ch.ech.xmlns.ech_0044._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for personIdentificationPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personIdentificationPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vn" type="{http://www.ech.ch/xmlns/eCH-0044/1}vnType" minOccurs="0"/&gt;
 *         &lt;element name="localPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType"/&gt;
 *         &lt;element name="OtherPersonId" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="officialName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/&gt;
 *         &lt;element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/&gt;
 *         &lt;element name="sex" type="{http://www.ech.ch/xmlns/eCH-0044/1}sexType" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.ech.ch/xmlns/eCH-0044/1}datePartiallyKnownType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personIdentificationPartnerType", propOrder = {
    "vn",
    "localPersonId",
    "otherPersonId",
    "officialName",
    "firstName",
    "sex",
    "dateOfBirth"
})
public class PersonIdentificationPartnerType {

    @XmlSchemaType(name = "unsignedLong")
    protected Long vn;
    @XmlElement(required = true)
    protected NamedPersonIdType localPersonId;
    @XmlElement(name = "OtherPersonId")
    protected List<PersonIdentificationPartnerType.OtherPersonId> otherPersonId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String officialName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlSchemaType(name = "string")
    protected SexType sex;
    protected DatePartiallyKnownType dateOfBirth;

    /**
     * Gets the value of the vn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVn() {
        return vn;
    }

    /**
     * Sets the value of the vn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVn(Long value) {
        this.vn = value;
    }

    public boolean isSetVn() {
        return (this.vn!= null);
    }

    /**
     * Gets the value of the localPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link NamedPersonIdType }
     *     
     */
    public NamedPersonIdType getLocalPersonId() {
        return localPersonId;
    }

    /**
     * Sets the value of the localPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPersonIdType }
     *     
     */
    public void setLocalPersonId(NamedPersonIdType value) {
        this.localPersonId = value;
    }

    public boolean isSetLocalPersonId() {
        return (this.localPersonId!= null);
    }

    /**
     * Gets the value of the otherPersonId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPersonId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentificationPartnerType.OtherPersonId }
     * 
     * 
     */
    public List<PersonIdentificationPartnerType.OtherPersonId> getOtherPersonId() {
        if (otherPersonId == null) {
            otherPersonId = new ArrayList<PersonIdentificationPartnerType.OtherPersonId>();
        }
        return this.otherPersonId;
    }

    public boolean isSetOtherPersonId() {
        return ((this.otherPersonId!= null)&&(!this.otherPersonId.isEmpty()));
    }

    public void unsetOtherPersonId() {
        this.otherPersonId = null;
    }

    /**
     * Gets the value of the officialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialName() {
        return officialName;
    }

    /**
     * Sets the value of the officialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialName(String value) {
        this.officialName = value;
    }

    public boolean isSetOfficialName() {
        return (this.officialName!= null);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    public boolean isSetSex() {
        return (this.sex!= null);
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setDateOfBirth(DatePartiallyKnownType value) {
        this.dateOfBirth = value;
    }

    public boolean isSetDateOfBirth() {
        return (this.dateOfBirth!= null);
    }

    public NamedPersonIdType localPersonId() {
        if (null == this.localPersonId) {
            this.localPersonId = new NamedPersonIdType();
        }
        return this.localPersonId;
    }

    public PersonIdentificationPartnerType.OtherPersonId otherPersonId() {
        PersonIdentificationPartnerType.OtherPersonId newElement = new PersonIdentificationPartnerType.OtherPersonId();
        getOtherPersonId().add(newElement);
        return newElement;
    }

    public DatePartiallyKnownType dateOfBirth() {
        if (null == this.dateOfBirth) {
            this.dateOfBirth = new DatePartiallyKnownType();
        }
        return this.dateOfBirth;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OtherPersonId
        extends NamedPersonIdType
    {


    }

}
