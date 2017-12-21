package com.vinodyara.SpringDemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for the dependency.
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		
		return "Repeat 30 mins of Batting Practise";
	}

	@Override
	public String getFortune() {
		
		//use the fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
}
