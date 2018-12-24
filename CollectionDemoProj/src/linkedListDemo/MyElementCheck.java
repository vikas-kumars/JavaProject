package linkedListDemo;

import java.util.LinkedList;

public class MyElementCheck {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		LinkedList<String> list=new LinkedList<String>();
		list.add("second");
		list.add("fourth");
		System.out.println("contains list of elements: "+ll.containsAll(list));
		list.add("random");
		System.out.println("contains list of elements: "+ll.containsAll(list));
	}

}
