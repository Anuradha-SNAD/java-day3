package org.snad.Arrays;

import java.util.Scanner;

public class Maximun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		int secondMax = arr[0];
		int secondMin = arr[0];
		
		//for max,and second max
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max ;
				max = arr[i];
			}else if(arr[i]>secondMax && secondMax<max) {
				secondMax = arr[i];
			}
		}
		//for mini and second min
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin = min ;
				min = arr[i];
			}else if (arr[i]<secondMin && secondMin > min) {
				secondMin = arr[i];
			}
		}
		
		System.out.println("Maximum = "+max);
		System.out.println("Second Maximum = "+secondMax);
		
		System.out.println("Minimun = "+min);
		System.out.println("Second Minimum = "+secondMin);
	}

}
