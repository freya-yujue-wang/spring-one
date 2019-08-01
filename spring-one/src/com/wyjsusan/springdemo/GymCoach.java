package com.wyjsusan.springdemo;

public class GymCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GymCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 60 minutes on lifting weights.";
	}

	@Override
	public String getDailyFortune() {
		return "Wow" + fortuneService.getFortune();
	}
}
