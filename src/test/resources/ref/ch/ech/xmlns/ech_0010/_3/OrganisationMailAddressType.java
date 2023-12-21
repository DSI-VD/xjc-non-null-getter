
package ch.ech.xmlns.ech_0010._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organisationMailAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="organisationMailAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/3}organisationMailAddressInfoType"/>
 *         <element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/3}addressInformationType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationMailAddressType", propOrder = {
    "organisation",
    "addressInformation"
})
public class OrganisationMailAddressType {

    @XmlElement(required = true)
    protected OrganisationMailAddressInfoType organisation;
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

    public AddressInformationType addressInformation() {
        if (null == this.addressInformation) {
            this.addressInformation = new AddressInformationType();
        }
        return this.addressInformation;
    }

}
