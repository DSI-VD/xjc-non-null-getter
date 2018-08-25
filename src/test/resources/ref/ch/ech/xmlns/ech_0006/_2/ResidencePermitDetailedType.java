
package ch.ech.xmlns.ech_0006._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour residencePermitDetailedType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="residencePermitDetailedType"&gt;
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
 *     &lt;enumeration value="060101"/&gt;
 *     &lt;enumeration value="060201"/&gt;
 *     &lt;enumeration value="060102"/&gt;
 *     &lt;enumeration value="060202"/&gt;
 *     &lt;enumeration value="0701"/&gt;
 *     &lt;enumeration value="0702"/&gt;
 *     &lt;enumeration value="070101"/&gt;
 *     &lt;enumeration value="070201"/&gt;
 *     &lt;enumeration value="070102"/&gt;
 *     &lt;enumeration value="070202"/&gt;
 *     &lt;enumeration value="070103"/&gt;
 *     &lt;enumeration value="070104"/&gt;
 *     &lt;enumeration value="070204"/&gt;
 *     &lt;enumeration value="070105"/&gt;
 *     &lt;enumeration value="070205"/&gt;
 *     &lt;enumeration value="070206"/&gt;
 *     &lt;enumeration value="070907"/&gt;
 *     &lt;enumeration value="0804"/&gt;
 *     &lt;enumeration value="0905"/&gt;
 *     &lt;enumeration value="1006"/&gt;
 *     &lt;enumeration value="100601"/&gt;
 *     &lt;enumeration value="100602"/&gt;
 *     &lt;enumeration value="100603"/&gt;
 *     &lt;enumeration value="1107"/&gt;
 *     &lt;enumeration value="1208"/&gt;
 *     &lt;enumeration value="1300"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "residencePermitDetailedType")
@XmlEnum
public enum ResidencePermitDetailedType {

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
    @XmlEnumValue("060101")
    VALUE_11("060101"),
    @XmlEnumValue("060201")
    VALUE_12("060201"),
    @XmlEnumValue("060102")
    VALUE_13("060102"),
    @XmlEnumValue("060202")
    VALUE_14("060202"),
    @XmlEnumValue("0701")
    VALUE_15("0701"),
    @XmlEnumValue("0702")
    VALUE_16("0702"),
    @XmlEnumValue("070101")
    VALUE_17("070101"),
    @XmlEnumValue("070201")
    VALUE_18("070201"),
    @XmlEnumValue("070102")
    VALUE_19("070102"),
    @XmlEnumValue("070202")
    VALUE_20("070202"),
    @XmlEnumValue("070103")
    VALUE_21("070103"),
    @XmlEnumValue("070104")
    VALUE_22("070104"),
    @XmlEnumValue("070204")
    VALUE_23("070204"),
    @XmlEnumValue("070105")
    VALUE_24("070105"),
    @XmlEnumValue("070205")
    VALUE_25("070205"),
    @XmlEnumValue("070206")
    VALUE_26("070206"),
    @XmlEnumValue("070907")
    VALUE_27("070907"),
    @XmlEnumValue("0804")
    VALUE_28("0804"),
    @XmlEnumValue("0905")
    VALUE_29("0905"),
    @XmlEnumValue("1006")
    VALUE_30("1006"),
    @XmlEnumValue("100601")
    VALUE_31("100601"),
    @XmlEnumValue("100602")
    VALUE_32("100602"),
    @XmlEnumValue("100603")
    VALUE_33("100603"),
    @XmlEnumValue("1107")
    VALUE_34("1107"),
    @XmlEnumValue("1208")
    VALUE_35("1208"),
    @XmlEnumValue("1300")
    VALUE_36("1300");
    private final String value;

    ResidencePermitDetailedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidencePermitDetailedType fromValue(String v) {
        for (ResidencePermitDetailedType c: ResidencePermitDetailedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
