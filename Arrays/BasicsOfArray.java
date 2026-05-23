package org.snad.Arrays;

import java.util.Scanner;

public class BasicsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
//		int arr[] = {10,20,30,40,50};
		int sum = 0;
//		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
			
			sum = sum + arr[i];
		}
		System.out.println("]");
		System.out.println("Sum : "+sum); //static intialisation
	}

}
