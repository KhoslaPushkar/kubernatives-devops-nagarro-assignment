package com.nagarro.kubernatives_devops_nagarro_assignment.entity;

import com.nagarro.kubernatives_devops_nagarro_assignment.utils.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing an employee. Mapped to the "employee" table in the
 * database. Includes fields for employee ID, name, department, and email. Uses
 * Lombok for boilerplate code generation.
 * 
 * Annotations used: - @Entity: Marks this class as a JPA entity. - @Data:
 * Generates getters, setters, toString, equals, and hashCode.
 * - @NoArgsConstructor, @AllArgsConstructor: Generates constructors.
 * - @Enumerated: Persists enum as string.
 * 
 * Author: pushkarkhosla
 */
@Data
@Entity(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

	/**
	 * Primary key for the employee. Auto-generated using identity strategy.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Name of the employee.
	 */
	private String name;

	/**
	 * Department of the employee, stored as a string in the database.
	 */
	@Enumerated(EnumType.STRING)
	private Department department;

	/**
	 * Email address of the employee.
	 */
	private String email;

	/**
	 * Constructor to create an employee without specifying ID.
	 * 
	 * @param name       Name of the employee
	 * @param department Department enum
	 * @param email      Email address
	 */
	public EmployeeEntity(String name, Department department, String email) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
	}
}
