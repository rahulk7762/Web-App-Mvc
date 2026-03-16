package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

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
	public String CreateUser(@RequestParam(name = "user", defaultValue = "MY-DEFAULT-NAME") String name, Model model) {
		model.addAttribute("user", name);
		System.out.println("WelcomeController.greeting()");
		return "success";
	}
	
	
	@GetMapping("/path-var/{id}")
	public String PathVarExample(@PathVariable(name = "id") int id, Model model) {
		model.addAttribute("user", "sorry this :"+id+"Not found in our DB");
		System.out.println("WelcomeController.PathVarExample()");
		return "success";
	}
	
	
	@GetMapping("/getcookie")
	public String getCookieVal(@CookieValue(name = "JSESSIONID") String JSESSIONID, Model model) {
		model.addAttribute("cookie", "Your JSESSIONID is :"+JSESSIONID);
		System.out.println("JSESSIONID: "+JSESSIONID);
		return "cookieval";
	}
	
	@GetMapping("/getMycookie")
	public String getMyCookieVal(@CookieValue(name = "firstCookie") String firstCookie, Model model) {
		model.addAttribute("firstCookie", "Your getMycookie is :"+firstCookie);
		System.out.println("firstCookie: "+firstCookie);
		return "MyCookieVal";
	}
	
	@GetMapping("/setcookie")
	public String setCookieVal(HttpServletResponse response, Model model) {
		Cookie cookie1 = new Cookie("firstCookie","SensitiveInformation");
		cookie1.setMaxAge(100);
		response.addCookie(cookie1);
		System.out.println("WelcomeController.setCookieVal()");
		return "redirect:/getMycookie";
	}
	
	
	
}
