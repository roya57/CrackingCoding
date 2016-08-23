package ch02;

public class c2_3_e6 {
	public static boolean deleteMiddleNode(Node a){
		if (a==null || a.next==null){
			return false;
		}
		Node b=a.next;
		a.data=b.data;
		a.next=b.next;
		return true;
		
		
		
	}
	public static void main(String[] args){
		Node head=new Node(4);
		int[] a={5,6,7,8};
		head.addAll(a);
		head.print();
		if (deleteMiddleNode(head.next.next.next.next)){
			head.print();
		}else{
			System.out.println("failed");
		}
		
	}

}
