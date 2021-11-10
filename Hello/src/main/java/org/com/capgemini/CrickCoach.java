package org.com.capgemini;

import org.springframework.stereotype.Component;

@Component("ccoach")
public class CrickCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Your Backlock";
	}

}
