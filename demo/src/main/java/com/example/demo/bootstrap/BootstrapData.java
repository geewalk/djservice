package com.example.demo.bootstrap;

import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.DJProfile;
import com.example.demo.domain.User;
import com.example.demo.repositories.DJRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.DJService;
import com.example.demo.services.UserService;

@Component
@Transactional
public class BootstrapData implements CommandLineRunner{
	
//	private final UserRepository userRepository;
//	private final DJRepository djRepository;
//	
//	public BootstrapData(UserRepository userRepository, DJRepository djRepository) {
//		super();
//		this.userRepository = userRepository;
//		this.djRepository = djRepository;
//	}
	
	private final UserService userService;
	private final DJService djService;
	

	public BootstrapData(UserService userService, DJService djService) {
		super();
		this.userService = userService;
		this.djService = djService;
	}


	@Override
	public void run(String... args) throws Exception {
		
		User gwalk612 = new User("gwalk612@gmail.com", "Liverpool12"); 
		DJProfile geewalk = new DJProfile("geewalk");
		gwalk612.getDjProfiles().add(geewalk);
		geewalk.getUsers().add(gwalk612);
		
		userService.save(gwalk612);
		djService.save(geewalk);
		
		User ryanjohnson = new User("ryanjohnson@gmail.com", "themixup"); 
		DJProfile oldhomeplace = new DJProfile("oldhomeplace");
		ryanjohnson.getDjProfiles().add(oldhomeplace);
		oldhomeplace.getUsers().add(ryanjohnson);
		
		
		
		userService.save(ryanjohnson);
		djService.save(oldhomeplace);
		
		User dustin = new User("dustin@gmail.com", "bluegrass01"); 
		DJProfile wilsonsstepbrother = new DJProfile("wilsonsstepbrother");
		dustin.getDjProfiles().add(wilsonsstepbrother);
		wilsonsstepbrother.getUsers().add(dustin);
		
		userService.save(dustin);
		djService.save(wilsonsstepbrother);
		
		
        System.out.println("Started in Bootstrap");
        System.out.println(userService.findAll());
        System.out.println(djService.findAll());
        
        
	}

}
