package com.tka;

public class CalculatorUsingSwitchCase {
	public static void main(String args[]) {
		int num1=4,num2=5;
		char operator='*';
		switch (operator) {
		case '+':
			System.out.println("Addition: " +(num1+num2));
		break;
		case '-':
			System.out.println("Subtraction: "+(num1-num2));
		break;
		case '*':
			System.out.println("Multiplication: "+(num1*num2));
		break;
		case '/':
			System.out.println("Division: "+(num1/num2));
		break;
		default:
			System.out.println("Invalid input");
		
		}
	}

}
