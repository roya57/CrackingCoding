package ch02;

public class c2_5_e6_v2 {
	static class PartialSum{
		 Node sum=null;
		 int carry=0;
	}
	
	public static Node sumListReverse(Node x, Node y){
		int xl=listLength(x);
		int yl=listLength(y);
		if (xl>yl){
			y=addZero(y,xl-yl);
		}else{
			x=addZero(x,yl-xl);
		}
		
		PartialSum ps=sumListReverseHelper(x,y);
		return ps.sum;
		
	}
	
	public static int listLength(Node a){
		Node i=a;
		int l=0;
		while(i!=null){
			 l++;
			 i=i.next;
		}
		return l;
		 
	}
	public static Node addZero(Node l, int n){
		
		for (int i=0;i<n;i++){
			Node h=new Node(0);
			h.next=l;
			l=h;
			
		}
		return l;
	}
	public static PartialSum sumListReverseHelper(Node x, Node y){
		PartialSum ps=new PartialSum();
		if (x==null & y==null){
			return ps;
		}
		ps=sumListReverseHelper(x.next,y.next);
		int value=ps.carry;
		value+=x.data;
		value+=y.data;
		Node r=new Node(value%10);
		r.next=ps.sum;
		ps.sum=r;
		if (value>=10){
			ps.carry=1;
		}else{
			ps.carry=0;
		}
		return ps;
	}
	public static void main(String[] args){
		Node a=new Node(1);
		int[] aa={2,3,4};
		a.addAll(aa);
		Node b=new Node(5);
		int[] bb={6,7};
		b.addAll(bb);
		a.print();
		b.print();
		sumListReverse(a,b).print();
	}

}
