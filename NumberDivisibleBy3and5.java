package com.tka;

public class NumberDivisibleBy3and5 {
	public static void main(String args[]) {
		int num=17;
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("Number is divisible by 3 and 5");
		}else {
			System.out.println("Number is not divisible by 3 and 5");
		}
	}

}
