package linkedListDemo;

import java.util.LinkedList;

public class MyAllRemoveOprs {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		ll.add("eight");
		ll.add("sixth");
		ll.add("seventh");
		ll.add("eight");
		ll.add("fifth");
		System.out.println("Original LinkedList: "+ll);
		System.out.println("Using remove(): "+ll.remove());
		System.out.println("After remove(): "+ll);
		System.out.println("Using remove(index): "+ll.remove(2));
		System.out.println("After remove(index): "+ll);
		System.out.println("Using removeFirst(): "+ll.removeFirst());
		System.out.println("After removeFirst(): "+ll);
		System.out.println("Using remove(object): "+ll.remove("sixth"));
		System.out.println("After using remove(object): "+ll);
		System.out.println("Using removeFirstOccurence(obj): "+ll.removeFirstOccurrence("eight"));
		System.out.println("After using removeFirstOccurrence(obj): "+ll);
		System.out.println("Using removeLastOccurrence(obj): "+ll.removeLastOccurrence("fifth"));
		System.out.println("After using removeLastOccurrence(obj): "+ll);
		System.out.println("Using removeLast(): "+ll.removeLast());
		System.out.println("After using removeLast(): "+ll);
	}

}
