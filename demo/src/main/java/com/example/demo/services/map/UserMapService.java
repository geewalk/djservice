package com.example.demo.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.services.UserService;

@Service
@Profile({"default", "map"})
public class UserMapService extends AbstractMapService<User, Long> implements UserService{
	

	@Override
	public User findByEmail(String email) {
	    return this.findAll()
                .stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
	}

	@Override
	public List<User> findAllByEmailLike(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Set<User> findAll() {
		 return super.findAll();
	}

	@Override
	public User findById(Long id) {
		return super.findById(id);
	}

	@Override
	public User save(User object) {
        return super.save(object);
	}

	@Override
	public void delete(User object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

}
