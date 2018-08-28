package com.recordkeeping.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recordkeeping.employee.GET.EmployeeGet;
import com.recordkeeping.employee.GET.EmployeeGetRepository;

@Service
public class EmployeeService {
	
	@Autowired EmployeeRepository employeeRepository;
	@Autowired EmployeeGetRepository employeeGetRepository;
	
	public List<EmployeeGet> getAllEmployees(){
		List<EmployeeGet> employees = new ArrayList<>();
		
		employeeGetRepository.findAll().forEach(employees::add);
		
		return employees;
	}
	
	public Optional<EmployeeGet> getEmployee(Long id) {
		return employeeGetRepository.findById(id);
	}
	
	public Employee saveEmployee(Employee employee){
		return employeeRepository.save(employee);
	}

	public List<EmployeeGet> deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return getAllEmployees();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
