package linkedListDemo;

import java.util.LinkedList;

public class MyAddLast {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("my");
		ll.add("name");
		ll.add("is");
		System.out.println("Original string: "+ll);
		ll.addLast("vikas");
		System.out.println("Added at last using addLast(): "+ll);
		ll.offerLast("kumar");
		System.out.println("Added at last using offerLast(): "+ll);
		ll.offer("sahu");
		System.out.println("Addded at last using offer(): "+ll);
	}

}
