package com.vkakarla.codingproblems.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array A of positive integers. Your task is to find the MVP's in the
 * array. An element of array is considered MVP if it is greater than or equal
 * to all the elements to its right side. The rightmost element is always a MVP.
 * Example 1: Input: n = 6 A[] = {16,17,4,3,5,2} Output: 17 5 2 Explanation: The
 * first MVP is 17 as it is greater than all the elements to its right.
 * Similarly, the next leader is 5. The right most element is always a leader so
 * it is also included. Example 2: Input: n = 5 A[] = {1,2,3,4,0} Output: 4 0
 * Explanation: 0 is the rightmost element and 4 is the only element which is
 * greater than all the elements to its right. To Do: You don't need to read
 * input or print anything. The task is to complete the function find MVP()
 * which takes array A and n as input parameters and returns an array of leaders
 * in order of their appearance. Constraints: 1 ​
 */
public class LeadersInArray2 {

	public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {

		ArrayList<Integer> ans = new ArrayList<>();

// Last element of an array is always a leader,
// push into ans array.
		int max = arr[n - 1];

		ans.add(arr[n - 1]);

// Start checking from the end whether a number is greater
// than max no. from right, hence leader.
		for (int i = n - 2; i >= 0; i--)
			if (arr[i] > max) {
				ans.add(arr[i]);
				max = arr[i];
			}

		return ans;

	}

	public static void main(String args[]) {
// Array Initialization.
		int n = 6;
		int arr[] = { 16, 17, 4, 3, 5, 2 };

		ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

		Collections.sort(ans, Collections.reverseOrder());

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}
}
