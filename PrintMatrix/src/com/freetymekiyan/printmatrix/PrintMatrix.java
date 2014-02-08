package com.freetymekiyan.printmatrix;

/**
 * Amazon on-campus interview.
 * 
 * Given a m*n matrix.
 * Print it out in certain order.
 * 
 * Example:
 * input:	|1 4 7|
 * 			|2 5 8|
 * 			|3 6 9|
 * output:	1,2,3,1,2,6,1,2,9,1,5,3,1,5,6,1,5,9...,7,8,3,7,8,6,7,8,9
 *  
 * Solution:
 * recursion
 * m rows, n columns
 * keep track of index of each row
 * 
 * @author Kiyan
 */
public class PrintMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1, 4, 7, 10}, {2, 5, 8, 11}, {3, 6, 9, 12}};
		int[] indices = new int[matrix.length];
		printMatrix(matrix, indices);
	}

	private static void printMatrix(int[][] matrix, int[] indices) {
		// check stop
		boolean done = false;
		for(int index : indices) {
			if (index > matrix[1].length - 1) {
				done = true;
			}
		}
		if (done) {
			return;
		}
		// print
		for (int i = 0; i < indices.length; i++) {
			System.out.println(matrix[i][indices[i]] + ", ");
		}
		// update index
		boolean updated = false;
		for (int i = indices.length - 1; i > 0; i--) {
			if (!updated) {
				indices[i]++;
				updated = true;
			}
			if (indices[i] <= matrix[i].length - 1) {
				break;
			} else {
				indices[i] = 0;
				indices[i - 1]++;
			}
		}
		// recursion
		printMatrix(matrix, indices);
	}
}