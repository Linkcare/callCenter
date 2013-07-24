
package com.alcatel_lucent.test.soapstub.types.notifier;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filter" type="{http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema}AlcSelector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="httpHeaders" type="{http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema}AlcHttpHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fwSessionId",
    "notificationUrl",
    "filter",
    "expires",
    "httpHeaders"
})
@XmlRootElement(name = "subscribeRequest")
public class SubscribeRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true)
    protected String notificationUrl;
    @XmlElement(nillable = true)
    protected List<AlcSelector> filter;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer expires;
    @XmlElement(nillable = true)
    protected List<AlcHttpHeader> httpHeaders;

    /**
     * Gets the value of the fwSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwSessionId() {
        return fwSessionId;
    }

    /**
     * Sets the value of the fwSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwSessionId(String value) {
        this.fwSessionId = value;
    }

    /**
     * Gets the value of the notificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationUrl() {
        return notificationUrl;
    }

    /**
     * Sets the value of the notificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationUrl(String value) {
        this.notificationUrl = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcSelector }
     * 
     * 
     */
    public List<AlcSelector> getFilter() {
        if (filter == null) {
            filter = new ArrayList<AlcSelector>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpires(Integer value) {
        this.expires = value;
    }

    /**
     * Gets the value of the httpHeaders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpHeaders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcHttpHeader }
     * 
     * 
     */
    public List<AlcHttpHeader> getHttpHeaders() {
        if (httpHeaders == null) {
            httpHeaders = new ArrayList<AlcHttpHeader>();
        }
        return this.httpHeaders;
    }

}
