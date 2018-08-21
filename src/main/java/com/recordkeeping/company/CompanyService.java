package com.recordkeeping.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	@Autowired
	CompanyRepository companyRepository;

	public List<Company> getAllCompanies() {
		List<Company> companies = new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);
		return companies;
	}

	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	public Optional<Company> getCompany(Long id) {
		return companyRepository.findById(id);
	}

}
