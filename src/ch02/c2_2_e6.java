package ch02;

public class c2_2_e6 {
	public static Node kthToLast(Node head, int k){
		Node a=head;
		Node b=head;
		for (int i=0;i<k;i++){
			if (b==null) return null;
			b=b.next;
		}
		while(b!=null){
			a=a.next;
			b=b.next;
		}
		return a;
		
	}
	public static void main(String[] args){
		Node a = new Node(2);
		int[] ar = { 8 };
		a.addAll(ar);
		a.print();
		kthToLast(a,3).print();
	}

}
