//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES001Msg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for QuoteInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteId" type="{}MaxMin16AlphaNumericText" minOccurs="0"/>
 *         &lt;element name="QuoteOp" type="{}QuoteOp"/>
 *         &lt;element name="BusiType" type="{}BusiType"/>
 *         &lt;element name="TrdDir" type="{}TrdDir"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteInf", propOrder = {
    "quoteId",
    "quoteOp",
    "busiType",
    "trdDir"
})
public class QuoteInf implements Serializable {

    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteOp", required = true)
    protected String quoteOp;
    @XmlElement(name = "BusiType", required = true)
    protected BusiType busiType;
    @XmlElement(name = "TrdDir", required = true)
    protected TrdDir trdDir;

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the quoteOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteOp() {
        return quoteOp;
    }

    /**
     * Sets the value of the quoteOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteOp(String value) {
        this.quoteOp = value;
    }

    /**
     * Gets the value of the busiType property.
     * 
     * @return
     *     possible object is
     *     {@link BusiType }
     *     
     */
    public BusiType getBusiType() {
        return busiType;
    }

    /**
     * Sets the value of the busiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusiType }
     *     
     */
    public void setBusiType(BusiType value) {
        this.busiType = value;
    }

    /**
     * Gets the value of the trdDir property.
     * 
     * @return
     *     possible object is
     *     {@link TrdDir }
     *     
     */
    public TrdDir getTrdDir() {
        return trdDir;
    }

    /**
     * Sets the value of the trdDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrdDir }
     *     
     */
    public void setTrdDir(TrdDir value) {
        this.trdDir = value;
    }

}