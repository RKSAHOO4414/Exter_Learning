package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("channel", "okay java");
		
		return "index";
	}
	
	@GetMapping("/locale")
	public String changeLocal(@RequestParam String language, Model model) {
		System.out.println("language selected = "+language);
		model.addAttribute("channel", "okay java");
		return "index";
	}
	
}
