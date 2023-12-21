
package ch.ech.xmlns.ech_0011._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="reportetPerson" type="{http://www.ech.ch/xmlns/eCH-0011/3}reportedPersonType"/>
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
    "reportetPerson"
})
@XmlRootElement(name = "personRoot")
public class PersonRoot {

    @XmlElement(required = true)
    protected ReportedPersonType reportetPerson;

    /**
     * Gets the value of the reportetPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPersonType }
     *     
     */
    public ReportedPersonType getReportetPerson() {
        return reportetPerson;
    }

    /**
     * Sets the value of the reportetPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPersonType }
     *     
     */
    public void setReportetPerson(ReportedPersonType value) {
        this.reportetPerson = value;
    }

    public boolean isSetReportetPerson() {
        return (this.reportetPerson!= null);
    }

    public ReportedPersonType reportetPerson() {
        if (null == this.reportetPerson) {
            this.reportetPerson = new ReportedPersonType();
        }
        return this.reportetPerson;
    }

}
