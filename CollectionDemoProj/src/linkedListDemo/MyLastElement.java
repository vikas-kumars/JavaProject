package linkedListDemo;

import java.util.LinkedList;

public class MyLastElement {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("vikas");
		ll.add("kumar");
		ll.add("sahu");
		System.out.println("Last element using getLast(): "+ll.getLast());
		System.out.println("Last element using peekLast(): "+ll.peekLast());
	}

}
