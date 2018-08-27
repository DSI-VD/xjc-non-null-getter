
package ch.ech.xmlns.ech_0010._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/3}organisationMailAddressInfoType"/&gt;
 *           &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/3}personMailAddressInfoType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/3}addressInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailAddressType", propOrder = {
    "organisation",
    "person",
    "addressInformation"
})
public class MailAddressType {

    protected OrganisationMailAddressInfoType organisation;
    protected PersonMailAddressInfoType person;
    @XmlElement(required = true)
    protected AddressInformationType addressInformation;

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public OrganisationMailAddressInfoType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public void setOrganisation(OrganisationMailAddressInfoType value) {
        this.organisation = value;
    }

    public boolean isSetOrganisation() {
        return (this.organisation!= null);
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public PersonMailAddressInfoType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public void setPerson(PersonMailAddressInfoType value) {
        this.person = value;
    }

    public boolean isSetPerson() {
        return (this.person!= null);
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

    public boolean isSetAddressInformation() {
        return (this.addressInformation!= null);
    }

    public OrganisationMailAddressInfoType organisation() {
        if (null == this.organisation) {
            this.organisation = new OrganisationMailAddressInfoType();
        }
        return this.organisation;
    }

    public PersonMailAddressInfoType person() {
        if (null == this.person) {
            this.person = new PersonMailAddressInfoType();
        }
        return this.person;
    }

    public AddressInformationType addressInformation() {
        if (null == this.addressInformation) {
            this.addressInformation = new AddressInformationType();
        }
        return this.addressInformation;
    }

}
