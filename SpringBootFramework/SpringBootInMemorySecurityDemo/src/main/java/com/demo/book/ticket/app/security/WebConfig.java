package com.demo.book.ticket.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests().antMatchers("/api/tickets/**")
			.hasAnyRole("admin", "user").and().formLogin();
		http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**")
			.hasAnyRole("admin").and().formLogin();
		
		//Refactor
		/*http.csrf().disable().authorizeRequests().antMatchers("/api/tickets/**").hasAnyRole("admin", "user")
		 .and()
		 .authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("admin").and().formLogin();*/
		
	}
	
	@Autowired
	public void configurewGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("rocky").password("rocky@123").roles("user");
		auth.inMemoryAuthentication().withUser("martin").password("matin@123").roles("user","admin");
		
		//Refactor
		/*auth.inMemoryAuthentication().withUser("rocky").password("rocky@123").roles("user")
		  .and()
		  .withUser("martin").password("matin@123").roles("user","admin");*/
	}

}
