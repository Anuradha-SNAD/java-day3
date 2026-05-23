package org.snad.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TypesOfExceptions {
	public static void main(String[] args) {
		int a = 10;
		try {
			FileReader f = new FileReader("abc.txt");//checked exception(compiler force to handle)
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException Handled");
		}
		
		try {
			a = 10/0;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
		System.out.println("a = "+a);
		
		String s = null;
		
		try {
		System.out.println(s.length());
		
		}catch( NullPointerException e) {
			System.out.println("NullPointerException Handled");
		}
		
		try {
			array();
			string();
		}catch(Exception e) {
			System.out.println("ArrayOutOfBoundException Handled");
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		
		
	}
	public static void array() throws ArrayIndexOutOfBoundsException{
		int [] arr = {10,20};
		System.out.println(arr[5]);
	}
	public static void string() throws StringIndexOutOfBoundsException  {
		String s = "Hi";
		System.out.println(s.charAt(5));
	}
}
