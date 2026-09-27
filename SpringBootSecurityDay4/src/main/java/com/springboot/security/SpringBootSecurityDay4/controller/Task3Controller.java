package com.springboot.security.SpringBootSecurityDay4.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Practice Task 3 — Authorities
@RestController
@RequestMapping("/task3")
public class Task3Controller {
	
	@GetMapping("/report/read")
	public String readReport() {
		return "Task3- Report read API successful...";
	}
	
	@PostMapping("/report/write")
	public String writeReport() {
		return "Task3- Report write API successful...";
	}
	
	@DeleteMapping("/report/delete")
	public String deleteReport() {
		return "Task3- Report write API successful...";
	}
}
