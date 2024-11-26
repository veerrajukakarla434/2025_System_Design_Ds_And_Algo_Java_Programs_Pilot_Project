package com.vkakarla.codingproblems.categories.arrays;

import java.util.Arrays;
import java.util.List;

public class P0004ValidateSubsequence {

	public static void main(String[] args) {

		List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

		System.out.println(isValidSubsequence(array, sequence)); // Output: true

	}
	
	
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence ) {
	    int seqIndex = 0;
	   for (int value : array) {
	            if (seqIndex == sequence.size()) break;
	            if (sequence.get(seqIndex) == value) {
	                seqIndex++;
	            }
	        }

	        return seqIndex == sequence.size();
	  }

}	