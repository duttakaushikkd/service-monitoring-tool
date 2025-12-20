package com.example.decision.registration_service.implementation;

import com.example.decision.registration_service.entity.Service;

import java.util.Optional;

public interface ServiceImplementation {

    public Service addService(Service service);

    public Optional<Service> getService(int id);
}
