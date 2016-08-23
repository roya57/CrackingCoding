package ch01;

/* Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to zero
 */

import java.util.Arrays;

public class c1_8_e6 {
	public static void zeroMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] visitedRows = new boolean[m];
		boolean[] visitedCols= new boolean[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j]==0){
					visitedRows[i]=true;
					visitedCols[j]=true;
				}
			}
			
		}
		for (int i=0;i<m;i++){
			if (visitedRows[i]){
				for (int j=0;j<n;j++){
					matrix[i][j]=0;
				}
			}
			
			
		}
		for (int j=0;j<n;j++){
			if (visitedCols[j]){
				for (int i=0;i<m;i++){
					matrix[i][j]=0;
				}
			}
		}
	
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 0, 5 }, { 4, 3, 2, 0 }, { 1, 3, 6, 7 } };
		zeroMatrix(a);
		System.out.println(Arrays.deepToString(a));
	}
}
