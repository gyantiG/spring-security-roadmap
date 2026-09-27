package com.springboot.security.SpringBootSecurityDay3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Example3Controller {
	
	@GetMapping("/products")
	public String products() {
		return "All Products";
	}
	
	@GetMapping("/products/{id}")
	public String produc(@PathVariable int id) {
		return "Product of :: "+id;
	}
	
	@GetMapping("/orders")
	public String orders() {
		return "All the orders";
	}
	
	@GetMapping("/orders/{id}")
	public String order(@PathVariable int id) {
		return "Order of :: "+id;
	}
}
