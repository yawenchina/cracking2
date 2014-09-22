
public class partition {
	public static void main(String args[]){
		Node root = new Node(6);
		Node one = new Node(2);
		Node one1 = new Node(3);
		Node one2 = new Node(4);
		Node one3 = new Node(5);
		Node one4 = new Node(4);
		Node one5 = new Node(5);
		root.next = one;
		one.next = one1;
		one1.next = one2;
		one2.next = one3;
		one3.next = one4;
		one4.next = one5;
		print(partition(root,5));
	}
	public static void print(Node root){
		while(root != null){
			System.out.print(root.data);
			root = root.next;
		}
	}
	public static Node partition(Node root,int target){
		Node first = null;
	
		Node second = null;
		while(root != null){
			Node temp = new Node(root.data);
			if(root.data < target){
				
				temp.next = first;
				first = temp;
			}else{
				temp.next = second;
				second = temp;
			}
			root = root.next;
		}
		Node end = first;
		while(end.next != null){
			end = end.next;
		}
		end.next = second;
		return first;
	}
	
}
