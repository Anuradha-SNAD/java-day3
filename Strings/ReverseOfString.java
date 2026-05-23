package org.snad.Strings;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			rev = rev+ch;
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Polidrome");
		}else {
			System.out.println("Not Polidrome");
		}
		
	}

}
