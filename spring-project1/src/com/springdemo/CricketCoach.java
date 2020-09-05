package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//private fields for email address and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("CricketCoach: inside email setter");
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: inside team setter");
	}



	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: fortune service inside setter");
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
