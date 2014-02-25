package com.freetymekiyan.largestsubmat;

/**
 * Given a matrix of zeros and 1s.
 * Find largest all 1s sub-matrix in a binary matrix.
 * 
 * Input:
 * 1  1  0  0  1  0
 * 0  1  1  1  1  1
 * 1  1  1  1  1  0
 * 0  0  1  1  0  0
 * 
 * Output:
 * Largest all 1s sub-matrix is from (1,1) to (2,4).
 * 
 * @author Kiyan
 */
public class LargestSubmat {
	
	public void findMaxSubmat(int[][] M) {
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
					S[i][j] = S[i - 1][j] + 1;
				}
			}
		}
		
		Main.printMat(S);
		
//		int max = S[0][0];
//		int maxRow = 0;
//		int maxCol = 0;
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				if (max < S[i][j]) {
//					max = S[i][j];
//					maxRow = i;
//					maxCol = j;
//				}
//			}
//		}
//		
//		System.out.println("Max sub square matrix size = " + max + " * " + max);
//		System.out.println("Starts from (" + (maxRow - max + 1) + ", " + (maxCol - max + 1) + ")");
//		System.out.println("Ends at (" + maxRow + ", " + maxCol + ")");
	}
}
