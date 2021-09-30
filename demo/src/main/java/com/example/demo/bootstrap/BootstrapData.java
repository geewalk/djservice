package com.example.demo.bootstrap;

import java.util.HashSet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.DJ;
import com.example.demo.domain.User;
import com.example.demo.repositories.DJRepository;
import com.example.demo.repositories.UserRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	private final UserRepository userRepository;
	private final DJRepository djRepository;
	
	public BootstrapData(UserRepository userRepository, DJRepository djRepository) {
		super();
		this.userRepository = userRepository;
		this.djRepository = djRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		
		User gwalk612 = new User("gwalk612@gmail.com", "Liverpool12", new DJ("geewalk", new User(), new HashSet<>()), new HashSet<>()); 
		User ryanjohnson = new User("ryanjohnson@gmail.com", "ryan101", new DJ("oldhomeplace", new User(), new HashSet<>()), new HashSet<>()); 
		User dustin = new User("wils@yahoo.com", "lostinyard99", new DJ("wilsonsStepBrother", new User(), new HashSet<>()), new HashSet<>()); 
		
//		geewalk.setUser(gwalk612);
//		oldhomeplace.setUser(ryanjohnson);
//		wilsonsstepbrother.setUser(dustin);
		
		
		userRepository.save(gwalk612);
//		userRepository.save(ryanjohnson);
//		userRepository.save(dustin);
		
		djRepository.save(gwalk612.getDjProfile());
//		djRepository.save(ryanjohnson.getDjProfile());
//		djRepository.save(dustin.getDjProfile());
		
		
		System.out.println(userRepository.findById(1L));
	}

}
