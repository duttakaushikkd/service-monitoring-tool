package com.example.decision.monitoring_service.Repository;

import com.example.decision.monitoring_service.DTO.RequestDto;
import com.example.decision.monitoring_service.entity.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer> {

    @Override
    <S extends Request> S save(S entity);

    Boolean save(RequestDto request);
}
