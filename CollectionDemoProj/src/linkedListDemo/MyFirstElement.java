package linkedListDemo;

import java.util.LinkedList;

public class MyFirstElement {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		System.out.println("first element of linkedlist using element(): "+ll.element());
		System.out.println("first element of linkedlist using peek(): "+ll.peek());
		System.out.println("first element of linkedlist using peekLast(): "+ll.peekFirst());
		System.out.println("first element of linkedlist using getLast(): "+ll.getFirst());
		}
}
