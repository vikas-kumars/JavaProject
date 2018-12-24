package linkedListDemo;

import java.util.LinkedList;

public class MyBasicOperations {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("first");
		list.add("fourth");
		list.add("fifth");
		list.remove("first");
		System.out.println(list);
		System.out.println("size of linkedlist: "+list.size());
		System.out.println("is linkedList empty: "+list.isEmpty());
		System.out.println("is it containing third: "+list.contains("third"));
	}

}
