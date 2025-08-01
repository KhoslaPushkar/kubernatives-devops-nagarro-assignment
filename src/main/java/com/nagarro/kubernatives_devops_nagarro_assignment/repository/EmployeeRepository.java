package com.nagarro.kubernatives_devops_nagarro_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.kubernatives_devops_nagarro_assignment.entity.EmployeeEntity;

/**
 * @author pushkarkhosla
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
