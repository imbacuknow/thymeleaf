package com.example.demo.repository;

import com.example.demo.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long>{
}