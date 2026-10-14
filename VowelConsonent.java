package com.tka;

public class VowelConsonent {
	public static void main(String args[]) {
		char alph = 'U';
		switch (alph) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");

		}
	}

}
