package com.tka;

public class ElectricityBill {
	public static void main(String args[]) {
		int units=50;
		int bill;
		if(units <=100) {
			bill=units*5;
			System.out.println("Electricity Bill Rs : " +bill);
		}else if(units <=200) {
			bill=units*7;
			System.out.println("Electricity Bill Rs : " +bill);
		}else {
			bill=units*10;
			System.out.println("Electricity Bill Rs : " +bill);
		}
	}

}
