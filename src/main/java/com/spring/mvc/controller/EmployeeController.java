package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/emp")
	public String emp() {
		System.out.println("EmployeeController.emp()");
		return "empl";
	}
	
	@GetMapping("/empl")
	public String empl() {
		System.out.println("EmployeeController.emp()");
		return "empl2";
	}
	
}
