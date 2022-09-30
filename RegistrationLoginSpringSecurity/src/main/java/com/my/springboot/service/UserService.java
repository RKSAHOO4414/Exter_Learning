package com.my.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.my.springboot.model.User;
import com.my.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
