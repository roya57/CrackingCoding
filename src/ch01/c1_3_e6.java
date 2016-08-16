package ch01;
/* Write a method to replace all spaces in a string with %20. 
 * You may assume the string has sufficient space at the end
 * and that you are given the true length of the string.
 */
public class c1_3_e6 {
	public static String urlify(char[] s, int l){
		int j=s.length-1;
		int i=l-1;
		while(i!=j){
			System.out.println(i+":"+s[i]+"("+j+")");
			if (s[i]!=' '){
				s[j]=s[i];
				j--;
			}else{
				s[j]='0';
				j--;
				s[j]='2';
				j--;
				s[j]='%';
				j--;
			}
			i--;
		}
		
		return new String(s);
	}
	public static void main(String[] args){
		System.out.println(urlify("Mr John Smith    ".toCharArray(),13));
	}
}
