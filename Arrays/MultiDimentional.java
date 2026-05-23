package org.snad.Arrays;

import java.util.Arrays;

public class MultiDimentional {
	public static void main(String[] args) {
		int arr [][] = {{1,2,3},{4,5,6}};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
			for(int j=0;j<arr[i].length;j++) {
		        sum += arr[i][j];
		    }
		}
		System.out.println("Sum = "+sum);
		System.out.println(Arrays.deepToString(arr));
	}

}
