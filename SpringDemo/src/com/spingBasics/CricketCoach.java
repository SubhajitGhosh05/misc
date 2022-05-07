package com.spingBasics;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;

	// create a no-arg constructor

	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor ");
	}

	// Generate getter,setter for emailAddress and team

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method EmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method Team()");
		this.team = team;
	}

	// create setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method fortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast Bowling for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
