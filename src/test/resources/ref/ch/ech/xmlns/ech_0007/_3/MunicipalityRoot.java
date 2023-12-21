
package ch.ech.xmlns.ech_0007._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <choice>
 *         <element name="swissMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissMunicipalityType"/>
 *         <element name="swissAndFlMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/3}swissAndFlMunicipalityType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swissMunicipality",
    "swissAndFlMunicipality"
})
@XmlRootElement(name = "municipalityRoot")
public class MunicipalityRoot {

    protected SwissMunicipalityType swissMunicipality;
    protected SwissAndFlMunicipalityType swissAndFlMunicipality;

    /**
     * Gets the value of the swissMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public SwissMunicipalityType getSwissMunicipality() {
        return swissMunicipality;
    }

    /**
     * Sets the value of the swissMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public void setSwissMunicipality(SwissMunicipalityType value) {
        this.swissMunicipality = value;
    }

    public boolean isSetSwissMunicipality() {
        return (this.swissMunicipality!= null);
    }

    /**
     * Gets the value of the swissAndFlMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public SwissAndFlMunicipalityType getSwissAndFlMunicipality() {
        return swissAndFlMunicipality;
    }

    /**
     * Sets the value of the swissAndFlMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public void setSwissAndFlMunicipality(SwissAndFlMunicipalityType value) {
        this.swissAndFlMunicipality = value;
    }

    public boolean isSetSwissAndFlMunicipality() {
        return (this.swissAndFlMunicipality!= null);
    }

    public SwissMunicipalityType swissMunicipality() {
        if (null == this.swissMunicipality) {
            this.swissMunicipality = new SwissMunicipalityType();
        }
        return this.swissMunicipality;
    }

    public SwissAndFlMunicipalityType swissAndFlMunicipality() {
        if (null == this.swissAndFlMunicipality) {
            this.swissAndFlMunicipality = new SwissAndFlMunicipalityType();
        }
        return this.swissAndFlMunicipality;
    }

}
