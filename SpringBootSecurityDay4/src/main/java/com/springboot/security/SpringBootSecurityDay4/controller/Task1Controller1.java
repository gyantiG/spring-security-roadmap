package com.springboot.security.SpringBootSecurityDay4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Example 1 — Two Users
@RestController
@RequestMapping("/task1")
public class Task1Controller1 {
	
	@GetMapping("/public")
	public String publicApi() {
		return "This is the public api - any one can access it";
	}
	
	@GetMapping("/user")
	public String user() {
		return "This is a user api - Only authorized users and admin can access this";
	}
	@GetMapping("/manager")
	public String manager() {
		return "This is a manager api - Only authorized manager can access this";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is an admin api - Only admin can access this ";
	}
}
