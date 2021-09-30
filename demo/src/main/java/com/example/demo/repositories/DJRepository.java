package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.DJProfile;

public interface DJRepository extends CrudRepository<DJProfile, Long>{

}
