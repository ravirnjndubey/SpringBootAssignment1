package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return empRepo.getAllEmployee();
		
	}
}
