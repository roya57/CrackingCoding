package ch01;

/* Given a string, write a function to check if it is a permutation of a pallindrome.
 * 
 */
public class c1_4_e6 {
	public static boolean palindromPermutation(String s) {
		int bitRep = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				int c = s.charAt(i) - 'a';
				bitRep = (1 << c) ^ bitRep;
			}
		}
		if (Integer.bitCount(bitRep) > 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(palindromPermutation("yo banana boyy"));
	}

}
