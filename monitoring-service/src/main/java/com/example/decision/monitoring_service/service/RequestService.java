package com.example.decision.monitoring_service.service;

import com.example.decision.monitoring_service.Implementation.RequestImplementation;
import com.example.decision.monitoring_service.Repository.RequestRepository;
import com.example.decision.monitoring_service.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;

public class RequestService implements RequestImplementation {

    @Autowired
    RequestRepository requestRepository;

    @Override
    public String addRequest(Request request) {
        return requestRepository.save(request).toString();
    }
}
