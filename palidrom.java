import java.util.Stack;

import java.util.*;
public class palindrom {
	public static void main(String args[]){
		Node root = new Node(1);
		Node one = new Node(2);
		Node one1 = new Node(3);
		Node one2 = new Node(4);
		Node one3 = new Node(5);
		Node one4 = new Node(6);
		Node one9 = new Node(2);
		Node one8 = new Node(3);
		Node one7 = new Node(4);
		Node one6 = new Node(5);
		Node one5 = new Node(6);
		Node one10 = new Node(1);
		root.next = one;
		one.next = one1;
		one1.next = one2;
		one2.next = one3;
		one3.next = one4;
		one4.next = one5;
		one5.next = one6;
		one6.next = one7;
		one7.next = one8;
		one8.next = one9;
		one9.next = one10;
		System.out.print(check(root));
	}
	public static boolean check(Node root){
		Node fast = root;
		Node slow = root;
		Stack<Integer> s = new Stack<Integer>();
		while(fast != null && fast.next != null){
			s.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
			
		}
		
		if(fast!= null){
			slow = slow.next;
		}
		while( slow != null ){
			int m = s.pop();
			if(m != slow.data){
				return false;
			}
			slow = slow.next;
			
 		}
		return true;
	}
}
