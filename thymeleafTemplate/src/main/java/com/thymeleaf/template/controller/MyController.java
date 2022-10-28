package com.thymeleaf.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/aboutnew")
	public String newAbout() {
		
		System.out.println("About Successful!!!");
		
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		System.out.println("Contact Successful!!!");
		
		return "contact";
	}


}
  