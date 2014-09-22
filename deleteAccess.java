
public class deleteAccess {
	public static void main(String args[]){
		Node root = new Node(1);
		Node one = new Node(2);
		Node one1 = new Node(3);
		Node one2 = new Node(4);
		Node one3 = new Node(5);
		root.next = one;
		one.next = one1;
		one1.next = one2;
		one2.next = one3;
		print(remove(root,one));
	}
	public static void print(Node root){
		while(root != null){
			System.out.print(root.data);
			root = root.next;
		}
	}
	public static Node remove(Node root,Node one){
		if(one == null || one.next == null){
			return root;
		}
		Node next = one.next;
		one.data = next.data;
		one.next = next.next;
		return root;
	}
	
	
}
