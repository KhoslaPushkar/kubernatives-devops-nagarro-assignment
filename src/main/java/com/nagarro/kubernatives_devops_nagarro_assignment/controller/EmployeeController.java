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
 * Controller class to handle employee-related API endpoints. Provides endpoints
 * to fetch all employees and generate sample employee data.
 *
 * Mapped under base URL path: <code>/employee/</code> Annotations used:
 * 
 * {@code @RestController} - Indicates this class is a REST controller.
 * {@code @RequestMapping} - Base URL mapping for all endpoints in this
 * controller.
 * 
 * @author pushkarkhosla
 */
@RestController
@RequestMapping(value = "/employee/")
public class EmployeeController {

	/**
	 * Logger instance for logging API activity.
	 */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Service class to handle business logic related to employees.
	 */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Endpoint to retrieve all employee records.
	 *
	 * @return {@link ResponseHelper} containing the list of employees and response
	 *         metadata.
	 */
	@GetMapping
	public ResponseHelper getAllEmployees() {

		logger.info("Calling Get All /employee/ api.");

		return employeeService.getAllEmployees();
	}

	/**
	 * Endpoint to generate and persist sample employee data.
	 *
	 * @return {@link ResponseHelper} indicating success or failure of sample data
	 *         creation.
	 */
	@GetMapping(value = "createSampleData")
	public ResponseHelper createSampleData() {

		logger.info("Calling /employee/createSampleData api.");

		return employeeService.createSampleData();
	}
}
