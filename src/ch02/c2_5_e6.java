package ch02;

public class c2_5_e6 {
	public static Node sumList(Node x, Node y){
		return addList(x, y, 0);
	}
	public static Node addList(Node x, Node y, int carry){
		
		if (x==null && y==null && carry==0){
			return null;
		}
		int value=carry;
		Node result=new Node();
		if (x!=null){
			value+=x.data;
		}
		if (y!=null){
			value+=y.data;
		}
		result.data=value%10;
		if (x!=null || y!=null){
			Node more=addList(x==null ? null : x.next, y==null ? null: y.next, value/10);
			result.next=more;
		}
		return result;
	}
	public static void main(String[] args){
		Node a=new Node(7);
		int[] aa={1,6};
		a.addAll(aa);
		Node b=new Node(5);
		int[] bb={9,2};
		b.addAll(bb);
		a.print();
		b.print();
		sumList(a,b).print();
		
	}

}
