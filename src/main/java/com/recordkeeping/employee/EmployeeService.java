package com.recordkeeping.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		employeeRepository.findAll().forEach(employees::add);
		
		return employees;
	}
	
	public Optional<Employee> getEmployee(Long id) {
		return employeeRepository.findById(id);
	}
	
	public Employee saveEmployee(Employee employee){
		return employeeRepository.save(employee);
	}

	public List<Employee> deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return getAllEmployees();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
