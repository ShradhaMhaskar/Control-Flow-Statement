package com.tka;

public class PrintLanguageName {
	public static void main(String args[]) {
		int langCode = 1;
		switch (langCode) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("Python");
			break;
		case 3:
			System.out.println("C++");
			break;
		case 4:
			System.out.println("JavaScript");
			break;
		default:
			System.out.println("Invalid language code");

		}
	}

}
