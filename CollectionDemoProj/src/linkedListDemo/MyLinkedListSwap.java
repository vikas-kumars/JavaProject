package linkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListSwap {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		System.out.println("original linkedlist: "+ll);
		Collections.swap(ll, 2, 4);
		System.out.println("LinledList after swap: "+ll);
	}

}
