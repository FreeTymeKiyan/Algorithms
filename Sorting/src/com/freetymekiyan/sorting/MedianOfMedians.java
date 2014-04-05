package com.freetymekiyan.sorting;

public class MedianOfMedians {
	
	public static int medianOfMedians(int[] orgArray, int left, int right) {
		int[] array = orgArray;
		// 向上取整用Math.ceil(double a)
		// 向下取整用Math.floor(double a)
		int numMedians = (int)Math.ceil((right - left) / 5.0);
		for (int i = 0; i < numMedians; i++) {
			int subLeft = left + i * 5;
			int subRight = subLeft + 4;
			if (subRight > right) subRight = right;
			int medianIdx = selectIdx(array, subLeft, subRight, (subRight - subLeft) / 2);
			// swap list[left+i] and list[medianIdx]
			int temp = array[left + i];
			array[left + i] = array[medianIdx];
			array[medianIdx] = temp;
		}
		return selectIdx(array, left, left + numMedians - 1, numMedians / 2);
	}

	public static int selectIdx(int[] array, int left, int right, int n) {
		if(left == right) {
			return left;
		}
		while (true) {
//			int pivotIndex = selectIdx(array, left, right, );
			int pivotIndex = (int) (left + Math.floor(Math.random() * (right - left + 1))); 
			pivotIndex = partition(array, left, right, pivotIndex);			
			if (n == pivotIndex - left) {
				return pivotIndex;
			} else if (n < pivotIndex - left) {
				right = pivotIndex - 1;
			} else {
				n = n - (pivotIndex - left) - 1;
				left = pivotIndex + 1;
			}
		}
	}

	private static int partition(int[] array, int left, int right, int pivotIndex) {
		int pivotValue = array[pivotIndex];
		swap(array, pivotIndex, right);
		int storeIndex = left;
		for(int i = left; i < right; i++) {
			if(array[i] < pivotValue) {
				swap(array, storeIndex, i);
				storeIndex++;
			}
		}
		swap(array, right, storeIndex);
		return storeIndex;
	}

	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}