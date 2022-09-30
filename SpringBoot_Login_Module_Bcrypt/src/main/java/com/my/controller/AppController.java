package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.dao.UserRepo;
import com.my.model.User;

@Controller
public class AppController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/")
	public String login() {
		return "about";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
	
	@RequestMapping("/saveData")
	@ResponseBody
	public String saveData(User user) {
		repo.save(user);
		return "success";
	}
	
}
