package com.tka;

public class OnlineShoppingDiscount {
	public static void main(String args[]) {
		int amount = 2000;
		boolean member = false;
		double discount;
		if (amount > 1000) {
			discount = amount * 10/100;
			System.out.println("You get discount :" + discount);
			if(member == true) {
				discount = amount * 20/100.0;
				System.out.println("Discount for members : " +discount);
			}else {
				System.out.println("No discount");
			}

		}
		else {
			System.out.println("You doesn't get discount");
		}
	}

}
