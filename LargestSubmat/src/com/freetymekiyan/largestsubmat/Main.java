package com.freetymekiyan.largestsubmat;

public class Main {
	
	public static void main(String[] args) {
		int[][] mat1 = {{0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, 
				{1, 1, 1, 1, 1}, {0, 0, 0, 0, 0,}};
//		printMat(mat1);
		int[][] mat2 = {{1, 1, 0, 0, 1, 0}, {0, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 0}, 
				{0, 0, 1, 1, 0, 0}};
		printMat(mat2);
		
//		LargestSquareSubmat lss = new LargestSquareSubmat();
//		lss.findMaxSubSquare(Matrix);
		LargestSubmat ls = new LargestSubmat();
		ls.findMaxSubmat(mat2);
		
	}
	
	/**
	 * Print a matrix in common format
	 * 
	 * @param mat
	 */
	public static void printMat(int[][] mat) {
		int row = mat.length;
		int column = mat[0].length;
		 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (j == column - 1) {
					System.out.println(mat[i][j]);
					continue;
				}
				System.out.print(mat[i][j] + " ");
			}
		}
		System.out.println(); // change row
	}
}