package com.app_farmacia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app_farmacia.controllers")
public class AppFarmaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppFarmaciaApplication.class, args);
	}

}
