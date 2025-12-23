package com.example.decision.monitoring_service.service;

import com.example.decision.monitoring_service.DTO.RequestDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class publishService {

    private final KafkaTemplate<String, RequestDto> kafkaTemplate;


    public publishService(KafkaTemplate<String, RequestDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

public void publishMessage(RequestDto requestDto){
        kafkaTemplate.send("monitoring-event", requestDto);
        System.out.println("Message published successfully");
    }
}
