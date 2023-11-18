package com.company.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Employee;
import com.company.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}

	@Override
	public Optional<Employee> getEmployee(int id) {

		Optional<Employee> emp = employeeRepository.findById(id);
		
		return emp;
	}

	@Override
	public List<Employee> getAll() {

		List<Employee> emp = employeeRepository.findAll();
		
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {

		Employee employee = employeeRepository.save(emp);
		
		if (employee instanceof Employee) {
			return "Employee Updated";
		}
		
		return "Employee not updated";
	}

	@Override
	public String deleteEmployee(int id) {

		employeeRepository.deleteById(id);
		
		return "The Employee has been deleted";
	}

}
