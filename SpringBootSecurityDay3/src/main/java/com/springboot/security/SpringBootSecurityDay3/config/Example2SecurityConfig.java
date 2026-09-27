//package com.springboot.security.SpringBootSecurityDay3.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class Example2SecurityConfig {
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests(auth->auth
//				.requestMatchers("/register","/login","/about","/product").permitAll()
//				.requestMatchers("/profile","/order").authenticated()
//				.anyRequest().authenticated()
//				)
//		.formLogin(login->login.permitAll());
//		return http.build();
//		
//	}
//
//}
