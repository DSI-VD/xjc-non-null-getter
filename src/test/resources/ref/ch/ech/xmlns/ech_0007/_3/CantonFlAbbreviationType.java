
package ch.ech.xmlns.ech_0007._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for cantonFlAbbreviationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="cantonFlAbbreviationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <maxLength value="2"/>
 *     <enumeration value="ZH"/>
 *     <enumeration value="BE"/>
 *     <enumeration value="LU"/>
 *     <enumeration value="UR"/>
 *     <enumeration value="SZ"/>
 *     <enumeration value="OW"/>
 *     <enumeration value="NW"/>
 *     <enumeration value="GL"/>
 *     <enumeration value="ZG"/>
 *     <enumeration value="FR"/>
 *     <enumeration value="SO"/>
 *     <enumeration value="BS"/>
 *     <enumeration value="BL"/>
 *     <enumeration value="SH"/>
 *     <enumeration value="AR"/>
 *     <enumeration value="AI"/>
 *     <enumeration value="SG"/>
 *     <enumeration value="GR"/>
 *     <enumeration value="AG"/>
 *     <enumeration value="TG"/>
 *     <enumeration value="TI"/>
 *     <enumeration value="VD"/>
 *     <enumeration value="VS"/>
 *     <enumeration value="NE"/>
 *     <enumeration value="GE"/>
 *     <enumeration value="JU"/>
 *     <enumeration value="FL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "cantonFlAbbreviationType")
@XmlEnum
public enum CantonFlAbbreviationType {

    ZH,
    BE,
    LU,
    UR,
    SZ,
    OW,
    NW,
    GL,
    ZG,
    FR,
    SO,
    BS,
    BL,
    SH,
    AR,
    AI,
    SG,
    GR,
    AG,
    TG,
    TI,
    VD,
    VS,
    NE,
    GE,
    JU,
    FL;

    public String value() {
        return name();
    }

    public static CantonFlAbbreviationType fromValue(String v) {
        return valueOf(v);
    }

}
