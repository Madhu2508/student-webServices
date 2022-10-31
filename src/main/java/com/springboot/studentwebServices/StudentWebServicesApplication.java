package com.springboot.studentwebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.studentwebServices")
public class StudentWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWebServicesApplication.class, args);
	}

}
