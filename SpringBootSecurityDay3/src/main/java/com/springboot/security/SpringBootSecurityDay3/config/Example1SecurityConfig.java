//package com.springboot.security.SpringBootSecurityDay3.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class Example1SecurityConfig {
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//		
//		httpSecurity.authorizeHttpRequests(auth->auth
//				.requestMatchers("/public").permitAll()
//				.requestMatchers("/user").authenticated()
//				.requestMatchers("/admin").authenticated()
//				.anyRequest().authenticated()
//				)
//		.formLogin(login->login.permitAll());
//
//		return httpSecurity.build();
//	}
//
//}
