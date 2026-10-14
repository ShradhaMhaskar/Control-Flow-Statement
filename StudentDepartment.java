package com.tka;

public class StudentDepartment {
	public static void main(String args[]) {
		int deptNumber = 3;
		switch (deptNumber) {
		case 1:
			System.out.println("Computer Science");
			break;
		case 2:
			System.out.println("Mechanical");
			break;
		case 3:
			System.out.println("Civil");
			break;
		case 4:
			System.out.println("Electrical");
			break;
		default:
			System.out.println("Invalid department number");

		}
	}

}
