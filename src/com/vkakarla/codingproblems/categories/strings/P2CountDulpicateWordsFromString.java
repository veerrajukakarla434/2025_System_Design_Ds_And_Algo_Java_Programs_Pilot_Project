package com.vkakarla.codingproblems.categories.strings;

import java.util.HashMap;
import java.util.Map;

public class P2CountDulpicateWordsFromString {

	public static void main(String[] args) {
		
		String str = "hai how are you you you you you you you you hai are are are how are you veer";
		
		//String[] words = str.split("\\s+");
		String[] words = str.split(" ");
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		for(String word: words) {
			if(wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word)+1);
			}else {
				wordMap.put(word, 1);
			}
		}
		
		//for all words count with single word
		System.out.println(wordMap);
		
		//OR Using Java 8 streams
		wordMap.entrySet().stream().forEach(e1->{System.out.println(e1);});
		
		//OR Using Java 8 streams using Method arguments
		wordMap.entrySet().forEach(System.out::println);
		
		// if we want to print duplicate more than one element
		wordMap.entrySet().stream().filter(e-> e.getValue()>1).forEach(e1->{System.out.println(e1);});
		
	   //OR just using Map.Entry
		
		for(Map.Entry<String, Integer> entryset: wordMap.entrySet()) {
			if(entryset.getValue()>1) {
				System.out.println(entryset.getKey()+" -"+ entryset.getValue());
			}
		}
}
}
