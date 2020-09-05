package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//init method
	public void coachStartup() {
		System.out.println("\nPerforming initialization");
	}
	
	//destroy method
	public void coachShutdown() {
		System.out.println("\nPerforming destruction");
	}
}
