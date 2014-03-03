package com.freetymekiyan.sorting;

/**
 * Runtime: O(nlog(n)) average, O(n) worst
 * Memory: 	O(log(n))
 * 
 * Pick a random element and partition the array, such that all
 * numbers that are less than the partitioning element come before 
 * all elements that are greater than it.
 * The partitioning can be performed efficiently through a series of swaps.
 * If we repeatedly partition the array(and its sub-arrays) around an element, 
 * the array will eventually become sorted.
 * However, as the partitioned element is not guaranteed to be the median(or 
 * anywhere near the median), our sorting could be very slow. This is reason 
 * for the O(n^2) worst case runtime. 
 * 
 * @author Kiyan
 */
public class QuickSort {

	public static void sort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1) {
			sort(array, left, index - 1);
		}
		if (index < right) {
			sort(array, index, right);
		}
	}
	
	/**
	 * choose a pivot
	 * find element on left that should be on right
	 * find element on right that should be on left
	 * swap, move left and right indices
	 * go on till crossed
	 * 
	 * @param array
	 * @param left
	 * @param right
	 * @return left index
	 */
	private static int partition(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2];
		while (left <= right) {
			while (array[left] < pivot) left++;
			while (array[right] > pivot) right--;
			if (left <= right) { // why "<=", not just "<" ?
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
