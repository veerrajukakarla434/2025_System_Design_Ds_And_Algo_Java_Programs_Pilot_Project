package com.vkakarla.codingproblems.leetcode;

/**
 * Given an array A of positive integers. Your task is to find the MVP's in the array. 
 * An element of array is considered MVP if it is greater than or equal to all the elements to its right side. 
 * The rightmost element is always a MVP. 
 * Example 1: Input: n = 6 A[] = {16,17,4,3,5,2} Output: 17 5 2 Explanation: 
 * The first MVP is 17 as it is greater than all the elements to its right. 
 * Similarly, the next leader is 5. The right most element is always a leader so it is also included. 
 * Example 2: Input: n = 5 A[] = {1,2,3,4,0} Output: 4 0 
 * Explanation: 0 is the rightmost element and 4 is the only element which is greater than all the elements to its right. 
 * To Do: You don't need to read input or print anything. 
 * The task is to complete the function find MVP() which takes array A and n as input parameters and returns an array of leaders in order of their appearance. 
 * Constraints: 1 ​ 
 */
public class LeadersInArray {

	public static void main(String[] args) {
		
		LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        lead.printLeaders(arr, n);
	}
	
	public static void printLeaders(int arr[], int size) {
		
		for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
		
		
	}
	

