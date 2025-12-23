package com.example.decision.monitoring_service.service;

import com.example.decision.monitoring_service.DTO.RequestDto;
import com.example.decision.monitoring_service.Implementation.RequestImplementation;
import com.example.decision.monitoring_service.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RequestService implements RequestImplementation {

    @Autowired
    RequestRepository requestRepository;

    @Override
    public String addRequest(RequestDto request) {
        //pubish event to kafka
        return requestRepository.save(request).toString();
    }
}
