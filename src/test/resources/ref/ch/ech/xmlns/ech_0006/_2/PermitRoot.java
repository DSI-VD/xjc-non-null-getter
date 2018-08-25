
package ch.ech.xmlns.ech_0006._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="residencePermitCategory" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermitRuling" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitRulingType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermitBorder" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitBorderType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermitShortType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitShortType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermit" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitType" minOccurs="0"/&gt;
 *         &lt;element name="inhabitantControl" type="{http://www.ech.ch/xmlns/eCH-0006/2}inhabitantControlType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermitDetailedType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitDetailedType" minOccurs="0"/&gt;
 *         &lt;element name="residencePermitToBeRegisteredType" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitToBeRegisteredType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * Obtient la valeur de la propriété residencePermitCategory.
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
     * Définit la valeur de la propriété residencePermitCategory.
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
     * Obtient la valeur de la propriété residencePermitRuling.
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
     * Définit la valeur de la propriété residencePermitRuling.
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
     * Obtient la valeur de la propriété residencePermitBorder.
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
     * Définit la valeur de la propriété residencePermitBorder.
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
     * Obtient la valeur de la propriété residencePermitShortType.
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
     * Définit la valeur de la propriété residencePermitShortType.
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
     * Obtient la valeur de la propriété residencePermit.
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
     * Définit la valeur de la propriété residencePermit.
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
     * Obtient la valeur de la propriété inhabitantControl.
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
     * Définit la valeur de la propriété inhabitantControl.
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
     * Obtient la valeur de la propriété residencePermitDetailedType.
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
     * Définit la valeur de la propriété residencePermitDetailedType.
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
     * Obtient la valeur de la propriété residencePermitToBeRegisteredType.
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
     * Définit la valeur de la propriété residencePermitToBeRegisteredType.
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
