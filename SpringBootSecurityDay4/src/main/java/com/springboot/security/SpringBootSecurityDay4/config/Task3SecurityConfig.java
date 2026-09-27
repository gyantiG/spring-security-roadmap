package com.springboot.security.SpringBootSecurityDay4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Task3SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		UserDetails employee=User.builder()
				.username("employee")
				.password(passwordEncoder.encode("employee123"))
				.authorities("READ_REPORT")
				.build();
		
		UserDetails manager=User.builder()
				.username("manager")
				.password(passwordEncoder.encode("manager123"))
				.authorities("READ_REPORT","WRITE_REPORT")
				.build();
		UserDetails admin=User.builder()
				.username("admin")
				.password(passwordEncoder.encode("admin123"))
				.authorities("READ_REPORT","WRITE_REPORT","DELETE_REPORT")
				.build();
		
				return new InMemoryUserDetailsManager(employee,manager,admin);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(auth-> auth
				.requestMatchers("/task3/report/read")
				.hasAuthority("READ_REPORT")
				.requestMatchers("/task3/report/write")
				.hasAuthority("WRITE_REPORT")
				.requestMatchers("/task3/report/delete")
				.hasAuthority("DELETE_REPORT")
				.anyRequest().authenticated()
				).formLogin(form->form.permitAll());
		
		return httpSecurity.build();
	}

}
