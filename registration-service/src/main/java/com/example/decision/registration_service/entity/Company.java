package com.example.decision.registration_service.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "registered_company")
public class Company {

    @Id
    @GeneratedValue
    int uuid;

    int company_id;

    String company_name;

    String registered_address;

    String service_count;

    Date created_at;


}
