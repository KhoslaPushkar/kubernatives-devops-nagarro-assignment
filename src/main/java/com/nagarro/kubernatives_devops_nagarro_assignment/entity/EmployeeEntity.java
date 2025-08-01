package com.nagarro.kubernatives_devops_nagarro_assignment.entity;

//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

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
 * @author pushkarkhosla
 *
 */
@Data
@Entity(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@Enumerated(EnumType.STRING)
	private Department department;

	private String email;

	public EmployeeEntity(String name, Department department, String email) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
	}

}
