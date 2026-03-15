package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

//	@RequestMapping("/")
//	@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	@GetMapping("/login")
	public String LoginUser() {
		System.out.println("WelcomeController.LoginUser()");
		return "login";
	}
	
	
	
	@GetMapping("/req-param")
	public String CreateUser(@RequestParam(name = "user") String name,Model model) {
		model.addAttribute("user",name);
		System.out.println("WelcomeController.greeting()");
		return "success";
	}
	
	
}
