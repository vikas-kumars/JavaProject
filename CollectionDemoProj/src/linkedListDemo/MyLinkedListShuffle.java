package linkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListShuffle {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		System.out.println("original linkedlist: "+ll);
		Collections.shuffle(ll);
		System.out.println("shuffle linkedlist: "+ll);
	}

}
