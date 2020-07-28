package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.demo.employee"})
public class SpringBootAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment1Application.class, args);
	}

}
