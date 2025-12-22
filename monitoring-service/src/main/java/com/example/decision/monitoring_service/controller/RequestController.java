package com.example.decision.monitoring_service.controller;


import com.example.decision.monitoring_service.Implementation.RequestImplementation;
import com.example.decision.monitoring_service.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/monitoring")
public class RequestController {

    @Autowired
    RequestImplementation requestImplementation;

    @PostMapping("/request")
    public String requestMap(Request request){
        requestImplementation.addRequest(request);
        return "Request routed";
    }
}
