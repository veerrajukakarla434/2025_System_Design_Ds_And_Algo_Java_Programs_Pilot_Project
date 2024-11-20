package com.vkakarla.codingproblems.categories.arrays;

public class P2ShiftArrayWithSameOrder {

	public static void main(String[] args) {
		
		int[] original = { 1, 2, 3, 4, 5, 6 };
		int[] reordered = new int[original.length];
		int shift = 3;
		
		for(int i=0; i<original.length;i++) {
		     reordered[i] = original[(shift+i)%original.length];	
	     }
	  for(int a : reordered) {
		  System.out.print(" "+a);
	  }
	}
}
