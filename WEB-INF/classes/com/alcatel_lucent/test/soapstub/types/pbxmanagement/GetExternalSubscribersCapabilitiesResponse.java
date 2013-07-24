
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
 *         &lt;element name="load" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filteringFields" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcExternalSubscriberField" maxOccurs="unbounded" minOccurs="0"/>
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
    "load",
    "filteringFields",
    "creation",
    "modification",
    "deletion"
})
@XmlRootElement(name = "getExternalSubscribersCapabilitiesResponse")
public class GetExternalSubscribersCapabilitiesResponse
    extends AlcResult
{

    protected boolean load;
    protected List<AlcExternalSubscriberField> filteringFields;
    protected boolean creation;
    protected boolean modification;
    protected boolean deletion;

    /**
     * Gets the value of the load property.
     * 
     */
    public boolean isLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     */
    public void setLoad(boolean value) {
        this.load = value;
    }

    /**
     * Gets the value of the filteringFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filteringFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilteringFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcExternalSubscriberField }
     * 
     * 
     */
    public List<AlcExternalSubscriberField> getFilteringFields() {
        if (filteringFields == null) {
            filteringFields = new ArrayList<AlcExternalSubscriberField>();
        }
        return this.filteringFields;
    }

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
