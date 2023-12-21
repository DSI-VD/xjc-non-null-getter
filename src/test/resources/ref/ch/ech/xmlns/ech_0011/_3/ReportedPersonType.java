
package ch.ech.xmlns.ech_0011._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportedPersonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="reportedPersonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="person" type="{http://www.ech.ch/xmlns/eCH-0011/3}personType"/>
 *         <element name="anyPerson" type="{http://www.ech.ch/xmlns/eCH-0011/3}anyPersonType"/>
 *         <choice>
 *           <element name="hasMainResidence" type="{http://www.ech.ch/xmlns/eCH-0011/3}mainResidenceType"/>
 *           <element name="hasSecondaryResidence" type="{http://www.ech.ch/xmlns/eCH-0011/3}secondaryResidenceType"/>
 *           <element name="hasOtherResidence" type="{http://www.ech.ch/xmlns/eCH-0011/3}otherResidenceType"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportedPersonType", propOrder = {
    "person",
    "anyPerson",
    "hasMainResidence",
    "hasSecondaryResidence",
    "hasOtherResidence"
})
public class ReportedPersonType {

    @XmlElement(required = true)
    protected PersonType person;
    @XmlElement(required = true)
    protected AnyPersonType anyPerson;
    protected MainResidenceType hasMainResidence;
    protected SecondaryResidenceType hasSecondaryResidence;
    protected OtherResidenceType hasOtherResidence;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    public boolean isSetPerson() {
        return (this.person!= null);
    }

    /**
     * Gets the value of the anyPerson property.
     * 
     * @return
     *     possible object is
     *     {@link AnyPersonType }
     *     
     */
    public AnyPersonType getAnyPerson() {
        return anyPerson;
    }

    /**
     * Sets the value of the anyPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyPersonType }
     *     
     */
    public void setAnyPerson(AnyPersonType value) {
        this.anyPerson = value;
    }

    public boolean isSetAnyPerson() {
        return (this.anyPerson!= null);
    }

    /**
     * Gets the value of the hasMainResidence property.
     * 
     * @return
     *     possible object is
     *     {@link MainResidenceType }
     *     
     */
    public MainResidenceType getHasMainResidence() {
        return hasMainResidence;
    }

    /**
     * Sets the value of the hasMainResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainResidenceType }
     *     
     */
    public void setHasMainResidence(MainResidenceType value) {
        this.hasMainResidence = value;
    }

    public boolean isSetHasMainResidence() {
        return (this.hasMainResidence!= null);
    }

    /**
     * Gets the value of the hasSecondaryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryResidenceType }
     *     
     */
    public SecondaryResidenceType getHasSecondaryResidence() {
        return hasSecondaryResidence;
    }

    /**
     * Sets the value of the hasSecondaryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryResidenceType }
     *     
     */
    public void setHasSecondaryResidence(SecondaryResidenceType value) {
        this.hasSecondaryResidence = value;
    }

    public boolean isSetHasSecondaryResidence() {
        return (this.hasSecondaryResidence!= null);
    }

    /**
     * Gets the value of the hasOtherResidence property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResidenceType }
     *     
     */
    public OtherResidenceType getHasOtherResidence() {
        return hasOtherResidence;
    }

    /**
     * Sets the value of the hasOtherResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResidenceType }
     *     
     */
    public void setHasOtherResidence(OtherResidenceType value) {
        this.hasOtherResidence = value;
    }

    public boolean isSetHasOtherResidence() {
        return (this.hasOtherResidence!= null);
    }

    public PersonType person() {
        if (null == this.person) {
            this.person = new PersonType();
        }
        return this.person;
    }

    public AnyPersonType anyPerson() {
        if (null == this.anyPerson) {
            this.anyPerson = new AnyPersonType();
        }
        return this.anyPerson;
    }

    public MainResidenceType hasMainResidence() {
        if (null == this.hasMainResidence) {
            this.hasMainResidence = new MainResidenceType();
        }
        return this.hasMainResidence;
    }

    public SecondaryResidenceType hasSecondaryResidence() {
        if (null == this.hasSecondaryResidence) {
            this.hasSecondaryResidence = new SecondaryResidenceType();
        }
        return this.hasSecondaryResidence;
    }

    public OtherResidenceType hasOtherResidence() {
        if (null == this.hasOtherResidence) {
            this.hasOtherResidence = new OtherResidenceType();
        }
        return this.hasOtherResidence;
    }

}
