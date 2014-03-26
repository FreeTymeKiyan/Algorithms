package com.freetymekiyan.removedup;

import java.util.ArrayList;

public class RemoveDup {
	
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2, 3, 3, 4};
		Integer[] arr = removeDup(array);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	private static Integer[] removeDup(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list.toArray(new Integer[list.size()]);
	}
}	
