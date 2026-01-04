package com.example.decision.decision_service.service;

import com.example.decision.decision_service.implementation.pollerImplementation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class pollerService implements pollerImplementation {

    @KafkaListener(
            topics = "monitoring-event",
            groupId = "monitoring-consumer-group"
    )

    @Override
    public String pollMessage(Object event) {
        System.out.println("Consumed message: " + event);
        return "consumed !!";
    }
}
