package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		String text = "This is a private page.";
		
		text+="This Page is now allowed to Unauthenticated Users.";
		
		return text;
	}
	
	@RequestMapping("/getusers")
	public String getUser()
	{
		return "{\"name\":\"Vishal\"}";
	}

}
