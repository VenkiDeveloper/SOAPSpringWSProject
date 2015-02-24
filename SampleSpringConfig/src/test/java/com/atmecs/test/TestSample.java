package com.atmecs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atmecs.service.HelloWorldImpl;
import com.atmecs.service.config.HelloWorldConfig;

public class TestSample {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorldImpl helloWorld = ctx.getBean(HelloWorldImpl.class);
		helloWorld.setMsg("Venki");
		System.out.println("Output is"+helloWorld.getMsg());
	}
}
