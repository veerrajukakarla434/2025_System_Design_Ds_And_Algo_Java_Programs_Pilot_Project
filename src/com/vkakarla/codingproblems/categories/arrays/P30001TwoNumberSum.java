package com.vkakarla.codingproblems.categories.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class P30001TwoNumberSum {

	public static void main(String[] args) {

		int[] array = { 3, 5, -4, 8, 11, 1, -1, 6 };
		int targetSum = 10;

		int[] result1 = twoNumberSumBruteForce(array, targetSum);
		int[] result2 = twoNumberSumHashMap(array, targetSum);
		int[] result3 = twoNumberSumTwoPointer(array, targetSum);

		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));

	}

	public static int[] twoNumberSumBruteForce(int[] ary, int targatedSum) {

		for (int i = 0; i < ary.length; i++) {

			for (int j = i + 1; j < ary.length; j++) {

				if (ary[i] + ary[j] == targatedSum) {

					return new int[] { ary[i], ary[j] };
				}
			}

		}

		return new int[0]; // returning empty array if no pair is found.
	}

	public static int[] twoNumberSumHashMap(int[] ary, int targatedSum) {

		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int num : ary) {

			int poitentialMatch = targatedSum - num;
			if (map.containsKey(poitentialMatch)) {
				return new int[] { poitentialMatch, num };
			} else {
				map.put(num, true);
			}
		}

		return new int[0]; // returning empty array if no pair is found.
	}

	public static int[] twoNumberSumTwoPointer(int[] ary, int targatedSum) {

		Arrays.sort(ary); // Sort the array
		int left = 0;
		int right = ary.length - 1;

		while (left < right) {
			int currentSum = ary[left] + ary[right];
			if (currentSum == targatedSum) {
				return new int[] { ary[left], ary[right] };
			} else if (currentSum < targatedSum) {
				left++;
			} else {
				right--;
			}
		}

		return new int[0]; // returning empty array if no pair is found.
	}

}
