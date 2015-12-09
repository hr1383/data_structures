package ds;

public class LinkedList {

	/**
	 * Remove element from the list.
	 * Handle cases:
	 *  a) Multiple occurrences of the element
	 *  b) Element at start or end of the list
	 *  c) Element repeated. 
	 */
	public Node removeNode(int value, Node start) {
		Node curr = start;
		while(curr.next != null) {
			if(curr.next.value == value) {
				curr.next = curr.next.next;
			} else 
				curr = curr.next;
		}
		if( start.value == value ) {
			start = start.next;
		}
		return start;
	}
	
	/**
	 * Add a the end of the list.
	 */
	public void addNode(int value, Node curr) {
		if(curr == null) {
			curr = new Node(value);
			return;
		} 
		else {
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = new Node(value);
		}
	}
	
	/**
	 * Find the first occurrence of the element and return the node 
	 */
	public Node find(int value, Node curr) {
		while(curr != null && curr.value == value) {
			curr = curr.next;
		}
		return curr;
	}
	
	/**
	 * Print all elements in the list 
	 */
	public void print(Node curr) {
		while(curr != null) {
			System.out.print(curr.value + " " );
			curr =curr.next;
		}
	}
	public static void main(String args[]) {
		Node start = new Node(1);
		LinkedList l = new LinkedList();
		l.addNode(1, start);
		l.addNode(1, start);
		l.addNode(5, start);
		l.addNode(1, start);
		l.print(start);
		start = l.removeNode(1, start);
		System.out.println(" ");
		l.print(start);
	}
}

class Node {
	int value;
	protected Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}