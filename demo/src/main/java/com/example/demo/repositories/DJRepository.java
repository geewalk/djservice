package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.DJProfile;

public interface DJRepository extends CrudRepository<DJProfile, Long>{
	
    DJProfile findByDjName(String djName);

    List<DJProfile> findAllByDjNameLike(String djName);

}
