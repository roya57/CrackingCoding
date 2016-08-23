package ch02;

public class Node {
	int data;
	Node next;
	public Node(){
		data=0;
		next=null;
	}
	public Node(int d){
		data=d;
		next=null;
	}
	public void addAfter(int d){
		if (next==null){
			next=new Node(d);
		}else{
			Node m=new Node(d);
			m.next=this.next;
			this.next=m;
		}
	}
	public void setNext(Node y){
		this.next=y;
	}
	public void addAtEnd(int d){
		Node n=this;
		while (n.next!=null){
			n=n.next;
			
		}
		n.next=new Node(d);
	}
	public void addAll(int[] b){
		
		for (int i=0;i<b.length;i++){
			addAtEnd(b[i]);
			
		}
	}
	public void print(){
		Node n=this;
		while( n.next!=null){
			System.out.print(n.data+",");
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	public Node delete(int d){
		Node n=this;
		if (n.data==d){
			return n.next;
		}
		while (n.next!=null){
			Node m=n.next;
			if (m.data==d){
				n.next=m.next;
				return this;
			}
			n=n.next;
		}
		return this;
	}
	public static void main(String[] args){
		Node a=new Node(3);
		for(int i=0;i<5;i++){
			
			a.addAtEnd(i);
		
		}
		a.addAfter(7);
		a.print();
		Node b=a.delete(8);
		b.print();
		
	}

}
