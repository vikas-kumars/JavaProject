package linkedListDemo;

import java.util.LinkedList;

public class MyAddFirst {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("vikas");
		ll.add("sahu");
		System.out.println("Original linkedlist "+ll);
		System.out.println("Add first");
		ll.addFirst("suresh");
		System.out.println(ll);
		System.out.println("Add 2nd time on first");
		ll.offerFirst("first");
		System.out.println(ll);
	}

}
