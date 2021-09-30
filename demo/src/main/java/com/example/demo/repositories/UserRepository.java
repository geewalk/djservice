package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
    User findByEmail(String email);

    List<User> findAllByEmailLike(String email);

}
