package com.tka;

public class AreaCalculator {
	public static void main(String args[]) {
		int num=1;
		switch(num) {
		case 1:
			float r=3.5f;
			System.out.println("Area of a circle : " +(3.14*r*r));
			break;
		case 2:
			float l=5.0f , b=3.5f;
			System.out.println("Area of a rectangle : " +(l*b));
			break;
		case 3:
			float s=4;
			System.out.println("Area of a circle : " +(s*s));
			break;
			default:
				System.out.println("Invalid number");
		}
		
	}

}
