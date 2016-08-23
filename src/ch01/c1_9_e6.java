package ch01;

/* Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation 
 * of s1 using only one call to isSubstring.
 */
public class c1_9_e6 {
	public static boolean stringRotation(String s1, String s2) {
		return isSubstring(s1, s2 + s2);
	}

	public static boolean isSubstring(String s1, String s2) {
		return s2.indexOf(s1) != -1;
	}

	public static void main(String[] args) {
		System.out.println(stringRotation("waterbottle", "erbottelewat"));
	}

}
