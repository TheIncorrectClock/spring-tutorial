package com.vogella.spring.first.di.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.vogella.spring.first.di" })
public class Config {

	@Bean
	public Long getId() {
		return Long.valueOf(0);
	}
	
	@Bean
	public String getSummary() {
		return "Spring DI";
	}
	
	@Bean
	public Boolean isDone() {
		return Boolean.FALSE;
	}
	
	@Bean
	public Date getDueDate() {
		return new Date();
	}
	
}
