package com.springboot.security.SpringBootSecurityDay3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Example3SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth->auth
				.requestMatchers("/api/products/**").permitAll()
				.requestMatchers("/api/orders/**").authenticated()
				.anyRequest().authenticated()
				)
		.formLogin(login->login.permitAll());
		return http.build();
		
	}

}
