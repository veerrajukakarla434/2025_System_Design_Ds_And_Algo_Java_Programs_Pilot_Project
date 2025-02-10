package com.vkakarla.codingproblems.hackerRank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		String []tokens =str.split("[^A-Za-z]+");
		List<String> filtered = new ArrayList<>();
		
		for(String token: tokens) {
			if(!token.isEmpty()) {
				filtered.add(token);
			}
		}
		
		System.out.println(filtered.size());
		
		filtered.forEach(t->{
			System.out.println(t);
		});
		
        scan.close();
	}

}
