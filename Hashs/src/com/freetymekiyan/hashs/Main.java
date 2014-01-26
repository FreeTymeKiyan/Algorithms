package com.freetymekiyan.hashs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Playing around with different hash data structures like:
 * 	hashset
 * 	hashtable
 * 	hashmap
 * 	...
 * 
 * @author Kiyan
 */

public class Main {
	
	HashSet<Integer> hashSet = new HashSet<Integer>();
	Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
	private void checkHashSet() {
		hashSet.add(e);
		hashSet.addAll(c);
		hashSet.clear();
		hashSet.clone();
		hashSet.contains(o);
		hashSet.containsAll(c);
		hashSet.equals(o);
		hashSet.isEmpty();
		hashSet.iterator();
		hashSet.remove(o);
		hashSet.removeAll(c);
		hashSet.retainAll(c);
		hashSet.size();
		hashSet.toArray();
		hashSet.toArray(a);
	}
	
	private void checkHashTable() {
		hashTable.clear();
		hashTable.clone();
		hashTable.contains(value);
		hashTable.containsKey(key);
		hashTable.containsValue(value);
		hashTable.elements();
		hashTable.entrySet();
		hashTable.equals(o);
		hashTable.get(key);
		hashTable.hashCode();
		hashTable.isEmpty();
		hashTable.keys();
		hashTable.keySet();
		hashTable.put(key, value);
		hashTable.putAll(t);
		hashTable.remove(key);
		hashTable.size();
		hashTable.toString();
		hashTable.values();
	}
	
	private void checkHashMap() {
		hashMap.clear();
		hashMap.clone();
		hashMap.containsKey(key);
		hashMap.containsValue(value);
		hashMap.entrySet();
		hashMap.equals(o);
		hashMap.get(key);
		hashMap.hashCode();
		hashMap.isEmpty();
		hashMap.keySet();
		hashMap.put(key, value);
		hashMap.putAll(m);
		hashMap.remove(key);
		hashMap.size();
		hashMap.toString();
		hashMap.values();
	}
	
}
