package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return Arrays.asList(
				new Employee("1","Ravi","Associate"),
				new Employee("2","Abhishek","SE"),
				new Employee("3","Manjit","SSE")
				);
	}
}
