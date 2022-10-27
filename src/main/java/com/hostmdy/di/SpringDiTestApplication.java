package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.ConstructorInjectedController;
import com.hostmdy.di.controller.ContextController;
import com.hostmdy.di.controller.PropertyInjectedController;
import com.hostmdy.di.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiTestApplication.class, args);
		
//		ContextController contextController = (ContextController) context.getBean("contextController");
//		System.out.println(contextController.sayHello());
	
		PropertyInjectedController propertyInjectedBean = context.getBean(PropertyInjectedController.class);
		System.out.println("propertyInjectedBean : "+propertyInjectedBean.sayHello());
		
		SetterInjectedController setterInjectedBean = context.getBean(SetterInjectedController.class);
		System.out.println("SetterInjectedBean : "+setterInjectedBean.sayHello());
		
		ConstructorInjectedController constructorInjectedBean = context.getBean(ConstructorInjectedController.class);
		System.out.println("ConstructorInjectedBean : "+constructorInjectedBean.sayHello());
	}

}
