package com.spingBasics;

public class BaseballCoach implements Coach {

	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//Define a constructor for DI
	
	 public BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		 fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
