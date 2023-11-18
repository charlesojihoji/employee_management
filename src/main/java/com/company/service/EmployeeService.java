package com.company.service;

import java.util.List;
import java.util.Optional;

import com.company.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);

	public Optional<Employee> getEmployee(int id);

	public List<Employee> getAll();

	public String updateEmployee(Employee emp);

	public String deleteEmployee(int id);

}
