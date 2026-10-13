package com.tka;

public class TicketPriceBasedOnAge {
	public static void main(String args[]) {
		int age=65;
		int ticketPrice;
		
			if(age >=65) {
				ticketPrice=70;
				System.out.println("Senior discount : " +ticketPrice);
				if(age >=18) {
					ticketPrice=150;
					System.out.println("Ticket Price : " +ticketPrice);
			}else {
				ticketPrice=50;
				System.out.println("Child ticket");
			}
	}
		else {
			System.out.println("Normal Price");
		}
	}

}

