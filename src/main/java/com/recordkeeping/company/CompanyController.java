package com.recordkeeping.company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/companiesTest")
	public String companiesTest() {
		return "Companies Service...";
	}
	
	@GetMapping("/companies")
	public List<Company> getAllCompanies(){
		return companyService.getAllCompanies();
	}
	
	@PostMapping("/companies")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@GetMapping("/companies/{id}")
	public Optional<Company> getCompany(@PathVariable Long id) {
		return companyService.getCompany(id);
	}
	
	@PutMapping("/companies/{id}")
	public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
		return companyService.saveCompany(company);
	}

}
