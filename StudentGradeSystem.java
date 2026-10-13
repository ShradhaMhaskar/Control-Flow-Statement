package com.tka;

public class StudentGradeSystem {
	public static void main(String args[]) {
		int marks=80;
		if(marks >=40) {
			System.out.println("Pass");
			if(marks >=90) {
				System.out.println("A Grade");
			}else if(marks >=75) {
				System.out.println("B Grade");
			}else {
				System.out.println("C Grade");
			}
		}else {
			System.out.println("Fail");
		}
	}

}
