package com.example.demo.services.springdatajpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserSDJService implements UserService{
	
	private final UserRepository userRepository;
	

	public UserSDJService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        userRepository.findAll().forEach(users::add);
        return users;
	}

	@Override
	public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
	}

	@Override
	public User save(User object) {
        return userRepository.save(object);
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllByEmailike(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
