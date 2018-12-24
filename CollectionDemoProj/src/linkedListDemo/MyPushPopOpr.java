package linkedListDemo;

import java.util.LinkedList;

public class MyPushPopOpr {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		System.out.println(ll);
		ll.push("fifth");
		System.out.println("After using push(): "+ll);
		ll.pop();
		System.out.println("After using pop(): "+ll);
		
	}

}
