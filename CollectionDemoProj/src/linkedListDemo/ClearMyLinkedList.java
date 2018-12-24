package linkedListDemo;

import java.util.LinkedList;

public class ClearMyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		System.out.println("original linkedlist "+ll);
		ll.clear();
		System.out.println("cleared the linkedlist :"+ll);
	}

}
