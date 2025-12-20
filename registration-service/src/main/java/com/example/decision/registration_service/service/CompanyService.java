package com.example.decision.registration_service.service;

import com.example.decision.registration_service.entity.Company;
import com.example.decision.registration_service.implementation.CompanyImplementation;
import com.example.decision.registration_service.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService implements CompanyImplementation {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company_details) {
        return companyRepository.save(company_details);
    }

    @Override
    public Optional<Company> getCompany(int id) {
        return companyRepository.findById(id);
    }
}
