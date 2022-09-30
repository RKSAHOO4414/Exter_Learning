package com.my.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
