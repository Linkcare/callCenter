package com.espaitic.bean;

import java.io.Serializable;

public class CallCenterLogAlcUser implements Serializable{

	private static final long serialVersionUID = 6721945450473115374L;

    private String companyPhone;//terminal
    private String firstName;
    private String lastName;
    private String loginName;

    
    
    public CallCenterLogAlcUser() {
		super();
	}

	public CallCenterLogAlcUser(String companyPhone, String firstName, String lastName,
			String loginName) {
		super();
		this.companyPhone = companyPhone;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
	}

	/**
     * Gets the value of the companyPhone property.
     * 
     * @return
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Sets the value of the companyPhone property.
     * 
     * @param value
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

	@Override
	public String toString() {
		return "AlcUser [companyPhone=" + companyPhone + ", firstName="
				+ firstName + ", lastName=" + lastName + ", loginName="
				+ loginName + "]";
	}
	
}
