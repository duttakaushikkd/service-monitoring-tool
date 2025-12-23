package com.example.decision.monitoring_service.DTO;

public class RequestDto {

    int request_uuid;

    int service_id;

    int service_strength;

    public RequestDto(int request_uuid, int service_id, int service_strength) {
        this.request_uuid = request_uuid;
        this.service_id = service_id;
        this.service_strength = service_strength;
    }

    public int getRequest_uuid() {
        return request_uuid;
    }

    public void setRequest_uuid(int request_uuid) {
        this.request_uuid = request_uuid;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getService_strength() {
        return service_strength;
    }

    public void setService_strength(int service_strength) {
        this.service_strength = service_strength;
    }
}
