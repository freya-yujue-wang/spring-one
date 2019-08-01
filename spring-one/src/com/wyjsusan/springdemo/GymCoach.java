package com.wyjsusan.springdemo;

public class GymCoach implements Coach {
	public String getDailyWorkout() {
		return "Spend 60 minutes on lifting weights.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
