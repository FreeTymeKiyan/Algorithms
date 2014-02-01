package com.freetymekiyan.mergearray;

/**
 * You are given two sorted arrays, A and B.
 * A has a large enough buffer at the end to hold B.
 * Write a method to merge B in sorted order.
 * 
 * The only issue with this is that if we insert an 
 * element into the front of A, then we'll have to
 * shift the existing elements backwards to make room
 * for it. It's better to insert elements into the back
 * of the array, where there's empty space.
 * 
 * @author Kiyan
 */
public class MergeArray {
	
	public static void merge(int[] a, int[] b, int lastA, int lastB) {
//		int indexA = a.length - 1; // can't use a.length here, cuz a has free space
//		int indexB = b.length - 1;
//		int indexMerged = a.length + b.length - 1;
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastA + lastB - 1;
		
		while (indexA >= 0 && indexB >= 0) {
			if (a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA];
				indexMerged--;
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
				indexMerged--;
				indexB--;
			}
		}
		
		/*copy remaining elements in B*/
		while (indexB >= 0) {
			a[indexMerged] = b[indexB];
			indexMerged--;
			indexB--;
		}
	}
}