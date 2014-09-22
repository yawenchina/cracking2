
public class deleteNode {
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
		//print(delete(root,1));
		//print(delete(root,4));
		print(delete(root,5));
	}
	public static Node delete(Node root,int target){
		if(root.data ==  target){
			return root.next;
		}
		Node first = root;
		while(first.next != null){
			if(first.next.data == target){
				first.next = first.next.next;
				return root;
			}
			first = first.next;
		}
		return root;
		
	}
	public static void print(Node root){
		while(root != null){
			System.out.print(root.data);
			root = root.next;
		}
	}
}
