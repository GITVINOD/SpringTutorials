package com.vinodyara.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 //load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		 // retrieve the bean from spring container
		CricketCoachClass theCoach=context.getBean("myCricketCoach", CricketCoachClass.class);
		
		//Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
