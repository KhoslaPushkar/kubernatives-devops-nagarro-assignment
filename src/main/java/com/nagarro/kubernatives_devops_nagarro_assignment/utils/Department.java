package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

/**
 * @author pushkarkhosla
 *
 */
public enum Department {

	HR("HR"), IT("IT"), FINANCE("FINANCE"), MARKETING("MARKETING"), SALES("SALES"), OPERATIONS("OPERATIONS"),
	CUSTOMER_SERVICE("CUSTOMER_SERVICE"), PRODUCTION("PRODUCTION"), LEGAL("LEGAL");

	private final String value;

	private Department(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
