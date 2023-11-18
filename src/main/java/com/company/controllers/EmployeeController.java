package com.company.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Employee;
import com.company.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
	
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		
		return employeeService.getEmployee(id);
	
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		
		return employeeService.getAll();
	
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
		
		employeeService.updateEmployee(emp);
		
		return "Employee Updated";
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		employeeService.deleteEmployee(id);
		
		return "Employee deleted";
	}
}
