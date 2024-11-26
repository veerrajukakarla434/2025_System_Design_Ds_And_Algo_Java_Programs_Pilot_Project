package com.vkakarla.codingproblems.categories.strings;

public class P0003PalindromeCheck {

	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar")); // true
		System.out.println(isPalindrome("hello")); // false
		
		System.out.println(isPalindrome1("racecar")); // true
		System.out.println(isPalindrome1("hello")); // false
	}
	
	 public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	 
	 public static boolean isPalindrome1(String str) {
		 String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

}
