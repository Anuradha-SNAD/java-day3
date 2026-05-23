package org.snad.Arrays;

import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		System.out.println("enter the "+n+" elements ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int duplicate [] = new int[n];
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					int k ;
					for(k=0;k<count;k++) {
						if(arr[i] == duplicate[k]) {
							break;
						}
					}
					if(k == count) {
						duplicate[count] = arr[i];
						count++;
						System.out.print(arr[i]+" ");
					}
				}
			}
		}
		
	}

}
