package linkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListNewCollection {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		System.out.println("Original LinkeList: "+ll);
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		ll.addAll(list);
		System.out.println("added list to linkedlist: "+ll);
	}

}
