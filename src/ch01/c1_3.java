package ch01;
/*
 Design an algorithm and write code to remove the duplicate characters in a string
 without using any additional buffer. NOTE: One or two additional variables are fine.
 An extra copy of the array is not.
 FOLLOW UP
 Write the test cases for this method.
 */

public class c1_3 {
	private static void removeDuplicates(char[] s){
		int t=1;
		for (int i=1;i<s.length;i++){
			int j=0;
			for (j=0;j<t;j++){
				if (s[i]==s[j]) break;
			}
			if (j==t){
				s[t]=s[i];
				t++;
			}
		}
		for (int i=t;i<s.length;i++){
			s[i]='\0';
		}
	}
	public static void main(String[] args){
		char[] s="ababcededca".toCharArray();
		removeDuplicates(s);
		System.out.println(s);
		
	}

}
