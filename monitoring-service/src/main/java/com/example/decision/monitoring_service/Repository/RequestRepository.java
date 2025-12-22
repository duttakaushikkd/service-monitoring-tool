package com.example.decision.monitoring_service.Repository;

import com.example.decision.monitoring_service.entity.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Integer> {

    @Override
    <S extends Request> S save(S entity);
}
