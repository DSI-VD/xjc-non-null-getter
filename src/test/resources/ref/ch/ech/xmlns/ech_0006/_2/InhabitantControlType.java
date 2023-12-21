
package ch.ech.xmlns.ech_0006._2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for inhabitantControlType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="inhabitantControlType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="0102"/>
 *     <enumeration value="0201"/>
 *     <enumeration value="0202"/>
 *     <enumeration value="0301"/>
 *     <enumeration value="0302"/>
 *     <enumeration value="0401"/>
 *     <enumeration value="0402"/>
 *     <enumeration value="0503"/>
 *     <enumeration value="0601"/>
 *     <enumeration value="0602"/>
 *     <enumeration value="0701"/>
 *     <enumeration value="0702"/>
 *     <enumeration value="0804"/>
 *     <enumeration value="0905"/>
 *     <enumeration value="1006"/>
 *     <enumeration value="1108"/>
 *     <enumeration value="1208"/>
 *     <enumeration value="1300"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "inhabitantControlType")
@XmlEnum
public enum InhabitantControlType {

    @XmlEnumValue("0102")
    VALUE_1("0102"),
    @XmlEnumValue("0201")
    VALUE_2("0201"),
    @XmlEnumValue("0202")
    VALUE_3("0202"),
    @XmlEnumValue("0301")
    VALUE_4("0301"),
    @XmlEnumValue("0302")
    VALUE_5("0302"),
    @XmlEnumValue("0401")
    VALUE_6("0401"),
    @XmlEnumValue("0402")
    VALUE_7("0402"),
    @XmlEnumValue("0503")
    VALUE_8("0503"),
    @XmlEnumValue("0601")
    VALUE_9("0601"),
    @XmlEnumValue("0602")
    VALUE_10("0602"),
    @XmlEnumValue("0701")
    VALUE_11("0701"),
    @XmlEnumValue("0702")
    VALUE_12("0702"),
    @XmlEnumValue("0804")
    VALUE_13("0804"),
    @XmlEnumValue("0905")
    VALUE_14("0905"),
    @XmlEnumValue("1006")
    VALUE_15("1006"),
    @XmlEnumValue("1108")
    VALUE_16("1108"),
    @XmlEnumValue("1208")
    VALUE_17("1208"),
    @XmlEnumValue("1300")
    VALUE_18("1300");
    private final String value;

    InhabitantControlType(String v) {
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
    public static InhabitantControlType fromValue(String v) {
        for (InhabitantControlType c: InhabitantControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
