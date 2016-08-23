package ch01;

/* Given two strings, write a method to decide if one is a permutation of
 *  the other
 */
public class c1_2_e6 {
	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] map = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			map[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			int index = s2.charAt(i);
			if (map[index] == 0)
				return false;
			map[index]--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPermutation("", ""));
	}

}
