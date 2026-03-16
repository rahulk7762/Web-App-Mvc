package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/footwear")
public class Footwear {

	@GetMapping("/sliper")
	public String Sliper() {
		System.out.println("Footwear.Sliper()");
		return"sliper";
	}
	
	
	@GetMapping("/shoes")
	public String Shoes() {
		System.out.println("Footwear.Shoes()");
		return"shoes";
	}
	
	@GetMapping("/sandal")
	public String Sandal() {
		System.out.println("Footwear.Sandal()");
		return"sandal";
	}
	
}
