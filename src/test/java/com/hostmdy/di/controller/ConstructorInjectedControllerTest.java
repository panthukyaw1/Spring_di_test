package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		constructorInjectedController = new ConstructorInjectedController(greetingService);

	}
	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,constructorInjectedController.sayHello());

	}
	
}
