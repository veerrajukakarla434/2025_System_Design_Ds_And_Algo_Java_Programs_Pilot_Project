package com.vkakarla.codingproblems.leetcode;

/**
 * Largest Sum Contiguous Subarray (Kadane’s Algorithm)
 * Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
 */
public class P1MaximumSubSubArray {

	public static void main(String[] args) {
		
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                           + maxSubArraySum(a));
	}
	
	public static int maxSubArraySum(int[] num) {
		
		int maxSoFar= num[0];
		int currentSum= num[0];
		
		for(int i=1; i<num.length; i++) {
			
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum+num[i];
			
			if(currentSum > maxSoFar) {
				maxSoFar = currentSum;
			}
		}
			
		return maxSoFar;		
	}
	

}
