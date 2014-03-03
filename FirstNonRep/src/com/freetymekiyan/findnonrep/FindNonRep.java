package com.freetymekiyan.findnonrep;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Given a stream of characters
 * find the first non-repeating character in the stream 
 * You can go through this stream only once
 * 
 * Basic way to do this, is to loop over the char array,
 * search through the array to find duplication.
 * But we can only go through this stream once.
 * So, we need to get some information to help us from the 
 * only time.
 * One information which may be of some help is the count 
 * of each character. We may go through the array, store the 
 * character and how many times it shows up in a HashMap. 
 * Then iterate over the entry set of the HashMap to get the 
 * count with 1. But the problem of it would be, we can't 
 * guarantee that it's the first non-repeating character.
 * The iteration is done randomly.
 * One way to solve this problem is using LinkedHashMap, which
 * has a predictable iteration order.
 * 
 * Here is the implementation.
 * 
 * Another way to do this is to build the relation between the 
 * index and characters.
 * It's still a bit hard to understand because we are using 
 * senior data structures, not a good way of thinking to solve 
 * this question. More generally, what we are trying to build 
 * is a relation between the index, the character, and the character 
 * count. As we all known, only 26 characters are there in 
 * English, and they've been already well coded in ASCII. So, 
 * if we get a character from the input, we may minus it by 'a'
 * to get an offset to represent which character it is. These 
 * offsets can be used as indices of an array of integers to 
 * represent count at the same time. Moreover, we need to insert 
 * these characters in order to an array to maintain the sequence. 
 * This would help us to find the first non-repeating character easily.
 * 
 * @author Kiyan
 */
public class FindNonRep {
	
	public static final int TOTAL_ALPHABET = 26;
	
	public static void main(String[] args) {
		String input = "fabcdefcbeaghiadklz";
//		lindkedHashMap(input);
		System.out.println(selfBuildMap(input));
	}

	private static void lindkedHashMap(String input) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			char curChar = input.charAt(i);
			if (hashMap.containsKey(input.charAt(i))) {
				hashMap.put(curChar, hashMap.get(curChar) + 1);
			} else {
				hashMap.put(curChar, 1);
			}
		}
		
		for (Entry<Character, Integer> obj : hashMap.entrySet()) {
			if (obj.getValue() == 1) {
				System.out.print("First non-repeating character in the stream : "+ obj.getKey());
				break;
			}
		}
	}
	
	private static char selfBuildMap(String input) {
		char result = '1';
		char[] charIndex = new char[TOTAL_ALPHABET];
		int[] charCount = new int[TOTAL_ALPHABET];
		int charToInt;
		int charPos = -1;
		
		String lowerCase = input.toLowerCase();
		
		for (int i = 0; i < lowerCase.length(); i++) {
			charToInt = lowerCase.charAt(i) - 'a'; // it's like an offset
			if (++charCount[charToInt] == 1) { // first time
				charIndex[++charPos] = lowerCase.charAt(i); // insert lower case, only one time 
			}
		}
		
		for (int i = 0; i <= charPos; i++) {
			if (charCount[charIndex[i] - 'a'] == 1) // only showed one time
				return charIndex[i];
		}
		return result;
	}
}
