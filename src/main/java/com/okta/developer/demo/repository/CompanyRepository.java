package com.okta.developer.demo.repository;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

import com.okta.developer.demo.domain.Company;

public interface CompanyRepository extends ReactiveNeo4jRepository<Company, Long>{
    
}
