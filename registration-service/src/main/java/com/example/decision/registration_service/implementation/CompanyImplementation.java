package com.example.decision.registration_service.implementation;

import com.example.decision.registration_service.entity.Company;

import java.util.Optional;

public interface CompanyImplementation {

    public Company saveCompany(Company company_details);

    public Optional<Company> getCompany(int id);
}
