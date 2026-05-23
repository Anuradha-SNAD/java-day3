package org.snad.Exceptions;

import java.util.Scanner;

public class CustomException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		try {
			checkAge(sc.nextInt());
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not eligible to vote");
		}else {
			System.out.println("eligible to vote");
		}
	}

}

class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
	}
	
}
