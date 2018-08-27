
package ch.ech.xmlns.ech_0010._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for organisationMailAddressInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationMailAddressInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationName" type="{http://www.ech.ch/xmlns/eCH-0010/3}organisationNameType"/&gt;
 *         &lt;element name="organisationNameAddOn1" type="{http://www.ech.ch/xmlns/eCH-0010/3}organisationNameType" minOccurs="0"/&gt;
 *         &lt;element name="organisationNameAddOn2" type="{http://www.ech.ch/xmlns/eCH-0010/3}organisationNameType" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.ech.ch/xmlns/eCH-0010/3}titleType" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0010/3}firstNameType" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.ech.ch/xmlns/eCH-0010/3}lastNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationMailAddressInfoType", propOrder = {
    "organisationName",
    "organisationNameAddOn1",
    "organisationNameAddOn2",
    "title",
    "firstName",
    "lastName"
})
public class OrganisationMailAddressInfoType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationNameAddOn1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationNameAddOn2;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lastName;

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    public boolean isSetOrganisationName() {
        return (this.organisationName!= null);
    }

    /**
     * Gets the value of the organisationNameAddOn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNameAddOn1() {
        return organisationNameAddOn1;
    }

    /**
     * Sets the value of the organisationNameAddOn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNameAddOn1(String value) {
        this.organisationNameAddOn1 = value;
    }

    public boolean isSetOrganisationNameAddOn1() {
        return (this.organisationNameAddOn1 != null);
    }

    /**
     * Gets the value of the organisationNameAddOn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNameAddOn2() {
        return organisationNameAddOn2;
    }

    /**
     * Sets the value of the organisationNameAddOn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNameAddOn2(String value) {
        this.organisationNameAddOn2 = value;
    }

    public boolean isSetOrganisationNameAddOn2() {
        return (this.organisationNameAddOn2 != null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

}
