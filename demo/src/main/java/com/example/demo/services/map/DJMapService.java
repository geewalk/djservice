package com.example.demo.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.domain.DJProfile;
import com.example.demo.services.DJService;

@Service
public class DJMapService extends AbstractMapService<DJProfile, Long> implements DJService{
	
	@Override
	public Set<DJProfile> findAll() {
		 return super.findAll();
	}

	@Override
	public DJProfile findById(Long id) {
		return super.findById(id);
	}

	@Override
	public DJProfile save(DJProfile object) {
        return super.save(object);
	}

	@Override
	public void delete(DJProfile object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	@Override
	public DJProfile findByDjName(String djName) {
	    return this.findAll()
                .stream()
                .filter(dj -> dj.getDjName().equalsIgnoreCase(djName))
                .findFirst()
                .orElse(null);
	}

	@Override
	public List<DJProfile> findAllByDjNamelike(String djName) {
		// TODO Auto-generated method stub
		return null;
	}
}
