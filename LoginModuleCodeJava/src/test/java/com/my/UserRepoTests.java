package com.my;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepoTests {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("raja@gmail.com");
		user.setPassword("raja");
		user.setFirstName("raja");
		user.setLastName("Kumar");
		
		User savedUser = userRepo.save(user);
		
		User exstUser = entityManager.find(User.class, savedUser.getId());
		
		assertThat(exstUser.getEmail()).isEqualTo(user.getEmail());
	}
	
}
