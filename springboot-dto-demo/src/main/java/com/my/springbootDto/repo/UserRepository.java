package com.my.springbootDto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.springbootDto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
