package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is the Home URL");
		model.addAttribute("name", "Vishal Singh");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about URL");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services URL");
		return "services";
	}
	
	@RequestMapping("/help")
	public String help(Model model) {
		System.out.println("This is help URL");
		model.addAttribute("rollnumber", 2110982010);
		LocalDateTime now = LocalDateTime.now();
		model.addAttribute("time", now);
		List<Integer> list = new ArrayList<Integer>();
		list.add(94);
		list.add(98);
		list.add(93);
		list.add(92);
		model.addAttribute("marks", list);
		return "help";
	}

}
