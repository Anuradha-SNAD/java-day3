package org.snad.Exceptions;

import java.util.Scanner;

public class CustomException2 {
	public static void main(String[] args) {
		int balance = 10000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("======Welcome======");
		System.out.println("1. Total Balance");
		System.out.println("2. Withdraw");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Total Balance = "+balance);
		}else if(n==2){
			System.out.println("enter the amount to withdraw : ");
			int amount = sc.nextInt();
			try {
				withdraw(balance,amount);
			} catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}	
		}else {
			System.out.println("Invalid..!! Choose Correct Option");
		}
		
		
	}
	
	public static void withdraw(int balance,int amount) throws InsufficientBalanceException{
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance!!..Total Balance = "+balance);
		}else {
			balance=balance-amount;
			System.out.println("withdraw successful!!.....Total Balance = "+balance);
		}
	}

}
class InsufficientBalanceException  extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}
