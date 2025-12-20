package com.example.decision.registration_service.service;

import com.example.decision.registration_service.implementation.ServiceImplementation;
import com.example.decision.registration_service.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service implements ServiceImplementation {

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public com.example.decision.registration_service.entity.Service addService(com.example.decision.registration_service.entity.Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public Optional<com.example.decision.registration_service.entity.Service> getService(int id) {
        return serviceRepository.findById(id);
    }
}
