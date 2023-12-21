
package ch.ech.xmlns.ech_0006._2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for residencePermitCategoryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="residencePermitCategoryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="01"/>
 *     <enumeration value="02"/>
 *     <enumeration value="03"/>
 *     <enumeration value="04"/>
 *     <enumeration value="05"/>
 *     <enumeration value="06"/>
 *     <enumeration value="07"/>
 *     <enumeration value="08"/>
 *     <enumeration value="09"/>
 *     <enumeration value="10"/>
 *     <enumeration value="11"/>
 *     <enumeration value="12"/>
 *     <enumeration value="13"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    public static ResidencePermitCategoryType fromValue(String v) {
        for (ResidencePermitCategoryType c: ResidencePermitCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
