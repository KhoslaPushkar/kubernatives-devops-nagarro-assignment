package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

/**
 * Enum representing various departments within an organization. Each enum
 * constant holds a string value representing the department name.
 * 
 * Author: pushkarkhosla
 */
public enum Department {

	HR("HR"), IT("IT"), FINANCE("FINANCE"), MARKETING("MARKETING"), SALES("SALES"), OPERATIONS("OPERATIONS"),
	CUSTOMER_SERVICE("CUSTOMER_SERVICE"), PRODUCTION("PRODUCTION"), LEGAL("LEGAL");

	/**
	 * String representation of the department.
	 */
	private final String value;

	/**
	 * Constructor to assign the string value to the enum constant.
	 * 
	 * @param value department name
	 */
	private Department(String value) {
		this.value = value;
	}

	/**
	 * Returns the string value of the department.
	 * 
	 * @return department name as string
	 */
	public String getValue() {
		return value;
	}
}
