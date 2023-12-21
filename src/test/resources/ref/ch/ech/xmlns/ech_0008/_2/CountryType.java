
package ch.ech.xmlns.ech_0008._2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for countryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="countryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="countryId" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryIdType" minOccurs="0"/>
 *         <element name="countryIdISO2" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryIdISO2Type" minOccurs="0"/>
 *         <element name="countryNameShort" type="{http://www.ech.ch/xmlns/eCH-0008/2}countryNameShortType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryType", propOrder = {
    "countryId",
    "countryIdISO2",
    "countryNameShort"
})
public class CountryType {

    @XmlSchemaType(name = "integer")
    protected Integer countryId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryIdISO2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryNameShort;

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryId(Integer value) {
        this.countryId = value;
    }

    public boolean isSetCountryId() {
        return (this.countryId!= null);
    }

    /**
     * Gets the value of the countryIdISO2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIdISO2() {
        return countryIdISO2;
    }

    /**
     * Sets the value of the countryIdISO2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIdISO2(String value) {
        this.countryIdISO2 = value;
    }

    public boolean isSetCountryIdISO2() {
        return (this.countryIdISO2 != null);
    }

    /**
     * Gets the value of the countryNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameShort() {
        return countryNameShort;
    }

    /**
     * Sets the value of the countryNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameShort(String value) {
        this.countryNameShort = value;
    }

    public boolean isSetCountryNameShort() {
        return (this.countryNameShort!= null);
    }

}
