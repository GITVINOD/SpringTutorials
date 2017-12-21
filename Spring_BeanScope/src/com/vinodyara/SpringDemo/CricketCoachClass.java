package com.vinodyara.SpringDemo;

public class CricketCoachClass implements Coach{

	/**
	 * No-arg constructor
	 */
	public CricketCoachClass() {
		super();
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	private FortuneService fortuneService;
	
	//add New fields for emailAddress and Team
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside settermethod of FortuneService");
		this.fortuneService = fortuneService;
	}

	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside Setter Method of EmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter Method of Team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
