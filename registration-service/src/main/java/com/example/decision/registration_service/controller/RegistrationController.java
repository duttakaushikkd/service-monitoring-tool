package com.example.decision.registration_service.controller;
import com.example.decision.registration_service.entity.Company;
import com.example.decision.registration_service.entity.Service;
import com.example.decision.registration_service.implementation.CompanyImplementation;
import com.example.decision.registration_service.implementation.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/registration")
public class RegistrationController {

    @Autowired
    CompanyImplementation companyImplementation;

    @Autowired
    ServiceImplementation serviceImplementation;

    @PostMapping("/company")
    public String addCompany(Company company_details){
        return companyImplementation.saveCompany(company_details).toString();
    }

    @GetMapping("/get/company")
    public Optional<Company> getCompany(int id){
        return companyImplementation.getCompany(id);
    }

    @PostMapping("/service")
    public String addCompany(Service service_details){
        return serviceImplementation.addService(service_details).toString();
    }

    @GetMapping("/get/service")
    public Optional<Service> getService(int id){
        return serviceImplementation.getService(id);
    }
}
