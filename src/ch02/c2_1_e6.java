package ch02;

/* Write code to remove duplicates from an unsorted linked list
 * 
 */
import java.util.HashSet;

public class c2_1_e6 {
	public static Node removeDuplicates(Node head) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node n = head;
		Node prev = null;
		while (n != null) {
			if (hs.contains(n.data)) {
				prev.next = n.next;
			} else {
				hs.add(n.data);
				prev = n;
			}
			n = n.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node a = new Node(2);
		int[] ar = { 3, 1, 2, 5, 5, 1 };
		a.addAll(ar);
		a.print();
		removeDuplicates(a).print();
	}

}
