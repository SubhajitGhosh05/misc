package com.spingBasics;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach : "+fortuneService.getFortune();
	}

	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff method ");
	}
	
	//Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff method ");
	}
}