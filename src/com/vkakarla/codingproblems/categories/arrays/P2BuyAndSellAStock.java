package com.vkakarla.codingproblems.categories.arrays;

/**
 * Given an array prices[] of length N, representing the prices of the stocks on different days, 
 * the task is to find the maximum profit possible by buying and selling 
 * the stocks on different days when at most one transaction is allowed.
 * Note: Stock must be bought before being sold.
 * 
 * Input: prices[] = {7, 1, 5, 3, 6, 4}
	Output: 5
	Explanation:
	The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, 
	the highest price of the stock is witnessed on the 5th day, i.e. price = 6. 
	Therefore, maximum possible profit = 6 – 1 = 5. 
	
	Input: prices[] = {7, 6, 4, 3, 1} 
	Output: 0
	Explanation: Since the array is in decreasing order, no possible way exists to solve the problem.
 * 
 */
public class P2BuyAndSellAStock {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };

		System.out.println("Maximum Profit :" + maxProfit(prices));

	}

	public static int maxProfit(int[] a) {
		int minSoFar = a[0];
		int ans = 0;

		for (int i = 1; i < a.length; i++) {
			int profit = a[i] - minSoFar;

			if (ans < profit) {
				ans = profit;
			}

			if (minSoFar > a[i]) {
				minSoFar = a[i];
			}
			// minSoFar = Math.min(a[i], minSoFar);
		}

		return ans;
	}

}
