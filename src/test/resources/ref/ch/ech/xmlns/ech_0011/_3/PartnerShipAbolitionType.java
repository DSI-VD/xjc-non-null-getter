
package ch.ech.xmlns.ech_0011._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for partnerShipAbolitionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="partnerShipAbolitionType">
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
@XmlType(name = "partnerShipAbolitionType")
@XmlEnum
public enum PartnerShipAbolitionType {

    @XmlEnumValue("1")
    VALUE_1("1"),
    @XmlEnumValue("2")
    VALUE_2("2"),
    @XmlEnumValue("3")
    VALUE_3("3"),
    @XmlEnumValue("4")
    VALUE_4("4"),
    @XmlEnumValue("9")
    VALUE_5("9");
    private final String value;

    PartnerShipAbolitionType(String v) {
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
    public static PartnerShipAbolitionType fromValue(String v) {
        for (PartnerShipAbolitionType c: PartnerShipAbolitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
