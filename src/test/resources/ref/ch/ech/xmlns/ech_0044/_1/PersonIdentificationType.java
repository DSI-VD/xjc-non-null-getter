
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
 * <p>Classe Java pour personIdentificationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personIdentificationType"&gt;
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
 *         &lt;element name="EuPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="officialName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/&gt;
 *         &lt;element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/&gt;
 *         &lt;element name="sex" type="{http://www.ech.ch/xmlns/eCH-0044/1}sexType"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.ech.ch/xmlns/eCH-0044/1}datePartiallyKnownType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personIdentificationType", propOrder = {
    "vn",
    "localPersonId",
    "otherPersonId",
    "euPersonId",
    "officialName",
    "firstName",
    "sex",
    "dateOfBirth"
})
public class PersonIdentificationType {

    @XmlSchemaType(name = "unsignedLong")
    protected Long vn;
    @XmlElement(required = true)
    protected NamedPersonIdType localPersonId;
    @XmlElement(name = "OtherPersonId")
    protected List<PersonIdentificationType.OtherPersonId> otherPersonId;
    @XmlElement(name = "EuPersonId")
    protected List<NamedPersonIdType> euPersonId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String officialName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SexType sex;
    @XmlElement(required = true)
    protected DatePartiallyKnownType dateOfBirth;

    /**
     * Obtient la valeur de la propriété vn.
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
     * Définit la valeur de la propriété vn.
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
     * Obtient la valeur de la propriété localPersonId.
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
     * Définit la valeur de la propriété localPersonId.
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
     * {@link PersonIdentificationType.OtherPersonId }
     * 
     * 
     */
    public List<PersonIdentificationType.OtherPersonId> getOtherPersonId() {
        if (otherPersonId == null) {
            otherPersonId = new ArrayList<PersonIdentificationType.OtherPersonId>();
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
     * Gets the value of the euPersonId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euPersonId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEuPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedPersonIdType }
     * 
     * 
     */
    public List<NamedPersonIdType> getEuPersonId() {
        if (euPersonId == null) {
            euPersonId = new ArrayList<NamedPersonIdType>();
        }
        return this.euPersonId;
    }

    public boolean isSetEuPersonId() {
        return ((this.euPersonId!= null)&&(!this.euPersonId.isEmpty()));
    }

    public void unsetEuPersonId() {
        this.euPersonId = null;
    }

    /**
     * Obtient la valeur de la propriété officialName.
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
     * Définit la valeur de la propriété officialName.
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
     * Obtient la valeur de la propriété firstName.
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
     * Définit la valeur de la propriété firstName.
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
     * Obtient la valeur de la propriété sex.
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
     * Définit la valeur de la propriété sex.
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
     * Obtient la valeur de la propriété dateOfBirth.
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
     * Définit la valeur de la propriété dateOfBirth.
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

    public PersonIdentificationType.OtherPersonId otherPersonId() {
        PersonIdentificationType.OtherPersonId newElement = new PersonIdentificationType.OtherPersonId();
        getOtherPersonId().add(newElement);
        return newElement;
    }

    public NamedPersonIdType euPersonId() {
        NamedPersonIdType newElement = new NamedPersonIdType();
        getEuPersonId().add(newElement);
        return newElement;
    }

    public DatePartiallyKnownType dateOfBirth() {
        if (null == this.dateOfBirth) {
            this.dateOfBirth = new DatePartiallyKnownType();
        }
        return this.dateOfBirth;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
