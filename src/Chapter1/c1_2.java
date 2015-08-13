package Chapter1;
/**
 *Write code to reverse a C-Style String. (C-String means that “abcd” is represented 
 *as five characters, including the null character.)
*/

public class c1_2 {
	private static void reverse(char[] s){
		int l=s.length;
		for (int i=0;i<Math.floor(l/2);i++){
		
			char tmp=s[i];
			s[i]=s[l-i-1];
			s[l-i-1]=tmp;
		}
		
	}
	
	public static void main(String[] args){
		char[] s="alireza salehi golsefidy".toCharArray();
		reverse(s);
		System.out.println(s);
		
	}

}
