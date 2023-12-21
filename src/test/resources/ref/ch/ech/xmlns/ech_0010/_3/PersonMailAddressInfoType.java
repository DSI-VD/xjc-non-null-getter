
package ch.ech.xmlns.ech_0010._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for personMailAddressInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="personMailAddressInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mrMrs" type="{http://www.ech.ch/xmlns/eCH-0010/3}mrMrsType" minOccurs="0"/>
 *         <element name="title" type="{http://www.ech.ch/xmlns/eCH-0010/3}titleType" minOccurs="0"/>
 *         <element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0010/3}firstNameType" minOccurs="0"/>
 *         <element name="lastName" type="{http://www.ech.ch/xmlns/eCH-0010/3}lastNameType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personMailAddressInfoType", propOrder = {
    "mrMrs",
    "title",
    "firstName",
    "lastName"
})
public class PersonMailAddressInfoType {

    @XmlSchemaType(name = "token")
    protected MrMrsType mrMrs;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lastName;

    /**
     * Gets the value of the mrMrs property.
     * 
     * @return
     *     possible object is
     *     {@link MrMrsType }
     *     
     */
    public MrMrsType getMrMrs() {
        return mrMrs;
    }

    /**
     * Sets the value of the mrMrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MrMrsType }
     *     
     */
    public void setMrMrs(MrMrsType value) {
        this.mrMrs = value;
    }

    public boolean isSetMrMrs() {
        return (this.mrMrs!= null);
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
