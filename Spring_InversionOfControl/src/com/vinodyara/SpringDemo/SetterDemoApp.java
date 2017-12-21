package com.vinodyara.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		CricketCoachClass theCoach=context.getBean("myCricketCoach",CricketCoachClass.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeamName());
		
		//close the context
		context.close();
	}

}
