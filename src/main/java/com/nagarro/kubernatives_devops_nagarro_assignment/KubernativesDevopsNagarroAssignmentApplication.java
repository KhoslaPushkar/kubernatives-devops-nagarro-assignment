package com.nagarro.kubernatives_devops_nagarro_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main class for the Spring Boot application.
 * 
 * This application demonstrates a Kubernetes and DevOps assignment using a
 * Spring Boot microservice architecture. It scans for JPA entities and
 * repositories within the specified base packages.
 *
 * Annotations used:
 * 
 * {@code @SpringBootApplication} - Enables component scanning,
 * auto-configuration, and Spring Boot configuration. {@code @EntityScan} -
 * Specifies the base packages to scan for JPA entities.
 * {@code @EnableJpaRepositories} - Specifies the base packages to scan for
 * Spring Data JPA repositories.
 * 
 * 
 * @author pushkarkhosla
 */
@SpringBootApplication
@EntityScan(basePackages = "com.nagarro.kubernatives_devops_nagarro_assignment.entity")
@EnableJpaRepositories(basePackages = "com.nagarro.kubernatives_devops_nagarro_assignment.repository")
public class KubernativesDevopsNagarroAssignmentApplication {

	/**
	 * The entry point of the Spring Boot application.
	 *
	 * @param args Command-line arguments passed at runtime.
	 */
	public static void main(String[] args) {
		SpringApplication.run(KubernativesDevopsNagarroAssignmentApplication.class, args);
	}

}
