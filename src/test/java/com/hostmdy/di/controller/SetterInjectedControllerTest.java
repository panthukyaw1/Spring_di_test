package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController=
			new SetterInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		setterInjectedController.setGreetingService(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,setterInjectedController.sayHello());

	}
}