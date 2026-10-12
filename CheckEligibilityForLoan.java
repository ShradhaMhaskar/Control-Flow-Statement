package com.tka;

public class CheckEligibilityForLoan {
	public static void main(String args[]) {
		int age=23;
		int salary=30000;
		if(age > 21 && salary >25000) {
			System.out.println("You are eligible for loan");
		}else {
			System.out.println("You are not eligible for loan");
		}
	}

}
