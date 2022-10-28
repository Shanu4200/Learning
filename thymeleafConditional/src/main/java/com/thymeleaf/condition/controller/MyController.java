package com.thymeleaf.condition.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/if")
	public String conditionHandler(Model m) {
		
		System.out.println("If Handler Executed");
		
		m.addAttribute("gender", "M");
		
		List<Integer> list = List.of(243,654,865,321,986);
		
		m.addAttribute("mylist", list);
		
		return "if";
	}

}
