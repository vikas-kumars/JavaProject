package linkedListDemo;

import java.util.LinkedList;

public class MyLinkedListArray {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		String[] str=ll.toArray(new String[ll.size()]);
		System.out.println("LinkedList to Array:");
		for(String s:str) {
			System.out.print(s+" ");
		}
	}

}
