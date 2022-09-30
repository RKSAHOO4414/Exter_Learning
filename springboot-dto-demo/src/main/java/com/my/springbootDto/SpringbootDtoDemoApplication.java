package com.my.springbootDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.springbootDto.model.Location;
import com.my.springbootDto.model.User;
import com.my.springbootDto.repo.LocationRepository;
import com.my.springbootDto.repo.UserRepository;

@SpringBootApplication
public class SpringbootDtoDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoDemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		
		locationRepository.save(location);
		
		User user1 = new User();
		user1.setFirstName("raja");
		user1.setLastName("kumar");
		user1.setEmail("raja@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);
		
		User user2 = new User();
		user2.setFirstName("rani");
		user2.setLastName("kumari");
		user2.setEmail("rani@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);

		
	}

}
