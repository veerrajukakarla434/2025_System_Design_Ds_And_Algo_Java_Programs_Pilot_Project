package com.vkakarla.codingproblems.categories.arrays;

import java.util.Arrays;

public class P0005SortedSquaredArray {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1,22,3,4,5,6,7,8,9};
		int[] result = sortedSquaredArrayTwoPointer(array);
		
		for(int a : result) {
			  System.out.print(a+" ");
		  }
		
	}
		
	public static int[] sortedSquaredArrayNaive(int[] array) {
        int[] squared = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            squared[i] = array[i] * array[i];
        }
        
        Arrays.sort(squared); // Sort the squared array
        return squared;
    }

	
	 public static int[] sortedSquaredArrayTwoPointer(int[] array) {
	        int n = array.length;
	        int[] result = new int[n];
	        int left = 0;
	        int right = n - 1;
	        int index = n - 1; // Start filling from the end
	        
	        while (left <= right) {
	            int leftSquare = array[left] * array[left];
	            int rightSquare = array[right] * array[right];
	            
	            if (leftSquare > rightSquare) {
	            	System.out.println("Entered");
	                result[index--] = leftSquare;
	                left++;
	            } else {
	                result[index--] = rightSquare;
	                right--;
	            }
	        }
	        return result;
	    }

	
}
