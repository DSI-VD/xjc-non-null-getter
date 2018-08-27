
package ch.ech.xmlns.ech_0011._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0044._1.NamedPersonIdType;


/**
 * <p>Java class for partnerIdOrganisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partnerIdOrganisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType"/&gt;
 *         &lt;element name="OtherPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/1}namedPersonIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerIdOrganisationType", propOrder = {
    "localPersonId",
    "otherPersonId"
})
public class PartnerIdOrganisationType {

    @XmlElement(required = true)
    protected NamedPersonIdType localPersonId;
    @XmlElement(name = "OtherPersonId")
    protected List<NamedPersonIdType> otherPersonId;

    /**
     * Gets the value of the localPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link NamedPersonIdType }
     *     
     */
    public NamedPersonIdType getLocalPersonId() {
        return localPersonId;
    }

    /**
     * Sets the value of the localPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPersonIdType }
     *     
     */
    public void setLocalPersonId(NamedPersonIdType value) {
        this.localPersonId = value;
    }

    public boolean isSetLocalPersonId() {
        return (this.localPersonId!= null);
    }

    /**
     * Gets the value of the otherPersonId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPersonId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedPersonIdType }
     * 
     * 
     */
    public List<NamedPersonIdType> getOtherPersonId() {
        if (otherPersonId == null) {
            otherPersonId = new ArrayList<NamedPersonIdType>();
        }
        return this.otherPersonId;
    }

    public boolean isSetOtherPersonId() {
        return ((this.otherPersonId!= null)&&(!this.otherPersonId.isEmpty()));
    }

    public void unsetOtherPersonId() {
        this.otherPersonId = null;
    }

    public NamedPersonIdType localPersonId() {
        if (null == this.localPersonId) {
            this.localPersonId = new NamedPersonIdType();
        }
        return this.localPersonId;
    }

    public NamedPersonIdType otherPersonId() {
        NamedPersonIdType newElement = new NamedPersonIdType();
        getOtherPersonId().add(newElement);
        return newElement;
    }

}
