package com.freetymekiyan.sorting;

import java.util.ArrayList;

/**
 * Runtime: O(kn), n is the number of elements, k is the number
 * of passes of the sorting algo.
 * Memory: 	O(k+n)
 * 
 * A sorting algorithm for integers (and some other data types)
 * that takes advantage of the fact that integers have a finite 
 * number of bits.
 * 
 * Iterate through each digit of the number 
 * Grouping numbers by each digit
 * Sort each of the groups by the next digit 
 * 
 * @author Kiyan
 */
public class RadixSort {
	
	public static void sort(int[] array, int maxDigits) {
		int exp = 1; // 10^0
		for(int i =0; i < maxDigits; i++){
			ArrayList<Integer>[] bucketList = new ArrayList[10];
			for(int k=0; k < 10; k++){
				bucketList[k] = new ArrayList<Integer>();
			}
			for(int j =0; j < array.length; j++){
				int number = (array[j]/exp)%10;
				bucketList[number].add(array[j]);
			}
			exp *= 10;
			int index =0;
			for(int k=0; k < 10; k++){
				for(int num: bucketList[k]){
					array[index] = num;
					index++;
				}
			}
		}
	}
}