package com.tka;

public class ATMWithdrawal {
	public static void main(String args[]) {
		int balance=10000;
		int withdrawalAmount=5000;
		if(balance >= withdrawalAmount ){
			 if( withdrawalAmount % 100 == 0) {
			System.out.println("Withdrawal Succesful..");
		} else {
			System.out.println("Invalid denomination");
		} 
		}else {System.out.println("Insufficient balance");}
		
	}

}
