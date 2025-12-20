package com.example.decision.registration_service.repository;

import com.example.decision.registration_service.entity.Service;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ServiceRepository extends CrudRepository<Service, Integer> {

    @Override
    <S extends Service> S save(S entity);

    @Override
    Optional<Service> findById(Integer integer);
}
