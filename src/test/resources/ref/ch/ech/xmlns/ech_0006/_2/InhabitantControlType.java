
package ch.ech.xmlns.ech_0006._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inhabitantControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="inhabitantControlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0102"/&gt;
 *     &lt;enumeration value="0201"/&gt;
 *     &lt;enumeration value="0202"/&gt;
 *     &lt;enumeration value="0301"/&gt;
 *     &lt;enumeration value="0302"/&gt;
 *     &lt;enumeration value="0401"/&gt;
 *     &lt;enumeration value="0402"/&gt;
 *     &lt;enumeration value="0503"/&gt;
 *     &lt;enumeration value="0601"/&gt;
 *     &lt;enumeration value="0602"/&gt;
 *     &lt;enumeration value="0701"/&gt;
 *     &lt;enumeration value="0702"/&gt;
 *     &lt;enumeration value="0804"/&gt;
 *     &lt;enumeration value="0905"/&gt;
 *     &lt;enumeration value="1006"/&gt;
 *     &lt;enumeration value="1108"/&gt;
 *     &lt;enumeration value="1208"/&gt;
 *     &lt;enumeration value="1300"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static InhabitantControlType fromValue(String v) {
        for (InhabitantControlType c: InhabitantControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
