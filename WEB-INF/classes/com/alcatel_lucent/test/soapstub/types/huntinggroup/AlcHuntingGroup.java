
package com.alcatel_lucent.test.soapstub.types.huntinggroup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes a hunting group.
 *         
 * 
 * <p>Java class for AlcHuntingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcHuntingGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="directoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup}AlcHuntingGroupSearchType"/>
 *         &lt;element name="members" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unavailableAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="releaseAfterTimer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowDirectoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcHuntingGroup", propOrder = {
    "directoryNumber",
    "directoryName",
    "searchType",
    "members",
    "unavailableAuthorized",
    "releaseAfterTimer",
    "overflowDirectoryNumber",
    "entity"
})
public class AlcHuntingGroup {

    @XmlElement(required = true)
    protected String directoryNumber;
    @XmlElement(required = true)
    protected String directoryName;
    @XmlElement(required = true)
    protected AlcHuntingGroupSearchType searchType;
    protected List<String> members;
    protected boolean unavailableAuthorized;
    protected boolean releaseAfterTimer;
    @XmlElement(required = true, nillable = true)
    protected String overflowDirectoryNumber;
    protected int entity;

    /**
     * Gets the value of the directoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryNumber() {
        return directoryNumber;
    }

    /**
     * Sets the value of the directoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryNumber(String value) {
        this.directoryNumber = value;
    }

    /**
     * Gets the value of the directoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /**
     * Sets the value of the directoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryName(String value) {
        this.directoryName = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcHuntingGroupSearchType }
     *     
     */
    public AlcHuntingGroupSearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcHuntingGroupSearchType }
     *     
     */
    public void setSearchType(AlcHuntingGroupSearchType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the members property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMembers() {
        if (members == null) {
            members = new ArrayList<String>();
        }
        return this.members;
    }

    /**
     * Gets the value of the unavailableAuthorized property.
     * 
     */
    public boolean isUnavailableAuthorized() {
        return unavailableAuthorized;
    }

    /**
     * Sets the value of the unavailableAuthorized property.
     * 
     */
    public void setUnavailableAuthorized(boolean value) {
        this.unavailableAuthorized = value;
    }

    /**
     * Gets the value of the releaseAfterTimer property.
     * 
     */
    public boolean isReleaseAfterTimer() {
        return releaseAfterTimer;
    }

    /**
     * Sets the value of the releaseAfterTimer property.
     * 
     */
    public void setReleaseAfterTimer(boolean value) {
        this.releaseAfterTimer = value;
    }

    /**
     * Gets the value of the overflowDirectoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverflowDirectoryNumber() {
        return overflowDirectoryNumber;
    }

    /**
     * Sets the value of the overflowDirectoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverflowDirectoryNumber(String value) {
        this.overflowDirectoryNumber = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     */
    public int getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     */
    public void setEntity(int value) {
        this.entity = value;
    }

}
