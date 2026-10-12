package com.tka;

public class CalculateElecBillBasedOnUnits {
	public static void main(String args[]) {
		int units = 155;
		int bill;
		if (units ==0) {
			System.out.println("Invalid units");
		} else if (units <= 100) {
			bill=100*5;
			System.out.println("Electricity bill Rs :" +bill);

		} else if (units <=200) {
			bill=(100*5) + ((units-100)*7);
			System.out.println("Electricity bill Rs :" +bill);

		}else {
			bill=(100*5)+(100*7)+((units-200)*10);
			System.out.println("Electricity bill Rs :"+bill);
		}
	}

}
