package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.hostmdy.di.service.GreetingService;

public class ContextController {

		
		public GreetingService greetingService;
		
		@Autowired
		public String sayHello() {
			return greetingService.sayHello();
		}
}
	

