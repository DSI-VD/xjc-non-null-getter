
package ch.ech.xmlns.ech_0006._2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for residencePermitType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="residencePermitType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="01"/>
 *     <enumeration value="0102"/>
 *     <enumeration value="02"/>
 *     <enumeration value="0201"/>
 *     <enumeration value="0202"/>
 *     <enumeration value="03"/>
 *     <enumeration value="0301"/>
 *     <enumeration value="0302"/>
 *     <enumeration value="04"/>
 *     <enumeration value="0401"/>
 *     <enumeration value="0402"/>
 *     <enumeration value="05"/>
 *     <enumeration value="0503"/>
 *     <enumeration value="06"/>
 *     <enumeration value="0601"/>
 *     <enumeration value="0602"/>
 *     <enumeration value="060101"/>
 *     <enumeration value="060201"/>
 *     <enumeration value="060102"/>
 *     <enumeration value="060202"/>
 *     <enumeration value="07"/>
 *     <enumeration value="0701"/>
 *     <enumeration value="0702"/>
 *     <enumeration value="070101"/>
 *     <enumeration value="070201"/>
 *     <enumeration value="070102"/>
 *     <enumeration value="070202"/>
 *     <enumeration value="070103"/>
 *     <enumeration value="070104"/>
 *     <enumeration value="070204"/>
 *     <enumeration value="070105"/>
 *     <enumeration value="070205"/>
 *     <enumeration value="070206"/>
 *     <enumeration value="070907"/>
 *     <enumeration value="08"/>
 *     <enumeration value="0804"/>
 *     <enumeration value="09"/>
 *     <enumeration value="0905"/>
 *     <enumeration value="10"/>
 *     <enumeration value="1006"/>
 *     <enumeration value="100601"/>
 *     <enumeration value="100602"/>
 *     <enumeration value="100603"/>
 *     <enumeration value="11"/>
 *     <enumeration value="1107"/>
 *     <enumeration value="12"/>
 *     <enumeration value="1208"/>
 *     <enumeration value="1300"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    public static ResidencePermitType fromValue(String v) {
        for (ResidencePermitType c: ResidencePermitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
