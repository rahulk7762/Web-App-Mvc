package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class EmployeeController {
	
	static Map<Integer,Employee> map= null;
	static int empId = 0;
	static {
		
		map = new HashMap<>();
		map.put(++empId, new Employee(empId,"Mukesh","IT","Noida"));
		map.put(++empId, new Employee(empId,"Rakesh","IT","Noida"));
		map.put(++empId, new Employee(empId,"Nitesh","IOT","Noida"));
		map.put(++empId, new Employee(empId,"Abhishek","AI","Noida"));
		map.put(++empId, new Employee(empId,"Nakul","IT","Noida"));
	}

	@GetMapping("/getform")
	public String getForm() {
		return "Signup";
	}
	
	@PostMapping("/signupUser")
	public String postUser(@RequestParam(name = "username") String username, @RequestParam(name = "department") String department, @RequestParam(name = "address") String address, Model model) {
		
		System.out.println("Username"+username);
		System.out.println("Department"+department);
		System.out.println("Address"+address);
		
		model.addAttribute("username", username);
		model.addAttribute("department", department);
		model.addAttribute("address", address);
		
		return "success";
	}
	
//	Note :-- read the data and set to the variable using the @RequestParam and the below i have done the same thing from the @ModelAttribute Employee user and also by making the model of the Employee
	
	@GetMapping("/getsignupform")
	public String getForm2() {
		return "Signup2";
	}
	
	
	
	@PostMapping("/createUser")
	public String postUser(@ModelAttribute Employee employee,Model model) {
		
		System.out.println("UserController.postUser()");
		employee.setId(++empId);
		map.put(empId,employee);
		
		System.out.println(employee);
		return "success";
	}
	
	

	@GetMapping("/getEmpbyId/{id}")
	public String gerUser(@PathVariable(name = "id") int id,Model model) {
		
		System.out.println("UserController.gerUser()");
		Employee e = map.get(id);
		model.addAttribute("employee",e);
		return "success";
	}
	
}
