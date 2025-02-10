package com.vkakarla.codingproblems.hackerRank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTwoStrings {

	public static void main(String[] abc) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean result = isAnagram(a, b);
		System.out.println(result ? "Anagrams" : "Not Anagrams");

	}

	public static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}
		a.toLowerCase();
		b.toLowerCase();

		char[] ar1 = a.toCharArray();
		char[] ar2 = b.toCharArray();

		Arrays.sort(ar1);
		Arrays.sort(ar2);

		return Arrays.equals(ar1, ar2);

	}
}
