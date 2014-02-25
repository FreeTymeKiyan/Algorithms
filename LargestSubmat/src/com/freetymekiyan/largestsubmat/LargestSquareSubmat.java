package com.freetymekiyan.largestsubmat;

/**
 * Given a matrix consisting only 0s and 1s
 * Find the maximum size square sub-matrix with all 1s.
 * 
 * Example:
 * 
 * 0  1  1  0  1
 * 1  1  0  1  0
 * 0  1  1  1  0
 * 1  1  1  1  0
 * 1  1  1  1  1
 * 0  0  0  0  0
 * 
 * The maximum square sub-matrix with all '1' bits 
 * is from (2,1) to (4,3) 
 * 
 * Solution:
 * Build an auxiliary matrix S[][]
 * S[i][j] represents size of the square sub-matrix 
 * with all 1s including M[i][j]
 * 
 * How to build S[][]?
 * 1. Shortcut: first row and column are the same as M[][].
 * 2. If M[i][j] is '0' then S[i][j] will obviously be '0'.
 * 3. S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1
 * 
 * 
 * 
 * @author Kiyan
 */
public class LargestSquareSubmat {
	
	public void findMaxSubSquare(int[][] M) {
		int row = M.length;
		int column = M[0].length;
		int[][] S = new int[row][column]; 
		
		/*copy first column*/
		for (int i = 0; i < row; i++) {
			S[i][0] = M[i][0];
		}
		
		/*copy first row*/
		for (int i = 0; i < column; i++) {
			S[0][i] = M[0][i];
		}
		
		/*calculate other elments*/
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				if (M[i][j] == 0) {
					S[i][j] = 0;
				} else {
					S[i][j] = Math.min(S[i - 1][j], Math.min(S[i - 1][j - 1], S[i][j - 1])) + 1;
				}
			}
		}
		
		Main.printMat(S);
		int max = S[0][0];
		int maxRow = 0;
		int maxCol = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (max < S[i][j]) {
					max = S[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		
		System.out.println("Max sub square matrix size = " + max + " * " + max);
		System.out.println("Starts from (" + (maxRow - max + 1) + ", " + (maxCol - max + 1) + ")");
		System.out.println("Ends at (" + maxRow + ", " + maxCol + ")");
	}
}