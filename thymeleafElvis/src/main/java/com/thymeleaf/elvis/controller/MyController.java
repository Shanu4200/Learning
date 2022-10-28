package com.thymeleaf.elvis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		
		System.out.println("Conditional Handler Executed");
		
		m.addAttribute("isActive", true);
		
		return "condition";
	}

}
