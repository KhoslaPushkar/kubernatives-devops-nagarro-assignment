package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

import lombok.Data;

/**
 * Helper class to standardize API responses. Contains fields for indicating
 * error status, response code, response data, and error message.
 * 
 * Author: pushkarkhosla
 */
@Data
public class ResponseHelper {

	/**
	 * Flag indicating whether the response represents an error.
	 */
	private boolean error;

	/**
	 * HTTP status code associated with the response.
	 */
	private int code;

	/**
	 * The actual response data returned to the client. Marked as transient to avoid
	 * serialization issues.
	 */
	private transient Object data;

	/**
	 * Descriptive error message, populated if an error occurred.
	 */
	private String errorMessage;
}
