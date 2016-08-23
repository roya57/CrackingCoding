package ch02;

public class c2_4_e6 {
	 public static Node partition(Node head, int x){
		 Node prev=null;
		 Node cur=head;
		 boolean visited=false;
		 Node left=null;
		 
		 while(cur!=null){
			 if (!visited && cur.data<x){
				 left=cur;
			 }
			 if (cur.data>=x){
				 visited=true;
			 }
			 if (visited && cur.data<x){
				 Node b=new Node(cur.data);
				 if (left==null){
					 b.next=head;
					 head=b;
				 }else{
					 b.next=left.next;
					 left.next=b;
					 
				 }
				 left=b;
				 prev.next=cur.next;
				 cur=prev.next;
			 }else{
				 prev=cur;
				 cur=cur.next;
			 }
			 
			 
			 
		 }
		 
		 return head;
	 }
	 public static void main(String[] args){
		 Node head=new Node(2);
		 int[] a={1};
		 head.addAll(a);
		 head.print();
		 partition(head,2).print();
	 }
}
