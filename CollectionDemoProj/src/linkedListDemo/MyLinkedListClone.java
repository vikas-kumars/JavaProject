package linkedListDemo;

import java.util.HashSet;
import java.util.LinkedList;

public class MyLinkedListClone {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		System.out.println("Original LinkedList "+ll);
		LinkedList<String> list=(LinkedList<String>)ll.clone();
		System.out.println("cloned linkedlist: "+list);
		
	}

}
