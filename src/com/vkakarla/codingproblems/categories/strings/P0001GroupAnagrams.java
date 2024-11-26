package com.vkakarla.codingproblems.categories.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class P0001GroupAnagrams {

	public static void main(String[] args) {
		
		String[] words = { "ace", "cea", "crew", "wrec", "werc", "yo", "oy", "act", "cat", "tac", "foo", "oof", "ofo","flop", "olfp" };
		List<String> wordList = Arrays.asList(words);
		List<List<String>> result = groupAnagrams(wordList);
		// result.forEach(t -> System.out.println(t + " "));
		// OR
		for (List<String> list : result) {
			System.out.println(list);
		}
	}

	public static List<List<String>> groupAnagrams(List<String> strs) {
		
		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			String key = new String(chArr).toLowerCase();

			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				List<String> strList = new ArrayList<>();
				strList.add(str);
				map.put(key, strList);
			}
		}
		result.addAll(map.values());
		return result;
	}
}
