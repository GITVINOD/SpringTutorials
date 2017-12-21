package com.vinodyara.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the Spring Configuration File
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// Let's call our Dependency injection Service
		System.out.println(theCoach.getFortune());
		
		// close the context
		context.close();
	}

}
