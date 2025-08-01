package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

import org.springframework.http.HttpStatus;

/**
 * @author pushkarkhosla
 *
 */
public class APIResponseHelper {

	private APIResponseHelper() {
	}

	/**
	 * @param object
	 * @return
	 */
	public static ResponseHelper getSuccessResponse(final Object object) {
		ResponseHelper response = new ResponseHelper();
		response.setError(Boolean.FALSE);
		response.setCode(HttpStatus.OK.value());
		response.setData(object);
		return response;
	}

	/**
	 * @param reResponse
	 * @return
	 */
	public static ResponseHelper getErrorResponse(String errorMsg, HttpStatus errorCode) {
		ResponseHelper response = new ResponseHelper();
		response.setError(Boolean.TRUE);
		response.setCode(errorCode.value());
		response.setErrorMessage(errorMsg);
		return response;
	}

}
