
public class Node {
	Node next = null;
	int data;
	public Node(int n){
		this.data = n;
	}
	public void appendToTail(int m){
		Node end = new Node(m);
		Node n = this;
		while(this.next != null){
		     n = this;
			n = n.next;
		}
		n.next = end;
	}
}
