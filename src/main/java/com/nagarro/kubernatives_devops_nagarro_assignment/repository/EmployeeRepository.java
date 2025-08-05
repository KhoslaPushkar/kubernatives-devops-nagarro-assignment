package com.nagarro.kubernatives_devops_nagarro_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.kubernatives_devops_nagarro_assignment.entity.EmployeeEntity;

/**
 * Repository interface for EmployeeEntity. Extends JpaRepository to provide
 * CRUD operations and query methods for EmployeeEntity.
 * 
 * This interface interacts with the "employee" table in the database.
 * 
 * Author: pushkarkhosla
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
