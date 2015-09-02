package ch01;

/* Write a method to decide if two strings are anagrams or not. */

public class c1_4 {
	public static boolean anagram(String s1, String s2){
		if (s1.length()!=s2.length()){
			return false;
		}
		int[] letters=new int[256];
		for (int i=0; i<s1.length();i++){
			int c=(int)s1.charAt(i);
			letters[c]++;
		}
		for (int i=0;i<s2.length();i++){
			int c=(int)s2.charAt(i);
			if (letters[c]==0){
				return false;
			}else{
				letters[c]--;
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(anagram("hellooo","hhloeab"));
	}

}