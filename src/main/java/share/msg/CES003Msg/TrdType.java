//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES003Msg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for TrdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TT01"/>
 *     &lt;enumeration value="TT02"/>
 *     &lt;enumeration value="TT03"/>
 *     &lt;enumeration value="TT04"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrdType")
@XmlEnum
public enum TrdType implements Serializable {

    @XmlEnumValue("TT01")
    TT_01("TT01"),
    @XmlEnumValue("TT02")
    TT_02("TT02"),
    @XmlEnumValue("TT03")
    TT_03("TT03"),
    @XmlEnumValue("TT04")
    TT_04("TT04");
    private final String value;

    TrdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrdType fromValue(String v) {
        for (TrdType c: TrdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}