package com.springboot.security.SpringBootSecurityDay1.controller;

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

}
