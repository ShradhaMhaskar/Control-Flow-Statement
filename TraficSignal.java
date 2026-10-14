package com.tka;

public class TraficSignal {
	public static void main(String args[]) {
		String clr = "green";
		switch (clr) {
		case "red":
			System.out.println("Stop...!");
			break;
		case "yellow":
			System.out.println("Ready to go...!");
			break;
		case "green":
			System.out.println("Go...!");
			break;
		default:
			System.out.println("Invalid color");

		}
	}

}
