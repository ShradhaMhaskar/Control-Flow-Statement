package com.tka;

public class CategoryBasedOnMarks {
	public static void main(String args[]) {
		int categoryNo = 1;
		switch (categoryNo) {
		case 1:
			System.out.println("Pass");
			break;
		case 2:
			System.out.println("Distiction");
			break;
		case 3:
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid marks and category");

		}
	}

}
