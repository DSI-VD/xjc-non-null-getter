
package ch.ech.xmlns.ech_0011._3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maritalDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="maritalDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="maritalStatus" type="{http://www.ech.ch/xmlns/eCH-0011/3}maritalStatusType"/>
 *         <element name="dateOfMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="separation" type="{http://www.ech.ch/xmlns/eCH-0011/3}separationType" minOccurs="0"/>
 *         <element name="dateOfSeparation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="cancelationReason" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="1"/>
 *               <enumeration value="2"/>
 *               <enumeration value="3"/>
 *               <enumeration value="4"/>
 *               <enumeration value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maritalDataType", propOrder = {
    "maritalStatus",
    "dateOfMaritalStatus",
    "separation",
    "dateOfSeparation",
    "cancelationReason"
})
public class MaritalDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MaritalStatusType maritalStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfMaritalStatus;
    @XmlSchemaType(name = "string")
    protected SeparationType separation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSeparation;
    protected MaritalDataType.CancellationReason cancelationReason;

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusType }
     *     
     */
    public MaritalStatusType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusType }
     *     
     */
    public void setMaritalStatus(MaritalStatusType value) {
        this.maritalStatus = value;
    }

    public boolean isSetMaritalStatus() {
        return (this.maritalStatus!= null);
    }

    /**
     * Gets the value of the dateOfMaritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfMaritalStatus() {
        return dateOfMaritalStatus;
    }

    /**
     * Sets the value of the dateOfMaritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfMaritalStatus(XMLGregorianCalendar value) {
        this.dateOfMaritalStatus = value;
    }

    public boolean isSetDateOfMaritalStatus() {
        return (this.dateOfMaritalStatus!= null);
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link SeparationType }
     *     
     */
    public SeparationType getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparationType }
     *     
     */
    public void setSeparation(SeparationType value) {
        this.separation = value;
    }

    public boolean isSetSeparation() {
        return (this.separation!= null);
    }

    /**
     * Gets the value of the dateOfSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSeparation() {
        return dateOfSeparation;
    }

    /**
     * Sets the value of the dateOfSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSeparation(XMLGregorianCalendar value) {
        this.dateOfSeparation = value;
    }

    public boolean isSetDateOfSeparation() {
        return (this.dateOfSeparation!= null);
    }

    /**
     * Gets the value of the cancelationReason property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalDataType.CancellationReason }
     *     
     */
    public MaritalDataType.CancellationReason getCancelationReason() {
        return cancelationReason;
    }

    /**
     * Sets the value of the cancelationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalDataType.CancellationReason }
     *     
     */
    public void setCancelationReason(MaritalDataType.CancellationReason value) {
        this.cancelationReason = value;
    }

    public boolean isSetCancelationReason() {
        return (this.cancelationReason!= null);
    }


    /**
     * <p>Java class for null</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * <pre>{@code
     * <simpleType>
     *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     <enumeration value="1"/>
     *     <enumeration value="2"/>
     *     <enumeration value="3"/>
     *     <enumeration value="4"/>
     *     <enumeration value="9"/>
     *   </restriction>
     * </simpleType>
     * }</pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum CancellationReason {

        @XmlEnumValue("1")
        E1_dissous_judiciairement("1"),
        @XmlEnumValue("2")
        E2_annulation("2"),
        @XmlEnumValue("3")
        E3_disparition("3"),
        @XmlEnumValue("4")
        E4_deces("4"),
        @XmlEnumValue("9")
        E9_inconnu_autre("9");
        private final String value;

        CancellationReason(String v) {
            value = v;
        }

        /**
         * Gets the value associated to the enum constant.
         * 
         * @return
         *     The value linked to the enum.
         */
        public String value() {
            return value;
        }

        /**
         * Gets the enum associated to the value passed as parameter.
         * 
         * @param v
         *     The value to get the enum from.
         * @return
         *     The enum which corresponds to the value, if it exists.
         * @throws IllegalArgumentException
         *     If no value matches in the enum declaration.
         */
        public static MaritalDataType.CancellationReason fromValue(String v) {
            for (MaritalDataType.CancellationReason c: MaritalDataType.CancellationReason.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
