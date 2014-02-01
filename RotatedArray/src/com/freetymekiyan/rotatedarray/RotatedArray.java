package com.freetymekiyan.rotatedarray;

/**
 * Given a sorted array of n integers that has been 
 * rotated an unknown number of times, write code 
 * to find an element in the array. You may assume
 * that the array was originally sorted in increasing
 * order.
 * 
 * Example
 * Input: find 5 in {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}
 * Output: 8 (the index of 5 in the array)	
 * 
 * One important thing here is to understand rotation 
 * here fully. Rotation here means that the last number 
 * of the array is moved to the front. So, after rotate 
 * several times, left half and right half should be 
 * still in order.
 * 
 * @author Kiyan
 */
public class RotatedArray {
	
	public static void main(String[] args) {
		int[] a = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		int x = 5;
		System.out.println(search(a, 0, a.length - 1, x));
	}
	
	public static int search(int a[], int left, int right, int x) {
		int mid = (left + right) / 2;
		if (x == a[mid]) { // found element
			return mid;
		}
		if (right < left) { // error
			return -1;
		}
		
		if (a[left] < a[mid]) { // left is normally ordered
			if (x >= a[left] && x < a[mid]) {
				return search(a, left, mid - 1, x);
			} else {
				return search(a, mid + 1, right, x);
			}
		} else if (a[mid] < a[left]) { // right is normally ordered
			if (x > a[mid] && x <= a[right]) {
				return search(a, mid + 1, right, x);
			} else {
				return search(a, left, mid - 1, x);
			}
		} else if (a[mid] == a[left]) { // left half is all repeats
			if (a[mid] != a[right]) { // if right is diff, search it
				return search(a, mid + 1, right, x);
			} else { // search both halves
				int result = search(a, left, mid - 1, x); // search left first
				if (result == -1) { // not in left
					return search(a, mid + 1, right, x); // search right
				} else {
					return result;
				}
			}
		}
		return -1;
	}
}