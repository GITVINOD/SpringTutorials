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
	public String getDailyWorkout() {
		
		return "Run 5k Hard";
	}

	@Override
	public String getDailyFortune() {
		return "This is from Track Coach"+ fortuneService.getFortune();
	}

}
