package com.project.AttendenceSystemLogipool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.dao","com.service","com.model"})
@EnableJpaRepositories(basePackages="com.dao")
@EntityScan("com.model")
public class AttendenceSystemLogipoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendenceSystemLogipoolApplication.class, args);
		System.out.println("Attendence System Working...");
	}

}
