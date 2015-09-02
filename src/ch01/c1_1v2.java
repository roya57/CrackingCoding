package ch01;

/*
 Implement an algorithm to determine if a string has all unique characters. 
 What if you can not use additional data structures?
 */


public class c1_1v2 {
	private static boolean ifUnique(String s){
		int bitRepresentation=0;
		for (int i=0;i<s.length();i++){
			//Assuming characters between 'a' to 'z'
			int c=s.charAt(i)-'a';
			if (((1<<c)&bitRepresentation)!=0){
				return false;
			}else{
				bitRepresentation=bitRepresentation|(1<<c);
				
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(ifUnique("thefoxjump"));
		
	}

}
