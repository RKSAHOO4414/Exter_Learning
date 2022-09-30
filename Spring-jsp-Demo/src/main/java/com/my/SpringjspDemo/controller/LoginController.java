package com.my.SpringjspDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap mm , @RequestParam String userId, @RequestParam String password) {
		
		if(userId.equals("admin") && password.equals("root")) {
			mm.put("userId", userId);
			return "welcome";
		}
		
		mm.put("errormsg", "provide correct userid and password");
		
		return "login";
	}
	
}
