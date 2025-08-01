package com.nagarro.kubernatives_devops_nagarro_assignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.kubernatives_devops_nagarro_assignment.service.EmployeeService;
import com.nagarro.kubernatives_devops_nagarro_assignment.utils.ResponseHelper;

/**
 * @author pushkarkhosla
 *
 */
@RestController
@RequestMapping(value = "/employee/")
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeService employeeService;

	/**
	 * @return
	 */
	@GetMapping
	public ResponseHelper getAllEmployees() {

		logger.info("Calling Get All /employee/ api.");

		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "createSampleData")
	public ResponseHelper createSampleData() {

		logger.info("Calling Get All /employee/createSampleData api.");

		return employeeService.createSampleData();
	}
}
