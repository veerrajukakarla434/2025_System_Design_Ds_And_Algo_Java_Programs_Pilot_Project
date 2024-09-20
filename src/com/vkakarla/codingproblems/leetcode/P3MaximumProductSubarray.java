package com.vkakarla.codingproblems.leetcode;

/**
 * Given an array that contains both positive and negative integers, 
 * the task is to find the product of the maximum product subarray. 
 */
public class P3MaximumProductSubarray {

	public static void main(String[] args) {
		
		int[] a = {-4, -3, -2};
        System.out.println("Maximum Product Subarray is " + maxSubarrayProduct(a));
	}
	
	public static int maxSubarrayProduct(int[] num) {
		
		if(num == null || num.length == 0 ) {
			return 0;
		}
		int maxProduct= num[0];
		int minProduct= num[0];
		int result = num[0];
		
		 for(int i =1; i<num.length; i++) {
			 
			 if(num[i]>=0) {
				 maxProduct = Math.max(num[i], result * num[i]);
				 minProduct = Math.min(num[i], minProduct * num[i]);
			 }else {
				 int temp =maxProduct;
				 maxProduct = Math.max(num[i], minProduct * num[i]);
				 minProduct = Math.min(num[i], temp * num[i]);
			 }
			 
			 result = Math.max(result, maxProduct);
			 
		 }
		
		return result;	
	}
	

}
