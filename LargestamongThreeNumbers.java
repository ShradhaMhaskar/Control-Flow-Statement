package com.tka;

public class LargestamongThreeNumbers {
	public static void main(String args[]) {
		int num1 = 45;
		int num2 = 78;
		int num3 = 25;
		if (num1 > num2 && num1 > num3) {
			System.out.println("Num1 is largest : " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Num1 is largest : " + num2);

		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Num1 is largest : " + num3);

		} else {
			System.out.println(" All are Equals");
		}
	}

}
