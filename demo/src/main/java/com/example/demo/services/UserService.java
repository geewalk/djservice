package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.User;

public interface UserService extends CrudService<User, Long>{
	
    User findByEmail(String email);

    List<User> findAllByEmailike(String email);

}
