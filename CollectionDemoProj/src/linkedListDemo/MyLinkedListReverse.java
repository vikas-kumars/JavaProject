package linkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListReverse {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println("original linkedlist: "+ll);
		Collections.reverse(ll);
		System.out.println("reversed linkedlist: "+ll);
	}

}
