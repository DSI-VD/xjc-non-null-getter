
package ch.ech.xmlns.ech_0044._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for datePartiallyKnownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datePartiallyKnownType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="yearMonthDay" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="yearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datePartiallyKnownType", propOrder = {
    "yearMonthDay",
    "yearMonth",
    "year"
})
public class DatePartiallyKnownType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearMonthDay;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yearMonth;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;

    /**
     * Gets the value of the yearMonthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonthDay() {
        return yearMonthDay;
    }

    /**
     * Sets the value of the yearMonthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonthDay(XMLGregorianCalendar value) {
        this.yearMonthDay = value;
    }

    public boolean isSetYearMonthDay() {
        return (this.yearMonthDay!= null);
    }

    /**
     * Gets the value of the yearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonth() {
        return yearMonth;
    }

    /**
     * Sets the value of the yearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonth(XMLGregorianCalendar value) {
        this.yearMonth = value;
    }

    public boolean isSetYearMonth() {
        return (this.yearMonth!= null);
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    public boolean isSetYear() {
        return (this.year!= null);
    }

}
