
package ch.ech.xmlns.ech_0006._2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="residencePermitCategory" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitCategoryType" minOccurs="0"/>
 *         <element name="residencePermitRuling" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitRulingType" minOccurs="0"/>
 *         <element name="residencePermitBorder" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitBorderType" minOccurs="0"/>
 *         <element name="residencePermitShortType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitShortType" minOccurs="0"/>
 *         <element name="residencePermit" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitType" minOccurs="0"/>
 *         <element name="inhabitantControl" type="{http://www.ech.ch/xmlns/eCH-0006/2}inhabitantControlType" minOccurs="0"/>
 *         <element name="residencePermitDetailedType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitDetailedType" minOccurs="0"/>
 *         <element name="residencePermitToBeRegisteredType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitToBeRegisteredType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "residencePermitCategory",
    "residencePermitRuling",
    "residencePermitBorder",
    "residencePermitShortType",
    "residencePermit",
    "inhabitantControl",
    "residencePermitDetailedType",
    "residencePermitToBeRegisteredType"
})
@XmlRootElement(name = "permitRoot")
public class PermitRoot {

    @XmlSchemaType(name = "string")
    protected ResidencePermitCategoryType residencePermitCategory;
    @XmlSchemaType(name = "string")
    protected ResidencePermitRulingType residencePermitRuling;
    @XmlSchemaType(name = "string")
    protected ResidencePermitBorderType residencePermitBorder;
    @XmlSchemaType(name = "string")
    protected ResidencePermitShortType residencePermitShortType;
    @XmlSchemaType(name = "string")
    protected ResidencePermitType residencePermit;
    @XmlSchemaType(name = "string")
    protected InhabitantControlType inhabitantControl;
    @XmlSchemaType(name = "string")
    protected ResidencePermitDetailedType residencePermitDetailedType;
    @XmlSchemaType(name = "string")
    protected ResidencePermitToBeRegisteredType residencePermitToBeRegisteredType;

    /**
     * Gets the value of the residencePermitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitCategoryType }
     *     
     */
    public ResidencePermitCategoryType getResidencePermitCategory() {
        return residencePermitCategory;
    }

    /**
     * Sets the value of the residencePermitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitCategoryType }
     *     
     */
    public void setResidencePermitCategory(ResidencePermitCategoryType value) {
        this.residencePermitCategory = value;
    }

    public boolean isSetResidencePermitCategory() {
        return (this.residencePermitCategory!= null);
    }

    /**
     * Gets the value of the residencePermitRuling property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitRulingType }
     *     
     */
    public ResidencePermitRulingType getResidencePermitRuling() {
        return residencePermitRuling;
    }

    /**
     * Sets the value of the residencePermitRuling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitRulingType }
     *     
     */
    public void setResidencePermitRuling(ResidencePermitRulingType value) {
        this.residencePermitRuling = value;
    }

    public boolean isSetResidencePermitRuling() {
        return (this.residencePermitRuling!= null);
    }

    /**
     * Gets the value of the residencePermitBorder property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitBorderType }
     *     
     */
    public ResidencePermitBorderType getResidencePermitBorder() {
        return residencePermitBorder;
    }

    /**
     * Sets the value of the residencePermitBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitBorderType }
     *     
     */
    public void setResidencePermitBorder(ResidencePermitBorderType value) {
        this.residencePermitBorder = value;
    }

    public boolean isSetResidencePermitBorder() {
        return (this.residencePermitBorder!= null);
    }

    /**
     * Gets the value of the residencePermitShortType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitShortType }
     *     
     */
    public ResidencePermitShortType getResidencePermitShortType() {
        return residencePermitShortType;
    }

    /**
     * Sets the value of the residencePermitShortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitShortType }
     *     
     */
    public void setResidencePermitShortType(ResidencePermitShortType value) {
        this.residencePermitShortType = value;
    }

    public boolean isSetResidencePermitShortType() {
        return (this.residencePermitShortType!= null);
    }

    /**
     * Gets the value of the residencePermit property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitType }
     *     
     */
    public ResidencePermitType getResidencePermit() {
        return residencePermit;
    }

    /**
     * Sets the value of the residencePermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitType }
     *     
     */
    public void setResidencePermit(ResidencePermitType value) {
        this.residencePermit = value;
    }

    public boolean isSetResidencePermit() {
        return (this.residencePermit!= null);
    }

    /**
     * Gets the value of the inhabitantControl property.
     * 
     * @return
     *     possible object is
     *     {@link InhabitantControlType }
     *     
     */
    public InhabitantControlType getInhabitantControl() {
        return inhabitantControl;
    }

    /**
     * Sets the value of the inhabitantControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhabitantControlType }
     *     
     */
    public void setInhabitantControl(InhabitantControlType value) {
        this.inhabitantControl = value;
    }

    public boolean isSetInhabitantControl() {
        return (this.inhabitantControl!= null);
    }

    /**
     * Gets the value of the residencePermitDetailedType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitDetailedType }
     *     
     */
    public ResidencePermitDetailedType getResidencePermitDetailedType() {
        return residencePermitDetailedType;
    }

    /**
     * Sets the value of the residencePermitDetailedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitDetailedType }
     *     
     */
    public void setResidencePermitDetailedType(ResidencePermitDetailedType value) {
        this.residencePermitDetailedType = value;
    }

    public boolean isSetResidencePermitDetailedType() {
        return (this.residencePermitDetailedType!= null);
    }

    /**
     * Gets the value of the residencePermitToBeRegisteredType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitToBeRegisteredType }
     *     
     */
    public ResidencePermitToBeRegisteredType getResidencePermitToBeRegisteredType() {
        return residencePermitToBeRegisteredType;
    }

    /**
     * Sets the value of the residencePermitToBeRegisteredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitToBeRegisteredType }
     *     
     */
    public void setResidencePermitToBeRegisteredType(ResidencePermitToBeRegisteredType value) {
        this.residencePermitToBeRegisteredType = value;
    }

    public boolean isSetResidencePermitToBeRegisteredType() {
        return (this.residencePermitToBeRegisteredType!= null);
    }

}
