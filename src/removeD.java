
public class removeD {
	public static void main(String args[]){
		Node root = new Node(1);
		Node one = new Node(3);
		Node one1 = new Node(3);
		Node one2 = new Node(3);
		Node one3 = new Node(5);
		root.next = one;
		one.next = one1;
		one1.next = one2;
		one2.next = one3;

		print(removeD(root));
	}
	public static Node removeD(Node root){
		Node cur = root;
		while(cur != null){
			
			Node next = cur;
			while(next.next!= null){
				if(cur.data == next.next.data){
					next.next =next.next.next;
				}else{
					next = next.next;
				}
			}
			cur = cur.next;
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
