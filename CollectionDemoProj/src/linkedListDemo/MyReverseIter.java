package linkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class MyReverseIter {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		Iterator itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
