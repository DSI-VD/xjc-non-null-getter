
package ch.ech.xmlns.ech_0044._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for personIdentificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="personIdentificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="vn" type="{http://www.ech.ch/xmlns/eCH-0044/1}vnType" minOccurs="0"/>
 *         <element name="localPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType"/>
 *         <element name="OtherPersonId" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="EuPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="officialName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/>
 *         <element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType"/>
 *         <element name="sex" type="{http://www.ech.ch/xmlns/eCH-0044/1}sexType"/>
 *         <element name="dateOfBirth" type="{http://www.ech.ch/xmlns/eCH-0044/1}datePartiallyKnownType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPersonId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentificationType.OtherPersonId }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherPersonId property.
     */
    public List<PersonIdentificationType.OtherPersonId> getOtherPersonId() {
        if (otherPersonId == null) {
            otherPersonId = new ArrayList<>();
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euPersonId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEuPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedPersonIdType }
     * </p>
     * 
     * 
     * @return
     *     The value of the euPersonId property.
     */
    public List<NamedPersonIdType> getEuPersonId() {
        if (euPersonId == null) {
            euPersonId = new ArrayList<>();
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
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
