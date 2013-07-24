
package com.alcatel_lucent.test.soapstub.types.phone;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="mainLine" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcBasicTelephonicStateInfo"/>
 *         &lt;element name="secondaryLines" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcBasicTelephonicStateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="globalState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcBasicTelephonicState"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mainLine",
    "secondaryLines",
    "globalState"
})
@XmlRootElement(name = "getBasicTelephonicStateResponse")
public class GetBasicTelephonicStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcBasicTelephonicStateInfo mainLine;
    @XmlElement(nillable = true)
    protected List<AlcBasicTelephonicStateInfo> secondaryLines;
    @XmlElement(required = true, nillable = true)
    protected AlcBasicTelephonicState globalState;

    /**
     * Gets the value of the mainLine property.
     * 
     * @return
     *     possible object is
     *     {@link AlcBasicTelephonicStateInfo }
     *     
     */
    public AlcBasicTelephonicStateInfo getMainLine() {
        return mainLine;
    }

    /**
     * Sets the value of the mainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcBasicTelephonicStateInfo }
     *     
     */
    public void setMainLine(AlcBasicTelephonicStateInfo value) {
        this.mainLine = value;
    }

    /**
     * Gets the value of the secondaryLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcBasicTelephonicStateInfo }
     * 
     * 
     */
    public List<AlcBasicTelephonicStateInfo> getSecondaryLines() {
        if (secondaryLines == null) {
            secondaryLines = new ArrayList<AlcBasicTelephonicStateInfo>();
        }
        return this.secondaryLines;
    }

    /**
     * Gets the value of the globalState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcBasicTelephonicState }
     *     
     */
    public AlcBasicTelephonicState getGlobalState() {
        return globalState;
    }

    /**
     * Sets the value of the globalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcBasicTelephonicState }
     *     
     */
    public void setGlobalState(AlcBasicTelephonicState value) {
        this.globalState = value;
    }

}
