package com.tka;

public class CheckNumberPositiveOrEven {
	public static void main(String args[]) {
		int num=8;
		if(num > 0 && num % 2 == 0) {
			System.out.println("The entered number is positive and even");
		}else {
			System.out.println("The entered number is not positive and not even");
		}
	}

}
