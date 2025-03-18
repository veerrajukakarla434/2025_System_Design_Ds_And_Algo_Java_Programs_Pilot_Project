package com.vkakarla.codingproblems.categories.arrays;

/**
 * Largest Sum Contiguous Subarray (Kadane’s Algorithm)
 * Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
 */
public class P0001MaximumSumSubArray {

	public static void main(String[] args) {
		int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int result = maximumSubArray(array);
		System.out.println("Maximum contiguous sum is " + result);

	}

	public static int maximumSubArray(int[] a) {

		int maxSoFar = a[0];
		int currentSum = a[0];

		for (int i = 1; i < a.length; i++) {

			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + a[i];

			if (currentSum > maxSoFar) {
				maxSoFar = currentSum;
			}
		}

		return maxSoFar;
	}
}
