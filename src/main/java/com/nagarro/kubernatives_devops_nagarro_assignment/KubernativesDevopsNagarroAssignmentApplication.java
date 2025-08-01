package com.nagarro.kubernatives_devops_nagarro_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author pushkarkhosla
 *
 */
@SpringBootApplication
@EntityScan(basePackages = "com.nagarro.kubernatives_devops_nagarro_assignment.entity")
@EnableJpaRepositories(basePackages = "com.nagarro.kubernatives_devops_nagarro_assignment.repository")
public class KubernativesDevopsNagarroAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernativesDevopsNagarroAssignmentApplication.class, args);
	}

}
