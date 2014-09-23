
public class removeKth {
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
		removeKth(root,5);
	}
	public static int removeKth(Node root, int n){
		 if(root == null){
	           return 0;
	       }
	       int m = removeKth(root.next,n)+1;
	       if(m == n){
	    	   System.out.print(root.data);
	         
	       }
	       return m;
	}
}
