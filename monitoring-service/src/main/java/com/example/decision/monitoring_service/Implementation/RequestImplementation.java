package com.example.decision.monitoring_service.Implementation;

import com.example.decision.monitoring_service.DTO.RequestDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface RequestImplementation {

    public String addRequest(RequestDto request);
}
