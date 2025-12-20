package com.example.decision.registration_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.TypeBinderType;

@Entity
@Table(name = "registered_service")
public class Service {

    @Id
    @GeneratedValue
    int uuid;

    String service_id;

    String service_name;


}
