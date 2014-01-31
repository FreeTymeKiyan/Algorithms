package com.freetymekiyan.sorting;

/**
 * Runtime:	O(n^2) average and worst case
 * Memory: 	O(1)
 * 
 * find the smallest element using a linear scan and move it to the front
 * then find the second smallest and move it 
 * continue doing this until all the elements are in place
 * 
 * @author Kiyan
 */
public class SelectionSort {
	
	public static void sort(int[] array) {
		int size = array.length;
		int sortedIdx = 0;
		while(sortedIdx < size) {
			int smallestIdx = sortedIdx;
			for (int i = sortedIdx; i < size; i++) {
				if (array[i] < array[smallestIdx]) {
					smallestIdx = i;
				}
			}
			int temp = array[smallestIdx]; // swap
			array[smallestIdx] = array[sortedIdx];
			array[sortedIdx] = temp;
			sortedIdx++;
		}
	}
}