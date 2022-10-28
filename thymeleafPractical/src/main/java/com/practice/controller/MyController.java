package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside the Handler");
		
		model.addAttribute("name","Vishal Singh");
		
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		return"about";
	}
	
	//Iteration Handler
	
	@GetMapping("/example-loop")
	public String iterationHandler(Model m) {
		
		List<String> names = List.of("Vishal","Vijay","Shanu","Janu");
		
		m.addAttribute("names",names);
		
		return"iterate";
	}

}
