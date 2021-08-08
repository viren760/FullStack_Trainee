package com.spring.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		    .csrf().disable()
		    .authorizeRequests()
		    .antMatchers(HttpMethod.POST, "/banks").hasRole("ADMIN")
		    .anyRequest()
		    .permitAll()
		    .and()
		    .httpBasic();
		
		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("Viren").password("Viren").roles("ADMIN");
	auth.inMemoryAuthentication().withUser("Negi").password("Negi").roles("NORMAL"); 
	}
	
   @Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
   
   @Override
   @Bean
   public AuthenticationManager authenticationManagerBean() throws Exception {
     return super.authenticationManagerBean();
   }
	

	
	
}
