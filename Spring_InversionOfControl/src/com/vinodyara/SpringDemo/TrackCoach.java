package com.vinodyara.SpringDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param fortuneService
	 */
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkOut() {
		
		return "Run 5k Hard";
	}

	@Override
	public String getFortune() {
		return "This is from Track Coach"+ fortuneService.getFortune();
	}

}
