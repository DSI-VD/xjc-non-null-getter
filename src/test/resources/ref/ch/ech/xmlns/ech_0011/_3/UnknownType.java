
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unknownType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unknownType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="0"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "unknownType")
@XmlEnum
public enum UnknownType {

    @XmlEnumValue("0")
    VALUE_1("0");
    private final String value;

    UnknownType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnknownType fromValue(String v) {
        for (UnknownType c: UnknownType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
