package ch01;

/* There are three types of edits that can be performed on strings. 
 * Insert a character,remove a character or replace a character.
 * Given two strings, write a function to check if they are one or zero edits away.
 */
public class c1_5_e6 {
	public static boolean oneAway(String s1, String s2) {
		if (s1.length() == s2.length()) {
			int countEdit = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					countEdit++;
				}
				if (countEdit > 1)
					return false;
			}
			return true;
		}
		if (s1.length() == s2.length() + 1) {
			int countEdit = 0;
			for (int i = 0, j = 0; i < s2.length(); i++, j++) {
				if (s1.charAt(i) != s2.charAt(j)) {
					countEdit++;
					i++;
				}
				if (countEdit > 1) {
					return false;
				}
			}
			return true;
		}
		if (s2.length() == s1.length() + 1) {
			int countEdit = 0;
			for (int i = 0, j = 0; i < s1.length(); i++, j++) {
				if (s2.charAt(i) != s1.charAt(j)) {
					countEdit++;
					i++;
				}
				if (countEdit > 1) {
					return false;
				}
			}
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(oneAway("pale", "bake"));
	}
}
