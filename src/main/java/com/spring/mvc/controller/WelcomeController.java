package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

//	@RequestMapping("/")
//	@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index.jsp";
	}
	
	@GetMapping("/login")
	public String LoginUser() {
		System.out.println("WelcomeController.LoginUser()");
		return "login.jsp";
	}
	
	
	
	@GetMapping("/signup")
	public String CreateUser() {
		System.out.println("WelcomeController.greeting()");
		return "success.jsp";
	}
	
	
}
