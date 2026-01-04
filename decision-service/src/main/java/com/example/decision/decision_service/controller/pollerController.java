package com.example.decision.decision_service.controller;

import com.example.decision.decision_service.implementation.pollerImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decision/v1/")
public class pollerController {

    @Autowired
    public pollerImplementation pollerImpl;

    @GetMapping("/poll")
    public String pollMessage(Object event){
        try{
            pollerImpl.pollMessage(event  );
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        return "Message polled";
    }
}
