package ch01;

/* Write a method to replace all spaces in a string with ‘%20’. */

public class c1_5 {
	public static StringBuffer replaceString(StringBuffer s){
		int i=0;
		while(i<s.length()){
			if (s.charAt(i)==' '){
				//s=s.substring(0, i)+"%20"+s.substring(i+1);
				s.subSequence(0, i).
				
				i=i+3;
				
			}else{
				i++;
			}
		}
		return s;
	}
	public static void main(String[] arg){
		String s="Write a method to replace all spaces in a string with ‘%20’";
		replaceString(s);
		System.out.println(s);
	}
	

}