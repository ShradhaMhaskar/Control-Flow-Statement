package com.tka;

public class CheckingDay {
	public static void main(String args[]) {
		int dayNum=12;
		switch(dayNum) {
		case 1,2,3,4,5:
			System.out.println("Weekday");
		break;
		case 6,7:
			System.out.println("Weekend");
		break;
		default:
			System.out.println("Invalid day number");
		}
	}

}
