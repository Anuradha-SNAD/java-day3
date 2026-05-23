package org.snad.Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		System.out.println("enter the "+n+" elements ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count >= 1) {
				int j;
                for(j=0; j<i; j++) {
                    if(arr[i] == arr[j]) {
                        break;
                    }
                }

                if(i == j) {
                    System.out.print(arr[i] + " ");
                }
			}
		}
	}

}
