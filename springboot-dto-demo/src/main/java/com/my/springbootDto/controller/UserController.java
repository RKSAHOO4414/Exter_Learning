package com.my.springbootDto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.springbootDto.dto.UserLocationDto;
import com.my.springbootDto.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users-location")
	public List<UserLocationDto> getAllUsersLocation(){
		return userService.getAllUsersLocation();
	}
	
}
