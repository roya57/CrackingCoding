package ch01;

/* Implement a method to perform basic string compression using the counts of
 * repeated characters. If the "compressed" string would not become smaller 
 * than the original string, it should return the original string.
 */
public class c1_6_e6 {
	public static String stringCompression(String s) {
		StringBuilder result = new StringBuilder();
		int count = 1;
		int i = 0;
		for (int j = 1; j <= s.length(); j++) {

			if ((j == s.length()) || (s.charAt(i) != s.charAt(j))) {
				result.append(s.charAt(i));
				result.append(count);
				i = j;
				count = 1;
			} else {
				count++;
			}
		}
		if (s.length() > result.length()) {
			return result.toString();
		} else {
			return s;
		}

	}

	public static void main(String[] args) {
		System.out.println(stringCompression("aabccccaaa"));
	}

}
