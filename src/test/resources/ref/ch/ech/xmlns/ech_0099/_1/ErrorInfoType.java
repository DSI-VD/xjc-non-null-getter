
package ch.ech.xmlns.ech_0099._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="errorInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorInfoType", propOrder = {
    "code",
    "text"
})
public class ErrorInfoType {

    /**
     * Nummerischer Code des Fehlers. Der Wertebereich und die Bedeutung 
     *             dieser Codes sind in einem anderen Dokument spezifiziert.
     * 
     */
    @XmlElement(required = true)
    protected String code;
    /**
     * Textuelle Beschreibung des Fehlers. Die Bedeutung ist in einem anderen 
     *             Dokument spezifiziert.
     * 
     */
    @XmlElement(required = true)
    protected String text;

    /**
     * Nummerischer Code des Fehlers. Der Wertebereich und die Bedeutung 
     *             dieser Codes sind in einem anderen Dokument spezifiziert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code!= null);
    }

    /**
     * Textuelle Beschreibung des Fehlers. Die Bedeutung ist in einem anderen 
     *             Dokument spezifiziert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

    public boolean isSetText() {
        return (this.text!= null);
    }

}
