package com.freetymekiyan.sorting;

public class Main {
	
	static int[] array = {17,
			16,
			17,
			17,
			18,
			3,
			20,
			1,
			2,
			16,
			11,
			17,
			17,
			5,
			7,
			11,
			18,
			1,
			20,
			10};
	
	public static void main(String[] args) {
		printArr(array);
		long startTime = System.nanoTime();
//		BubbleSort.sort(array);
//		SelectionSort.sort(array);
//		MergeSort.sort(array, 0, array.length - 1);
//		QuickSort.sort(array, 0, array.length - 1);
		RadixSort.sort(array, 2);
		System.out.println(System.nanoTime() - startTime);
		printArr(array);
	}
	
	private static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}
}