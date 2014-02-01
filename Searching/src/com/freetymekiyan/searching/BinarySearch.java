package com.freetymekiyan.searching;

/**
 * Array must be sorted.
 * 
 * @author Kiyan
 */
public class BinarySearch {
	
	private int binarySearch(int[] a, int x) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1; // no result
	}
	
	private int binarySearchRecursive(int[] a, int x, int low, int high) {
		if (low > high) return -1;
		
		int mid = (low + high) / 2;
		if (a[mid] < x) {
			binarySearchRecursive(a, x, mid + 1, high);
		} else if (a[mid] > x) {
			binarySearchRecursive(a, x, low, mid - 1);
		} else {
			return a[mid];
		}
		return -1; // actually can't be executed
	}
}