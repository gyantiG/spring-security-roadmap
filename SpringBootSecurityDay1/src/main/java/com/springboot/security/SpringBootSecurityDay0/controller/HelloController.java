package com.springboot.security.SpringBootSecurityDay0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello day1";
	}

	// task 1
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}

	// task 2
	@GetMapping("/about")
	public String about() {
		return "Learning spring security step by step";
	}

	// task 3
	@GetMapping("/user")
	public String user() {
		return "this is the user api";
	}

	// task 4
	@GetMapping("/admin")
	public String admin() {
		return "this is the admin api";
	}

	// task 5
	@GetMapping("/profile")
	public String profile() {
		return "this is the admin api";
	}

	// task 6
	@GetMapping("/employee")
	public String employee() {
		return "this is the employee api";
	}

}
