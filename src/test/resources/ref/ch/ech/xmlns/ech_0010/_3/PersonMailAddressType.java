
package ch.ech.xmlns.ech_0010._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personMailAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="personMailAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/3}personMailAddressInfoType"/>
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
@XmlType(name = "personMailAddressType", propOrder = {
    "person",
    "addressInformation"
})
public class PersonMailAddressType {

    @XmlElement(required = true)
    protected PersonMailAddressInfoType person;
    @XmlElement(required = true)
    protected AddressInformationType addressInformation;

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
