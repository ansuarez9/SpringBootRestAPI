package com.recordkeeping.company;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.recordkeeping.employee.Employee;

@Entity
@Table(name="companies")
public class Company {
	
	@Id
	@Column(name="COMPANY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long companyId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COUNTRY")
	private String country;
	
	@OneToMany(mappedBy="company")
	private Collection<Employee> employees = new ArrayList<Employee>();

	public Company() {

	}

	public Company(Long companyId, String companyName, String country) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.country = country;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
