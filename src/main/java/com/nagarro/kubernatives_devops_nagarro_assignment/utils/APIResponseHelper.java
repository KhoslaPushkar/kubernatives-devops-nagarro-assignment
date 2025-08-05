package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

import org.springframework.http.HttpStatus;

/**
 * Utility class to generate standardized API responses. Provides static methods
 * to create success and error responses wrapped in the {@link ResponseHelper}
 * object.
 * 
 * Author: pushkarkhosla
 */
public class APIResponseHelper {

	/**
	 * Private constructor to prevent instantiation.
	 */
	private APIResponseHelper() {
	}

	/**
	 * Generates a successful API response.
	 * 
	 * @param object the response body to be included in the success response
	 * @return a ResponseHelper object with HTTP 200 status and the provided data
	 */
	public static ResponseHelper getSuccessResponse(final Object object) {
		ResponseHelper response = new ResponseHelper();
		response.setError(Boolean.FALSE);
		response.setCode(HttpStatus.OK.value());
		response.setData(object);
		return response;
	}

	/**
	 * Generates an error API response.
	 * 
	 * @param errorMsg  the error message to be included in the response
	 * @param errorCode the HTTP status code representing the error
	 * @return a ResponseHelper object with error flag and details
	 */
	public static ResponseHelper getErrorResponse(String errorMsg, HttpStatus errorCode) {
		ResponseHelper response = new ResponseHelper();
		response.setError(Boolean.TRUE);
		response.setCode(errorCode.value());
		response.setErrorMessage(errorMsg);
		return response;
	}
}
