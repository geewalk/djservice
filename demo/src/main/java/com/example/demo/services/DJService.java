package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.DJProfile;

public interface DJService extends CrudService<DJProfile, Long>{
	
    DJProfile findByDjName(String djName);

    List<DJProfile> findAllByDjNamelike(String djName);

}
