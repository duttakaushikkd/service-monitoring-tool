package com.example.decision.monitoring_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue
    int uuid;

    int service_id;

    int request_id;

    boolean decision_recieved;
}
