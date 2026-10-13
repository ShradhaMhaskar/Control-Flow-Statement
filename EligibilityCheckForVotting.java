package com.tka;

public class EligibilityCheckForVotting {
	public static void main(String args[]) {
		int age=24;
		if(age > 18 && age < 120) {
			System.out.println("You are eligible for votting");
		}else {
			System.out.println("You are noteligible for votting");
		}
	}

}
