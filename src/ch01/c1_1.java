package ch01;
/*
 * Implement an algorithm to determine if a string has all unique characters. 
 */

public class c1_1 {
	private static boolean ifUnique(String s) {
		// ASCII
		boolean[] chars = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if (chars[c])
				return false;
			else {
				chars[c] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(ifUnique("thefoxjfump"));

	}

}
