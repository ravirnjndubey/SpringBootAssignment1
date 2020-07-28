package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	public List<Employee> getAllEmployee(){
		
		return Arrays.asList(
				new Employee("1","Faizan","PM"),
				new Employee("2","Shiny","Manager"),
				new Employee("3","Pramod","TL"),
				new Employee("4","Varsha","SE")
				
				);
	}

}
