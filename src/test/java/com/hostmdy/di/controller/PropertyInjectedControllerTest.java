package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController = 
			new PropertyInjectedController();
	

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingServiceImpl = new GreetingServiceImpl();
		propertyInjectedController.greetingService = greetingServiceImpl;
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,propertyInjectedController.sayHello());
	}

}
