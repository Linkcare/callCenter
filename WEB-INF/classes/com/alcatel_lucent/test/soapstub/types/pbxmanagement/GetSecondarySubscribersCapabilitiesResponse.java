
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

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
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "creation",
    "modification",
    "deletion"
})
@XmlRootElement(name = "getSecondarySubscribersCapabilitiesResponse")
public class GetSecondarySubscribersCapabilitiesResponse
    extends AlcResult
{

    protected boolean creation;
    protected boolean modification;
    protected boolean deletion;

    /**
     * Gets the value of the creation property.
     * 
     */
    public boolean isCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     */
    public void setCreation(boolean value) {
        this.creation = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     */
    public boolean isModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     */
    public void setModification(boolean value) {
        this.modification = value;
    }

    /**
     * Gets the value of the deletion property.
     * 
     */
    public boolean isDeletion() {
        return deletion;
    }

    /**
     * Sets the value of the deletion property.
     * 
     */
    public void setDeletion(boolean value) {
        this.deletion = value;
    }

}
