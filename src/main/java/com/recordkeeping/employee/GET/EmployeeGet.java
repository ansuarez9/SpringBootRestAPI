package com.recordkeeping.employee.GET;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.recordkeeping.company.Company;

@Entity
public class EmployeeGet {
	
	@Id
	private Long employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	Company company;
	
	public EmployeeGet() {

	}

	public EmployeeGet(Long employeeId, String firstName, String lastName, int age, Company company) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.company = company;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	

}
