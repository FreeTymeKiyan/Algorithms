package com.freetymekiyan.sorting;

/**
 * Runtime: O(nlog(n)) average and worse case
 * Memory: 	Depends
 * 
 * Merge sort divides the array in half, sorts each of those halves
 * then merges them back together.
 * Each of those halves has the same sorting algorithm applied to it.
 * Eventually, you are merging just two single-element arrays.
 * It's the "merge" part that does all the heavy lifting.
 * 
 * @author Kiyan
 */
public class MergeSort {
	
	public static void sort(int[] array, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2; // change to low + (high - low) / 2, won't exceed integer limit
			sort(array, low, middle);
			sort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}

	/**
	 * The merge method operates by copying all the elements from the target array segment
	 * into a helper array, keeping track of where the start of the left and right halves 
	 * should be(helperLeft and helperRight). We then iterate through helper, copying the 
	 * smaller element from each half into the array. At the end, we copy any remaining 
	 * elements into the target array. 
	 * 
	 * @param array
	 * @param low
	 * @param middle
	 * @param high
	 */
	private static void merge(int[] array, int low, int middle, int high) {
		int[] helper = new int[array.length]; // as large as the original array
		for (int i = low; i <= high; i++) {
			helper[i] = array[i]; // only need this part of elements
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while (helperLeft <= middle && helperRight <= high) { // till running out of elements
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		/* Copy the rest of the left side of the array into the 
		 * target array 
		 * right side is already in it.*/
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}
}