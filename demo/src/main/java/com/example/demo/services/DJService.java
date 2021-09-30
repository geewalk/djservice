package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.DJProfile;
import com.example.demo.domain.User;

public interface DJService extends CrudService<DJProfile, Long>{
	
    User findByDjName(String djName);

    List<DJProfile> findAllByDjNamelike(String djName);

}
