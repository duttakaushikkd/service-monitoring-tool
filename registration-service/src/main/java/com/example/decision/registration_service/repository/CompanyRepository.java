package com.example.decision.registration_service.repository;

import com.example.decision.registration_service.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

    @Override
    <S extends Company> S save(S entity);

    @Override
    Optional<Company> findById(Integer integer);
}
