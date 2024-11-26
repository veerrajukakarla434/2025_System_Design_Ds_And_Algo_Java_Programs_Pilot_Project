package com.vkakarla.codingproblems.categories.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class P0001GroupAnagrams {

	public static void main(String[] args) {
		
		String[] words = { "ace", "cea", "crew", "wrec", "werc", "yo", "Oy", "act", "cat", "tac", "foo", "oof", "ofo","flop", "olfp" };
		List<String> wordList = Arrays.asList(words);
		//List<List<String>> result1 = groupAnagrams(wordList);
		List<List<String>> result = groupAnagrams1(words);
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
	
	
	public static List<List<String>> groupAnagrams1(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            // Sort the string to get the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars).toLowerCase();
            
            // Add to the appropriate group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
	
	
}
