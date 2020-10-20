package com.example.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class TestSpringSecurity extends WebSecurityConfigurerAdapter {
	
	@Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// enable in memory based authentication with a user named
        // "user" and "admin"
	        auth.inMemoryAuthentication()
	        	.withUser("user")
	        	.password("password")
	        	.roles("USER")
	        	.and()
	            .withUser("admin")
	            .password("password")
	            .roles("USER", "ADMIN");
	 }

		@Bean
		public PasswordEncoder getPasswordenc()
		{
			return NoOpPasswordEncoder.getInstance();
		}
	
	

}