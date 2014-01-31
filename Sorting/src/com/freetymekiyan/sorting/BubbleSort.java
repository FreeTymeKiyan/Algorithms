package com.freetymekiyan.sorting;

/**
 * Runtime:	O(n^2) average and worst case
 * Memory: 	O(1)
 * 
 * start at the beginning of the array and swap the first two elements
 * if the first is greater than the second.
 * then go to the next pair, and so on.
 * continuously making sweeps of the array until sorted
 * 
 * @author Kiyan
 *
 */
public class BubbleSort {
	
	public static void sort(int[] array) {
		boolean hasSwapped = false;
		do {
			hasSwapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1]; // swap
					array[i + 1] = array[i];
					array[i] = temp;
					hasSwapped = true;
				}
			}
		} while(hasSwapped);
	}
}