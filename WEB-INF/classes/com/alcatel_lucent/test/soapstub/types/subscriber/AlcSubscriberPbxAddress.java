
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSubscriberPbxAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSubscriberPbxAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shelf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="board" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="equipment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSubscriberPbxAddress", propOrder = {
    "shelf",
    "board",
    "equipment"
})
public class AlcSubscriberPbxAddress {

    protected int shelf;
    protected int board;
    protected int equipment;

    /**
     * Gets the value of the shelf property.
     * 
     */
    public int getShelf() {
        return shelf;
    }

    /**
     * Sets the value of the shelf property.
     * 
     */
    public void setShelf(int value) {
        this.shelf = value;
    }

    /**
     * Gets the value of the board property.
     * 
     */
    public int getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     */
    public void setBoard(int value) {
        this.board = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     */
    public int getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     */
    public void setEquipment(int value) {
        this.equipment = value;
    }

}
