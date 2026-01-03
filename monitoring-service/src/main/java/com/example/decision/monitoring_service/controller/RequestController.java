package com.example.decision.monitoring_service.controller;


import com.example.decision.monitoring_service.DTO.RequestDto;
import com.example.decision.monitoring_service.Implementation.RequestImplementation;
import com.example.decision.monitoring_service.entity.Request;
import com.example.decision.monitoring_service.service.publishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/monitoring")
public class RequestController {
//
//    @Autowired
//    RequestImplementation requestImplementation;

    @Autowired
    public  publishService publishService;

    @PostMapping("/request")
    public String requestMap(@RequestBody  RequestDto requestDto){

        try{
            publishService.publishMessage(requestDto);
        }catch (Exception e){
            throw  e;
        }
//        requestImplementation.addRequest(requestDto);
        return "Request routed";
    }
}
