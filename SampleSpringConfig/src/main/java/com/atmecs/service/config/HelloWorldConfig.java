package com.atmecs.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.atmecs.service.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorldImpl helloWorld(){
		
		return new HelloWorldImpl();
	}
}
