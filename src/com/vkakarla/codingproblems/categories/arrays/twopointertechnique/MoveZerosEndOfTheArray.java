package com.vkakarla.codingproblems.categories.arrays.twopointertechnique;

import java.util.Arrays;

public class MoveZerosEndOfTheArray {

	public static void main(String[] args) {
		int [] arr= new int[]{23,5,0,1,0,3,5,0,1,0,1};
		moveZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

	 public static void moveZerosToEnd(int[] arr) {
		 
		 int j=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] != 0) {
				 // Swap arr[i] and arr[j]
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 j++;
			 }
		 }
		
	 }
}
