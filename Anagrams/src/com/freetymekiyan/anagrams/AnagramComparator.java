package com.freetymekiyan.anagrams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Write a method to sort an array of strings
 * so that all the anagrams are next to each other.
 * 
 * <p> a modification of BucketSort
 * @author Kiyan
 */
public class AnagramComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return sortChars(o1).compareTo(sortChars(o2));
	}
	
	private String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public void sort(String[] array) {
//		Arrays.sort(array, new AnagramComparator());
		Hashtable<String, LinkedList<String>> hash = 
				new Hashtable<String, LinkedList<String>>();
		for (String s : array) {
			String key = sortChars(s);
			if (!hash.containsKey(key)) {
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		
		int index = 0;
		for (String key : hash.keySet()) {
			LinkedList<String> list = hash.get(key);
			for (String t : list) {
				array[index] = t;
				index++;
			}
		}
	}
}