package com.tka;
     public class CheckCharacterIsVowelOrConsonant {
	    public static void main(String args[]) {

	        char character = '0';

	        if (Character.isLetter(character)) {

	            if (character == 'a'||character == 'e'||character == 'i'||character == 'o'||character == 'u'||character == 'A'||character == 'E'||character == 'I'||character == 'O'||character == 'U') {

	                System.out.println("Vowel");

	            } else {
	                System.out.println("Consonant");
	            }

	        } else if (Character.isDigit(character)) {
	            System.out.println("Digit");

	        } else {
	            System.out.println("Special character");
	        }
	    }
	}
	


