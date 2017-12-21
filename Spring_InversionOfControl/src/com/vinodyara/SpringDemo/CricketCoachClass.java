package com.vinodyara.SpringDemo;

public class CricketCoachClass implements Coach {
	
	private FortuneService fortuneService;
	
	//add new field for emailaddress and team
	private String emailAddress;
	private String teamName;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("We are inside emailAddress setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("We are inside teamName setter method");
		this.teamName = teamName;
	}

	//create no-arg constructor
	public CricketCoachClass() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//Our setter Method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("We are inside fortuneService setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practise 15mins of Staight Drive";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
