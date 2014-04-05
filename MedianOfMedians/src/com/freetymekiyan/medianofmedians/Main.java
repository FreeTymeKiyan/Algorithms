package com.freetymekiyan.medianofmedians;

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
		int idx = MedianOfMedians.medianOfMedians(array, 0, array.length - 1);
		System.out.println(idx + "||" + array[idx]);
	}
}
