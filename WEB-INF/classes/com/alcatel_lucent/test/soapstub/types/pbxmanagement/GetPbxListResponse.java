
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="pbx" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcPbxInformation" maxOccurs="unbounded" minOccurs="0"/>
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
    "pbx"
})
@XmlRootElement(name = "getPbxListResponse")
public class GetPbxListResponse
    extends AlcResult
{

    protected List<AlcPbxInformation> pbx;

    /**
     * Gets the value of the pbx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pbx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPbx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcPbxInformation }
     * 
     * 
     */
    public List<AlcPbxInformation> getPbx() {
        if (pbx == null) {
            pbx = new ArrayList<AlcPbxInformation>();
        }
        return this.pbx;
    }

}
