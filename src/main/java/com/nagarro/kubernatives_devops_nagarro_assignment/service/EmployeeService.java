package com.nagarro.kubernatives_devops_nagarro_assignment.service;

import static com.nagarro.kubernatives_devops_nagarro_assignment.utils.APIResponseHelper.getErrorResponse;
import static com.nagarro.kubernatives_devops_nagarro_assignment.utils.APIResponseHelper.getSuccessResponse;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nagarro.kubernatives_devops_nagarro_assignment.entity.EmployeeEntity;
import com.nagarro.kubernatives_devops_nagarro_assignment.repository.EmployeeRepository;
import com.nagarro.kubernatives_devops_nagarro_assignment.utils.Department;
import com.nagarro.kubernatives_devops_nagarro_assignment.utils.ResponseHelper;

/**
 * @author pushkarkhosla
 *
 */
@Service
public class EmployeeService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * @return
	 */
	public ResponseHelper getAllEmployees() {
		try {
			return getSuccessResponse(employeeRepository.findAll());
		} catch (Exception e) {
			logger.error(
					"Exception Occured While Executing getAllEmployees(). Exception Message {{}}, Exception Details {{}}",
					e.getMessage(), e);
			return getErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseHelper createSampleData() {
		try {
			List<EmployeeEntity> sampleList = new ArrayList<>();
			sampleList.add(new EmployeeEntity("Alice", Department.HR, "alice@example.com"));
			sampleList.add(new EmployeeEntity("Bob", Department.CUSTOMER_SERVICE, "bob@example.com"));
			sampleList.add(new EmployeeEntity("Charlie", Department.FINANCE, "charlie@example.com"));
			sampleList.add(new EmployeeEntity("David", Department.MARKETING, "david@example.com"));
			sampleList.add(new EmployeeEntity("Eva", Department.SALES, "eva@example.com"));
			sampleList.add(new EmployeeEntity("Frank", Department.PRODUCTION, "frank@example.com"));
			sampleList.add(new EmployeeEntity("Grace", Department.HR, "grace@example.com"));
			sampleList.add(new EmployeeEntity("Henry", Department.FINANCE, "henry@example.com"));
			sampleList.add(new EmployeeEntity("Isla", Department.MARKETING, "isla@example.com"));
			sampleList.add(new EmployeeEntity("Jake", Department.SALES, "jake@example.com"));

			employeeRepository.saveAll(sampleList);
			return getSuccessResponse("All Employees Saved Successfully.");
		} catch (Exception e) {
			logger.error(
					"Exception Occured While Executing getAllEmployees(). Exception Message {{}}, Exception Details {{}}",
					e.getMessage(), e);
			return getErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
