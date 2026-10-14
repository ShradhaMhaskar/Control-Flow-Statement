package com.tka;

public class SeasonFinder {
	public static void main(String args[]) {
		int number = 4;
		switch (number) {
		case 12, 1, 2:
			System.out.println("Winter");
			break;
		case 3, 4, 5:
			System.out.println("Summer");
			break;
		case 6, 7, 8:
			System.out.println("Monsoon");
			break;
		default:
			System.out.println("Unknown season");

		}
	}

}
