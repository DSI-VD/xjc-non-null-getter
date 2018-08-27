
package ch.ech.xmlns.ech_0006._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for residencePermitCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="residencePermitCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="13"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "residencePermitCategoryType")
@XmlEnum
public enum ResidencePermitCategoryType {

    @XmlEnumValue("01")
    VALUE_1("01"),
    @XmlEnumValue("02")
    VALUE_2("02"),
    @XmlEnumValue("03")
    VALUE_3("03"),
    @XmlEnumValue("04")
    VALUE_4("04"),
    @XmlEnumValue("05")
    VALUE_5("05"),
    @XmlEnumValue("06")
    VALUE_6("06"),
    @XmlEnumValue("07")
    VALUE_7("07"),
    @XmlEnumValue("08")
    VALUE_8("08"),
    @XmlEnumValue("09")
    VALUE_9("09"),
    @XmlEnumValue("10")
    VALUE_10("10"),
    @XmlEnumValue("11")
    VALUE_11("11"),
    @XmlEnumValue("12")
    VALUE_12("12"),
    @XmlEnumValue("13")
    VALUE_13("13");
    private final String value;

    ResidencePermitCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidencePermitCategoryType fromValue(String v) {
        for (ResidencePermitCategoryType c: ResidencePermitCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
