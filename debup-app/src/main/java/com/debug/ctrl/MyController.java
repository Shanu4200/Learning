package com.debug.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/about")
	public String getAbout() {
		String str = "This is a Test for Debugging.";
		str=str.toLowerCase();
		str=str.toUpperCase();
		return str;
	}

}
