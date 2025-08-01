package com.nagarro.kubernatives_devops_nagarro_assignment.utils;

import lombok.Data;

/**
 * @author pushkarkhosla
 *
 */
@Data
public class ResponseHelper {

	private boolean error;
	private int code;
	private transient Object data;
	private String errorMessage;
}
