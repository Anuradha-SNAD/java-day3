package org.snad.Arrays;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("[");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			if(i!=0) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}
