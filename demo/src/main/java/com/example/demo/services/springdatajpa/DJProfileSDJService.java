package com.example.demo.services.springdatajpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.domain.DJProfile;
import com.example.demo.domain.User;
import com.example.demo.repositories.DJRepository;
import com.example.demo.services.DJService;

@Service
public class DJProfileSDJService implements DJService{
	
	private final DJRepository djRepository;
	

	public DJProfileSDJService(DJRepository djRepositories) {
		super();
		this.djRepository = djRepositories;
	}

	@Override
	public Set<DJProfile> findAll() {
        Set<DJProfile> djs = new HashSet<>();
        djRepository.findAll().forEach(djs::add);
        return djs;
	}

	@Override
	public DJProfile findById(Long id) {
        return djRepository.findById(id).orElse(null);
	}

	@Override
	public DJProfile save(DJProfile object) {
        return djRepository.save(object);
	}

	@Override
	public void delete(DJProfile object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByDjName(String djName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DJProfile> findAllByDjNamelike(String djName) {
		// TODO Auto-generated method stub
		return null;
	}

}
