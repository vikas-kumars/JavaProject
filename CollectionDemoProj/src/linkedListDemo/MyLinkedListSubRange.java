package linkedListDemo;

import java.util.LinkedList;

public class MyLinkedListSubRange {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		System.out.println("original LinkedList: "+ll);
		System.out.println("sublist of LinkedList: "+ll.subList(2, 4));
	}

}
