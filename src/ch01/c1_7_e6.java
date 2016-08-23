package ch01;

/* Given an image represented by an NxN matrix, where each pixel in the image
 * is 4 bytes, write a method to rotate the image by 90 degrees. Can you do it in place?
 */
import java.util.Arrays;

public class c1_7_e6 {
	public static short[][] rotateMatrix(short[][] m) {
		int n = m.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - 1 - i; j++) {
				short tmp = m[i][j];
				m[i][j] = m[n - 1 - j][i];
				m[n - 1 - j][i] = m[n - 1 - i][n - 1 - j];
				m[n - 1 - i][n - 1 - j] = m[j][n - 1 - i];
				m[j][n - 1 - i] = tmp;

			}
		}
		return m;
	}

	public static void main(String[] args) {
		short[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.deepToString(rotateMatrix(a)));

	}

}
