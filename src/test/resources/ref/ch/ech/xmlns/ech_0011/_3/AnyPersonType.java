
package ch.ech.xmlns.ech_0011._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0006._2.ResidencePermitType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anyPersonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="anyPersonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="swiss">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="placeOfOrigin" type="{http://www.ech.ch/xmlns/eCH-0011/3}placeOfOriginType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="foreigner">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="residencePermit" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitType"/>
 *                   <element name="residencePermitTill" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="nameOnPassport" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anyPersonType", propOrder = {
    "swiss",
    "foreigner"
})
public class AnyPersonType {

    protected AnyPersonType.Swiss swiss;
    protected AnyPersonType.Foreigner foreigner;

    /**
     * Gets the value of the swiss property.
     * 
     * @return
     *     possible object is
     *     {@link AnyPersonType.Swiss }
     *     
     */
    public AnyPersonType.Swiss getSwiss() {
        return swiss;
    }

    /**
     * Sets the value of the swiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyPersonType.Swiss }
     *     
     */
    public void setSwiss(AnyPersonType.Swiss value) {
        this.swiss = value;
    }

    public boolean isSetSwiss() {
        return (this.swiss!= null);
    }

    /**
     * Gets the value of the foreigner property.
     * 
     * @return
     *     possible object is
     *     {@link AnyPersonType.Foreigner }
     *     
     */
    public AnyPersonType.Foreigner getForeigner() {
        return foreigner;
    }

    /**
     * Sets the value of the foreigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyPersonType.Foreigner }
     *     
     */
    public void setForeigner(AnyPersonType.Foreigner value) {
        this.foreigner = value;
    }

    public boolean isSetForeigner() {
        return (this.foreigner!= null);
    }

    public AnyPersonType.Swiss swiss() {
        if (null == this.swiss) {
            this.swiss = new AnyPersonType.Swiss();
        }
        return this.swiss;
    }

    public AnyPersonType.Foreigner foreigner() {
        if (null == this.foreigner) {
            this.foreigner = new AnyPersonType.Foreigner();
        }
        return this.foreigner;
    }


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
     *         <element name="residencePermit" type="{http://www.ech.ch/xmlns/eCH-0006/2}residencePermitType"/>
     *         <element name="residencePermitTill" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="nameOnPassport" type="{http://www.ech.ch/xmlns/eCH-0044/1}baseNameType" minOccurs="0"/>
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
        "residencePermit",
        "residencePermitTill",
        "nameOnPassport"
    })
    public static class Foreigner {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResidencePermitType residencePermit;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar residencePermitTill;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String nameOnPassport;

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
         * Gets the value of the residencePermitTill property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResidencePermitTill() {
            return residencePermitTill;
        }

        /**
         * Sets the value of the residencePermitTill property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResidencePermitTill(XMLGregorianCalendar value) {
            this.residencePermitTill = value;
        }

        public boolean isSetResidencePermitTill() {
            return (this.residencePermitTill!= null);
        }

        /**
         * Gets the value of the nameOnPassport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameOnPassport() {
            return nameOnPassport;
        }

        /**
         * Sets the value of the nameOnPassport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameOnPassport(String value) {
            this.nameOnPassport = value;
        }

        public boolean isSetNameOnPassport() {
            return (this.nameOnPassport!= null);
        }

    }


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
     *         <element name="placeOfOrigin" type="{http://www.ech.ch/xmlns/eCH-0011/3}placeOfOriginType" maxOccurs="unbounded"/>
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
        "placeOfOrigin"
    })
    public static class Swiss {

        @XmlElement(required = true)
        protected List<PlaceOfOriginType> placeOfOrigin;

        /**
         * Gets the value of the placeOfOrigin property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeOfOrigin property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPlaceOfOrigin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceOfOriginType }
         * </p>
         * 
         * 
         * @return
         *     The value of the placeOfOrigin property.
         */
        public List<PlaceOfOriginType> getPlaceOfOrigin() {
            if (placeOfOrigin == null) {
                placeOfOrigin = new ArrayList<>();
            }
            return this.placeOfOrigin;
        }

        public boolean isSetPlaceOfOrigin() {
            return ((this.placeOfOrigin!= null)&&(!this.placeOfOrigin.isEmpty()));
        }

        public void unsetPlaceOfOrigin() {
            this.placeOfOrigin = null;
        }

        public PlaceOfOriginType placeOfOrigin() {
            PlaceOfOriginType newElement = new PlaceOfOriginType();
            getPlaceOfOrigin().add(newElement);
            return newElement;
        }

    }

}
