
package ch.ech.xmlns.ech_0006._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for residencePermitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="residencePermitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="0102"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="0201"/&gt;
 *     &lt;enumeration value="0202"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="0301"/&gt;
 *     &lt;enumeration value="0302"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="0401"/&gt;
 *     &lt;enumeration value="0402"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="0503"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="0601"/&gt;
 *     &lt;enumeration value="0602"/&gt;
 *     &lt;enumeration value="060101"/&gt;
 *     &lt;enumeration value="060201"/&gt;
 *     &lt;enumeration value="060102"/&gt;
 *     &lt;enumeration value="060202"/&gt;
 *     &lt;enumeration value="07"/&gt;
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
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="0804"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="0905"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="1006"/&gt;
 *     &lt;enumeration value="100601"/&gt;
 *     &lt;enumeration value="100602"/&gt;
 *     &lt;enumeration value="100603"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="1107"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="1208"/&gt;
 *     &lt;enumeration value="1300"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "residencePermitType")
@XmlEnum
public enum ResidencePermitType {

    @XmlEnumValue("01")
    VALUE_1("01"),
    @XmlEnumValue("0102")
    VALUE_2("0102"),
    @XmlEnumValue("02")
    VALUE_3("02"),
    @XmlEnumValue("0201")
    VALUE_4("0201"),
    @XmlEnumValue("0202")
    VALUE_5("0202"),
    @XmlEnumValue("03")
    VALUE_6("03"),
    @XmlEnumValue("0301")
    VALUE_7("0301"),
    @XmlEnumValue("0302")
    VALUE_8("0302"),
    @XmlEnumValue("04")
    VALUE_9("04"),
    @XmlEnumValue("0401")
    VALUE_10("0401"),
    @XmlEnumValue("0402")
    VALUE_11("0402"),
    @XmlEnumValue("05")
    VALUE_12("05"),
    @XmlEnumValue("0503")
    VALUE_13("0503"),
    @XmlEnumValue("06")
    VALUE_14("06"),
    @XmlEnumValue("0601")
    VALUE_15("0601"),
    @XmlEnumValue("0602")
    VALUE_16("0602"),
    @XmlEnumValue("060101")
    VALUE_17("060101"),
    @XmlEnumValue("060201")
    VALUE_18("060201"),
    @XmlEnumValue("060102")
    VALUE_19("060102"),
    @XmlEnumValue("060202")
    VALUE_20("060202"),
    @XmlEnumValue("07")
    VALUE_21("07"),
    @XmlEnumValue("0701")
    VALUE_22("0701"),
    @XmlEnumValue("0702")
    VALUE_23("0702"),
    @XmlEnumValue("070101")
    VALUE_24("070101"),
    @XmlEnumValue("070201")
    VALUE_25("070201"),
    @XmlEnumValue("070102")
    VALUE_26("070102"),
    @XmlEnumValue("070202")
    VALUE_27("070202"),
    @XmlEnumValue("070103")
    VALUE_28("070103"),
    @XmlEnumValue("070104")
    VALUE_29("070104"),
    @XmlEnumValue("070204")
    VALUE_30("070204"),
    @XmlEnumValue("070105")
    VALUE_31("070105"),
    @XmlEnumValue("070205")
    VALUE_32("070205"),
    @XmlEnumValue("070206")
    VALUE_33("070206"),
    @XmlEnumValue("070907")
    VALUE_34("070907"),
    @XmlEnumValue("08")
    VALUE_35("08"),
    @XmlEnumValue("0804")
    VALUE_36("0804"),
    @XmlEnumValue("09")
    VALUE_37("09"),
    @XmlEnumValue("0905")
    VALUE_38("0905"),
    @XmlEnumValue("10")
    VALUE_39("10"),
    @XmlEnumValue("1006")
    VALUE_40("1006"),
    @XmlEnumValue("100601")
    VALUE_41("100601"),
    @XmlEnumValue("100602")
    VALUE_42("100602"),
    @XmlEnumValue("100603")
    VALUE_43("100603"),
    @XmlEnumValue("11")
    VALUE_44("11"),
    @XmlEnumValue("1107")
    VALUE_45("1107"),
    @XmlEnumValue("12")
    VALUE_46("12"),
    @XmlEnumValue("1208")
    VALUE_47("1208"),
    @XmlEnumValue("1300")
    VALUE_48("1300");
    private final String value;

    ResidencePermitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidencePermitType fromValue(String v) {
        for (ResidencePermitType c: ResidencePermitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
